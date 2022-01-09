package entities.item;

public class ConjuredItem extends Item {
    public ConjuredItem(String name, Integer sellIn, Integer quality, Integer price) {
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

