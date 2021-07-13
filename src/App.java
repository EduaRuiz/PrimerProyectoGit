//import java.lang.*;

public class App {

    public static void main(String[] args) {
        byte numero = 5;
        int entero = 1;
        long largo = 5L;
        short corto = 2;
        float decimalCorto = 5.0F;
        double decimalLargo = 5.00001;
        String str = "Cadena";
        boolean booleanas = true;
        char caracter = 'h';
        int[] lista = { 1, 2, 3, 4, 5 };
        var variableConTipadoInferido = 50;

        System.out.println("Hello, World!");
        System.out.println(numero + entero + largo + corto + decimalCorto + decimalLargo + str + booleanas + caracter
                + lista[2] + variableConTipadoInferido + "\n a" + "\t b" + "\r c" + "\b d" + "\f e");

        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        int a = Math.round(1) < 10 ? 8 : 2;
        System.out.println(a);

        if (5 < a ^ 7 < 10) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        System.out.println(calcularDigito(800090));

    }

    public static int calcularDigito(int numero) {
        int resultado = 0;
        while (numero != 0) {
            numero /= 10;
            resultado++;
        }
        return resultado;
    }
}
