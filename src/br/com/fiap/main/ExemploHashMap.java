package br.com.fiap.main;

import javax.swing.*;
import java.util.HashMap;

public class ExemploHashMap {
    static void main() {
        HashMap<String, String> mapa = new HashMap<>();
        do {
            try{
                // cadastro de UF e Estados
                String sigla, estado;
                do {
                    sigla = JOptionPane.showInputDialog("Digite a UF (Unidade Federal) de um estado ou digite \"FIM\" para encerrar").toUpperCase();
                    if(!sigla.equals("FIM")){
                        if (mapa.containsKey(sigla)) {
                            JOptionPane.showMessageDialog(null, "Estado JA cadastrado!");
                        } else {
                            estado = JOptionPane.showInputDialog("Digite o nome completo do estado informado");
                            mapa.put(sigla, estado);
                        }
                    }
                } while(!sigla.equals("FIM"));
                // realizando a consulta de um estado pelo seu UF
                String escolha = JOptionPane.showInputDialog("Digite a UF de um estado qualquer").toUpperCase();
                if(mapa.containsValue(escolha)){
                    JOptionPane.showMessageDialog(null, "Nome do Estado: " + mapa.get(escolha));
                } else {
                    JOptionPane.showMessageDialog(null, "Estado NAO cadastrado!");
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } while(JOptionPane.showConfirmDialog(null, "Deseja continuar?","Atencao",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
    }
}
