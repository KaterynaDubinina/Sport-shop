package app.tshirt;

public class BlueTShirt extends TShirt {

    @Override
    public float price() {
        return 150.0f;
    }

    @Override
    public String name() {
        return "Blue T-shirt";
    }
}
