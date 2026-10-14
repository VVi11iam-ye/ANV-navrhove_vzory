import Builder.CustomDrink;
import Factory.DrinkFactory;
import Singleton.CafeConfig;

public class Main {
    public static void main(String[] args) {
        System.out.println(DrinkFactory.createDrink("tea").serve() + " in " + CafeConfig.getInstance().getCafeName());

        CustomDrink customDrink = new CustomDrink.Builder("coffee")
                .milk()
                .sugar()
                .build();

        System.out.println(customDrink + " in " + CafeConfig.getInstance().getCafeName());
    }
}