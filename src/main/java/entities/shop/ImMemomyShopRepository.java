package entities.shop;

import entities.item.GenericItem;
import entities.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ImMemomyShopRepository implements ShopRepository {
    private List<Item> items;

    public ImMemomyShopRepository(){
        this.items = new ArrayList<>();
        this.items.add(new GenericItem("Coque de maille", 20, 20, 2900));
    }

    @Override
    public Integer getShopGold() {
        Integer shopGold = 0;
        for(Item item: items) {
            shopGold += item.value;
        }
        return shopGold;
    }

    @Override
    public void setShopGold(Integer gold, String typeOperation) {
        if (typeOperation.equals("add")) {

        }
    }

    @Override
    public void saveShop(List<Item> items) {
        this.items = items;
    }
}
