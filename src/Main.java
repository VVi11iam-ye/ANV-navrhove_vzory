import Builder.CustomDrink;
import Factory.DrinkFactory;
import Singleton.CafeConfig;

public class Main {
    public static void main(String[] args) {
        // První příklad z Factory
        System.out.println(DrinkFactory.createDrink("tea").serve() + " in " + CafeConfig.getInstance().getCafeName());

        // Druhý příklad z Builderu
        CustomDrink customDrink = new CustomDrink.Builder("coffee")
                .milk()
                .sugar()
                .build();

        System.out.println(customDrink + " in " + CafeConfig.getInstance().getCafeName());
    }
}