import java.util.Scanner;
public class kafe15{
    public static void Menu(String namaPelangan, boolean isMember) {
     System.out.println("Selamat datang, "+namaPelangan+"!");
     
     if (isMember) {
        System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
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

    public static int promo (int hargaAwal, String kodePromo){
        int diskon = 0;
        if (kodePromo.equals("DISKON50")) {
            diskon = hargaAwal * 50 / 100;
            System.out.println("Diskon 50%: Rp " + diskon);
        } else if (kodePromo.equals("DISKON30")) {
            diskon = hargaAwal * 30 / 100;
            System.out.println("Diskon 30%: Rp " + diskon);
        } else {
            System.out.println("Kode promo invalid! Tidak ada diskon.");
        }

        int hargaAkhir = hargaAwal - diskon;
        return hargaAkhir;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true);
        int total = 0;
        char ulang;
        do {
             System.out.print("\nMasukkan nomor menu: ");
            int pilMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item: ");
            int bykItem = sc.nextInt();

            int subtotal = hitungTotalHarga(pilMenu, bykItem);

            System.out.println("Subtotal pesanan ini: Rp " + subtotal);

            total += subtotal;

            System.out.print("\nIngin pesan menu lain? (y/n): ");
            ulang = sc.next().charAt(0);
        } while (ulang == 'y');

        System.out.println("\nTOTAL SEBELUM DISKON: Rp " + total);

        System.out.print("Masukkan kode promo (ketik 'n' jika tidak ada): ");
        String kodePromo = sc.next();

        int totalAkhir = promo(total, kodePromo);

        System.out.println("TOTAL YANG HARUS DIBAYAR: Rp " + totalAkhir);
    }
}
