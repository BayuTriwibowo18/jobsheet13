import java.util.Scanner;
public class Percobaan607_1 {
   
    // Fungsi hitungLuas 
    static int hitungLuas ( int pjg, int lb){
            int Luas=pjg*lb;
            return Luas;
    }
    // Fungsi hitungVolume
    static int hitungVolume (int tinggi, int a, int b){
        int volume = hitungLuas(a, b)*tinggi;
        return volume;
    }
    // Fungsi main
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

