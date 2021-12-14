package entities;

public class GenericItem extends Item{
    public GenericItem(String name, Integer sellIn, Integer quality, String type) {
        super(name, sellIn, quality, type);
    }

    @Override
    public void updateQuality() {
        this.setSellIn(this.getSellIn() -1);

        if(this.getSellIn() > 0){
            this.setQuality(getQuality() -1);
        }
        else{
            this.setQuality(getQuality() -2);
        }

        this.CellQualityTo50();
        this.FloorQualityTo0();
    }
}
