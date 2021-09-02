/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteTarea;

import java.util.*;
import java.io.*;

/**
 *
 * @author Luis
 */
public class Operaciones {
    
    private Scanner entrada;
    private String nombre;
    private double enero;
    private double febrero;
    private double marzo;
    private double total;
    private double promedio;
    
    File ficherocomi = new File("C:\\Users\\Usuario 2021\\Desktop\\archivotarea\\comision.txt");
    
    public Operaciones(){
        
    }
    
    public void existearchivo(){
        try{
            if(ficherocomi.exists()){
                System.out.println("El archivo ya existe");
            }else{
                ficherocomi.createNewFile();
                System.out.println("Fichero creado");
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
    public void asignardatos(String nombre2, double enero2, double febrero2, double marzo2){
        
        nombre = nombre2;
        enero = enero2;
        febrero = febrero2;
        marzo = marzo2;
        total = enero+febrero+marzo;
        promedio = total/3;
        //hacer aca el calculo
        try{
            
            BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficherocomi, true)));
            Fescribe.write(nombre+"|"+enero+"|"+febrero+"|"+marzo+"|"+total+"|"+promedio);
            Fescribe.write("\n");
            System.out.println("Los datos ya fueron añadidos al archivo");
            Fescribe.close();
            
        }catch(Exception ex){
            
            System.out.println(ex.getMessage());
            
        }
        
    }
    
    public void mostrardatos(){
        
        try{
            FileReader fileR = new FileReader("C:\\Users\\Usuario 2021\\Desktop\\archivotarea\\comision.txt");
            BufferedReader bufe = new BufferedReader(fileR);
            String cadena;
            while((cadena=bufe.readLine())!=null){
                System.out.println(""+cadena);
            }
        }catch(Exception ex){
            System.out.println();
        }
        
    }
    
    public void buscarregistro(String nombreVenta){
        
        String usuario=nombreVenta;
        try{
            BufferedReader leer = new BufferedReader(new FileReader("C:\\Users\\Usuario 2021\\Desktop\\archivotarea\\comision.txt"));
            String linea = "";
            while((linea=leer.readLine())!=null){
                if(linea.indexOf(usuario)!=-1){
                    System.out.println("Se encontro el registro "+linea);
                }
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
    public void buscarventa(String name){
        String usuario=name;
        try{
            entrada=new Scanner(new File("C:\\Users\\Usuario 2021\\Desktop\\archivotarea\\comision.txt"));
            BufferedReader leer= new BufferedReader(new FileReader("C:\\Users\\Usuario 2021\\Desktop\\archivotarea\\comision.txt"));
            String linea="";
            while((linea=leer.readLine())!=null){
                if(linea.indexOf(usuario)!=-1){
                    System.out.println("Se encontro el registro "+usuario);
                    String nomb = entrada.next();
                    double ventaa=entrada.nextDouble();
                    
                }
            }
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
}
