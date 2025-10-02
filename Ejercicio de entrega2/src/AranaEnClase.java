import java.util.Scanner;

public class AranaEnClase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables
        String nombre;
        int metrosRecorridos = 0;      // metros caminados en el aula
        int puntosAtencion = 0;        // puntos por prestar atención
        boolean seEsconde = false;     // si la araña decide esconderse


        System.out.println("Bienvenido a la aventura de la araña en clase.");
        System.out.print("Introduce el nombre de tu araña: ");
        nombre = sc.nextLine();

        System.out.println("\nHoy " + nombre + " entra al aula de un colegio. " +
                "Hay estudiantes, pupitres y la maestra está a punto de empezar la lección.");

        // Primera decisión
        System.out.println("\nDECISIÓN 1: ¿Qué hace " + nombre + " al inicio de la clase?");
        System.out.println("1. Subir a la pizarra para observar todo.");
        System.out.println("2. Esconderse bajo un pupitre.");
        int d1 = sc.nextInt();

        if (d1 == 1) {
            metrosRecorridos += 2;
            puntosAtencion += 2;
            System.out.println(nombre + " trepa dos metros hasta la pizarra y observa con atención.");
        } else {
            seEsconde = true;
            System.out.println(nombre + " se esconde bajo un pupitre para no ser visto.");
        }

        // Segunda decisión
        System.out.println("\nDECISIÓN 2: El profesor empieza a explicar programacion.");
        System.out.println("1. Escuchar atentamente.");
        System.out.println("2. Caminar por el pupitre de un estudiante.");
        int d2 = sc.nextInt();

        if (d2 == 1) {
            puntosAtencion += 3;
            System.out.println(nombre + " escucha atentamente y gana 3 puntos de atención.");
        } else {
            metrosRecorridos += 1;
            System.out.println(nombre + " camina un metro por el pupitre, causando sorpresa entre los alumnos.");
        }

        // Tercera decisión
        System.out.println("\nDECISIÓN 3: Un estudiante lo ve y grita.");
        System.out.println("1. Escapar hacia la ventana.");
        System.out.println("2. Quedarse quieto en su sitio.");
        int d3 = sc.nextInt();

        if (d3 == 1) {
            metrosRecorridos += 3;
            System.out.println(nombre + " corre tres metros hasta la ventana.");
        } else {
            seEsconde = true;
            System.out.println(nombre + " se queda inmóvil esperando pasar desapercibido.");
        }
        
        System.out.println("\n--- DESENLACE ---");
        if (d1 == 1 && d2 == 1 && d3 == 1) {
            System.out.println(nombre + " aprendió matemáticas desde la pizarra y escapó justo a tiempo.");
        } else if (d1 == 1 && d2 == 1 && d3 == 2) {
            System.out.println(nombre + " se quedó quieto en la pizarra, siendo aplaudido como mascota de la clase.");
        } else if (d1 == 1 && d2 == 2 && d3 == 1) {
            System.out.println(nombre + " caminó por el pupitre, causó caos y huyó por la ventana.");
        } else if (d1 == 1 && d2 == 2 && d3 == 2) {
            System.out.println(nombre + " se quedó inmóvil sobre el pupitre, convirtiéndose en protagonista de la clase.");
        } else if (d1 == 2 && d2 == 1 && d3 == 1) {
            System.out.println(nombre + " escuchó escondido, aprendió y luego escapó hacia la ventana.");
        } else if (d1 == 2 && d2 == 1 && d3 == 2) {
            System.out.println(nombre + " permaneció bajo el pupitre toda la clase, aprendiendo en silencio.");
        } else if (d1 == 2 && d2 == 2 && d3 == 1) {
            System.out.println(nombre + " fue descubierto en el pupitre, pero alcanzó la ventana a tiempo.");
        } else {
            System.out.println(nombre + " se quedó inmóvil bajo el pupitre y pasó desapercibido hasta el final.");
        }
        }
        }