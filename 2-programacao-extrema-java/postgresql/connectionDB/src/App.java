import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class App {
    final static String USER = "postgres";
    final static String PASSWOR = "postgresql";
    final static String URL = "jdbc:postgresql://localhost:5432/descomplica";
    final static String DRIVER = "org.postgresql.Driver";

    public static void main(String[] args) {
        try {
            Class.forName(DRIVER);
            Connection connection = DriverManager.getConnection(URL, USER, PASSWOR);
            
            Statement stmt = connection.createStatement();
            addPessoa(connection, "Marcos");
            getPessoas(stmt);
            updatePessoa(connection, 1, "João");
            getPessoas(stmt);
            deletePessoa(connection, 2);
            getPessoas(stmt);

        } catch (Exception e) {
            System.out.println("Erro: "+e.getMessage());
        }
    }

    public static int getMaxSequence(Statement stmt) throws SQLException {
        ResultSet rs = stmt.executeQuery("SELECT MAX(id) FROM pessoas");
        rs.next();
        return rs.getInt("max");
    }

    public static void getPessoas(Statement stmt) throws SQLException {
        ResultSet rs = stmt.executeQuery("SELECT id, name FROM pessoas");
            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("id: "+id+" - name: "+name);
            }
            System.out.println("Consulta realizada com sucesso.");
    }

    public static void addPessoa(Connection connection,String name) throws SQLException {
        Statement stmt = connection.createStatement();
        int maxSequence = getMaxSequence(stmt);

        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO pessoas(id, name) VALUES(?,?)");
        preparedStatement.setInt(1, maxSequence+1);
        preparedStatement.setString(2, name);

        preparedStatement.executeUpdate();

        System.out.println("Inclusão realizada com sucesso.");
    }

    public static void updatePessoa(Connection connection, int id, String name) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("UPDATE pessoas SET name = ? WHERE ID = ?");
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, id);
        
        preparedStatement.executeUpdate();

        System.out.println("Atualização realizada com sucesso.");
    }

    public static void deletePessoa(Connection connection, int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM pessoas WHERE id = ?");
        preparedStatement.setInt(1, id);

        preparedStatement.executeUpdate();

        System.out.println("Remoção realizada com sucesso.");
    }
}
