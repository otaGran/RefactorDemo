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
        this.itemStrategy = ItemStrategyFactory.generateItemStrategy(name);
    }
    public void updateQuality() {
        itemStrategy.updateQuality(this);
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
