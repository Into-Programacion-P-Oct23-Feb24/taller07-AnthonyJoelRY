package problema005;

public class Problema005 {

    public static void main(String[] args) {
        int limite = 8;
        double resultado = 0;
        int numeroS = 0;
        boolean suma = true;

        do {
            if (suma) {
                resultado += 1.0 / (2 * numeroS + 1);
            } else {
                resultado -= 1.0 / (2 * numeroS + 1);
            }

            suma = !suma;
            numeroS++;
        } while (numeroS < limite);

        // Imprimir la serie
        numeroS = 0;
        int contador = 1;
        do {
            if (contador == 1) {
                System.out.print("1");
                contador = 2;
            } else {

                if (numeroS % 2 == 0) {
                    System.out.print("1/" + (2 * numeroS + 1));
                } else {
                    if (contador < 8) {
                        System.out.print(" - 1/" + (2 * numeroS + 1) + " + ");
                    } else {
                        System.out.print(" - 1/" + (2 * numeroS + 1));
                    }

                }

            }
            numeroS++;
            contador++;
        } while (numeroS < limite);

        System.out.println("\nResultado: ");
        System.out.printf("%.2f\n", resultado);
    }

}
