package challenge.dados.Fila;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();

        fila.add(1);
        fila.add(2);
        fila.add(3);

        System.out.println(fila);
        System.out.println(fila.peek());
        fila.remove();
        System.out.println(fila);
    }
}
