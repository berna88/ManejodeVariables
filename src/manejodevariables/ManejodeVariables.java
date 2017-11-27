/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodevariables;

/**
 *
 * @author berni
 */
public class ManejodeVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaracion de variables booleanas
        boolean bool1;
        //Inicializando
        bool1 = true;
        //Declaracion e inicializando
        boolean bool2 = false;
        //Imprimiendo
        System.out.println("Valor bool1: "+ bool1);
        System.out.println("Valor bool2: "+ bool2);
        System.out.println("");
        
        //variables byte
        
        byte b1 = 10;
        //En hexadecimal
        byte b2 = 0xa;
        System.out.println("Valor b1: "+ b1);
        System.out.println("Valor b2: "+ b2);
        System.out.println("");
        
        // Variables en short
        short s1 = 2;
        System.out.println("Valor s1: "+ s1);
        System.out.println("");
        
        //Variables en char 
        char ch1 = 65, ch2 = 'A';
        System.out.println("Valor ch1: "+ch1);
        System.out.println("Valor ch2: "+ch2);
        //Variables enteras
        int decimal = 100;
        int octal = 0144;// valor octal inicia con 0
        int hexa = 0x64; // valor hexadecimal inicia con 0x
        System.out.println("Valor decimal: "+ decimal);
        System.out.println("Valor octal: "+ octal);
        System.out.println("Valor hexadecimal: "+ hexa);
        System.out.println();
        //Variables long
        long long1 = 10, long2 = 20L;
        System.out.println("Valor long1: "+ long1);
        System.out.println("Valor long2: "+ long2);
        System.out.println();
        //Variables float
        float float1 = 15, float2 = 22.3F;
        System.out.println("Valor float1: "+ float1);
        System.out.println("Valor float2: "+ float2);
        System.out.println();
        //Variables Double
        double d1 = 11.0, d2 = 30.15D; 
        System.out.println("Valor d1: "+d1);
        System.out.println("Valor d2: "+d2);
        System.out.println();
        
    }
    
}
