package gildedRose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    private ItemStrategy itemStrategy;


    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        generateItemStrategy(name);
    }


    public void generateItemStrategy(String name){
        switch (name) {
            case "Aged Brie":
                itemStrategy = new AgedItemStrategy();
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                itemStrategy = new BackstageItemStrategy();
                break;
            case "Sulfuras, Hand of Ragnaros":
                itemStrategy = new SulfurasItemStrategy();
                break;
            default:
                itemStrategy = new OtherItemStrategy();
                break;
        }
    }
    public void updateQuality() {
        switch (name) {
            case "Aged Brie":
                if (quality < 50) {
                    quality = quality + 1;
                }
                sellIn = sellIn - 1;
                if (sellIn < 0 && quality < 50) {
                    quality = quality + 1;
                }
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                if (quality < 50) {
                    quality = quality + 1;
                    if (sellIn < 11 && quality < 50) {
                        quality = quality + 1;
                    }

                    if (sellIn < 6 && quality < 50) {
                        quality = quality + 1;
                    }
                }
                sellIn = sellIn - 1;
                if (sellIn < 0) {
                    quality = 0;
                }
                break;
            case "Sulfuras, Hand of Ragnaros":
                break;
            default:
                if (quality > 0) {
                    quality = quality - 1;
                }
                sellIn = sellIn - 1;
                if (sellIn < 0 && quality > 0) {
                    quality = quality - 1;
                }
                break;
        }
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
