package br.com.fiap.main;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class PokemonHashMap {
    public static void main(String[] args) {
        HashMap<String, String> pokemon = new HashMap<>();
        do {
            try {
                String nome, tipagem;
                do {
                    nome = JOptionPane.showInputDialog("Informe o nome do pokemon e digite \"FIM\" para finalizar").toUpperCase();
                    if (nome.equals("FIM")) {
                        break;
                    }
                    if (pokemon.containsKey(nome)) {
                        JOptionPane.showMessageDialog(null, "Pokemon já cadastrado!");
                    } else {
                        tipagem = JOptionPane.showInputDialog("Informe a tipagem do pokemon");
                        pokemon.put(nome, tipagem);
                    }
                } while (true);

                String elemento = JOptionPane.showInputDialog("Digite uma tipagem de pokemon para ver quais pokemons tem a mesma tipagem.");
                String lista = "Tipagem escolhida: " + elemento + "\nPokemons com a mesma tipagem:";
                boolean encontrou = false;
                for (Map.Entry<String, String> nomes : pokemon.entrySet()) {
                    if (nomes.getValue().equalsIgnoreCase(elemento)) {
                        lista += "\n" + nomes.getKey();
                        encontrou = true;
                    }
                }
                if (encontrou) {
                    JOptionPane.showMessageDialog(null, lista);
                } else {
                    JOptionPane.showMessageDialog(null, "Tipagem não registrada!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);

        JOptionPane.showMessageDialog(null, "Até a próxima!", "Adeus", JOptionPane.INFORMATION_MESSAGE);
    }
}