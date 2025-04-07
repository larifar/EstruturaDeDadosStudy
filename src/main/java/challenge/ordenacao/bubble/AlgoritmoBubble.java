package challenge.ordenacao.bubble;

import java.util.ArrayList;

public class AlgoritmoBubble {

    public final void bubbleSort( ArrayList<Integer> list){
        int aux;
        for (int e = 0; e < list.size(); e++){
            for (int i = 0; i< list.size()-1; i++){
                if (list.get(i) > list.get(i+1)){
                    aux = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, aux);
                }
            }
        }
    }
}
