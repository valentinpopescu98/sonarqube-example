public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Employee employee = new Employee("Valentin", "Popescu", 24,
                new Address("Aleea Mioritei", 3, "Potcoava",
                        "Olt", "Romania", 237355));

        System.out.println(employee);
    }
}
