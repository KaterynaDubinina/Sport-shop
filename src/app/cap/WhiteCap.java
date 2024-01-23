package app.cap;

import app.cap.Cap;

public class WhiteCap extends Cap {

    @Override
    public float price() {
        return 99.0f;
    }

    @Override
    public String name() {
        return "White cap";
    }
}
