/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerclase;

/**
 *
 * @author 42gii
 */
public class PrimerClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // variables
        //Crear 3 variables, una para edad, otra para nombre y otra para su salario
        
        int edad = 20;
        String nombre = "Martin";
        double salario = 500.0;
        
        //mostrar por pantalla Soy <nombre> tengo <edad> y mi sueldo es de <sueldo>
        //Todo en una linea
        
        System.out.println("Soy " + nombre + ", tengo " + edad + " años y mi sueldo es de $" + salario);
        //uno debajo del otro
        System.out.println("Soy " + nombre);
        System.out.println("tengo " + edad + " años");
        System.out.println("y mi sueldo es de $" + salario);
        
        System.out.println("---------------------------------");
        
        System.out.println("ESTRUCTURA DE CONTROL - CONDICIONALES");
        edad=20;
        if (edad>=18){
            System.out.println("Es mayor de 18");
        }
        if (edad>=20){
            System.out.println("No esta en el rango de edad para salir al boliche");
        }else{
            System.out.println("Es menor de 18");
        }
        //sout + TAB
        System.out.println("BUCLE FOR");
        // El bucle FOR se utiliza cuando sabemos de antemano cuantas 
        // veces queremos que se jecute un bloque de código
        /*
        for (inicializacion; condición ; actualización )
        BLOQUE DE CODIGO
         */
        for (int i=0; i<10; i++){
            System.out.println("Numero :" + i);
        }
        System.out.println("----------------------------");
        //crear un bucle que inicie en 1 y me muestre hasta el numero 5
        for (int i=1; i<6; i++){
            System.out.println("Numero :" + i);
        }
        //Estudiar estructura de un arreglo en JAVA, y como acceder a sus posiciones
        System.out.println("-----------------------------");
        int[] numeros = {1,2,3,4,5};
        for (int j = 0; j<numeros.length; j++){
            System.out.println("Elemento " + j + ": " + numeros[j]);
        }
        
        System.out.println("-------------------------------");
        System.out.println("BUCLE WHILE");
        /*
        El bucle whiole se utiliza cuando no sabemos cuantas veces debe ejecutarse el bloque de codigo,
        depende de una condicion para detenerse
         */
        int contador = 0;
        //recorrer arreglo numero con while
        while (contador < numeros.length){
            System.out.println("Numero: " +  contador + ": " + numeros[contador]);
            contador++;
        } 
    }   
}
