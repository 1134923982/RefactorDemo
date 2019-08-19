package gildedRose;

import java.util.stream.IntStream;

public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public Item[] getItems() {
        return items;
    }

    public void updateQuality() {
        IntStream.range(0, items.length).forEach(i -> {
            items[i].update();
        });
    }
}