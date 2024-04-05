package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inicializar Scanner
        Scanner scan = new Scanner(System.in);

        // Ingresar el número de columnas
        System.out.println("Indique el número de columnas");
        int x = scan.nextInt();

        // Ingresar el número de filas
        System.out.println("Indique el número de filas");
        int y = scan.nextInt();

        // Ingresar la cantidad de bombas
        System.out.println("Indique el número de bombas");
        int bombas = scan.nextInt();

        // Crear un objeto Tablero
        Tablero tablero = new Tablero(x, y, bombas);

        // Mostrar el tablero
        tablero.mostrarTablero();
    }
}