package gildedRose;

public class BackstagePassesItem extends ItemStrategy {
    @Override
    public void update(Item item) {
        item.setQuality(item.getQuality()+1);
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
        item.setSellIn(item.getSellIn() - 1);
        if (item.getSellIn() < 0) {
            item.setQuality(0);
        }
    }
}
