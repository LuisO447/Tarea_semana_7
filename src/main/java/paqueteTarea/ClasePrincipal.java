/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteTarea;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class ClasePrincipal {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int salir = 1;
        
        Operaciones objeto1 = new Operaciones();
        
        System.out.println("1. Crear archivo\n2. Ingresar datos\n3. Mostrar datos\n4. Buscar registro\n5. ver un vendedor.");
        
        while(salir!=6){
            try{
                System.out.println("------------------------------");
                System.out.println("Elija una opcion");
                salir=teclado.nextInt();
                if(salir==1){objeto1.existearchivo();}
                if(salir==2){
                    System.out.println("Ingresa el nombre");
                    String nombre = teclado.next();
                    System.out.println("Ingresa enero");
                    double enero = teclado.nextDouble();
                    System.out.println("Ingresa febrero");
                    double febrero = teclado.nextDouble();
                    System.out.println("Ingresa marzo");
                    double marzo = teclado.nextDouble();
                    objeto1.asignardatos(nombre,enero,febrero,marzo);
                }
                if(salir==3){objeto1.mostrardatos();}//poner aqui
                if(salir == 4){
                    System.out.println("Ingresa la venta a buscar");
                    String venta = teclado.next();
                    objeto1.buscarregistro(venta);
                }
                if(salir==5){
                    System.out.println("Ingresa el usuario a buscar su saldo");
                    String nombre1 = teclado.next();
                    //objeto1.salodregistro(nombre1);
                }
            }catch(Exception ex){
                System.out.println(ex.getMessage());
                teclado.nextLine();
            }
            
        }
    }
    
}
