public class PengunjungCafe15 {

    public static void main(String[] args) {
        daftarPengunjung15("Ali","Budi","Citra");
        daftarPengunjung15("Andi");
        daftarPengunjung15("Doni","Eti","Fahmi","Galih");
    }

    static void daftarPengunjung15(String...namaPengunjung){
        System.out.println("Daftar Nama Pengunjung: ");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("- "+namaPengunjung[i]);
        }
    }
}

