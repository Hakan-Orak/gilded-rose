package entities;

public class LegendaryItem extends Item {

    public LegendaryItem(String name, Integer sellIn, Integer quality, String type, Integer price) {
        super(name, sellIn, quality, type, price);
    }

    @Override
    public void UpdateQuality() {
        this.sellIn --;
        this.quality = 50;
    }
}
