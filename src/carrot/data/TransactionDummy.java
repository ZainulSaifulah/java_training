package carrot.data;

import carrot.model.Item;
import carrot.model.Transaction;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionDummy {
    public static List<Transaction> getDummyTransactions() {
        List<Transaction> dummyTransactions = new ArrayList<>();
        dummyTransactions.add(new Transaction("001", new Item("1", "Tumblr", 200, 20, 10), new Date(), 5));
        dummyTransactions.add(new Transaction("002", new Item("1", "Tumblr", 200, 20,10), new Date(), 3));
        dummyTransactions.add(new Transaction("003", new Item("1", "Tumblr", 200, 20, 10), new Date(), 2));
        dummyTransactions.add(new Transaction("004", new Item("1", "Tumblr", 200, 20, 10), new Date(), 5));
        dummyTransactions.add(new Transaction("005", new Item("1", "Tumblr", 200, 20, 10), new Date(), 5));
        dummyTransactions.add(new Transaction("006", new Item("1", "Tumblr", 200, 20, 10), new Date(), 5));
        dummyTransactions.add(new Transaction("007", new Item("1", "Tumblr", 200, 20, 10), new Date(), 5));
        dummyTransactions.add(new Transaction("008", new Item("1", "Tumblr", 200, 20, 10), new Date(), 5));
        dummyTransactions.add(new Transaction("009", new Item("1", "Tumblr", 200, 20, 10), new Date(), 5));
        dummyTransactions.add(new Transaction("010", new Item("1", "Tumblr", 200, 20, 10), new Date(), 5));
        dummyTransactions.add(new Transaction("011", new Item("1", "Tumblr", 200, 20, 10), new Date(), 5));

        return dummyTransactions;
    }
}
