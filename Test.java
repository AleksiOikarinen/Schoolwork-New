import java.util.ArrayList;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Kia");
        cars.add("Tesla");
        cars.add("BMW");
        cars.add("Renault");

        for (String car : cars) {
            System.out.println(car);
        }

        cars.add(1, "Ford");

        cars.remove("Tesla");

        int index = cars.indexOf("BMW");
        if (index != -1) {
            cars.set(index, "Audi");
        }

        System.out.println("MODIFIED LIST");
        for (String car : cars) {
            System.out.println(car);
        }

        Collections.sort(cars);

        System.out.println("SORTED LIST");
        for (String car : cars) {
            System.out.println(car);

        }     //Pahoittelut viivästyksestä

    }
}
