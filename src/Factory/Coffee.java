package Factory;

public class Coffee implements Drink {
    @Override
    public String serve() {
        return "Serving Factory.Coffee";
    }
}