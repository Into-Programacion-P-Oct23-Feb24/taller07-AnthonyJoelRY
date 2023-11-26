package problema004;

public class Problema004 {

    public static void main(String[] args) {
        int limite = 8;
        double resultado = 0;
        int numeroS = 0;
        boolean suma = true;

        while (numeroS < limite) {
            if (suma) {
                resultado += 1.0 / (2 * numeroS + 1);
            } else {
                resultado -= 1.0 / (2 * numeroS + 1);
            }

            suma = !suma;
            numeroS++;
        }

        // Imprimir la serie
        numeroS = 0;
        int contador = 1;
        while (numeroS < limite) {
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
        }

        System.out.println("\nResultado: ");
        System.out.printf("%.2f\n", resultado);
    }
}
