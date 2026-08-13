package br.com.fiap.main;

import java.util.HashMap;
import java.util.Map;

public class NavegaHashMap {
    static void main() {
        HashMap<String, Integer> pessoas = new HashMap<>();
        pessoas.put("AStrogildo", 18);
        pessoas.put("Berisvaldo", 25);
        pessoas.put("GUmercindo", 18);
        for (Map.Entry<String, Integer> valor : pessoas.entrySet()) {
            System.out.println("Chave: " + valor.getKey() + "\tValor: " + valor.getValue());
        }
    }
}
