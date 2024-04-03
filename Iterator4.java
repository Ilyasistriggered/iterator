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
import java.util.ListIterator;


public class Iterator4 {
    public static void main(String[] args){
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(22);
        list.add(19);
        list.add(99);
        
        ListIterator here = list.listIterator();
        System.out.println(here.previousIndex());
        System.out.println(here.nextIndex());
        System.out.println(here.nextIndex());
        
        
    }
}
