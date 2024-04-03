/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

/**
 *
 * @author 2386636
 */
import java.util.*;

public class Iterator3 {
    public static void main(String[] args){
        
        //Create a collection of strings
        ArrayList<String> names =new ArrayList<>();
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice");
        
        //Obtain an Iterator instance from the collection
        Iterator<String> ite = names.iterator();
        
        //Iterating through the collection using the Iterator
        while(ite.hasNext()){
            String name = ite.next();
            if(name.equals("Bob")){
                ite.remove(); //remove 'Bob' from the collection
                
            }
        }
        
        //print the modified collection
        System.out.println(names);
    }
}
