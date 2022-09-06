package bridge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SystemInterface {

    public static void main(String[] args) {

        // Ex 1
        Map<String, Car> cars = new HashMap<>();
        cars.put("AB123456",new Car("red", 4, 6.20, "AB123456"));
        cars.put("AZ123456",new Car("Blue", 2, 5.20, "AZ123456"));
        cars.put("AQ123456", new Car("green", 1, 8.20, "AQ123456"));

        System.out.println(cars.get("AB123456"));

        // Continued
        Set<String> lillebealt = new HashSet<>();
        Set<String> storebealt = new HashSet<>();

        lillebealt.add("AB123456");
        lillebealt.add("AZ123456");
        storebealt.add("AB123456");
        storebealt.add("AQ123456");

        var temp = lillebealt;
        temp.retainAll(storebealt);
        System.out.println(temp);

    }
}
