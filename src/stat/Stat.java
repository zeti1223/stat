package stat;
import java.util.Scanner;
public class Stat {
    public static void main(String[] args) {
        System.out.println("Ez a program három kétjegyű pozitív egésszel végez statisztikai számításokat.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adja meg az első kétjegyű pozitív egész számot: ");
        int szam1 = scanner.nextInt();
        System.out.print("Adja meg a második kétjegyű pozitív egész számot: ");
        int szam2 = scanner.nextInt();
        System.out.print("Adja meg a harmadik kétjegyű pozitív egész számot: ");
        int szam3 = scanner.nextInt();
        System.out.println("A megadott számok: " + szam1 + " " + szam2 + " " + szam3);
        double average = (szam1 + szam2 + szam3) / 3.0;
        System.out.println("A megadott számok átlaga: " + average);
        int otven = 0;
        if (szam1 < 50) otven++;
        if (szam2 < 50) otven++;
        if (szam3 < 50) otven++;
        System.out.println("Az ötvennél kisebb számok darabszáma: " + otven);
    }
}
