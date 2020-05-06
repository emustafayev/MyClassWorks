package lesson35.warUp.sql;

import java.sql.*;

public class SQLServer {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","efqan1999");
        String SQL = "SELECT title, CONCAT(FLOOR(length/60),':',MOD(length,60)) AS 'Length' FROM sakila.film";
        PreparedStatement stm = conn.prepareStatement(SQL);
        ResultSet result = stm.executeQuery();
        while (result.next()){
            String title = result.getString("title");
            String length = result.getString("length");
            System.out.printf("%s %15s\n",title,length);
        }
    }
}

