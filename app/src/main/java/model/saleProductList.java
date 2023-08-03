package model;


import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class saleProductList {
    private String name;

    private Items[] items;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Items[] getItems() {
        return items;
    }

    public void setItems(Items[] items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "ClassPojo [name = " + name + ", items = " + items + "]";
    }

}