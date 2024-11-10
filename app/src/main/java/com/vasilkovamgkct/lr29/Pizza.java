
package com.vasilkovamgkct.lr29;

public class Pizza {
    private String name;
    private int imageResourceId;

    public static Pizza[] pizzas = {
            new Pizza("Диаволо", R.drawable.diavalo),
            new Pizza("Фунги", R.drawable.fungi),
            // Добавьте другие пиццы здесь
    };

    public Pizza(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
