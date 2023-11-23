import java.util.Scanner;
public class UcapanTerimaKasih07 {
    public static String penerimaUcapan(){
        Scanner sc07 =new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc07.nextLine();
        sc07.close();
        return namaOrang;
    }
    public static void UcapanTerimaKasih() {
        String nama = penerimaUcapan();
        System.out.println("Thank you "+nama+" for being the teacher in the world.\n "+
        "You inspired in me a love for learning and made me feel like I could ask you anything. ");
       }
    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}
