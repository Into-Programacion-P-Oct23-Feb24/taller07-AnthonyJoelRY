package problema002;

public class Problema002 {

    public static void main(String[] args) {
        int num1 = 0;
        int limite = 10;
        int resultado = 2;

        while (num1 < limite) {
            System.out.println(resultado);
            resultado = resultado + (num1 + 2) * 2;
            num1++;
        }
    }

}
