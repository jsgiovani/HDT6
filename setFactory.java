
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class setFactory {
    
    public Set getSet(String tipoSet){
        
        switch(tipoSet){
            case "hashSet":
               
                return new HashSet<>(); 
                
                
            case "treeSet":
                return   new LinkedHashSet<>();
                
            case "linkedHashSet":
                return   new LinkedHashSet<>();    
                
            default:
                return null; 
               
                
               
       }

        
        
    
    
    }

   
    
}
