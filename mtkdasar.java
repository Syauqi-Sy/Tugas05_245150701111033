import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Scanner;

public class mtkdasar {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan dua angka untuk ditambah: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int tambah = ngitung.sum(a, b);
        System.out.println("Hasil tambah: " + tambah);
        System.out.println("");

        System.out.print("Masukkan dua angka untuk dikurang: ");
        int c = input.nextInt();
        int d = input.nextInt();
        int kurang = ngitung.sub(c, d);
        System.out.println("Hasil kurang: " + kurang);
        System.out.println("");


        ngitung itung = new ngitung();
        System.out.print("Masukkan dua angka untuk dikali: ");
        int e = input.nextInt();
        int f = input.nextInt();
        int kali = itung.mul(e, f);
        System.out.println("Hasil kali: " + kali);
        System.out.println("");

        System.out.print("Masukkan dua angka untuk dibagi: ");
        int g = input.nextInt();
        int h = input.nextInt();
        double bagi = itung.div(g, h);
        System.out.printf("Hasil bagi: %.2f\n", bagi);
        itung.sederhana(g, h);
        input.close();
    }
}

class ngitung {
    static int sum(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    int mul(int a, int b) {
        return a * b;
    }

    double div(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    void sederhana(int n, int d) {
        int gcd = gcd(n, d);
        n /= gcd;
        d /= gcd;
        if (d == 1) {
            System.out.print("Penyederhanaan: " + n);
        } else {
            System.out.print("Penyederhanaan: " + n + "/" + d);
        }
    }
    int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}
