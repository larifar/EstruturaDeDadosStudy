package challenge.ordenacao.bubble;

import java.util.ArrayList;
import java.util.List;

public class AlgoritmoBubble {

    public final  ArrayList<Integer> bubbleSort(List<Integer> list){
        ArrayList<Integer> ordenado = new ArrayList<>(list);
        for (int e = 0; e < list.size()-1; e++){
            for (int in = 0; in < list.size()-1-e; in++){
                if (ordenado.get(in)> ordenado.get(in+1)){
                    int temporario = ordenado.get(in);
                    ordenado.set(in, ordenado.get(in+1));
                    ordenado.set(in+1, temporario);
                }
            }
        }
        return ordenado;
    }
}
