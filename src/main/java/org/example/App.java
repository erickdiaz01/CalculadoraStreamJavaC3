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
        calculadoraStream.sumarListas();
       calculadoraStream.restarListas();
       calculadoraStream.multiplicarLasListas();
       calculadoraStream.dividirListas();
       calculadoraStream.potenciaDeListasConFilter();
       calculadoraStream.moduloSkipLastListas();



    }
}
