package com.mycompany.cursonasajop;
import javax.swing.JOptionPane;

public class CursoNASAJOP {
    public static void main(String[] args) {
        int aprovados = 0;
        int reprovados = 0;
        int faltaram = 0;
        
        // Recebe o valor do total de alunos
        int totalAlunos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número total de alunos: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

        // Cria um loop com o valor para rodar enquanto i for menor que o total de alunos
        for (int i = 0; i < totalAlunos; i++) {
            int resultado = Integer.parseInt(JOptionPane.showInputDialog(null,"Inserir resultado: \n1 - Aprovado \n2 - Reprovado \n3 - Faltou ", "Inserir", JOptionPane.PLAIN_MESSAGE));

            // Verifica o digito de entrada e encrementa +1 no em umas da variaveis
            switch (resultado) {
                case 1:
                    aprovados++;
                    break;
                case 2:
                    reprovados++;
                    break;
                case 3:
                    faltaram++;
                    break;
                // Se o valor digitado não estiver entre 1 e 3 ele entra na mensagem de erro e decrementa o indice para que a entrada seja repetida sem alterar a quantidade de entradas
                default:
                    JOptionPane.showMessageDialog(null, "Resultado inválido. Use 1 para aprovado, 2 para reprovado ou 3 para faltou.", "ERRO", JOptionPane.ERROR_MESSAGE);
                    i--;
            }
        }

        // Verifica a porcentagem de alunos aprovados reprovados e faltantes e exibe os resultados
        double porcentagemAprovados = ((double) aprovados / totalAlunos) * 100;
        double porcentagemReprovados = ((double) reprovados/ totalAlunos) * 100;
        double porcentagemFalta = ((double) faltaram/ totalAlunos) * 100;

           JOptionPane.showMessageDialog(null,
                "Total de alunos aprovados: " + porcentagemAprovados + "%\n" +
                "Total de alunos reprovados: " + porcentagemReprovados + "%\n" +
                "Total de alunos que faltaram: " + porcentagemFalta + "%", "RESULTADO", JOptionPane.PLAIN_MESSAGE);

        // Exibe uma mensagem caso a porcentagem de aprovados for maior que 70% e outra se for menor
        if (porcentagemAprovados > 70) {
            JOptionPane.showMessageDialog(null, "Curso Aprovado e Reconhecido", "RESULTADO", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "EXAME REALIZADO", "RESULTADO", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
