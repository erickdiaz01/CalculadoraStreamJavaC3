package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CalculadoraStream {
    List<Integer> listaAOperar1 ; ;
    List<Integer> listaAOperar2 ;
    Integer limite;

    public CalculadoraStream() {
        this.listaAOperar1=List.of(1,2,3,4,5,6);
        this.listaAOperar2= List.of(8,12,15,11,19);
       this.limite = this.listaAOperar1.size()<this.listaAOperar2.size()?this.listaAOperar1.size():this.listaAOperar2.size();
    }
public void sumarListas(){

        if(listaAOperar1.size()==listaAOperar2.size()){
            listaAOperar1.stream().map(numero->{
                Integer indice = listaAOperar1.indexOf(numero);
                return numero + listaAOperar2.get(indice);
            }).forEach(numeroSumado->{
                System.out.println("La suma por posicion de los dos numeros de las listas es : "+numeroSumado);
            });
        }else {
            listaAOperar1.stream().limit(this.limite).map(numero->{
                Integer indice = listaAOperar1.indexOf(numero);
                return numero + listaAOperar2.get(indice);
            }).forEach(numeroSumado->{
                System.out.println("La suma por posicion de los dos numeros de las listas es : "+numeroSumado);
            });
        }
}

public void restarListas(){
    if(listaAOperar1.size()==listaAOperar2.size()){
        listaAOperar1.stream().map(numero->{
            Integer indice = listaAOperar1.indexOf(numero);
            return numero - listaAOperar2.get(indice);
        }).forEach(numeroRestado->{
            System.out.println("La suma por posicion de los dos numeros de las listas es : "+numeroRestado);
        });
    }else {
        listaAOperar1.stream().limit(this.limite).map(numero->{
            Integer indice = listaAOperar1.indexOf(numero);
            return numero - listaAOperar2.get(indice);
        }).forEach(numeroRestado->{
            System.out.println("La resta por posicion de los dos numeros de las listas es : "+numeroRestado);
        });
    }

}
public void multiplicarLasListas(){
    if(listaAOperar1.size()==listaAOperar2.size()){
        listaAOperar1.stream().map(numero->{
            Integer indice = listaAOperar1.indexOf(numero);
            return numero * listaAOperar2.get(indice);
        }).forEach(producto->{
            System.out.println("La suma por posicion de los dos numeros de las listas es : "+producto);
        });
    }else {
        listaAOperar1.stream().limit(this.limite).map(numero->{
            Integer indice = listaAOperar1.indexOf(numero);
            return numero * listaAOperar2.get(indice);
        }).forEach(producto->{
            System.out.println("El producto por posicion de los dos numeros de las listas es : "+producto);
        });
    }
}



    public void dividirListas(){

        if(listaAOperar1.size()==listaAOperar2.size()){
            listaAOperar1.stream().map(numero->{
                Integer indice = listaAOperar1.indexOf(numero);
                String condicion= (listaAOperar2.get(indice) != 0) ?String.valueOf((float)(numero * (Math.pow(listaAOperar2.get(indice),-1)))): "No es posible dividir por 0" ;
                return condicion;            }).forEach(cociente->{
                System.out.println("La division por posicion de los dos numeros de las listas es : "+cociente);
            });
        }else {
            listaAOperar1.stream().limit(this.limite).map(numero->{
                Integer indice = listaAOperar1.indexOf(numero);
                String condicion= (listaAOperar2.get(indice) != 0) ?String.valueOf((float)(numero * (Math.pow(listaAOperar2.get(indice),-1)))): "No es posible dividir por 0" ;
                return condicion;
            }).forEach(cociente->{
                System.out.println("La division por posicion de los dos numeros de las listas es : "+cociente);
            });
        }
    }
    public void potenciaDeListasConFilter(){
        if(listaAOperar1.size()==listaAOperar2.size()){
            listaAOperar1.stream().filter(numeroAFiltrar->numeroAFiltrar<3).map(numero->{
                Integer indice = listaAOperar1.indexOf(numero);
                return Math.pow(numero,listaAOperar2.get(indice));
            }).forEach(potencia->{
                System.out.println("La potencia por posicion de los dos numeros de las listas es : "+potencia);
            });
        }else {
            listaAOperar1.stream().limit(this.limite).map(numero->{
                Integer indice = listaAOperar1.indexOf(numero);
                return Math.pow(numero,listaAOperar2.get(indice));
            }).forEach(potencia->{
                System.out.println("La potencia por posicion de los dos numeros de las listas es : "+potencia);
            });
        }
    }
    public void moduloSkipLastListas(){
        if(listaAOperar1.size()==listaAOperar2.size()){
            listaAOperar1.stream().filter(numeroAFiltrar->numeroAFiltrar<3).map(numero->{
                Integer indice = listaAOperar1.indexOf(numero);
                return numero%listaAOperar2.get(indice);
            }).forEach(modulo->{
                System.out.println("El modulo por posicion de los dos numeros de las listas es : "+modulo);
            });
        }else {
            listaAOperar1.stream().limit(this.limite).map(numero->{
                Integer indice = listaAOperar1.indexOf(numero);
                return numero%listaAOperar2.get(indice);
            }).forEach(modulo->{
                System.out.println("El modulo por posicion de los dos numeros de las listas es : "+modulo);
            });
        }
    }

    }
