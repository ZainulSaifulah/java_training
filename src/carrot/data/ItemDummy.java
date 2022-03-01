package carrot.data;

import carrot.model.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemDummy {
    public static List<Item> getDummyItems() {
        List<Item> dummyItems = new ArrayList<>() ;
        dummyItems.add(new Item("1", "Tumblr", 200, 20, 10));
        dummyItems.add(new Item("2", "Backpack", 400, 5, 10));
        dummyItems.add(new Item("3", "Smartwatch", 800, 10, 10));
        dummyItems.add(new Item("4", "Body Scale", 350, 11, 10));
        dummyItems.add(new Item("5", "Arm Rest", 370, 5, 10));

        return dummyItems;
    }
}
