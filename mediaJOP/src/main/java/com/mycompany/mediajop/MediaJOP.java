package com.mycompany.mediajop;
import javax.swing.JOptionPane;

public class MediaJOP {
    public static void main(String[] args) {
        float nota = 0;
        String notaIn;
        float soma = 0;
        int quantidadeNotas = 0;
        
        while (true) {
            // Recebe uma nota em formato string 
            notaIn =JOptionPane.showInputDialog(null,"Digite uma nota de 0 a 100 \nPara encerrar digite -1:", "Entrada", JOptionPane.PLAIN_MESSAGE);
            // Tenta transformar o valor recebido em um valor numerico(float)
            try{
                nota = Float.parseFloat(notaIn);
            }
            // Caso o valor não seja um numero ele vai exibir uma mensagem de erro e continuara o codigo
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "O caractere digitado não é um numero", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            
            // Caso o valor digitado seja -1 o loop sera quebrado 
            if (nota == -1) {
                break;
            }
            
            //  Se o valor digitado for menor que 0 (com exceção do -1) ou maior que 100 vai exibir uma mensagem de valor invalido e vai continuar
            if (nota < 0 || nota > 100) {
                JOptionPane.showMessageDialog(null, "Por favor, digite uma nota válida entre 0 e 100.", "Erro", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            
            soma += nota;
            quantidadeNotas++;
        }
        
        // Se a quantidade de notas for maior que 0, é feito o calculo da media e exibira o Resultado
        // Se a quantidade de notas for = 0 exibira uma mensagem de erro
        if (quantidadeNotas > 0) {
            double media = (double) soma / quantidadeNotas;
            JOptionPane.showMessageDialog(null, "Quantidade de notas informadas = " + quantidadeNotas + "\nMedia = " + media, "Resultado", JOptionPane.PLAIN_MESSAGE);
        } 
        else {
            JOptionPane.showMessageDialog(null, "Nenhuma nota válida foi informada.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
