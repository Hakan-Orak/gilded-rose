package entities.shop;

import entities.Item;

import java.util.ArrayList;
import java.util.List;

public class ShopInteractor {
    private ShopRepository repository;
    private List<Item> items;

    public ShopInteractor(ShopRepository shopRepository) {
        this.repository = shopRepository;
    }

    public Integer getShopGold() {
        Integer shopGold = 0;
        for(Item item: items) {
            shopGold += item.value;
        }
        return shopGold;
    }

    public void updateQuality() {
        for(Item item: items) {
            item.update();
        }
        this.repository.saveShop(items);
    }


}
