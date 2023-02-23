package persistence;

import entities.Bog;
import entities.Borrower;

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

    public Borrower findBorrower(int borrowerId) {

        List<Bog> bogList = new ArrayList<>();

        String sql = "SELECT * FROM laaner\n" +
                "where laaner_id = ?;";

        try (Connection connection = database.connect()) {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setInt(1,borrowerId);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    String name = rs.getString("navn");
                    String address = rs.getString("adresse");
                    int postNr = rs.getInt("postnr");

                    return new Borrower(borrowerId,name,address,postNr);

                }
            } catch (SQLException throwables) {
                // TODO: Make own throwable exception and let it bubble upwards
                throwables.printStackTrace();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public List<Borrower> findAllBorrowers() {

        List<Borrower> borrowerList = new ArrayList<>();

        String sql = "select * from laaner l\n" +
                "inner join postnummer p \n" +
                "using(postnr);";

        try (Connection connection = database.connect()) {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    int postNr = rs.getInt("postnr");
                    int laanerId = rs.getInt("laaner_id");
                    String name = rs.getString("navn");
                    String address = rs.getString("adresse");
                    String city = rs.getString("by");

                    borrowerList.add(new Borrower(laanerId,name,address,postNr,city));
                }
            } catch (SQLException throwables) {
                // TODO: Make own throwable exception and let it bubble upwards
                throwables.printStackTrace();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return borrowerList;
    }

}
