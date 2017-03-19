
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
public class MetodoMostrar {


 public void mostar(Set<Desarrollador> myTabla){
     
         System.out.println("Mostrando datos-------------------------------------------------------------------------------------------------------------------");
         //Mostrar Java,web y celulares
       System.out.println("\n1)Desarrolladores en Java, Web y celulares");
        for(Desarrollador des: myTabla){
             if(des.getJava()==true & des.getWeb()==true & des.getMovil()==true){
               System.out.println(des.getNombre());
            }
        }
        
        
        //Mostrar  Java pero no en Web
        System.out.println("\n2)Desarrolladores java pero no en Web");
         for(Desarrollador des: myTabla){
            if(des.getJava()==true & des.getWeb()==false){
               System.out.println(des.getNombre());
            }
        }
         
        //Mostrar  Web y celulares pero no en java 
         System.out.println("\n3)Desarrolladores Web y Celulares pero no en java");
          for(Desarrollador des: myTabla){
            if(des.getJava()==false & des.getWeb()==true & des.getMovil()==true){
               System.out.println(des.getNombre());
            }
        }
          
        //Mostrar web O celulalres pero que no en java
         System.out.println("\n4)Desarrolladores Web o Celulares pero no en java");
          for(Desarrollador des: myTabla){
            if((des.getWeb()==true || des.getMovil()==true) && des.getJava()==false ){
               System.out.println(des.getNombre());
            }
        }
          
        //Si o n, de desarroladores java es un subconjunto de desarrolladores web
        
         System.out.println("\n5)Desarrolladores Java y Web ");
          for(Desarrollador des: myTabla){
            if(des.getJava()==true & des.getWeb()==true ){
               System.out.println(des.getNombre());
            }
        }
          
        //El conjunto que tiene la más grande cantidad de desarroladores 
         //System.out.println("\n6)El conjunto que tiene más desarroladores es:");
         int contJava=0,contWeb=0,contMovil=0;
         
         for(Desarrollador des:myTabla){
             
             if(des.getJava()==true){
               contJava=contJava+1;
             }
             else if(des.getWeb()==true){
                 contWeb++;
             }
             else if(des.getMovil()==true){
                 contMovil++; 
             }
         }
             //Determinar el mayor 
             if(contJava>contWeb && contJava>contMovil){
                 System.out.println("\n6)El conjunto con más dessarroladores es: JAVA");
                 //Mostramos los desarroladores Java:
                  for(Desarrollador des: myTabla){
                     if(des.getJava()==true){
                         System.out.println(des.getNombre());
                     }
                 }
                 
                 
             }
             
             else if(contWeb>contJava && contWeb>contMovil){
                  System.out.println("\n6)El conjunto con más dessarroladores es: WEB");
                  //Mostramos los web
                   for(Desarrollador des: myTabla){
                     if(des.getWeb()==true){
                         System.out.println(des.getNombre());
                     }
                 }

             }
             else{
                System.out.println("\n6)El conjunto con más dessarroladores es: MOVIL");
                 //Mostramos los Movil
                   for(Desarrollador des: myTabla){
                     if(des.getMovil()==true){
                         System.out.println(des.getNombre());
                     }
                 }

             }
             
             System.out.println("\nFin de la muestra de datos-------------------------------------------------------------------------\n\n\n");
 }
}
