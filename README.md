# Buscaminas en Java

![Portada](https://avatars.githubusercontent.com/u/149858423?v=4)

---
## Índice
1. [Acerca de](#Acerca-de)
2. [Versión](#Versión)
3. [Cambios en esta versión](#Cambios-en-esta-versión)
4. [Instrucciones de uso](#Instrucciones-de-uso)
5. [Código](#Código)
6. [Notas](#Notas)

---
## Acerca de

Este es un buscaminas básico implementado en Java.
La aplicación genera un tablero de buscaminas con dimensiones personalizables y 
una cantidad definida de bombas. Los jugadores pueden explorar el tablero y descubrir 
las ubicaciones de las bombas evitando activarlas. 



---

## Versión

La versión actual de la aplicación es` v0.2.0.`


### Cambios en esta versión

- Refactorización del código para separar la lógica del tablero en una clase independiente llamada `Tablero`.
- Implementación de la clase `Tablero` para generar y administrar el tablero del buscaminas, mejorando la organización y mantenibilidad del código.
- Actualización de la representación de las casillas vacías en el tablero como `'-'`.
- Mejora en la identificación de las casillas contiguas a las bombas, mostrando el número de bombas adyacentes en las casillas vacías.
- Corrección de errores menores y optimización del rendimiento del programa.

---
## Instrucciones de uso

Este es un simple juego de buscaminas implementado en Java. El programa solicita al usuario las 
dimensiones del tablero y la cantidad de bombas que se desean colocar, luego muestra el tablero inicial 
con las bombas ocultas.

1. Ejecuta el programa `Main.java`.
2. Sigue las instrucciones en la consola para ingresar el número de columnas, filas y la cantidad de bombas.
3. Observa el tablero generado con las bombas ocultas representadas por el caracter `+` y los espacios vacíos con `-`.
4. En el tablero, las casillas vacías que están adyacentes a una o más bombas mostrarán un número que indica la cantidad de bombas que las rodean.
<div style="border: 2px solid black; width: 300px; height: 300px; overflow: hidden; margin: 0 auto;">
    <img src="img/Captura de pantalla 2024-04-05 102456.png" style="display: block; margin: 0 auto;">
</div>
## Código

```java
package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    // Aquí va el código...
}


```java
package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inicializar scanner y random
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);

        // Ingresar el número de columnas
        System.out.println("Indique el número de columnas:");
        int x = scan.nextInt();

        // Ingresar el número de filas
        System.out.println("Indique el número de filas:");
        int y = scan.nextInt();

        // Ingresar la cantidad de bombas
        System.out.println("Indique el número de bombas:");
        int bombas = scan.nextInt();

        // Crear una matriz en base a (x;y)
        char[][] tablero = new char[y][x];

        // Matriz dibujada con guiones
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                tablero[i][j] = '-';
            }
        }

        // Dibujar bombas
        for (int k = 0; k < bombas; k++) {
            int fil = ran.nextInt(y);
            int col = ran.nextInt(x);
            tablero[fil][col] = '+';
        }

        // Mostrar el numerado
        System.out.print("  ");
        for (int i = 0; i < x; i++) {
            System.out.print(" " + (i + 1));
        }

        // Mostrar matriz
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
```
Dada la mejora en la implementación y la inclusión de la clase `Tablero` para una mejor organización y legibilidad del código, podrías dejar una nota que refleje estos cambios y resalte las mejoras en la funcionalidad del programa. Aquí tienes una sugerencia:
## Nota

- El programa ha sido actualizado para incluir una clase `Tablero`, lo que mejora la organización y estructura del código. Ahora, además de generar un tablero con las bombas ocultas representadas por el caracter `+` y los espacios vacíos con `-`, muestra números en las casillas vacías para indicar la cantidad de bombas adyacentes. Esta actualización no solo optimiza la legibilidad y mantenibilidad del código, sino que también mejora la experiencia del usuario al proporcionar información más detallada sobre el entorno del juego.

- Próximamente se planea añadir funcionalidades interactivas al juego para hacerlo más similar al juego original. Se espera implementar un buscaminas funcional que permita a los usuarios jugar en la consola, con la posibilidad de realizar turnos para ingresar coordenadas de fila y columna. Esta actualización transformará el juego en una experiencia interactiva, ofreciendo una experiencia más inmersiva y entretenida para los jugadores.

- A largo plazo, el objetivo último de este proyecto es convertirse en un juego interactivo de consola. Sin embargo, mi visión a largo plazo incluye la posibilidad de desarrollar una interfaz gráfica que proporcione una experiencia aún más satisfactoria para el usuario.







