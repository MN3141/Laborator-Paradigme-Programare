package org.example;

public class Calculator {
    protected float value;

    public Calculator(float value) {
        this.value = value;
    }

    public void add(float x) {
        this.value += x;
    }

    public void subtract(float x) {
        this.value -= x;
    }

    public void multiply(float x) {
        this.value *= x;
    }

    public void divide(float x) {
        if (x != 0) this.value /= x;
    }

    public float getValue() {
        return this.value;
    }
}
