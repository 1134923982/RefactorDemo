package gildedRose;

public class Item {

    private String name;

    private int sellIn;

    private int quality;

    private ItemStrategy itemStrategy;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        createItemStrategy();
    }

    private void createItemStrategy(){
        switch (this.name){
            case "Aged Brie":
                this.itemStrategy = new AgedBrieItem();
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                this.itemStrategy = new BackstagePassesItem();
                break;
            case "Sulfuras, Hand of Ragnaros":
                this.itemStrategy = new SulfurasItem();
                break;
            default:
                this.itemStrategy = new NormalItem();

        }
    }

    public void update(){
        this.itemStrategy.update(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
