package com.example.project.Grocery_Store;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{
        public static void main (String[] args){


            Product[] initialList = new Product[8];

  
        Product p0 = new Product("cereal", 5);
        Product p1 = new Product("milk", 10);
        Product p2 = new Product("bread", 1);
        Product p3 = new Product("frozen pizza", 4);
        Product p4 = new Product("ice cream", 0);
        Product p5 = new Product("spaghetti", 6);
        Product p6 = new Product("muffins", 0);
        Product p7 = new Product("apples", 3);

        initialList = new Product[]{p0, p1, p2, p3, p4, p5, p6, p7};

            GroceryStore store = new GroceryStore(initialList);
            ArrayList<Integer> toReorder = store.getReorderList(5);
            //ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(0,2,3,4,6,7));
            System.out.println(toReorder);
    
            ArrayList<Integer> toReorder2 = store.getReorderList(2); //This part works
            System.out.println(toReorder2);
            ArrayList<Integer> expected2 = new ArrayList<Integer>(Arrays.asList(2,4,6));
            System.out.println(expected2);
            
            GroceryStore store1 = new GroceryStore(initialList);
            ArrayList<String> shoppingList1 = new ArrayList<String>(Arrays.asList("cereal", "bread", "apples", "spaghetti"));
            boolean allItemsAvailable = store1.checkAvailability(shoppingList1);
            System.out.println(allItemsAvailable);
            
            ArrayList<String> shoppingList2 = new ArrayList<String>(Arrays.asList("cereal", "milk", "muffins", "apples"));
            boolean allItemsAvailable2 = store1.checkAvailability(shoppingList2);
            System.out.println(allItemsAvailable2);
            
            ArrayList<String> shoppingList3 = new ArrayList<String>(Arrays.asList("ice cream", "frozen pizza", "muffins", "bread"));
            boolean allItemsAvailable3 = store1.checkAvailability(shoppingList3);
            System.out.println(allItemsAvailable3);
            
        }
}