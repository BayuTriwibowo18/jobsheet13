import java.util.Scanner;

public class Percobaan607 {
      public static void main(String[] args){
        Scanner sc07 =new Scanner(System.in);
        int p,l,t,L,vol;

        System.out.print("Masukkan panjang: ");
        p = sc07.nextInt();
        System.out.print("Masukkan lebar: ");
        l = sc07.nextInt();
        System.out.print("Masukkan tinggi: ");
        t = sc07.nextInt();

        L = p*l;
        System.out.println("Luas persegi panjang adalah: "+L);

        vol = p*l*t;
        System.out.println("Volume balok adalah: "+vol); 
    }
}
