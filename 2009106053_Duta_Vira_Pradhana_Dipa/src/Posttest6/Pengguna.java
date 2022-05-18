/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest6;

import static Posttest6.Aplikasi.menu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Pengguna implements Login{
    String username, password;
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Pengguna> akun = new ArrayList<>();
    static String pUsername, pPassword;

    public Pengguna(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void Masuk() throws IOException {
        System.out.println("*================================*");
        System.out.println("|              Masuk             |");
        System.out.println("*================================*");
        System.out.println(" Masukkan Username : ");
        pUsername = input.readLine();
        System.out.println(" Masukkan Password : ");
        pPassword = input.readLine();
        System.out.println("*================================*");
        if (pUsername.equals(this.getUsername()) && pPassword.equals(this.getPassword())){
            System.out.println("\n*================================*");
            System.out.println(" Selamat Datang "+ this.username);
            System.out.println("*================================*\n");
            menu();
        } else {
            System.out.println("\n*================================*");
            System.out.println("|         Masukkan Salah         |");
            System.out.println("*================================*\n");
            String skip = input.readLine();
            Masuk();
        }
    }
        

    @Override
    public void Keluar() throws IOException {
        System.out.println("\n*================================*");
        System.out.println("|           TERIMAKASIH          |");
        System.out.println("*================================*\n");
        System.exit(0);
    }
    
}
