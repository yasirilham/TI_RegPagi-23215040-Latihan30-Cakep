/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS_LATIHAN_PERTEMUAN_6;

/**
 *
 * @author ACER
 * NAMA : M YASIR ILHAM N
 * KELAS : PBO1
 * NIM : 23215040
 * DESKRIPSI PROGRAM : Membuat Program sesuai ketentuan
 */
import java.util.Scanner;
public class Latihan30_Cakep {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kamu ngerjain sendiri latihan 17 sampe latihan 30 ini?\nJawab (Yoi/Enggak): ");
        String jawaban = scanner.nextLine().trim().toLowerCase();

        if (jawaban.equals("yoi")) {
            System.out.println("Cakep Bener. Good Job");
        } else if (jawaban.equals("enggak")) {
            System.out.println("Tetep cakep sih.");
            System.out.println("Sing penting paham konsep nya yee.");
            System.out.println("Keep the code works dude");
        } else {
            System.out.println("Jawaban tidak sesuai. Coba lagi dengan 'Yoi' atau 'Enggak'.");
        }
    }
}
