/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi5;

/**
 *
 * @author HP
 */
public class Sumsang implements Ac{
    
    private int suhu;
    private boolean nyala;
    
    public Sumsang(){
        this.suhu = 18;
    }
    
    @Override
    public void nyalakan() {
        nyala = true;
        System.out.println("AC dinyalakan...");
        System.out.println("================");
    }

    @Override
    public void matikan() {
        nyala = false;
        System.out.println("AC dimatikan....");
        System.out.println("================");
    }

    @Override
    public void naikkanSuhu() {
        if (nyala) {
            if (this.suhu == suhu_max){
                System.out.println("Suhu Paling Tinggi");
                System.out.println("Suhu saat ini : "+ this.getSuhu()+ "derajat C");
                
            } else{
                this.suhu += 1;
                System.out.println("Suhu saat ini : "+ this.getSuhu()+ "derajat C");
            }
        }else {
            System.out.println("AC is Dead");
            System.out.println("==========");
        }
    }

    @Override
    public void turunkanSuhu() {
        if (nyala) {
            if (this.suhu == suhu_min){
                System.out.println("Suhu Paling Rendah");
                System.out.println("Suhu saat ini : "+ this.getSuhu()+ "derajat C");
                
            } else{
                this.suhu -= 1;
                System.out.println("Suhu saat ini : "+ this.getSuhu()+ "derajat C");
            }
        }else {
            System.out.println("AC is Dead");
            System.out.println("===========");
        }
    }
    
    public int getSuhu(){
        return this.suhu;
    }
}
