package entities.transmuter;

import Shop.Shop;
import entities.item.Item;
import entities.relic.Relic;

public class Transmuter {
    private Item item;
    private Relic relic;
    private Shop shop;

    public void transmutationItem(Item item, Shop shop) {
        this.item = item;
        this.item.quality -= 10;
        if(this.item.quality < 0) {
            this.item.quality = 0;
        }

        this.shop = shop;
        this.shop.setGolds(this.shop.getGolds() + 100);
    }

    public void transmutationRelic(Relic relic, Shop shop) {
        this.relic = relic;
        this.relic.quality -= 10;
        if(this.relic.quality < 0) {
            this.relic.quality = 0.0;
        }

        this.shop = shop;
        this.shop.setGolds(this.shop.getGolds() + 100);
    }
}
