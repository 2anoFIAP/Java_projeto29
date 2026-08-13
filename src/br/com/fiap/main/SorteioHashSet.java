package br.com.fiap.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class SorteioHashSet {
    static void main() {
        HashSet<Integer> numerosSorteados = new HashSet<>();
        Random random = new Random();
        System.out.println("Veja o resultado da Mega Sena");
        while(numerosSorteados.size() < 6){
            int numero = random.nextInt(59) + 1;
            numerosSorteados.add(numero);
        }
        ArrayList<Integer> resultadoDoSorteio = new ArrayList<>(numerosSorteados);
        Collections.sort(resultadoDoSorteio);
        System.out.println(resultadoDoSorteio);
    }
}
