package persistence;

import entities.Bog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BibliotekMapper {
    private Database database;

    public BibliotekMapper(Database database) {
        this.database = database;
    }

    public List<Bog> findBorrower() {

        List<Bog> bogList = new ArrayList<>();

        String sql = "SELECT * FROM laaner\n" +
                "where laaner_id = 1;";

        try (Connection connection = database.connect()) {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    int bogId = rs.getInt("bog_id");
                    String titel = rs.getString("titel");
                    int udgivelsesaar = rs.getInt("udgivelsesaar");
                    int forfatterId = rs.getInt("forfatterId");

                    bogList.add(new Bog(bogId, titel, udgivelsesaar, forfatterId));
                }
            } catch (SQLException throwables) {
                // TODO: Make own throwable exception and let it bubble upwards
                throwables.printStackTrace();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return bogList;
    }
}
