package challenge.FilaDuplamenteEncadeada;


public class FilaDuplamenteEncadeadaTest {
    private static class Node{
        public Node anterior;
        public Node proximo;
        public int valor;

        public Node(int valor){
            this.valor = valor;
            proximo = null;
            anterior = null;
        }
    }
    private Node inicio;
    private Node ultimo;
    private int tamanho;

    public FilaDuplamenteEncadeadaTest(){
        this.inicio = null;
        this.ultimo = null;
        tamanho = 0;
    }

    public boolean isEmpty(){
        return inicio == null;
    }

    public int getSize(){
        return this.tamanho;
    }

    public void addFinal(int valor){
        Node node = new Node(valor);
        if (isEmpty()){
            this.inicio = node;
        } else{
            node.anterior = this.ultimo;
            this.ultimo.proximo = node;
        }
        this.ultimo = node;
        tamanho = this.tamanho + 1;
    }

    public void addComeco(int valor){
        Node node = new Node(valor);
        if (isEmpty()){
            this.inicio = node;
            this.ultimo = node;
        } else{
            node.proximo = this.inicio;
            this.inicio.anterior = node;
            this.inicio = node;
        }
        tamanho = this.tamanho + 1;
    }

    public int getPosition(int valor){
        int position = 0;
        for(Node node = inicio; node!=null;node = node.proximo){
            if (node.valor == valor){
                return position;
            }
            position+=1;
        }
        return -1;
    }

    public void pop(){
        Node novoUltimo = this.ultimo.anterior;
        novoUltimo.proximo = null;
        this.ultimo = novoUltimo;
    }

    public String list(){
        if (isEmpty()){
            return "Lista vazia";
        }
        String string = "lista:";
        for (Node node = inicio; node!=null; node = node.proximo){
            string+= " " + node.valor + "\n";
        }
        return string;
    }
}
