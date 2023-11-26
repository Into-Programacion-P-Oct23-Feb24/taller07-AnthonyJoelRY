package problema001;

import java.util.*;

public class Problema001 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre_del_jugador;
        String posicion_en_el_campo;
        String informacion_a_presentar = "-Información de los jugadores-\n";
        String salir;
        String lista_de_edades = "Listado de Edades\n";
        int edad;
        double estatura;
        double promedioEstatura = 0;
        double promedioEdad = 0;
        boolean bandera = true;
        int contador = 0;
        int contador1 = 1;

        do {
            System.out.println("Ingrese el nombre y apellidos del jugador@ #"
                    + contador1);
            nombre_del_jugador = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador@.");
            edad = entrada.nextInt();
            System.out.println("Ingrese la posicion en la que juega.");
            entrada.nextLine();
            posicion_en_el_campo = entrada.nextLine();
            System.out.println("Ingrese la estatura del jugador@ en metros.");
            estatura = entrada.nextDouble();

            System.out.println("Si desea salir digite (uno) caso contrario "
                    + "digite otro numero.");
            entrada.nextLine();
            salir = entrada.nextLine();

            contador++;

            if (salir.equals("1")) {
                bandera = false;
            }
            informacion_a_presentar = String.format("%s"
                    + "%s.%s-%s-,edad %s,estatura %s\n",
                    informacion_a_presentar,
                    contador1, nombre_del_jugador,
                    posicion_en_el_campo, edad, estatura);

            lista_de_edades = String.format("%s%s\n", lista_de_edades,
                    edad);

            promedioEdad = promedioEdad + edad;
            promedioEstatura = promedioEstatura + estatura;

            contador1++;

        } while (bandera);
        promedioEdad = promedioEdad / contador;
        promedioEstatura = promedioEstatura / contador;
        System.out.printf(informacion_a_presentar);
        System.out.printf(lista_de_edades);
        System.out.print("Promedio de Edades:");
        System.out.println(promedioEdad);
        System.out.print("Promedio de Estatura:");
        System.out.println(promedioEstatura);
    }

}
