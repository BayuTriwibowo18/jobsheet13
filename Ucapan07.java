import java.util.Scanner;
public class Ucapan07 {
    public static String penerimaUcapan(){
        Scanner sc07 =new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan");
        String namaOrang = sc07.nextLine();
        sc07.close();
        return namaOrang;
    }
    public static void main(String[] args){
        String nama = penerimaUcapan();
        System.out.print("Thank you " +nama+" \n May the force be with you");
    }
}
 
