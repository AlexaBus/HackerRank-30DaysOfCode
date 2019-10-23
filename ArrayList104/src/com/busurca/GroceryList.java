package com.busurca;

import java.util.ArrayList;

class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    void addGroceryItem(String item) {
        groceryList.add(item);
    }

    void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (String item : groceryList) {
            System.out.println(item);
        }
    }

    void modifyGroceryItem(String oldItem, String newItem) {
        int position = findGroceryItem(oldItem);

        if (position == -1) {
            System.out.println("Item to be replaced is not in the list.");
        } else {
            modifyGroceryItem(position, oldItem, newItem);
        }
    }

    private void modifyGroceryItem(int position, String oldItem, String newItem) {
        groceryList.set(position, newItem);
        System.out.println(oldItem + " has been replaced with " + newItem);
    }

    void removeGroceryItem(String itemToRemove){
        int position = findGroceryItem(itemToRemove);

        if (!itemExists(itemToRemove)) {
            System.out.println(itemToRemove + " is not on the list.");
        } else {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        String groceryItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("Grocery item " + groceryItem + " has been removed");
    }

    private int findGroceryItem(String item) {
        return groceryList.indexOf(item);
    }

    boolean itemExists(String item) {
        return findGroceryItem(item) != -1;
    }


}
