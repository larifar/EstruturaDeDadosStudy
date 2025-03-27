package challenge.dados.Fila.FilaEncadeada;
public class FilaEncadeadaTest {
    private static class Node{
        public Node proximo;
        public int valor;

        public Node(int valor){
            this.valor = valor;
            proximo = null;
        }
    }

    private Node inicio;

    public FilaEncadeadaTest(){
        this.inicio = null;
    }

    public boolean isEmpty(){
        return inicio == null;
    }

    public boolean find(int valor){
        for(Node node = inicio; node != null; node = node.proximo){
            if (valor == node.valor) return true;
        }
        return false;
    }

    public void addAtFirst(int valor){
        Node node = new Node(valor);
        node.proximo = inicio;
        inicio = node;
    }

    public void removeFirst(){
        inicio = inicio.proximo;
    }

    public String exibeLista(){
        if(isEmpty()) return "Lista vazia\n"; //teste de lista vazia
        String str = "Lista Encadeada: ";
        for (Node node = inicio; node != null; node = node.proximo)
            str+= " "+ node.valor;
        return str + "\n";
    }
}
