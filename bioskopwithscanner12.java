import java.util.Scanner;
public class bioskopwithscanner12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu;
        String nama, next;

        String [][] penonton = new String [4][2];

        while (true) {
        System.out.println("Masukkan pilihan menu (1/2/3)");
        System.out.println("1.Input data penonton \n2.Tampilkan daftar penonton \n3.Exit");
        System.out.print(">>>");
        menu = sc.nextInt();


       if (menu == 1) {
        
       
            System.out.print("Masukkan nama : ");
            nama = sc.next();
            System.out.print("Masukkan baris : ");
            baris = sc.nextInt();
            System.out.print("Masukkan kolom : ");
            kolom = sc.nextInt();
            sc.nextLine();

           if (baris <= 4 && kolom <= 2 ) {
            if ((penonton[baris-1][kolom-1])== null){
            penonton[baris-1][kolom-1] = nama;}
            else {
                System.out.println("Kursi telah terisi.");
            }
           } else {
            System.out.println("Nomor kolom dan baris yang dimasukkan salah.");
           }

       }
       else if (menu == 2) {
        System.out.println("Menampilkan daftar penonton");
        for (int i = 0; i < penonton.length; i++) {
            if (penonton[i] == null) {
                System.out.print("***");
            }
            System.out.println("Penonton pada baris ke-" + (i+1) + "; " + String.join(",", penonton [i]));
        
       }} else if (menu == 3) {
        System.out.print("Input penonton lainnya ? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")){
                break;
            }
       }else {
        System.out.println("Menu tidak dapat ditemukan.");
       }
            
        }
    }
}
