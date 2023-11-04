// Jeremi Toroj 4.11.2023

public class Main {
    public static void main(String[] args) {

        MyMap<Integer, String> devicePrices = new MyMap<>();

        // adding first elements
        devicePrices.put(2, "cellphone");
        devicePrices.put(1, "car");
        devicePrices.put(10000, "empty can");

        devicePrices.put(2, "knife");                       // overwrites the previous value at key 2

        System.out.println("House: " + devicePrices);       // toString() grants access to printing

        System.out.println(devicePrices.get(1));            // access to value through key
        System.out.println(devicePrices.containsKey(2));    // check if key exists

        // thief
        Thief thief = new Thief();
        devicePrices.acceptVisitor(thief);                  // here thief steals items

        // map after theft
        System.out.println("House after theft: " + devicePrices);
    }
}
