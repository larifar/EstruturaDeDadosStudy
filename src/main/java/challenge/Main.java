package challenge;

import challenge.FilaDuplamenteEncadeada.FilaDuplamenteEncadeadaTest;
import challenge.FilaEncadeada.FilaEncadeadaTest;

public class Main {
    public static void main(String[] args) {
        FilaEncadeadaTest fila = new FilaEncadeadaTest();
//        fila.addAtFirst(1);
//        fila.addAtFirst(2);
//        fila.addAtFirst(3);
//        fila.addAtFirst(4);
//        fila.addAtFirst(5);
//        System.out.println("Fila:" + fila.exibeLista());
//        fila.removeFirst();
//        System.out.println("Fila ao remover primeiro:" + fila.exibeLista());

        FilaDuplamenteEncadeadaTest dupla = new FilaDuplamenteEncadeadaTest();
        dupla.addComeco(1);
        System.out.println(dupla.getSize());
        dupla.addFinal(2);
        dupla.addFinal(3);
        System.out.println(dupla.list());
        System.out.println(dupla.getPosition(3));
        System.out.println(dupla.getPosition(1));
        dupla.pop();
        System.out.println(dupla.list());
    }
}