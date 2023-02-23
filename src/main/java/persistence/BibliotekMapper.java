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

        String sql = "SELECT * FROM member_view;"; // TODO

        try (Connection connection = database.connect()) {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    int memberId = rs.getInt("member_id");
                    String name = rs.getString("name");
                    String address = rs.getString("address");
                    int zip = rs.getInt("zip");
                    String city = rs.getString("city");
                    String gender = rs.getString("gender");
                    int year = rs.getInt("year");

                    bogList.add(new Bog(memberId, name, address, zip, city, gender, year));
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
