
import java.util.Scanner;

import java.util.Set;

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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        int opcionSet;
        
        //Creamos objeto para ler datos del teclado
        Scanner teclado = new Scanner(System.in);
         String tipoSet=""; //varaible para guardar el string del tipo de set, a usar 
        
         
       
        
        while(true){// *************menu principal 
           
            System.out.println("Como desea implementar la interfaz Set");
            System.out.println("1)HashSet,2)TreeSet,3)LinkedSet4)Salir");
            System.out.print("Escriba el número de opcción:");
            opcionSet= teclado.nextInt();
           
            
            ////////////////////////Factory!////////////////////////////////////////////////
            if(opcionSet==1){//HashSet
                tipoSet="hashSet";
                 System.out.println("-----------------------HashSet-----------------------------");
            }
            else if(opcionSet==2){
                 tipoSet="treeSet";  
                  System.out.println("-----------------------TreeSet-----------------------------");
            }
            else if(opcionSet==3){
                tipoSet="linkedHashSet";
                System.out.println("------------------------LinkedHashSet----------------------------");
   
            }
            setFactory nFactory = new setFactory();
            Set<Desarrollador> myTabla = nFactory.getSet(tipoSet);
            
            //************************FIN DEL FACTORY************************************
            //Mostrar Java,web y celulares
                
          
            if(opcionSet<=3 ){ 
               
                //Ciclo para pedir nombres 
                String opccionOUsuario="y";
                String nombre;
                
                System.out.println("Ingrese el nombre del usuario: y luego el numero de ambiente donde ha trabajado");
                System.out.println("1)Desarrolador java\n2)Desarrodor Web\n3)Desarrolador Celulares");
        
                teclado.nextLine(); //para corregir el salto de linea de nextline()
                String opcionNombre="y";
                while(opcionNombre.equals("y") || opcionNombre.equals("Y") ){
                    System.out.print("\n***Nombre de Usuario:");  
                    nombre =teclado.nextLine();
                   
                    

                    //CIclo para pedir el tipo de desarrollador
                    String opcionAmbiente="y" ;
                    int n=0;
                    boolean java=false,web=false,movil=false;                   //variables para saber de que tipo son
                    while (opcionAmbiente.equals("y") && n<3){
                         n++; //si el contador llega a 3, ya no puede agregar mas ambientes
                       // Cambiamos el valor booleano dependiendo del tipo,webjavadmovil.
                        System.out.print("---Numero de ambiente:");
                        int nAmbiente = teclado.nextInt();          //pedimos el valor 
                        if(nAmbiente==1){// si es java
                            java=true; 
                        }
                        else if(nAmbiente==2){
                            web=true;
                        }
                        else if(nAmbiente==3){
                            movil=true; 
                        }
                        //-----------------------
                         
                          
                            System.out.print("---Desea agregar otro ambiente donde ha trabajado (y/n)");
                            teclado.nextLine();
                            opcionAmbiente=teclado.nextLine();
                        
                      
                    }//Fin del while opccionAmbiente
                    myTabla.add(new Desarrollador(nombre,java,web,movil));//Gurdamos los valores del objeto a la tabla
                    
                    System.out.print("\n********Desea agregar otro usuario (y/n)");
                   // teclado.nextLine();
                    opcionNombre=teclado.nextLine();       
                } 
                
                
           ///Mostramos datos que pide la hoja 
            MetodoMostrar mostrar = new MetodoMostrar();
            
            mostrar.mostar(myTabla);
                 
                
              
            }//Fin del if opcción1--------------------------------------------------------------------------------------------------------------------------------------------------
            
            

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
