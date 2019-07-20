package com.zhengguoqiang.decorator;

/**
 * @author zhengguoqiang
 */
public abstract class Beverage {

    protected String description = "Unknown Beverage";

    protected static final int TALL = 2;
    protected static final int GRANDE = 3;
    protected static final int VENTI = 4;

    protected int size = TALL;

    public String getDescription() {
        return description + " Size:" + size;
    }

    public abstract double cost();

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
