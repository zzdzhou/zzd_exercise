package jack.dataaccess.jdbc;

import java.sql.*;
import java.util.Properties;

public class HelloWorld {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
/*            Properties props = new Properties();
            props.put("user", "root");
            props.put("password", "zzde");*/
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zhibernate?serverTimezone=GMT%2B7",
                    "root", "zzde");

            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("select * from customer");
            while (rs.next()) {
                String email = rs.getString("email");
                System.out.println(email);
            }
            stat.close();
            con.close();
            System.exit(0);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
