package com.company;
/**
 * Yogie Alfin Salim
 * 10117100
 * IF - 3
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String kalimat;
        String kata;
        String kataB;

        Scanner scn = new Scanner (System.in);
        System.out.println("====== PROGRAM MENGGANTI KATA ======");
        System.out.println("");
        System.out.print("Masukkan Kalimat : ");
        kalimat =scn.nextLine();

        System.out.print("Ganti Kata\t : ");
        kata =scn.nextLine();

        System.out.print("Menjadi Kata\t : ");
        kataB = scn.nextLine();

        System.out.println("");
        String gantiKata = kalimat.replace(kata,kataB);
        System.out.println("========== HASIL FORMATING ==========");
        System.out.println("Kalimat Awal\t : " +kalimat);
        System.out.println("Kalimat Baru\t : " +gantiKata);
    }
}
