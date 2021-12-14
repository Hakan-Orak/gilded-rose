package entities;

public class Conjured extends Item {
    public Conjured(String name, Integer sellIn, Integer quality, Integer price) {
        super(name, sellIn, quality, price);
    }

    @Override
    public void update() {
        this.sellIn --;
        this.quality -= 2;
        this.CellQualityTo50();
        this.FloorQualityTo0();
    }
}

