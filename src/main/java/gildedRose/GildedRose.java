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
            updateItem(items[i]);
        });
    }

    private void updateItem(Item item) {
        calculateItemQuality(item);
        calculateItemSellIn(item);
        calculateItemQualityIfSellInLessThan0(item);
    }

    private void calculateItemQualityIfSellInLessThan0(Item item) {
        if (item.getSellIn() < 0) {
            if (!item.getName().equals("Aged Brie")) {
                if (!item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (item.getQuality() > 0) {
                        if (!item.getName().equals("Sulfuras, Hand of Ragnaros")) {
                            item.setQuality(item.getQuality() - 1);
                        }
                    }
                } else {
                    item.setQuality(0);
                }
            } else {
                if (item.getQuality() < 50) {
                    item.setQuality(item.getQuality() + 1);
                }
            }
        }
    }

    private void calculateItemSellIn(Item item) {
        if (!item.getName().equals("Sulfuras, Hand of Ragnaros")) {
            item.setSellIn(item.getSellIn() - 1);
        }
    }

    private void calculateItemQuality(Item item) {
        if (!item.getName().equals("Aged Brie")
                && !item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (item.getQuality() > 0) {
                if (!item.getName().equals("Sulfuras, Hand of Ragnaros")) {
                    item.setQuality(item.getQuality() - 1);
                }
            }
        } else {
            if (item.getQuality() < 50) {
                item.setQuality(item.getQuality()+1);

                if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (item.getSellIn() < 11) {
                        if (item.getQuality() < 50) {
                            item.setQuality(item.getQuality()+1);
                        }
                    }

                    if (item.getSellIn() < 6) {
                        if (item.getQuality() < 50) {
                            item.setQuality(item.getQuality()+1);
                        }
                    }
                }
            }
        }
    }
}