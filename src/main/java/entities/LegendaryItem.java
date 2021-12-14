package entities;

public class LegendaryItem extends Item{

    public LegendaryItem(String name, Integer sellIn, Integer quality, String type) {
        super(name, sellIn, quality, type);
    }

    @Override
    public void update() {
        this.sellin --;
        this.quality = 80;
    }   public Legendary(String nom, int sellin, int quality) {
        super(nom, sellin, quality);
    }

    @Override
    public void update() {
        this.sellin --;
        this.quality = 80;
    }
}
