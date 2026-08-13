package br.com.fiap.main;

import javax.swing.*;
import java.util.HashMap;

public class ExemploHashMap {
    static void main() {
        HashMap<String, String> mapa = new HashMap<>();
        do {
            try {
                //Cadastro de UF(Unidade Federal) e Estados
                String sigla, estado;
                do {
                    sigla = JOptionPane.showInputDialog("Digite a UF(Unidade Federal) de um estado ou digite \"FIM\" para encerrar").toUpperCase();
                    if (!sigla.equals("FIM")){
                        if(mapa.containsKey(sigla)){
                            JOptionPane.showMessageDialog(null, "Estado já cadastrado!");
                        } else{
                            estado = JOptionPane.showInputDialog("Digite o nome completo do estado informado");
                            mapa.put(sigla, estado);
                        }
                    }
                } while(!sigla.equals("FIM"));
                //Realizando a consulta de um estado pelo seu UF
                String escolha = JOptionPane.showInputDialog("Digite a UF de um estado qualquer").toUpperCase();
                if (mapa.containsKey(escolha)){
                    //ContainsKey verifica se tem a presença de chaves(elementos) dentro do HAshmap.
                    JOptionPane.showMessageDialog(null, "Nome do Estado: " + mapa.get(escolha));
                } else {
                    JOptionPane.showMessageDialog(null, "Estado não cadastrado");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } while(JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
    }
}