package io.github.nasvillanueva.springdemo.dto;

import io.github.nasvillanueva.springdemo.constants.MathOperation;

public class MathRequest {
    private int x;
    private int y;
    private MathOperation op;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public MathOperation getOp() {
        return op;
    }

    public void setOp(MathOperation op) {
        this.op = op;
    }
}
