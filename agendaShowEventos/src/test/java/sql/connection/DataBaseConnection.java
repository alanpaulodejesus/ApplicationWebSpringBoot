package sql.connection;

import java.sql.*;

public class DataBaseConnection {

     private static String url="jdbc:mysql://localhost/agenda";
     private static String username="root";
     private static String password="";
     private static Connection connection=null;
     public static Connection con;
    public static Statement stmt;
    public static ResultSet rs;

    public static void connectar(){

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

        public DataBaseConnection createQuery() throws SQLException {
            //query = "select * from test where no = 1;";
            stmt = connection.createStatement();
            return new DataBaseConnection();
        }

        public DataBaseConnection executeQuery(String sql) throws SQLException {
            rs = stmt.executeQuery(sql);
            return new DataBaseConnection();
        }

        public DataBaseConnection getData( String coluna) throws SQLException {
            while (rs.next()){
                rs.getString(coluna);
            }
            return new DataBaseConnection();
        }

        public DataBaseConnection closeConnection() throws SQLException {
            connection.close();
            return new DataBaseConnection();
        }

        public void iniciar(String sql, String coluna) throws SQLException {
            connectar();
            createQuery();
            executeQuery(sql);
            getData(coluna);
        }
}
