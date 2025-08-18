package com.mycompany.validacaoplacajoption;
import javax.swing.JOptionPane;

public class ValidacaoPlacaJOption {
    public static void main(String[] args) {
        String placa;

        do {
            placa = JOptionPane.showInputDialog("Digite a placa: ").toUpperCase();
        } while (!validarPlaca(placa));

        JOptionPane.showMessageDialog(null, "Placa válida: " + placa, "Sucesso", JOptionPane.PLAIN_MESSAGE);
    }

    public static boolean validarPlaca(String placa) {
        // Verifica se tem exatamente 7 caracteres
        if (placa == null || placa.length() != 7) {
            JOptionPane.showMessageDialog(null, "A placa deve conter 7 caracteres.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Valida formato antigo: LLLNNNN
        if (placa.matches("[A-Z]{3}[0-9]{4}")) {
            return true;
        }

        // Valida formato novo (Mercosul): LLNLNNN
        if (placa.matches("[A-Z]{3}[0-9][A-Z][0-9]{2}")) {
            return true;
        }

        // Se não for nenhum dos dois formatos, retorna erro
        JOptionPane.showMessageDialog(null,
            "Placa inválida!\nFormatos aceitos:\n- Antiga: ABC1234\n- Nova: ABC1D23",
            "Erro", JOptionPane.ERROR_MESSAGE);
        return false;
    }
}
