package com.gildedrose.entities;

import Shop.Shop;
import entities.LegendaryItem;
import entities.item.AgingItem;
import entities.item.ConjuredItem;
import entities.item.GenericItem;
import entities.item.Item;
import entities.shop.ShopInteractor;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTest {

    @Test
    public void getShopGoldWorks() {
        Item itemOne = new ConjuredItem("epee des tounois", 150, 150, 10);
        List<Item> items = new ArrayList<>();
        items.add(itemOne);
        ShopInteractor shopInteractor = new ShopInteractor(items);
        assertEquals(10, (int) shopInteractor.getShopGold());
    }

    List<String> autorizedItem = new ArrayList<>();
    Shop shop = new Shop();

    @Test
    void itemCreation_works() {
        String name = "Rose doréé";
        int sellIn = 25;
        int quality = 10;
        Integer price = 80;

        Item item = new GenericItem(name,sellIn,quality,price);

        assertEquals(item.name, name);
        assertEquals(item.sellIn, sellIn);
        assertEquals(item.quality, quality);
    }

    @Test
    void updateQualityLowQualityForGeneric_works() {
        int initialQuality = 20;
        GenericItem item = new GenericItem("Rose doréé",20,initialQuality,50);

        item.update();

        assertEquals(item.quality, initialQuality - 1);
    }

    @Test
    void updateQualityUpQualityForAging_works() {
        int initialQuality = 20;
         AgingItem item = new AgingItem("abc",20,initialQuality,50);
        item.update();
        assertEquals(item.quality, initialQuality + 1);
    }

    @Test
    void updateQualityLegendary_works() {
        int initialQuality = 80;
        LegendaryItem item = new LegendaryItem("Sulfuras",null,initialQuality,50);

        item.update();
        item.update();
        item.update();

        assertEquals(initialQuality, item.quality);
    }

    @Test
    void print_notif_in_windows_10 () throws IOException, AWTException {
        //Obtain only one instance of the SystemTray object
        SystemTray tray = SystemTray.getSystemTray();

        //If the icon is a file
        Image image = Toolkit.getDefaultToolkit().createImage("icon.png");
        //Alternative (if the icon is on the classpath):
        //Image image = Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png"));

        TrayIcon trayIcon = new TrayIcon(image, "Tray Demo");
        //Let the system resize the image if needed
        trayIcon.setImageAutoSize(true);
        //Set tooltip text for the tray icon
        trayIcon.setToolTip("System tray icon demo");
        tray.add(trayIcon);

        trayIcon.displayMessage("sold item", "abc", TrayIcon.MessageType.INFO);
        }

    }



