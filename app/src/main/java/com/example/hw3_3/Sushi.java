package com.example.hw3_3;

public class Sushi {
    String title;
    String Ingredients;
    int image;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIngredients() {
        return Ingredients;
    }

    public void setIngredients(String ingredients) {
        Ingredients = ingredients;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Sushi(String title, String ingredients, int image) {
        this.title = title;
        Ingredients = ingredients;
        this.image = image;
    }
}
