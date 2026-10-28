public class Main {

    public static void main(String[] args) {

        // Create the first Car object
        Car car1 = new Car(
                "Corolla",
                "Toyota",
                2024,
                25000.0,
                "White",
                5
        );

        // Create the second Car object with the same values
        Car car2 = new Car(
                "Corolla",
                "Toyota",
                2024,
                25000.0,
                "White",
                5
        );

        // Print the information about both cars
        System.out.println(car1);
        System.out.println(car2);

        // Compare the objects using equals()
        System.out.println("Are both cars equal? " + car1.equals(car2));

        // Print the hash codes
        System.out.println("Hash code of car1: " + car1.hashCode());
        System.out.println("Hash code of car2: " + car2.hashCode());

        // Compare the hash codes
        System.out.println(
                "Are both hash codes equal? " +
                        (car1.hashCode() == car2.hashCode())
        );
    }
}
