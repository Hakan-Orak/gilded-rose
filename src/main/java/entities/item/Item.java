package entities.item;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "item")
public abstract class Item {

    public Item(){};

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    public String name;

    @Column(name = "sellIn")
    public Integer sellIn;

    @Column(name = "quality")
    public Integer quality;

    @Column(name = "value")
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
