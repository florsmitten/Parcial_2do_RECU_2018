package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String server = "jdbc:sqlserver://192.168.1.175\\SQL2005;databaseName=ProgramacionAvanzada";
    private static String user = "alumno";
    private static String password = "USAL";

    static {
        try {
            Class.forName(driver);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(server, user, password);
    }
}
