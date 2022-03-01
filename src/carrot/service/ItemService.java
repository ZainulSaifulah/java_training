package carrot.service;

import carrot.model.Item;

import java.util.List;

import static carrot.data.ItemDummy.getDummyItems;

public class ItemService {
    private List<Item> items = getDummyItems();

    public List<Item> getItems() {
        return this.items;
    }

    public Item getItemById(String id) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    public boolean updateItem(String id, Item item) {
        Item foundedItem = getItemById(id);

        items.remove(foundedItem);
        return items.add(item);
    }
}
