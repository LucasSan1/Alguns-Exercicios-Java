package com.mycompany.telefone;
import java.util.Scanner;

public class Telefone {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite uma palavra: ");
        String sequencia = entrada.next(); 
        
        StringBuilder numeros = new StringBuilder();
        for (char letra : sequencia.toCharArray()) {
            char letras = Character.toUpperCase(letra);
            
            int numero;
            switch (letras) {
                case 'A':
                case 'B':
                case 'C':
                    numero = 2;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    numero = 3;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    numero = 4;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    numero = 5;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    numero = 6;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    numero = 7;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    numero = 8;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    numero = 9;
                    break;
                default:
                    return;
            }
            
            numeros.append(numero);
        }

        String numero = numeros.toString();
        System.out.println("A sequencia numérica é: " + numero);
    }
}
