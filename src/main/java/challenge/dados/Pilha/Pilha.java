package challenge.dados.Pilha;


import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        pilha.add(1);
        pilha.add(2);
        pilha.add(3);

        System.out.println(pilha);
        System.out.println(pilha.peek());
        pilha.pop();
        System.out.println(pilha);
    }
}
