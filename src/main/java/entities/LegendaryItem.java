package entities;

public class LegendaryItem extends Item {

    public LegendaryItem(String name, Integer sellIn, Integer quality, String type) {
        super(name, sellIn, quality, type);
    }

    @Override
    public void UpdateQuality() {
        this.sellIn --;
        this.quality = 80;
    }



}
