
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Taller4 {

    public static void arraySum(int[] Sum) {
        int suma = 0;
        for (int i = 0; i < Sum.length; i++) {
            suma += Sum[i];
        }
        System.out.println(suma);
    }

    public static void tablasMult(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
        }
    }

    public static int[] procesoOrdenar(int[] n) {
        for (int i = 0; i < n.length - 1; i++) {
            int j = i;
            int temp;
            if (j > 0 && n[j - 1] > n[j]) {
                temp = n[j];
                n[j] = n[j - 1];
                n[j - 1] = temp;

                j = j - 1;

            }

        }
        System.out.println(n[0] + "" + n[1] + "" + n[2]);
        return n;
    }

    public static long tomarTiempo(int n) {
        int[] a = generarArregloDeTamanoN(n);
        long startTime = System.currentTimeMillis();
        arraySum(a);
        long estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }

    public static int[] generarArregloDeTamanoN(int n) {
        int max = 5000;
        int[] a = new int[n];
        Random generator = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = generator.nextInt(max);
        }
        return a;
    }

    public static void main(String[] args) {
//tablasMult(8);
        int[] w = {4, 2, 5};
//arraySum(w);
        procesoOrdenar(w);

    }

}
