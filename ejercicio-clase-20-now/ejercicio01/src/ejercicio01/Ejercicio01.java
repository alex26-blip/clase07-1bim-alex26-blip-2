/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String mensaje = "" ;
        String nombre;
        int dias;
        double d_costo;
        double total;
        int contador = 1;
        
        while (contador <= 5 ) {
        
         System.out.println("Ingrese su nombre");//6
        nombre = entrada.nextLine(); 
         System.out.println("Ingrese los dias trabajados");//6
        dias = entrada.nextInt(); 
         System.out.println("Ingrese el cosoto por dia");//6
        d_costo = entrada.nextDouble(); 
        entrada.nextLine();
        total=  dias + d_costo;
        
        mensaje= String.format("%s Nombre %s, Dias %s, costo por dias $%s "
                + "Total $%s",mensaje, nombre , dias , d_costo , total );
        contador = contador + 1;
     
    }
        System.out.println(mensaje);
    
}}
