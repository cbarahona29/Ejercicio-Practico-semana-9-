package veterinaria;

import java.util.Scanner;

public class Atencion {
    int contadorAtencion = 0;
    int totalAtencion = 0;

    public void atencion() {
        int[][] precios = {
            {500, 300, 600},
            {700, 500, 800},
            {1000, 700, 1100} 
        };

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cual es el tamaño de la mascota?\n"
                + "1. Pequeño (5-10 lb)\n"
                + "2. Mediano (10-15 lb)\n"
                + "3. Grande (15-25 lb)");

        int tamano = entrada.nextInt();

        System.out.println("Que atencion medica necesita?\n"
                + "1. Vacunas\n"
                + "2. Consultas\n"
                + "3. Emergencias");

        int atencion = entrada.nextInt();

        int precio = precios[tamano - 1][atencion - 1];
        contadorAtencion++;
        totalAtencion += precio;

        System.out.println("El precio para la atencion medica es: " +precio+"Lps");
    }

    public int getContadorAtencion() {
        return contadorAtencion;
    }

    public int getTotalAtencion() {
        return totalAtencion;
    }
}



