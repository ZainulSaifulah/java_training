package carrot.controller;

import carrot.model.Item;
import carrot.model.Transaction;
import carrot.service.ItemService;
import carrot.service.TransactionService;

import java.util.Date;
import java.util.List;

public class MainController {
    private final TransactionService transactionService = new TransactionService();
    private final ItemService itemService = new ItemService();

    //for assignment no 1
    public List<Item> getListItem() {
        return itemService.getItems();
    }

    //for assignment no 2
    public String getSoldReport() {
        String soldReport = "";
        List<Item> items = itemService.getItems();

        for (Item item :items) {
            soldReport += "id='" + item.getId() + "', name='" + item.getName() + "', sold=" + item.getSold() + "\n";
        }

        return soldReport;
    }

    //for assignment no 3
    public Transaction buyItem(Date date, String itemId, int quantity) {
        Item item = itemService.getItemById(itemId);
        item.setStock(item.getStock() - quantity);
        item.setSold(item.getSold() + quantity);
        Transaction transaction = new Transaction("", item, date, quantity);

        if (transactionService.addTransaction(transaction) && itemService.updateItem(itemId, item)) {
            return transaction;
        }

        return null;
    }

    //for assignment no 4
    public Item manageItem(String id, String name, int point) {
        Item item = itemService.getItemById(id);
        item.setName(name);
        item.setPoint(point);

        if (itemService.updateItem(id, item)) {
            return item;
        }

        return null;
    }
}
