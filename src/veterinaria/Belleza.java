package veterinaria;

import java.util.Scanner;

public class Belleza {
    int contadorBelleza = 0;
    int totalBelleza = 0;

    public void belleza() {
        int[] precios = {250, 350, 500};
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cuál es el tamaño de la mascota?\n"
                + "1. Pequeño (5-10 lb)\n"
                + "2. Mediano (10-15 lb)\n"
                + "3. Grande (15-25 lb)");

        String tamano = entrada.nextLine();

        int indiceTamano;
        switch (tamano) {
            case "1":
                indiceTamano = 0;
                break;
            case "2":
                indiceTamano = 1;
                break;
            case "3":
                indiceTamano = 2;
                break;
            default:
                System.out.println("INGRESE SOLO NÚMEROS VALIDOS");
                return;
        }

        int precio = precios[indiceTamano];
        contadorBelleza++;
        totalBelleza += precio;

        System.out.println("El precio para el servicio de belleza es: " + precio+"Lps");
    }

    public int getContadorBelleza() {
        return contadorBelleza;
    }

    public int getTotalBelleza() {
        return totalBelleza;
    }
}