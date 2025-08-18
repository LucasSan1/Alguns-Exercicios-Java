package com.mycompany.validacaoplacajoption;
import javax.swing.JOptionPane;

public class ValidacaoPlacaJOption {
    public static void main(String[] args) {
        String placa;

        // Entra com o valor da placa e em seguida entra no loop para a validação da placa, caso a placa seja valida sai do while e entra no print
        do {
            placa = JOptionPane.showInputDialog("Digite a placa: ").toUpperCase();
        } while (!validarPlaca(placa));

        JOptionPane.showMessageDialog(null, "Placa valida " + placa, "Sucesso", JOptionPane.PLAIN_MESSAGE);
    }

    // declara uma função para fazer a validação das condiçoes da placa (numeros,letras e a quantidade de caracteres)
    public static boolean validarPlaca(String placa) {
        // Valida o tamanho da placa que deve ter 7 caracteres
        if (placa.length() != 7) {
            JOptionPane.showMessageDialog(null, "A placa deve conter 7 caracteres", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        // valida os 3 primeiros caracteres da placa sendo elas obrigatoriamente letras de A a Z
        for (int i = 0; i < 3; i++) {
            char c = placa.charAt(i);
            if (c < 'A' || c > 'Z') {
                JOptionPane.showMessageDialog(null, "As três primeiras posições devem ser letras de A a Z. ", "Caractere invalido", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }

        // valida os 4 ultimos caracteres da placa sendo esses entre 0 e 9
        for (int i = 3; i < 7; i++) {
            char c = placa.charAt(i);
            if (c < '0' || c > '9') {
                 JOptionPane.showMessageDialog(null, "As quatro últimas posições devem ser números de 0 a 9 ", "Caractere invalido", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }
}
