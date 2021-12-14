package entities.shop;

import entities.Item;

import java.util.List;

public interface ShopRepository {
    Integer getShopGold();
    void saveShop(List<Item> items);
}
