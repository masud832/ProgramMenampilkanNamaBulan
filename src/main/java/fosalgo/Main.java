package fosalgo;

import java.util.Scanner;

/**
 *
 * @author Sugiarto Cokrowibowo
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //TULISKAN KODEMU DIBAWAH INI
        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        if (n >= 1 && n <= 12) {
            n--;
            System.out.println("Output----");
            System.out.println(namaBulan[n]);
            System.out.println(namaBulan[(++n) % 12]);
            System.out.println(namaBulan[(++n) % 12]);
            System.out.println(namaBulan[(++n) % 12]);
        }     
    }

}
