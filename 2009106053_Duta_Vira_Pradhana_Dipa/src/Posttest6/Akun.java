/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest6;

import java.io.IOException;

/**
 *
 * @author HP
 */
public class Akun {
    private final Login login;

    public Akun(Login login){
        this.login = login;
    }

    void Masuk()throws IOException {
        this.login.Masuk();
    }

    public void Keluar()throws IOException {
        this.login.Keluar();
    }
}
