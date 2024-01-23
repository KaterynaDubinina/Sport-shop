package app.purchase;

import app.cap.BlackCap;
import app.cap.WhiteCap;
import app.purchase.Purchase;
import app.tshirt.BlueTShirt;
import app.tshirt.RedTShirt;

public class PurchaseBuilder {

    public Purchase prepareOrderA() {
        Purchase purchase = new Purchase();
        purchase.addOrder(new RedTShirt());
        purchase.addOrder(new WhiteCap());
        return purchase;
    }

    public Purchase prepareOrderB() {
        Purchase purchase = new Purchase();
        purchase.addOrder(new BlueTShirt());
        purchase.addOrder(new BlackCap());
        return purchase;
    }
}
