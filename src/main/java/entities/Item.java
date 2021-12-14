package entities;

public abstract class Item {
    public String name;
    public Integer sellIn;
    public Integer quality;
    public Integer value;

    public abstract void update();

    public Item(String name, Integer sellIn, Integer quality, Integer price) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.value = price;
    }

    protected void CellQualityTo50() {
        if (this.quality > 50) {
            this.quality = 50;
        }
    }

    protected void FloorQualityTo0() {
        if (this.quality < 0) {
            this.quality = 0;
        }
    }

    @Override
    public String toString() {
        return "Item{" +
            "name='" + name + '\'' +
            ", sellIn=" + sellIn +
            ", quality=" + quality +
            ", price=" + value +
            '}';
    }
}
