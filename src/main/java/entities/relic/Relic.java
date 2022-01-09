package entities.relic;
import Shop.Shop;
import entities.shop.ShopRepository;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Relic {
    public String name;
    public Double quality;
    public Integer value;
    public Shop shop;
    public ShopRepository shopRepository;

    public Relic(String name, Double quality, Integer value) {
        this.name = name;
        this.quality = quality;
        this.value = value;
        this.shop = new Shop();
    }

    @Override
    public String toString() {
        return "Relic{" +
            "name='" + name + '\'' +
            ", quality=" + quality +
            ", value=" + value +
            '}';
    }

    public void updateSoldeShop(){
        this.shop.setGolds(4000);
        List<Relic> relics= new ArrayList<>();
        relics.add(new Relic("La relic Sacree", 200.00, 400));

        for(Relic relic: relics) {

            System.out.println("before " + this.shop.golds);

            Double valeurAjouter = relic.quality / 1000 * relic.value;

            DecimalFormat df = new DecimalFormat("#");
            valeurAjouter = Double.valueOf(df.format(valeurAjouter));

            this.shop.setGolds(this.shop.getGolds() + valeurAjouter.intValue());


            relic.quality *= 1.05;
            if(relic.quality > 100) {
                relic.quality = 100.0;
            }
            System.out.println("after " + this.shop.golds);
        }

    }
}
