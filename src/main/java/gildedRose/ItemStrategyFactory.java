package gildedRose;

public class ItemStrategyFactory {

    public static ItemStrategy generateItemStrategy(String name){
        switch (name) {
            case "Aged Brie":
                return new AgedItemStrategy();
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstageItemStrategy();
            case "Sulfuras, Hand of Ragnaros":
                return new SulfurasItemStrategy();
            default:
                return new OtherItemStrategy();
        }
    }
}
