package entities.shop;

import entities.item.Item;

import java.util.List;

public interface ShopRepository {
    Integer getShopGold();
    void setShopGold(Integer gold, String typeOperation);
    void saveShop(List<Item> items);
}
