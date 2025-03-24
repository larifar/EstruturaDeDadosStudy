package challenge;

import challenge.FilaEncadeada.FilaEncadeadaTest;

public class Main {
    public static void main(String[] args) {
        FilaEncadeadaTest fila = new FilaEncadeadaTest();
        fila.addAtFirst(1);
        fila.addAtFirst(2);
        fila.addAtFirst(3);
        fila.addAtFirst(4);
        fila.addAtFirst(5);
        System.out.println("Fila:" + fila.exibeLista());
        fila.removeFirst();
        System.out.println("Fila ao remover primeiro:" + fila.exibeLista());
    }
}