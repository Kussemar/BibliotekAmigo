package dat;

import entities.Bog;
import entities.Borrower;
import persistence.BibliotekMapper;
import persistence.Database;

import java.util.List;

public class MainSupport {
    public void showBorrowerWithSpecificId(Borrower laaner){
        System.out.println("*** Viser nr 1 ***");
            System.out.println(laaner.toString());
    }

    public void findAllBorrowersAndShowTheirData(Database db){
        System.out.println("*** Find alle lånere, og vis deres data inklusive postnummer og by. ***" );
        for (Borrower b: new BibliotekMapper(db).findAllBorrowers()) {
            System.out.println(b);
        }
    }

    public void findAllBooksAndTheirAuthors(Database db){
        System.out.println("*** Find alle bøger, og deres forfattere ***");
        for (Bog b: new BibliotekMapper(db).findAllBooksAndAuthors()) {
            System.out.println(b);
        }
    }
}
