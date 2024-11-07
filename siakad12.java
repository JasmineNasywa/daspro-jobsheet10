import java.util.Scanner;
public class siakad12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int a,b;
        System.out.print("Masukkan baris : ");
        a = sc.nextInt();
        System.out.println("Masukkan kolom : ");
        b = sc.nextInt();
        int [][]nilai = new int [a][b];
    
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i=1));
            double totalpersiswa = 0;

            for (int j = 0; j < nilai.length; j++) {
                System.out.println("Nilai mata kuliah " + (j+1) + ": ");
                nilai [i][j] = sc.nextInt();
                totalpersiswa += nilai [i][j];
            }
            System.out.println("Nilai rata-rata: " + totalpersiswa/3);
        }

        System.out.println("\n=============================");
        System.out.println("Rata-rata nilai setiap mata kuliah :");

        for (int j = 0; j < 3; j++) {
            double totalperMatkul = 0;

            for (int i = 0; i < 4; i++) {
                totalperMatkul += nilai [i][j];
                
            }
            System.out.println("Mata kuliah " + (j + 1) + ": " + totalperMatkul/4);
        }
    }
}
