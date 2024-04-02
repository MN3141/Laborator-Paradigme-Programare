package org.example;

public class AdvancedCalculator extends Calculator {
    public AdvancedCalculator(float x) {
        super(x);
    }

    public void sqrt() {
        if (value >= 0) {
            this.value = (float) (Math.sqrt(this.value));
        }

    }

}
