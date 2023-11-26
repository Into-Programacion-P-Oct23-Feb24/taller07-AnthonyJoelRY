package problema003;

public class Problema003 {

    public static void main(String[] args) {
        int limite = 6;
        int resultado = 2;
        int num1 = 1;

        while (num1 <= limite) {
            System.out.println(resultado);

            resultado = resultado + num1 * 2 + 1;

            num1++;
        }
    }
}
