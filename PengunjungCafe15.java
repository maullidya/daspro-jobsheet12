public class PengunjungCafe15 {

    public static void main(String[] args) {
        daftarPengunjung15();
    }

    static void daftarPengunjung15(String...namaPengunjung){
        System.out.println("Daftar Nama Pengunjung: ");
        // for (int i = 0; i < namaPengunjung.length; i++) {
        //     System.out.println("- "+namaPengunjung[i]);
        for (String stNama : namaPengunjung) {
            System.out.println("- "+stNama);
        }
        }
    }

