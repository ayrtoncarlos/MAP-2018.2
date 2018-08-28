package br.cesed.unifacisa.si.map.exercicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author Ayrton Andrade
 *
 *	Classe que representa uma conexão de banco de dados.
 */
public class DatabaseConnection 
{
	private static Connection connection;
    private static String dsn = "jdbc:mysql://localhost:3306/agendaapp";
    private static String username = "root";
    private static String password = "root";
    
    /**
     * Método que cria uma instância de conexão para o banco de dados.
     * @return connection - Uma instância para a conexão com o banco de dados.
     */
    public static Connection getConnection() 
    {
        if (connection == null) 
        {
            try 
            {
                connection = DriverManager.getConnection(dsn, username, password);
            } 
            catch (SQLException ex) 
            {
                System.out.println("Houve um erro ao conectar com o Banco de Dados.");
            }
        }
        
        return connection;
    }
}