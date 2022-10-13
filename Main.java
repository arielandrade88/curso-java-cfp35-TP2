import java.text.DecimalFormat;
import java.util.Scanner;

/* 
Trabajo 2
1 - Modificar el trabajo 1 para que permita el ingreso de parámetros por consola de sistema.
2 - Crear la función calcularMasaCorporal, en esta función ingresa como parámetro el peso y la altura,
y devuelve el indice de masa corporal.
3 - Crear la función obtenerEstado, ingresa como parámetro el IMC y devuelve un String con el estado
'Normal','SobrePeso','Obesidad' etc. 
 */
public class Main {

  /**
 * @param args
 */
public static void main(String[] args) {
    System.out.println("ingrese peso y altura");
    
    double peso = 0;
    double altura = 0;

    if (args.length != 2) {
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("X CONOCE TU INDICE DE MASA CORPORAL X");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("Ingrese su peso");
        peso = new Scanner(System.in).nextDouble();
        System.out.println("Ingrese su altura");
        altura = new Scanner(System.in).nextDouble();
    } else {
        peso = Double.parseDouble(args[0]);
        altura = Double.parseDouble(args[1]);
    }
    calcularMasaCorporal(peso, altura);
 
  }

/**
 * @param peso
 * @param altura
 */
    private static void calcularMasaCorporal(double peso, double altura) {
    double alturaAlCuadrado = Math.pow(altura, 2);
    double imc = peso / alturaAlCuadrado;
    
    obtenerEstado(imc);
}

    private static void obtenerEstado(double imc) {
    DecimalFormat df = new DecimalFormat("###,###.#");
    System.out.println("Su indice de masa corporal es:" + df.format(imc));

    if (imc <= 15) {
        System.out.println("""
            
              §§                     
             §§§§                   
            §§  §§
           §§    §§
          §§  §§  §§
         §§   §§   §§
        §§    §§    §§
       §§     §§     §§
      §§              §§
     §§       §§       §§
    §§                  §§
   §§§§§§§§§§§§§§§§§§§§§§§§
                """);
        System.out.println("X X X X X X X X X X X X X X X X X X X");
        System.out.println("X Su estado es: Delgadez muy severa X");
        System.out.println("X X X X X X X X X X X X X X X X X X X");
    }
    if (imc >= 15 && imc <= 15.9) {
        System.out.println("""
            
              §§                     
             §§§§                   
            §§  §§
           §§    §§
          §§  §§  §§
         §§   §§   §§
        §§    §§    §§
       §§     §§     §§
      §§              §§
     §§       §§       §§
    §§                  §§
   §§§§§§§§§§§§§§§§§§§§§§§§
                """);

        System.out.println("X X X X X X X X X X X X X X X X X");
        System.out.println("X Su estado es: Delgadez severa X");
        System.out.println("X X X X X X X X X X X X X X X X X");
    }
    if (imc >= 16 && imc <= 18.4) {
        System.out.println("""             
              §§                     
             §§§§                   
            §§  §§
           §§    §§
          §§  §§  §§
         §§   §§   §§
        §§    §§    §§
       §§     §§     §§
      §§              §§
     §§       §§       §§
    §§                  §§
   §§§§§§§§§§§§§§§§§§§§§§§§
                """);
        System.out.println("X X X X X X X X X X X X X X");
        System.out.println("X Su estado es: Delgadez. X");
        System.out.println("X X X X X X X X X X X X X X");
    }
    if (imc >= 18.5 && imc <= 24.9) {            
        System.out.println("""

            ░░░░░░░░░░░░░░░░░░░░░░█████████
░░███████░░░░░░░░░░███▒▒▒▒▒▒▒▒███
░░█▒▒▒▒▒▒█░░░░░░░███▒▒▒▒▒▒▒▒▒▒▒▒▒███
░░░█▒▒▒▒▒▒█░░░░██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██
░░░░█▒▒▒▒▒█░░░██▒▒▒▒▒██▒▒▒▒▒▒██▒▒▒▒▒███
░░░░░█▒▒▒█░░░█▒▒▒▒▒▒████▒▒▒▒████▒▒▒▒▒▒██
░░░█████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██
░░░█▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒██
░██▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒██▒▒▒▒▒▒▒▒▒▒██▒▒▒▒██
██▒▒▒███████████▒▒▒▒▒██▒▒▒▒▒▒▒▒██▒▒▒▒▒██
█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒████████▒▒▒▒▒▒▒██
██▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██
░█▒▒▒███████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██
░██▒▒▒▒▒▒▒▒▒▒████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█
░░████████████░░░█████████████████
                """);
        System.out.println("X X X X X X X X X X X X X X X X X X");
        System.out.println("X Usted está en el peso correcto. X");
        System.out.println("X X X X X X X X X X X X X X X X X X");
    }
    if (imc >= 25 && imc <= 29.9) {
        System.out.println("""             
              §§                     
             §§§§                   
            §§  §§
           §§    §§
          §§  §§  §§
         §§   §§   §§
        §§    §§    §§
       §§     §§     §§
      §§              §§
     §§       §§       §§
    §§                  §§
   §§§§§§§§§§§§§§§§§§§§§§§§
                """);
        System.out.println("X X X X X X X X X X X X X X");
        System.out.println("X Su estado es: Sobrepeso X");
        System.out.println("X X X X X X X X X X X X X X");
    }
    if (imc >= 30 && imc <= 34.9) {
        System.out.println("""             
              §§                     
             §§§§                   
            §§  §§
           §§    §§
          §§  §§  §§
         §§   §§   §§
        §§    §§    §§
       §§     §§     §§
      §§              §§
     §§       §§       §§
    §§                  §§
   §§§§§§§§§§§§§§§§§§§§§§§§
                """);
        System.out.println("X X X X X X X X X X X X X X X X X X");
        System.out.println("X Su estado es: Obesidad moderada X");
        System.out.println("X X X X X X X X X X X X X X X X X X");
    }
    if (imc >= 35 && imc <= 39.9) {
        System.out.println("""             
              §§                     
             §§§§                   
            §§  §§
           §§    §§
          §§  §§  §§
         §§   §§   §§
        §§    §§    §§
       §§     §§     §§
      §§              §§
     §§       §§       §§
    §§                  §§
   §§§§§§§§§§§§§§§§§§§§§§§§
                """);
        System.out.println("X X X X X X X X X X X X X X X X X");
        System.out.println("X Su estado es: Obesidad severa X");
        System.out.println("X X X X X X X X X X X X X X X X X");
    }
    if (imc >= 40) {
        System.out.println("""             
              §§                     
             §§§§                   
            §§  §§
           §§    §§
          §§  §§  §§
         §§   §§   §§
        §§    §§    §§
       §§     §§     §§
      §§              §§
     §§       §§       §§
    §§                  §§
   §§§§§§§§§§§§§§§§§§§§§§§§
                """);
        System.out.println("X X X X X X X X X X X X X X X X X X");
        System.out.println("X Su estado es: Obesidad Mórbida. X");
        System.out.println("X X X X X X X X X X X X X X X X X X");
    }
}

}
