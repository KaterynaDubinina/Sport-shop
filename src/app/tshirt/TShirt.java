package app.tshirt;

import app.brand.ActiveSports;
import app.brand.Brand;
import app.purchase.Order;

public abstract class TShirt implements Order {
    @Override
    public Brand brand() {
        return new ActiveSports();
    }

    @Override
    public abstract float price();
}
