package dat;

import entities.Bog;
import entities.Borrower;
import persistence.BibliotekMapper;
import persistence.Database;

import java.util.List;

public class Main {
    private final static String USER = "root";
    private final static String PASSWORD = "mysql123";
    private final static String URL = "jdbc:mysql://localhost:3306/bibliotek?serverTimezone=CET&useSSL=false&allowPublicKeyRetrieval=true";

    public static void main(String[] args) {

        Database db = new Database(USER, PASSWORD, URL);
        BibliotekMapper bibliotekMapper = new BibliotekMapper(db);
        Borrower laaner = bibliotekMapper.findBorrower(1);

        MainSupport ms = new MainSupport();
        ms.showBorrowerWithSpecificId(laaner);
        ms.findAllBorrowersAndShowTheirData(db);
    }
}