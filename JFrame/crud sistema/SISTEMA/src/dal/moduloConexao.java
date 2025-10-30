package dal;
import java.sql.*;

public class moduloConexao {
    public static Connection conector() {
        java.sql.Connection conexao = null;
        
        //Chamando o driver
        String driver = "com.mysql.cj.jdbc.Driver";
        
        //Armazenando informaçoes referente ao banco
        String url = ""; // Trocar para as informaçoes do seu banco
        String user = "";
        String password = "";
        
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
            
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
