/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Iterator;

/**
 *
 * @author 2386636
 */
import java.util.ArrayList;
import java.util.Iterator;

public class LinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("come");
        list.add("as");
        list.add("you");
        list.add("are");
        
        Iterator<String> here = list.iterator();
        String str = here.next();
        System.out.println(str);
        //ouput: come
                
    }
    
}
