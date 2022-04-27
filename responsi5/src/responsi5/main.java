/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi5;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class main {
    public static void main(String[] args) {
        
        Ac SumsangAquos = new Sumsang();
        
        AirConditioner Anya = new AirConditioner(SumsangAquos);
        
        Anya.nyalakanAc();
        
        Scanner input = new Scanner(System.in);
        String aksi;
        
        while (true){
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan AC");
            System.out.println("[2] Matikan AC");
            System.out.println("[3] Naikkan Suhu");
            System.out.println("[4] Kurangi Suhu");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();
            
            if(aksi.equalsIgnoreCase("1")){
                Anya.nyalakanAc();
            } else if (aksi.equalsIgnoreCase("2")){
                Anya.matikanAc();
            } else if (aksi.equalsIgnoreCase("3")){
                Anya.TambahSuhu();
            } else if (aksi.equalsIgnoreCase("4")){
                Anya.KurangiSuhu();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }
        
    }
}
