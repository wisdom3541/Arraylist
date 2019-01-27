/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.*;
/**
 *
 * @author Bossbrown
 */
public class Arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creating array list
        {ArrayList<String> name = new ArrayList<String>();
        //adding to the arraylist
        name.add("lily");
        name.add("wisdom");
        name.add("ella");
        name.add("ayus");
        
        //printing arraylist with iterator
        Iterator i = name.iterator();
        System.out.println("arraylist contains "+name.size()+" Sring characters");
        while(i.hasNext())
        {
                
                System.out.println(i.next());
                        }
        
        
        
    }
    }
}
    

