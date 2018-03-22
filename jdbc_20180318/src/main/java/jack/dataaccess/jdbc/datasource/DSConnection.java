package jack.dataaccess.jdbc.datasource;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DSConnection {

    private Connection getConnection() throws SQLException, NamingException {
        InitialContext ctx = new InitialContext();
        DataSource ds = (DataSource) ctx.lookup("java:jboss/datasources/zhibernate");
        return ds.getConnection();
    }

    public String getUserEmailById(Long id) {
        String email = null;
        try {
            Statement stat = getConnection().createStatement();
            ResultSet rs = stat.executeQuery("select * from customer where id = " + id);
            while (rs.next()) {
                email = rs.getString("email");
                return email;
            }
        } catch (NamingException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return email;
    }
}
