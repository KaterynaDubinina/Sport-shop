package app.purchase;

import app.brand.Brand;

public interface Order {

    String name();
    Brand brand();
    float price();
}
