import java.util.Scanner;
public class kafe15{
    public static void Menu(String namaPelangan, boolean isMember, String kodePromo) {
     System.out.println("Selamat datang, "+namaPelangan+"!");
     
     if (isMember) {
        System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
     }
    if (kodePromo.equals("DISKON50")) {
        System.out.println("Anda mendapatkan diskon 50%");
    } else if (kodePromo.equals("DISKON30")) {
        System.out.println("Anda mendapatkan diskon 30%");
    } else{
        System.out.println("invalid.");
    }
     System.out.println("==== MENU RESTO KAFE ====");
     System.out.println("1. Kopi Hitam - Rp 15,000");
     System.out.println("2. Cappuccino - Rp 20,000");
     System.out.println("3. Latte - Rp 22,000");
     System.out.println("4. Teh Tarik - Rp 12,000");
     System.out.println("5. Roti Bakar - Rp 10,000");
     System.out.println("6. Mie Goreng - Rp 18,000");
     System.out.println("Silakan pilih menu yang Anda inginkan");
    }
    public static int hitungTotalHarga (int pilMenu, int bykItem) {
        int[] hargaItems = {15000,20000,22000,12000,10000,18000};

        int hargaTotal = hargaItems[pilMenu - 1] * bykItem;
        return hargaTotal; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true,"");
        System.out.print("\n Masukkan nomor menu yang ingin anda pesan : ");
        int pilMenu = sc.nextInt();
        System.out.print("\n Masukkan jumlah yang ingin dimasukkan : ");
        int bykItem = sc.nextInt();

        int totalHarga = hitungTotalHarga(pilMenu, bykItem);

        System.out.println("Total harga untuk pesanan anda : Rp" + totalHarga);
    }
}
