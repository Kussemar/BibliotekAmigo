package dat;

import entities.Bog;

import java.util.List;

public class MainSupport {
    public void showBorrowerWithSpecificId(List<Bog> bog){
        System.out.println("*** Viser nr 1 ***");
        for (Bog b: bog) {
            System.out.println(b.toString());
        }
    }
}
