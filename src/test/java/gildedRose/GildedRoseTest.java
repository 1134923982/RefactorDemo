package gildedRose;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {
    @Test
    public void should_return_quality_decrement_1_and_sellIn_decrement_1_when_given_items_name_not_is_special_name_and_its_sellIn_more_than_0_quality_is_more_than_0() throws Exception {
        //given
        Item item1 = new Item("item1",1,1);
        Item item2 = new Item("item2",2,2);
        Item[] items = {item1, item2};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();
        Item[] actualItems = gildedRose.getItems();

        //then
        Assert.assertEquals(0 ,actualItems[0].quality);
        Assert.assertEquals(0 ,actualItems[0].sellIn);
        Assert.assertEquals(1 ,actualItems[1].quality);
        Assert.assertEquals(1 ,actualItems[1].sellIn);
    }

    @Test
    public void should_return_quality_decrement_2_and_sellIn_decrement_1_when_given_items_name_not_is_special_name_and_its_sellIn_is_0_quality_is_2() throws Exception {
        //given
        Item item1 = new Item("item1",0,2);
        Item[] items = {item1};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();
        Item[] actualItems = gildedRose.getItems();

        //then
        Assert.assertEquals(0 ,actualItems[0].quality);
        Assert.assertEquals(-1 ,actualItems[0].sellIn);
    }

    @Test
    public void should_return_quality_decrement_1_and_sellIn_decrement_1_when_given_items_name_not_is_special_name_and_its_sellIn_is_0_quality_is_1() throws Exception {
        //given
        Item item1 = new Item("item1",0,1);
        Item[] items = {item1};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();
        Item[] actualItems = gildedRose.getItems();

        //then
        Assert.assertEquals(0 ,actualItems[0].quality);
        Assert.assertEquals(-1 ,actualItems[0].sellIn);
    }

    @Test
    public void should_return_quality_decrement_0_and_sellIn_decrement_1_when_given_items_name_not_is_special_name_and_its_sellIn_is_0_quality_is_0() throws Exception {
        //given
        Item item1 = new Item("item1",0,0);
        Item[] items = {item1};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();
        Item[] actualItems = gildedRose.getItems();

        //then
        Assert.assertEquals(0 ,actualItems[0].quality);
        Assert.assertEquals(-1 ,actualItems[0].sellIn);
    }

    @Test
    public void should_return_quality_add_1_and_sellIn_decrement_1_when_given_items_name_is_aged_brie_and_its_sellIn_is_2_quality_is_2() throws Exception {
        //given
        Item item1 = new Item("Aged Brie",2,2);
        Item[] items = {item1};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();
        Item[] actualItems = gildedRose.getItems();

        //then
        Assert.assertEquals(3 ,actualItems[0].quality);
        Assert.assertEquals(1 ,actualItems[0].sellIn);
    }

    @Test
    public void should_return_quality_add_2_and_sellIn_decrement_2_when_given_items_name_is_aged_brie_and_its_sellIn_is_0_quality_is_1() throws Exception {
        //given
        Item item1 = new Item("Aged Brie",0,1);
        Item[] items = {item1};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();
        Item[] actualItems = gildedRose.getItems();

        //then
        Assert.assertEquals(3 ,actualItems[0].quality);
        Assert.assertEquals(-1 ,actualItems[0].sellIn);
    }

    @Test
    public void should_return_quality_add_1_and_sellIn_decrement_1_when_given_items_name_is_aged_brie_and_its_sellIn_is_0_quality_is_49() throws Exception {
        //given
        Item item1 = new Item("Aged Brie",0,49);
        Item[] items = {item1};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();
        Item[] actualItems = gildedRose.getItems();

        //then
        Assert.assertEquals(50 ,actualItems[0].quality);
        Assert.assertEquals(-1 ,actualItems[0].sellIn);
    }
    @Test
    public void should_return_quality_decrement_0_and_sellIn_decrement_1_when_given_items_name_is_begin_with_backstage_and_its_sellIn_is_5_quality_is_10() throws Exception {
        //given
        Item item1 = new Item("Backstage passes to a TAFKAL80ETC concert",5,10);
        Item[] items = {item1};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();
        Item[] actualItems = gildedRose.getItems();

        //then
        Assert.assertEquals(13 ,actualItems[0].quality);
        Assert.assertEquals(4 ,actualItems[0].sellIn);
    }
}