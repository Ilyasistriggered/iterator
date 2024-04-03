/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

/**
 *
 * @author 2386636
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Iterator1 {
    public static void main(String[] args) {
        List <Integer> list1 = new ArrayList<Integer>();
        List <Double> list2 = new ArrayList<Double>();
        Set <Integer> set1 = new HashSet<Integer>();
        Set <Double> set2 = new TreeSet<Double>();
        
        //ArrayList fill 10 integers 1 - 10
        for(int i = 0; i<10; i++){
            list1.add((int)(Math.random()*10)+1);
        }
        
        //LinkedList fill 10 doubles 0 - .99
        for(int i = 0; i<10; i++){
            list2.add((int)(Math.random()*100)/100.0);
        }
        
        //HashSet fill 10 (As long as there are no duplicates) integers 1 - 10
        for(int i = 0; i<10; i++){
            set1.add((int)(Math.random()*10)+1);
        }
        
        //TreeSet fill 10 (As long as there are no duplicates) doubles 0 - .99
        for(int i = 0; i<10; i++){
            set2.add((int)(Math.random()*100)/100.0);
        }
        
        Iterator <Integer> here1 = list1.iterator(); //ArrayList Iterator
        Iterator <Double> here2 = list2.iterator(); //LinkedList Iterator
        Iterator <Integer> here3 = set1.iterator(); //HashSet Iterator
        Iterator <Double> here4 = set2.iterator(); //TreeSet Iterator
        
    }
}
