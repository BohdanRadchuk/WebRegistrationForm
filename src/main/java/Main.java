import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {


        private InitialContext ic;
        private DataSource ds;
        public static void main(String[] args) throws SQLException {
            Main maaa = new Main();
            Connection connection = null;
            try {
                connection = maaa.getConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (NamingException e) {
                e.printStackTrace();
            }
            if (connection.isClosed()){
                System.out.println(connection.isClosed());
            };

        }

        public Connection getConnection () throws SQLException, NamingException {
            ic = new InitialContext();
            System.out.println( ic.lookup("java:/comp/env/jdbc/regform"));
            ds = (DataSource) ic.lookup("java:/comp/env/jdbc/regform"); // вместо написать java:/comp/env/jdbc/TestDB
            return ds.getConnection();
        }
    }


