package pbo1.pkg10118033.latihan5;

/*
 *
 * @author
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 *
 */

public class PBO110118033Latihan5 {

    int jmlhKambing = 88;

    public void getJmlhKambing() {
        System.out.println("Jumlah Kambing : " +jmlhKambing);
    }

    public void tambahKambing() {
        jmlhKambing = jmlhKambing + 5;
        System.out.println("Jummlah kambing setelah ditambah : " +jmlhKambing);
    }
    
    public static void main(String[] args) {
        PBO110118033Latihan5 kambingSusu = new PBO110118033Latihan5();
        kambingSusu.getJmlhKambing();
        kambingSusu.tambahKambing();
        kambingSusu.getJmlhKambing();
    }
}