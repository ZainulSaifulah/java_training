package carrot;


import carrot.controller.MainController;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        MainController mainController = new MainController();

        //for assignment no 1
        System.out.println(mainController.getListItem() + "\n");

        //for assignment no 2
        System.out.println(mainController.getSoldReport() + "\n");

        //for assignment no 3
        System.out.println(mainController.buyItem(new Date(), "3", 2));
        System.out.println(mainController.getListItem() + "\n");

        //for assignment no 4
        System.out.println(mainController.manageItem("3", "New Smartwatch", 810));
        System.out.println(mainController.getListItem() + "\n");


    }
}
