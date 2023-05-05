/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_avrilromero;
import java.util.Scanner;
/**
 *
 * @author rodge
 */
public class Lab3P1_AvrilRomero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        boolean seguir = true;
        while (seguir){
            System.out.println("1.Serie Euclidiana .");
            System.out.println("2.Pokebola.");
            System.out.println("3.OK Boomer!");
            System.out.println("4.Salir.");
            System.out.println("Ingrese una opcion: ");
            int opcion = Leer.nextInt();
            switch (opcion){
                case 1: {
                    System.out.println("Ingrese la cantidad de puntos :");
                    int puntos = Leer.nextInt();
                    if (puntos <= 0) {
                        System.out.println("Su numero debe de ser positivo.Intente de nuevo.");
                    }
                    int i=1;
                    double acum=0;
                    while (i<=puntos){
                        System.out.println("Ingrese x: ");
                        int x = Leer.nextInt();
                        System.out.println("Ingrese y: ");
                        int y = Leer.nextInt();
                        double resta=x-y;
                        double exponente = Math.pow(resta,2);
                        acum=acum+exponente;
                        i++;
                    }
                    double raiz = Math.sqrt(acum);
                    System.out.println("La distancia euclidiana es: "+raiz);
                    
                }// fin case 1
                break;
                case 2:{
                    System.out.println("Ingrese un numero para el tamano de la pokebola: ");
                    int num = Leer.nextInt();
                    for (int cont1=1;cont1<=num;cont1++){
                             for (int cont2=1;cont2<=(num+num)-1;cont2++){
                                 if (cont1==1||cont1==num||cont2==1||cont2==(num+num)-1){
                                 System.out.print("*");
                         
                                 }else if((cont1==(num/2)+1)){//medio
                                        if ((cont2<((num-2)))||(cont2>(((num+num)-(num-2))))){
                                        System.out.print("#");
                                    }else {
                                      System.out.print(" "); 
                                        }         
                                 }else if(cont1<(num/2)){
                                     System.out.print("*");
                                 
                                 }else if (cont1==(num/2)) {
                                     if((cont2>=(((num+num))/3)+1)&&(cont2<=((((num+num)/3)*2)+1))){
                                         System.out.print("#");//arriba
                                     }else {
                                         System.out.print("*");
                                     }
                             }else if (cont1==(num/2)+2){
                                 if ((cont2>=(((num+num))/3)+1)&&(cont2<=(((((num+num))/3))*2)+1)){
                                     System.out.print("#");//abajo
                                 }else {
                                   System.out.print(" "); 
                                 }
                             }else if ((cont1==(num/2)+2) && (cont2<=(((num+num)+1)/3)+1)){
                                 
                             }
                                 else {
                                  System.out.print(" ");   
                                 }
                             }
                         System.out.println("");
                     }
                }//fin case 2
                break;
                case 3:{
                    System.out.println("Ingrese su año de nacimiento: ");
                    int fecha = Leer.nextInt();
                    if (fecha<=2025&&fecha>=2013){
                        System.out.println("Felicidades usted es de la Generacion Alpha!");
                    }else if (fecha<=2012&&fecha>=1990){
                        System.out.println("Felicidades usted es de la Generacion Z!");
                    }else if (fecha<=1994&&fecha>=1980){
                        System.out.println("Felicidades usted es de la Generacion Milleanials!");
                    }else if (fecha<=1985&&fecha>=1975){
                        System.out.println("Felicidades usted es de la Generacion Xennials!");
                     }else if (fecha<=1979&&fecha>=1960){
                         System.out.println("Felicidades usted es de la Generacion X!");
                     }else if (fecha<=1964&&fecha>=1946){
                         System.out.println("Felicidades usted es de la Generacion Baby Boomer!");
                     }else if (fecha>2025||fecha<1946){
                         System.out.println("Su fecha no esta dentro del rango");
                     }
                }// fin case 3
                break;
                case 4:
                    seguir = false;
                 break;
                default:
                    System.out.println("Opcion Incorrecta");
                break;
            }//fin switch final
        
        }//fin while
    }//fin 
    
}//fin public class
