package app.cap;

import app.cap.Cap;

public class BlackCap extends Cap {

    @Override
    public float price() {
        return 105.0f;
    }

    @Override
    public String name() {
        return "Black cap";
    }
}

