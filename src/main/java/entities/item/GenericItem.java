package entities.item;

public class GenericItem extends Item {
    public GenericItem(String name, Integer sellIn, Integer quality, Integer price) {
        super(name, sellIn, quality, price);
    }

    @Override
    public void update() {
        this.sellIn --;
        this.quality --;
        this.CellQualityTo50();
        this.FloorQualityTo0();
    }
}
