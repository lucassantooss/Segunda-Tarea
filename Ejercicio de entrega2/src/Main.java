import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                // Variables
                String nombre;
                int distancia = 0; // en metros
                int vehiculo = 0;  // distancia en transporte
                boolean encontroTesoro = false;

                // Introducción
                System.out.println("Bienvenido al libro interactivo de aventuras.");
                System.out.println("Introduce el nombre de tu araña protagonista:");
                nombre = sc.nextLine();

                System.out.println("\nLa historia comienza...");
                System.out.println(nombre + " despierta en su telaraña, con hambre y curiosidad por explorar.");

                // DECISIÓN 1
                System.out.println("\nPágina 1: " + nombre + " ve dos caminos: uno que sube al árbol y otro que baja al suelo. ¿Qué eliges?");
                System.out.println("1. Subir al árbol (+2 metros)");
                System.out.println("2. Bajar al suelo (-1 metro)");
                int decision1 = sc.nextInt();

                if (decision1 == 1) {
                    distancia += 2;
                    System.out.println("\n" + nombre + " sube con esfuerzo y alcanza una rama alta llena de hojas.");
                } else {
                    distancia -= 1;
                    System.out.println("\n" + nombre + " baja al suelo y siente la tierra húmeda bajo sus patas.");
                }

                // DECISIÓN 2
                System.out.println("\nPágina 2: " + nombre + " encuentra un escarabajo ofreciendo ayuda para avanzar.");
                System.out.println("1. Subirse al escarabajo y avanzar en vehículo (+5 metros en transporte)");
                System.out.println("2. Seguir caminando solo (+2 metros)");
                int decision2 = sc.nextInt();

                if (decision2 == 1) {
                    vehiculo += 5;
                    System.out.println("\n" + nombre + " se sube al escarabajo y viaja rápidamente entre las hojas.");
                } else {
                    distancia += 2;
                    System.out.println("\n" + nombre + " avanza lentamente, disfrutando del paisaje y la calma.");
                }

                // DECISIÓN 3
                System.out.println("\nPágina 3: Tras avanzar, " + nombre + " ve un brillo misterioso.");
                System.out.println("1. Investigar el brillo (posible tesoro)");
                System.out.println("2. Ignorarlo y seguir adelante");
                int decision3 = sc.nextInt();

                if (decision3 == 1) {
                    encontroTesoro = true;
                    System.out.println("\n" + nombre + " se acerca y descubre un pequeño cofre brillante con néctar.");
                } else {
                    System.out.println("\n" + nombre + " decide no arriesgarse y sigue explorando tranquilamente.");
                }

                // FINALES DIFERENTES
                System.out.println("\n--- FINAL DE LA HISTORIA ---");
                if (decision1 == 1 && decision2 == 1 && decision3 == 1) {
                    System.out.println(nombre + " termina en lo alto del árbol, rico en néctar y con un viaje inolvidable.");
                } else if (decision1 == 1 && decision2 == 1 && decision3 == 2) {
                    System.out.println(nombre + " disfruta del paseo en escarabajo, aunque deja atrás el misterio.");
                } else if (decision1 == 1 && decision2 == 2 && decision3 == 1) {
                    System.out.println(nombre + " se esfuerza caminando, pero obtiene su recompensa al hallar el tesoro.");
                } else if (decision1 == 1 && decision2 == 2 && decision3 == 2) {
                    System.out.println(nombre + " se queda en la rama, contemplando el horizonte con tranquilidad.");
                } else if (decision1 == 2 && decision2 == 1 && decision3 == 1) {
                    System.out.println(nombre + " recorre el suelo en escarabajo y encuentra un cofre escondido.");
                } else if (decision1 == 2 && decision2 == 1 && decision3 == 2) {
                    System.out.println(nombre + " viaja cómodo, pero nunca descubre lo que brillaba cerca.");
                } else if (decision1 == 2 && decision2 == 2 && decision3 == 1) {
                    System.out.println(nombre + " camina por el suelo y se sorprende con un tesoro oculto.");
                } else {
                    System.out.println(nombre + " decide caminar tranquilo en el suelo, disfrutando del viaje sin sobresaltos.");
                }

                // RESUMEN DE ESTADÍSTICAS
                System.out.println("\n--- RESUMEN DE ESTADÍSTICAS ---");
                System.out.println("Distancia recorrida a pie: " + distancia + " metros.");
                System.out.println("Distancia recorrida en vehículo: " + vehiculo + " metros.");
                System.out.println("¿Encontró tesoro?: " + (encontroTesoro ? "Sí" : "No"));
                System.out.println("Total recorrido: " + (distancia + vehiculo) + " metros.");
            }
        }