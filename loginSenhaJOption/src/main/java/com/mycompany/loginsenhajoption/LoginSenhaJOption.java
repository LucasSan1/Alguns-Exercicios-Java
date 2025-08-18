package com.mycompany.loginsenhajoption;
import javax.swing.JOptionPane;

public class LoginSenhaJOption {

    public static void main(String[] args) {
        String login, senha, log , sen;

        // Mostra um pop up para cadastrar o login e a senha
        login = JOptionPane.showInputDialog("Cadastre seu login: ");
        senha = JOptionPane.showInputDialog("Cadastre sua senha: ");
        // Mostra um pop up para validadar o login e a senha
        log = JOptionPane.showInputDialog("Login: ");
        sen = JOptionPane.showInputDialog("Senha: ");

        // compara se o login e a senha inseridos são os mesmos cadastrados e retorna uma mensagem
        while(true){
            if (login.compareTo(log) == 0 & senha.compareTo(sen) == 0){
                JOptionPane.showMessageDialog(null, "Logado com sucesso", "Logado", JOptionPane.PLAIN_MESSAGE);
            break;
           } 
            else{ 
               JOptionPane.showMessageDialog(null, "Login ou Senha incorreto tente novamente", "Login ou senha incorretos", JOptionPane.ERROR_MESSAGE);
               log = JOptionPane.showInputDialog("Login: ");
               sen = JOptionPane.showInputDialog("Senha: ");  
            
            }
        }
    }
}
