package app.cap;

import app.brand.Brand;
import app.purchase.Order;
import app.brand.SmartCaps;

public abstract class Cap implements Order {
    @Override
    public Brand brand() {
        return new SmartCaps();
    }

    @Override
    public abstract float price();
}
