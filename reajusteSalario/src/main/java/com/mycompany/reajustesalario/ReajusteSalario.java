package com.mycompany.reajustesalario;
import java.util.Scanner;

/**
 *
 * @author CT Desenvolvimento
 */
public class ReajusteSalario {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o salário atual: ");
        float salarioAtual = entrada.nextFloat();
        float reajuste =  salarioAtual * 0.19f;
        float salarioFinal = reajuste + salarioAtual;

        System.out.printf("Seu salario é: R$%.2f \nO reajuste foi de: R$%.2f \nO seu salario depois do reajuste é de: R$%.2f",salarioAtual, reajuste, salarioFinal);
    }
}
