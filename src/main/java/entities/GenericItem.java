package entities;

public class GenericItem extends Item {
    public GenericItem(String name, Integer sellIn, Integer quality, String type, Integer price) {
        super(name, sellIn, quality, type, price);
    }

    @Override
    public void UpdateQuality() {
        this.sellIn --;
        this.quality --;
    }
}
