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
public class FindDups {
    public static void main(String[] args){
        
        Set<String> s = new HashSet<>();
        String str = "I am sam sam i am";
        
        for(int i = 0;i<args.length;i++){
            if(!s.add(args[i])){
                System.out.println("Duplicate detected: "+ args[i]);
            }
        }
        
        System.out.println(s.size()+" distinct words detected: "+s);
        
    }
}
