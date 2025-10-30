import java.util.ArrayList;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Kia");
        cars.add("Tesla");
        cars.add("BMW");
        cars.add("Renault");

        // Print the original ArrayList (line by line)
        for (String car : cars) {
            System.out.println(car);
        }

        // Insert Ford after Kia
        cars.add(1, "Ford");

        // Delete Tesla
        cars.remove("Tesla");

        // Change BMW to Audi
        int index = cars.indexOf("BMW");
        if (index != -1) {
            cars.set(index, "Audi");
        }

        // Print modified list
        System.out.println("MODIFIED LIST");
        for (String car : cars) {
            System.out.println(car);
        }

        // Sort the list
        Collections.sort(cars);

        // Print sorted list
        System.out.println("SORTED LIST");
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
