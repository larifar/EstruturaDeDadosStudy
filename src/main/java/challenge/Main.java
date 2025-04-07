package challenge;

import challenge.dados.Fila.FilaDuplamenteEncadeada.FilaDuplamenteEncadeadaTest;
import challenge.dados.Fila.FilaEncadeada.FilaEncadeadaTest;
import challenge.ordenacao.bubble.AlgoritmoBubble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

//        FilaDuplamenteEncadeadaTest dupla = new FilaDuplamenteEncadeadaTest();
//        dupla.addComeco(1);
//        System.out.println(dupla.getSize());
//        dupla.addFinal(2);
//        dupla.addFinal(3);
//        System.out.println(dupla.list());
//        System.out.println(dupla.getPosition(3));
//        System.out.println(dupla.getPosition(1));
//        dupla.pop();
//        System.out.println(dupla.list());

        ArrayList<Integer> desordenado = new ArrayList<>(Arrays.asList(5, 2, 6, 4, 1, 3));
        System.out.println("Antes de ordenar: " + desordenado);
        new AlgoritmoBubble().bubbleSort(desordenado);
        System.out.println("Ordenado: " + desordenado);

    }
}