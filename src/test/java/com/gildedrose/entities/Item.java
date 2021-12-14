package com.gildedrose.entities;

public class Item {
    private String name = "";
    private Integer sellIn = null;
    private Integer quality = 0;
    private String type = "commun";

    public Item() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSellIn() {
        return sellIn;
    }

    public void setSellIn(Integer sellIn) {
        this.sellIn = sellIn;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Item{" +
            "name='" + name + '\'' +
            ", sellIn=" + sellIn +
            ", quality=" + quality +
            ", type='" + type + '\'' +
            '}';
    }
}
