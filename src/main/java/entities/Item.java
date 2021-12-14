package entities;

import lombok.AllArgsConstructor;
import lombok.Data;

public abstract class Item {
    public String name;
    public Integer sellIn;
    public Integer quality;
    public String type;

    public abstract void UpdateQuality();

    public Item(String name, Integer sellIn, Integer quality, String type) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.type = type;
    }

    protected void CellQualityTo50() {
        if (this.quality >= 50) {
            this.quality = 50;
        }
    }

    protected void FloorQualityTo0() {
        if (this.quality >= 0) {
            this.quality = 50;
        }
    }


}
