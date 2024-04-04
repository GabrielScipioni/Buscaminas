package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //inicializar scanner y  random
        Random ran=new Random();
        Scanner scan =new Scanner(System.in);
        //ingresar un numero x
        System.out.println("indique el numero de columnas");
        int x=scan.nextInt();
        //ingresar un numero y
        System.out.println("indique el numero de filas");
        int y=scan.nextInt();

        //ingresar cantidad de bombas
        System.out.println("indique el numero de bombas");
        int bombas= scan.nextInt();

        //crear una matriz en base a (x;y)
        char[][] tablero = new char[y][x];

        //matriz dibujada con guiones
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                tablero[i][j]='-';
            }
        }
        //dibujar bombas
        for (int k = 0; k < bombas; k++) {
            int fil=ran.nextInt(y);
            int col=ran.nextInt(x);
            tablero[fil][col]='+';
        }
        //mostrar el numerado
        System.out.print("  ");
        for (int i = 0; i < x; i++) {
            System.out.print(" "+(i+1));
        }

        //mostrar matriz
        System.out.println();
        for (int i = 0; i < y; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < x; j++) {
                System.out.print(" " + tablero[i][j]);
            }
            System.out.println();
        }
    }
}