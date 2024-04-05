package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tablero {
    int fil; // y
    int col; // x
    int bombas;//bombas
    char[][] tablero; //matriz que funciona de tablero


    Tablero(int fil, int col, int bombas) {
        this.fil = fil;
        this.col = col;
        this.bombas = bombas;
        this.tablero = new char[fil][col];
        inicializarTablero();
        colocarBombas();
        actualizarTablero();
    }
    private void inicializarTablero() {
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                tablero[i][j] = '-';
            }
        }
    }
    private void colocarBombas() {
        Random ran = new Random();
        List<Integer> bombPositions = new ArrayList<>();
        for (int k = 0; k < bombas; k++) {
            int pos = ran.nextInt(fil * col);
            while (bombPositions.contains(pos)) {
                pos = ran.nextInt(fil * col);
            }
            bombPositions.add(pos);
            int fila = pos / col;
            int columna = pos % col;
            tablero[fila][columna] = '+';
        }
    }
    private void actualizarTablero() {
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                if (tablero[i][j] != '+') {
                    int count = contarBombasAlrededor(i, j);
                    if (count == 0) {
                        tablero[i][j] = '-';
                    } else {
                        tablero[i][j] = (char) (count + '0'); // Convertir el número a char
                    }
                }
            }
        }
    }


    // Método para contar las bombas alrededor de una casilla
    private int contarBombasAlrededor(int fila, int columna) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int nuevaFila = fila + i;
                int nuevaColumna = columna + j;
                if (nuevaFila >= 0 && nuevaFila < fil && nuevaColumna >= 0 && nuevaColumna < col
                        && tablero[nuevaFila][nuevaColumna] == '+') {
                    count++;
                }
            }
        }
        return count;
    }

    // Método para mostrar el tablero
    public void mostrarTablero() {
        System.out.print("  ");
        for (int i = 0; i < col; i++) {
            System.out.print(" " + (i + 1));
        }
        System.out.println();
        for (int i = 0; i < fil; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < col; j++) {
                System.out.print(" " + tablero[i][j]);
            }
            System.out.println();
        }
    }
}
