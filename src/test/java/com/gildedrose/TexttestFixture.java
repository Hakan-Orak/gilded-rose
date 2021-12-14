package com.gildedrose;

import entities.Item;

public class TexttestFixture {
    public static void main(String[] args) {
        Item itemOne = new Item("Anneau de Doran", 15, 10, "commun");
        System.out.println(itemOne.toString());

    }
}
