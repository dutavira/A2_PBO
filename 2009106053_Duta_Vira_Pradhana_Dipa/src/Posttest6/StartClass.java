/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author HP
 */
public class StartClass {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        while (true){
            mulai();
        }
    }
    
    static void mulai() throws IOException{
        Pengguna akunbaru = new Pengguna("anyaforger", "anya123");
        Akun Anya = new Akun(akunbaru);
        System.out.println("*================================*");
        System.out.println("|        TravelOke Ticket        |");
        System.out.println("*================================*");
        System.out.println("| 1. Masuk    | 2. Keluar        |");
        System.out.println("*================================*");
        System.out.print(" Masukkan Pilihan : ");
        int pilihan = Integer.parseInt(input.readLine());
        if (pilihan==1){
            Anya.Masuk();
        } else if (pilihan ==2){
            Anya.Keluar();
        } else{
            System.out.println("\n*================================*");
            System.out.println("|         Masukkan Salah         |");
            System.out.println("*================================*\n");
//            String skip = input.readLine();
        }
    }
}
