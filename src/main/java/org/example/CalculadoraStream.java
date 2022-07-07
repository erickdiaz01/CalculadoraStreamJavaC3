package org.example;

import java.util.List;
import java.util.Optional;

public class CalculadoraStream {
    List<Integer> listaAOperar1 ; ;
    List<Integer> listaAOperar2 ;

    public CalculadoraStream() {
        this.listaAOperar1=List.of(1,2,3,4,5,6);
        this.listaAOperar2= List.of(7,8,9,10,11);
    }
public Integer sumarListas(){
        Optional<Integer> reduceSumaLista1 = listaAOperar1.stream().reduce((acumulador, numeroSig)->acumulador+=numeroSig);
        Optional<Integer> reduceSumaLista2 =listaAOperar2.stream().reduce((acumulador, numeroSig)->acumulador+=numeroSig);

    return reduceSumaLista1.get() + reduceSumaLista2.get();
}

public Integer restarListas(){
    Optional<Integer> reduceRestaLista1 = listaAOperar1.stream().reduce((acumulador, numeroSig)->acumulador-=numeroSig);
    Optional<Integer> reduceRestaLista2 = listaAOperar2.stream().reduce((acumulador, numeroSig)->acumulador-=numeroSig);
    return reduceRestaLista1.get()+reduceRestaLista2.get();

}
public Integer multiplicarSumaDeLasListas(){
    Optional<Integer> reduceSumaLista1 = listaAOperar1.stream().reduce((acumulador, numeroSig)->acumulador+=numeroSig);
    Optional<Integer> reduceSumaLista2 =listaAOperar2.stream().reduce((acumulador, numeroSig)->acumulador+=numeroSig);

    return reduceSumaLista1.get()*reduceSumaLista2.get();
}

    public Integer multiplicarRestaDeLasListas(){
        Optional<Integer> reduceRestaLista1 = listaAOperar1.stream().reduce((acumulador, numeroSig)->acumulador-=numeroSig);
        Optional<Integer> reduceRestaLista2 = listaAOperar2.stream().reduce((acumulador, numeroSig)->acumulador-=numeroSig);

        return reduceRestaLista1.get()*reduceRestaLista2.get();
    }
    public float dividirSumaDeLasListaConSkip(){
        Optional<Integer> reduceSumaLista1 = listaAOperar1.stream().skip(2).reduce((acumulador, numeroSig)->acumulador+=numeroSig);
        Optional<Integer> reduceSumaLista2 =listaAOperar2.stream().skip(2).reduce((acumulador, numeroSig)->acumulador+=numeroSig);
        return reduceSumaLista1.get()/reduceSumaLista2.get();
    }
    public float dividirRestaDeLasListaConSkip(){
        Optional<Integer> reduceRestaLista1 = listaAOperar1.stream().skip(3).reduce((acumulador, numeroSig)->acumulador-=numeroSig);
        Optional<Integer> reduceRestaLista2 = listaAOperar2.stream().skip(3).reduce((acumulador, numeroSig)->acumulador-=numeroSig);
        return reduceRestaLista1.get()/reduceRestaLista2.get();
    }
    public double potenciaMaximosDeListas(){
        Integer maximoLista1= listaAOperar1.stream().max(Integer::compare).get();
        Integer maximoLista2= listaAOperar2.stream().max(Integer::compare).get();

        return Math.pow(maximoLista1,maximoLista2);

    }
    public Integer moduloMinimosDeListas(){
        Optional<Integer> minimoLista1= listaAOperar1.stream().min(Integer::compare);
        Optional<Integer> minimoLista2= listaAOperar2.stream().min(Integer::compare);
        return minimoLista1.get()%minimoLista2.get();
    }

    }
