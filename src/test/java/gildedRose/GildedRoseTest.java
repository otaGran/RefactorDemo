package gildedRose;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class GildedRoseTest {

    @Test
    public void should_sub_1_of_the_quality_when_item_name_not_equals_Aged_Brie_and_Backstage_passes_to_a_TAFKAL80ETC_concert_andSulfuras_Hand_of_Ragnaros_and_quality_bigger_than_0(){
        Item itemList[] = new Item[1];
        itemList[0] = new Item("test", 123,12);
        GildedRose gildedRose = new GildedRose(itemList);

        gildedRose.updateQuality();

        assertEquals(11, gildedRose.items[0].quality);
    }
}