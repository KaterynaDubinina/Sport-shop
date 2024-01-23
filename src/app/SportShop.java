package app;

import app.purchase.Purchase;
import app.purchase.PurchaseBuilder;

public class SportShop {


    public static void main(String[] args) {

        final String PRICE = "\uD83D\uDCB2";

        PurchaseBuilder purchaseBuilder = new PurchaseBuilder();

        Purchase orderA = purchaseBuilder.prepareOrderA();
        System.out.println("\n\uD83C\uDD70\uFE0F Order ");
        orderA.showOrders();
        System.out.println("-".repeat(50) +
                "\n\u2705 Total Cost: " + PRICE + orderA.getCost());

        Purchase orderB = purchaseBuilder.prepareOrderB();
        System.out.println("\n\uD83C\uDD71\uFE0F Order ");
        orderB.showOrders();
        System.out.println("-".repeat(50) +
                "\n\u2705 Total Cost: " + PRICE + orderB.getCost());
    }
}
