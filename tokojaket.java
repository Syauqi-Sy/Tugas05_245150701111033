import java.util.Scanner;

public class tokojaket {
    public static void main (String[] args) {
        Labkomdas jual = new Labkomdas();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan banyak jaket A: ");
        int jJA = scanner.nextInt();
        System.out.print("Masukkan banyak jaket B: ");
        int jJB = scanner.nextInt();
        System.out.print("Masukkan banyak jaket C: ");
        int jJC = scanner.nextInt();
        scanner.close();
        
        int tJA = jual.hitungTotalA(jJA);
        int tJB = jual.hitungTotalB(jJB);
        int tJC = jual.hitungTotalC(jJC);
        int sum = tJA + tJB + tJC;

        System.out.print("Total harga jaket A: " + tJA + "\n");
        System.out.print("Total harga jaket B: " + tJB + "\n");
        System.out.print("Total harga jaket C: " + tJC + "\n");
        System.out.print("Total harga keseluruhan: " + sum + "\n");
    }
}

class Labkomdas {
    private final int jaketA = 100000;
    private final int jaketB = 125000;
    private final int jaketC = 175000;

    private final int jaketAD = 95000;
    private final int jaketBD = 120000;
    private final int jaketCD = 160000;
    
    int hitungTotalA(int jum) {
        if (jum > 100) {
            return jum * jaketAD;
        } else {
            return jum * jaketA;
        }
    }
    
    int hitungTotalB(int jum) {
        if (jum > 100) {
            return jum * jaketBD;
        } else {
            return jum * jaketB;
        }
    }
    
    int hitungTotalC(int jum) {
        if (jum > 100) {
            return jum * jaketCD;
        } else {
            return jum * jaketC;
        }
    }
}
