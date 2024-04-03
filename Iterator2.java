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

public class Iterator2 {
    public static void main(String[] args){
        ArrayList <Integer> list1 = new ArrayList<>();
        
        //ArrayList Fill 10 integers 1 - 10
        for(int i=0;i<10;i++){
            list1.add((int)(Math.random()*10)+1);
        }
        
        System.out.println("ArrayList: ");
        
        for(Iterator<Integer> i = list1.iterator(); i.hasNext();){
            System.out.print(i.next()+" ");   
        }
        
        System.out.println();
    }
}
