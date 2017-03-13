
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        int opcionSet;
        
        //Creamos objeto para ler datos del teclado
        Scanner teclado = new Scanner(System.in);
        
         
       
        
        while(true){// *************menu principal 
            System.out.println("Como desea implementar la interfaz Set");
            System.out.println("1)Hashsetn 4)Salir");
            System.out.print("Escriba el número de opcción:");
            opcionSet= teclado.nextInt();
            
            ////////////////////////Factory!!! con un case
            
            
            
            
            
            if(opcionSet==1){ // Si desea implementar HashSet
                HashSet<String> hashWeb = new HashSet<String>();
                HashSet<String> hashJava = new HashSet<String>();
                HashSet<String> hashMovil = new HashSet<String>();
                
                
                //Ciclo para pedir nombres 
                String opccionOUsuario="y";
                String nombre;
                System.out.println("\n\n-----------------------HashSet----------------------------");
                System.out.println("Ingrese el nombre del usuario: y luego el numero de ambiente donde ha trabajado");
                System.out.println("1)Desarrolador java\n2)Desarrodor Web\n3)Desarrolador Celulares");
                
                
                
                teclado.nextLine(); //para corregir el salto de linea de nextline()
                String opcionNombre="y";
                while(opcionNombre.equals("y") || opcionNombre.equals("Y") ){
                    System.out.print("\n***Nombre de Usuario:");
                   
                    nombre =teclado.nextLine();
                    
                  
                    //CIclo para pedir el ambiente donde trabaja 
                    String opcionAmbiente="y" ;
                    int n=0;
                    while (opcionAmbiente.equals("y") || opcionAmbiente.equals("Y")  && n<3){
                    
                   
                    
                         n++; //si el contador llega a 3, ya no puede agregar mas ambientes
                        System.out.print("---Numero de ambiente:");
                        int nAmbiente = teclado.nextInt();
                        if(nAmbiente==1){
                            hashJava.add(nombre);
                            
                        }
                        else if(nAmbiente==2){
                            hashWeb.add(nombre);
                        }
                        else if(nAmbiente==3){
                            hashMovil.add(nombre);
                        }
                        else{
                            System.out.println("Ingreso mal el número");
                        }
                        
                        
                        
                        
                        System.out.print("---Desea agregar otro ambiente donde ha trabajado (y/n)");
                        teclado.nextLine();
                        opcionAmbiente=teclado.nextLine();
                    }//Fin del while opccionAmbiente  1
                    
                    System.out.print("\n********Desea agregar otro usuario (y/n)");
                   // teclado.nextLine();
                    opcionNombre=teclado.nextLine();
                   
                    
                } 
                
              //************************Dessarroladores Web y Celular ****************** 
              HashSet<String> hashWebCelular = new HashSet<String>();
             System.out.print("\n\n -------Web y  Celular----- \n");
     
            for(String dWeb: hashWeb){
                hashWebCelular.add(dWeb); //Agregamos todos los web
            } 
            // como el HashSet no permite agregar nombres iguales, no hay problema 
            for (String dMovil:hashMovil){
                hashWebCelular.add(dMovil);
            } 
             //Imprimios los hashWeb y celular-----
            for(String datosWyC:hashWebCelular){
                System.out.println(datosWyC);
              }
            //Fin de web y celular/**************************************************
              
            //**************Desarrroladores Java,web y celular
            HashSet<String> hashD3 = new HashSet<String>();
            System.out.print("\n -----------------Java,web y celular------------- \n");
            // como el HashSet no permite agregar nombres iguales, no hay problema 
            for (String dJava:hashJava){
              hashD3.add(dJava);
            } 
            for(String dWeb: hashWeb){
                hashD3.add(dWeb); //Agregamos todos los web
            } 
            for (String dMovil:hashMovil){
             hashD3.add(dMovil);
            } 
            //Imprime los tres ambientes de desarroladores
             for(String datosD3:hashD3){
                System.out.println(datosD3);
             }
                
               
                
                
                
                
                
                
            
            }//Fin del if opcción1
            
            
            else if(opcionSet==2){ //Si desea implementar treeset
                System.out.println("-----------------------TreeSet-----------------------------");
                
                
                
                
                
            }
            
            else if(opcionSet==3){ //Si desea implementar Liked Hashset
               System.out.println("------------------------LinkedHashSet----------------------------");
               
               
               
            }
            else if(opcionSet==4){
                System.exit(0);
            }
            else{
                System.out.println("Ha ingresado una opción incorrecta\nsaliendo.....");
                System.exit(0);
            }
            
            
            
            
        
        }
    }
    
}
