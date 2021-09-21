package school.configConnect;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConfigConnect {
    public static final String URL = "jdbc:mysql://localhost:3306/sql_hr";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    public static Connection creatConnection() throws SQLException {
        MysqlDataSource datasource = new MysqlDataSource();
        datasource.setURL(URL);
        datasource.setPassword(PASSWORD);
        datasource.setUser(USERNAME);
        Connection connection = datasource.getConnection();
        return connection;
    }
}
