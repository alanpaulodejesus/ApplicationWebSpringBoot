package sql.connection;
import java.sql.*;
import java.util.ArrayList;
public class QueryConnection {
    public static ResultSet data(String data, String sql) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/agenda", "root", "");

        PreparedStatement statement = con.prepareStatement(sql);
        ResultSet result = statement.executeQuery();
        ArrayList<String> sqlData = new ArrayList<String>();

        while(result.next())
        {
            sqlData.add(data= result.getString("nome"));
            break;
        }
        return result;
    }
}
