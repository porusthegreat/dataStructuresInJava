import java.io.BufferedReader;

public class PrintPairs {
    public static void main(String[] args) {
        float[] a = {1, 2, -1, -2, 4, 5, -9, 0, 10, 40};

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[i] + a[j]) == 4) {
                    System.out.print("{" + (int) a[i] + ", " + (int) a[j] + "}, ");
                } else if (Math.abs(a[i] - a[j]) == 4) {
                    System.out.print("{" + (int) a[i] + ", " + (int) a[j] + "}, ");
                } else if ((a[i] * a[j]) == 4) {
                    System.out.print("{" + (int) a[i] + ", " + (int) a[j] + "}, ");
                } else if (a[j] != 0 && (a[i] / a[j]) == 4) {
                    System.out.print("{" + (int) a[i] + ", " + (int) a[j] + "}, ");
                } else if (a[i] != 0 && (a[j] / a[i]) == 4) {
                    System.out.print("{" + (int) a[i] + ", " + (int) a[j] + "}");
                }
            }
        }
    }
}

