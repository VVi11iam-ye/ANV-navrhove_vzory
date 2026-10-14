package Factory;

public class DrinkFactory {
    public static Drink createDrink(String type) {
        if (type == null) {
            return null;
        }

        if (type.equalsIgnoreCase("tea")) {
            return new Tea();
        } else if (type.equalsIgnoreCase("coffee")) {
            return new Coffee();
        }

        return null;
    }
}