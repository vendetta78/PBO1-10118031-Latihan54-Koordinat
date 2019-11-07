package pbo1.pkg10118031.latihan54.koordinat;

/**
 *
 * @author Vendetta 
 * NAMA : RIZKI ARIA PUTRA 
 * KELAS : PBO1 
 * NIM : 10118031
 * Deskripsi Program : Program ini untuk membuat Warna Sumbu.
 */
public class PBO110118031Latihan54Koordinat {

    public static void main(String[] args) {

        WarnaKoordinat wKoordinat = new WarnaKoordinat(10, 4, "Jingga");
        System.out.println("Warna Koordinat : " + wKoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " + wKoordinat.getX() + ", y : " + wKoordinat.getY());
    }

}
