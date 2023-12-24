package sql.connection;

import java.sql.*;

public class SingletonConnection {

    private static String url="jdbc:mysql://localhost/agenda";
    private static String username="root";
    private static String password="";
    private static Connection connection=null;

    private static void connectar(){

        try {
            if(connection==null){
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(url, username, password);
                connection.setAutoCommit(false);
                System.out.println("conectou com sucesso!!");
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection(){
        connectar();
        return connection;
    }

}
