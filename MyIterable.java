/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

/**
 *
 * @author 2386636
 */
import java.util.Iterator;

public class MyIterable implements Iterable<String>{
    
    private String[] elements;
    
    public MyIterable(String[] elements){
        this.elements = elements;
    }
    @Override
    public Iterator<String> iterator(){
        return new MyIterator();
    }
    //Inner class implementing Iterator
    private class MyIterator implements Iterator<String>{
        private int index = 0;
        
        @Override
        public boolean hasNext(){
            return index < elements.length;            
        }
        
        @Override
        public String next(){
            return elements[index++];
        }
    }
    
    public static void main(String[] args){
        
        String[] names = {"Alice","Bob","Charlie"};
        MyIterable iterable = new MyIterable(names);
        
        //Using for-each loop to iterate
        for(String name: iterable){
            System.out.println(name);
        }
    }
    
}
