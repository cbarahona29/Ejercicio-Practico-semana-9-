package veterinaria;

import java.util.Scanner;

public class Veterinaria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Belleza bel = new Belleza();
        Atencion at=new Atencion();

        while (true) {
            System.out.println("MENU\n"
                    + "1. Atencion Medica\n"
                    + "2. Belleza & Estetica\n"
                    + "3. Cerrar Caja\n"
                    + "4. Salir");

            String menu = entrada.nextLine();

            switch (menu) {
                case "1":
                   at.atencion();
                    break;

                case "2":
                    bel.belleza();
                    break;

                case "3":
                    System.out.println("Cerrando caja\n"
                            + "Resumen del dia:\n"
                            + "Servicios de atencion medica: " + at.getContadorAtencion()+"\n"+
                            "Total de atención medica: " + at.getTotalAtencion()+"Lps\n"+
                            "Servicios de belleza: " + bel.getContadorBelleza()+"\n"+
                            "Total de belleza: " + bel.getTotalBelleza()+"Lps\n"
                    +"Total: "+(at.getTotalAtencion()+bel.getTotalBelleza())+"Lps\n");
                    break;

                case "4":
                    System.out.println("Saliendo del sistema");
                    return; 

                default:
                    System.out.println("INGRESE SOLO NUMEROS VALIDOS");
            }
        }
    }
}

