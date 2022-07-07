package org.example;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       CalculadoraStream calculadoraStream = new CalculadoraStream();
        System.out.println("Suma de los valores reducidos de las listas: "+calculadoraStream.sumarListas());
        System.out.println("Resta de los valores reducidos de las listas: "+calculadoraStream.restarListas());
        System.out.println("Multiplicacion de la suma de las listas reducidas: "+calculadoraStream.multiplicarSumaDeLasListas());
        System.out.println("Multiplicacion de la resta de las listas reducidas: "+calculadoraStream.multiplicarRestaDeLasListas());
        System.out.println("Division de la suma de las listas reducidas: "+calculadoraStream.dividirSumaDeLasListaConSkip());
        System.out.println("Division de la resta de las listas reducidas: "+calculadoraStream.dividirRestaDeLasListaConSkip());
        System.out.println("Potencia de los numeros maximos de las listas: "+calculadoraStream.potenciaMaximosDeListas());
        System.out.println("Modulo de los numeros minimos de las listas: "+calculadoraStream.moduloMinimosDeListas());



    }
}
