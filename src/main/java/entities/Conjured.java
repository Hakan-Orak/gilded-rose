package entities;

public class Conjured extends Item {
    public Conjured(String name, Integer sellIn, Integer quality, String type, Integer price) {
        super(name, sellIn, quality, type, price);
    }

    @Override
    public void UpdateQuality() {
        this.sellIn --;
        this.quality -= 2;
    }
}

