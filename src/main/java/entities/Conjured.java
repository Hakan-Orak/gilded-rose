package entities;

public class Conjured extends Item {

    public Conjured(String name, Integer sellIn, Integer quality, String type) {
        super(name, sellIn, quality, type);
    }

    @Override
    public void update() {
        this.sellIn -=1;
        this.setQuality(getQuality() -2);

        this.CellQualityTo50();
        this.FloorQualityTo0();
    }
}

