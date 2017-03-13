
import java.util.HashSet;
import java.util.TreeSet;

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
               
                return (Set) new HashSet<String>(); 
                
                
            case "lis":
                return  (Set) new TreeSet<String>();
                
            default:
                return null; 
               
                
               
       }

        
        
    
    
    }

   
    
}
