package entities;

import entities.item.Item;

public class LegendaryItem extends Item {

    public LegendaryItem(String name, Integer sellIn, Integer quality, Integer price) {
        super(name, sellIn, quality, price);
    }

    @Override
    public void update() {}
}
