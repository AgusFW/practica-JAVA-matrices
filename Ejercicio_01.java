/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_Matrices;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Ejercicio_01 {

/*1.Una matriz de 5 filas x 3 columnas almacena el total de goles de 5 jugadores 
  de futbol en los últimos 3 partidos que jugaron, donde cada fila representa a un jugador 
  y cada columna a la cantidad de goles que hizo. Se necesita un programa que sea capaz de permitir la 
  carga de los goles, calcular el promedio de goles realizado por cada jugador y almacenar el resultado 
  en un vector de 5 posiciones, donde cada posición representará a un jugador. Tener en cuenta el 
  siguiente diagrama para llevar a cabo el planteo:
  Nota: tener en cuenta que el promedio de goles puede dar como resultado un número que NO SEA ENTERO.*/


public static void main(String[] args){

int matriz[][]= new int [2][3];
double resultado []= new double [2];

Scanner teclado = new Scanner (System.in);
for (int f=0; f<2; f++){
    for (int c=0; c<3; c++){
        System.out.println("El jugador de furbol: "+ f +", en la fecha "+ c +" metió goles.");
        int goles = teclado.nextInt();
        matriz [f][c] = goles;
    }}

    
    for (int f=0; f<2; f++){
        System.out.println("El jugador " +f);
        int total = 0;
    for (int c=0; c<3; c++){
        System.out.println("hizo " + matriz [f][c]);
        total = total + matriz [f][c];
    }
     double promedio = total / 3;
     System.out.println("Total: " + total);
     System.out.println("En promedio: " + promedio);
     resultado [f] = promedio;
     
    }
    
     for ( double x : resultado)
     {
         System.out.println("El promedio es: " + x);
     }

    
    

}


}
