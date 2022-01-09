package entities.shop;

import entities.item.Item;

import java.util.List;

public class ShopInteractor {
//    private ShopRepository repository;
    private List<Item> items;

    public ShopInteractor(List<Item> items) {
//        this.repository = shopRepository;
        this.items = items;
    }


    public Integer getShopGold() {
        Integer shopGold = 0;
        for(Item item: items) {
            shopGold += item.value;
        }
        return shopGold;
    }

    public void setShopGold(){

    }

    public void updateQuality() {
        for(Item item: items) {
            item.update();
        }
//        this.repository.saveShop(items);
    }


}
