package net.harawata.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by soso on 4/9/17.
 */

public class Car {

    private String name;

    private String color;

    private String maker;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }
}
