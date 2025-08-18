package com.mycompany.senha;
import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a senha numérica: ");
        String sequencia = entrada.next(); 
        
        StringBuilder senha = new StringBuilder();
        for (char num : sequencia.toCharArray()) {
            int numero = Character.getNumericValue(num);    
            
            switch (numero) {
                case 1:
                case 7:
                    senha.append('A');
                    break;
                case 3:
                case 9:
                    senha.append('B');
                    break;
                case 0:
                case 8:
                    senha.append('C');
                    break;
                case 5:
                case 6:
                    senha.append('D');
                    break;
                case 2:
                case 4:
                    senha.append('E');
                    break;
                default:
                    System.out.println("Número inválido: " + numero);
                    return;
            }
        }

        String senhaC = senha.toString();
        System.out.println("A senha é: " + senhaC);
    }
}
