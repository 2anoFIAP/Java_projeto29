package br.com.fiap.main;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class PokemonHashMap {

    // Sintaxe enxuta suportada no JDK 25+
    static void main() {
        HashMap<String, String> mapa = new HashMap<>();

        do {
            try {
                // 1. Cadastro de Pokémons
                String nome, tipo;
                do {
                    nome = JOptionPane.showInputDialog("Digite o NOME de um Pokémon ou digite \"FIM\" para encerrar").toUpperCase();

                    if (!nome.equals("FIM")) {
                        if (mapa.containsKey(nome)) {
                            JOptionPane.showMessageDialog(null, "Pokémon JA cadastrado!");
                        } else {
                            tipo = JOptionPane.showInputDialog("Digite o TIPO do pokémon informado").toUpperCase();
                            mapa.put(nome, tipo);
                        }
                    }
                } while (!nome.equals("FIM"));

                // 2. Pedir um tipo qualquer
                String escolha = JOptionPane.showInputDialog("Digite o TIPO de Pokémon que deseja buscar").toUpperCase();

                // 3. Percorrer o HashMap buscando os pokémons do tipo escolhido
                StringBuilder pokemonsEncontrados = new StringBuilder();
                boolean encontrou = false;

                for (Map.Entry<String, String> entry : mapa.entrySet()) {
                    if (entry.getValue().equals(escolha)) {
                        pokemonsEncontrados.append("- ").append(entry.getKey()).append("\n");
                        encontrou = true;
                    }
                }

                // Exibindo o resultado da busca
                if (encontrou) {
                    JOptionPane.showMessageDialog(null,
                            "Tipo escolhido: " + escolha + "\n\n" +
                                    "Nomes de todos os Pokémons desse tipo:\n" + pokemonsEncontrados.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum Pokémon do tipo " + escolha + " foi encontrado!");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            // 4. Perguntar se deseja continuar
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?","Atencao",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);

        // 5. Em caso negativo, exibir mensagem se despedindo
        JOptionPane.showMessageDialog(null, "Programa encerrado. Até logo!");
    }
}