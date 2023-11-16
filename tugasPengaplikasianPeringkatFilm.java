import java.util.Arrays;
import java.util.Scanner;

public class tugasPengaplikasianPeringkatFilm {
    public static void main(String[] args) {
        // Inisialisasi array film
        String[] judulFilm = {"The Shawshark Redemption", "The Godfather", "Pulp Fiction", "The Dark Knight", "Forest Gump"};
        String[] genreFilm = {"Drama", "Crime", "Crime", "Action", "Action"};
        double[] ratingFilm = {4.8, 4.9, 4.7, 4.5, 4.6};

        // Mengurutkan rating film
        Arrays.sort(ratingFilm);

        // Menampilkan daftar film
        System.out.println("Daftar Film:");
        for (int i = 0; i < judulFilm.length; i++) {
            System.out.println(judulFilm[i] + " (Genre: " + genreFilm[i] + ", Rating: " + ratingFilm[i] + ")");
        }
        
        // Minta pengguna untuk memasukkan rating yang ingin dicari
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan rating yang ingin dicari: ");
        double ratingCari = scanner.nextDouble();

        // Mencari film dengan rating tertentu
        boolean filmDitemukan = false;
        for (int i = 0; i < ratingFilm.length; i++) {
            if (ratingFilm[i] == ratingCari) {
                System.out.println("Film dengan rating " + ratingCari + " adalah " + judulFilm[i] + " (Genre: " + genreFilm[i] + ")");
                filmDitemukan = true;
            }
        }

        if (!filmDitemukan) {
            System.out.println("Tidak ada film dengan rating " + ratingCari);
        }

        scanner.close();
    }
}
