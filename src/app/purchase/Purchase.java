package app.purchase;

import app.purchase.Order;

import java.util.ArrayList;
import java.util.List;

public class Purchase {

    public final static String PRICE = "\uD83D\uDCB2";
    List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public float getCost() {
        float cost = 0.0f;

        for (Order order : orders) {
            cost += order.price();
        }
        return cost;
    }

    public void showOrders() {
        for (Order order : orders) {
            System.out.print("\uD83D\uDED2 Name  : " + order.name());
            System.out.print("\n   Brand : " + order.brand().brand());
            System.out.println("\n   Price : " + PRICE + order.price());
        }
    }
}
