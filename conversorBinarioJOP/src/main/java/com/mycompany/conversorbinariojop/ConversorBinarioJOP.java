package com.mycompany.conversorbinariojop;
import javax.swing.JOptionPane;

public class ConversorBinarioJOP {

    public static void main(String[] args) {
        int bits;

        while (true) {
            // Escolha do número de bits
            String bitsIn = JOptionPane.showInputDialog(
                "Escolha a quantidade de bits para a conversão (8, 16 ou 32):"
            );

            if (bitsIn == null) {
                JOptionPane.showMessageDialog(null, "Programa encerrado.", "Encerrando", JOptionPane.WARNING_MESSAGE);
                break;
            }

            try {
                bits = Integer.parseInt(bitsIn);
                if (bits != 8 && bits != 16 && bits != 32) {
                    JOptionPane.showMessageDialog(null, "Opção inválida! Digite apenas 8, 16 ou 32.", "ERRO", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida! Digite apenas 8, 16 ou 32.", "ERRO", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            // Intervalo válido para complemento de dois
            int min = -(int) Math.pow(2, bits - 1);
            int max = (int) Math.pow(2, bits - 1) - 1;

            // Loop para converter números até o usuário decidir trocar os bits
            while (true) {
                String numIn = JOptionPane.showInputDialog(
                    "Digite um número inteiro dentro do intervalo permitido para " + bits + " bits (" + min + " a " + max + "):\n" +
                    "Digite 'b' para trocar a quantidade de bits."
                );

                if (numIn == null) {
                    JOptionPane.showMessageDialog(null, "Programa encerrado.", "Encerrando", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                if (numIn.equalsIgnoreCase("b")) {
                    break; // volta para escolher outra quantidade de bits
                }

                try {
                    int numero = Integer.parseInt(numIn);

                    if (numero < min || numero > max) {
                        JOptionPane.showMessageDialog(null,
                            "Número fora do intervalo permitido para " + bits + " bits (" + min + " a " + max + ").",
                            "ERRO", JOptionPane.ERROR_MESSAGE);
                    } else {
                        String binario = intParaBinario (numero, bits);
                        JOptionPane.showMessageDialog(null,
                            "O número " + numero + " é igual a:\n" + binario + " em binário (" + bits + " bits).",
                            "Sucesso", JOptionPane.PLAIN_MESSAGE);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null,
                        "Entrada inválida! Por favor, insira um número válido.",
                        "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    // Converte numero em binário com o número de bits especificado
    public static String intParaBinario(int numero, int bits) {
        String binario = Integer.toBinaryString (numero);

        // Pega apenas os últimos caracteres (bits)
        if (binario.length() > bits) {
            binario = binario.substring(binario.length() - bits);
        } else {
            // Preenche com zeros à esquerda
            while (binario.length() < bits) {
                binario = "0" + binario;
            }
        }
        return binario;
    }
}
