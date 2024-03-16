package week08;

import java.util.*;

public class Task1 {
    public static void main(String[] args){
        //a)
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        System.out.println(integerList);
        // b) i. toString() method
        System.out.println(integerList.toString());
        // b) ii. for statement
        for(int i = 0; i < integerList.size(); i++){
            System.out.println(integerList.get(i) + " ");
        }
        // b) iii.enhanced 
        for(int num : integerList){
            System.out.println(num + " ");
        }
        // b) iv. iterator
        Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        // c) i. Adding elements
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("tea");
        shoppingList.add("bread");
        shoppingList.add("butter");
        shoppingList.add("eggs");
        // c) ii. Previous method usage
        System.out.println(shoppingList.toString());
        for(int i = 0; i < shoppingList.size(); i++){
            System.out.println(shoppingList.get(i));
        }
        for(String item:shoppingList){
            System.out.println(item);
        }
        Iterator<String> iterator2 = shoppingList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator2.next());
        }
        /// c) iii. Remove the element at index 2
        shoppingList.remove(2);
        // d) 
        List<String> newShoppingList = new ArrayList<>(shoppingList);
        // d) i. Add: "apple", "kiwi"
        newShoppingList.add("apple");
        newShoppingList.add("kiwi");
        for(String item:newShoppingList){
            System.out.println(item);
        }
        // d) ii. Print
        for(String item:newShoppingList){
            System.out.println(item);
        }
        // d) iii. Checking whether there is "tea" element in the newShoppingList
        if(newShoppingList.contains("tea")){
            System.out.println("The element exists");
        }
        else{
            System.out.println("The element does not exist");
        }
        // e) 
        LinkedList<String> newLinkedList = new LinkedList<>();
        // e) i. Adding elements
        newLinkedList.add("tomato");
        newLinkedList.add("potato");
        // e) ii. Adding elements of newShoppingList
        newLinkedList.addAll(newShoppingList);
        // e) iii. Removing first element and printing
        if(!newLinkedList.isEmpty()){
            newLinkedList.removeFirst();
            System.out.println(newLinkedList);
        }
        // e) iv. Removing last element and printing
        if(!newLinkedList.isEmpty()){
            newLinkedList.removeLast();
            System.out.println(newLinkedList);
        }
        

    }
}
