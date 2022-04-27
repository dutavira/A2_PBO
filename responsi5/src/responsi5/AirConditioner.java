/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi5;

/**
 *
 * @author HP
 */
public class AirConditioner {
    private Ac ac;

    public AirConditioner(Ac ac) {
        this.ac = ac;
    }
    
    void nyalakanAc(){
        this.ac.nyalakan();
    }
    
    void matikanAc(){
        this.ac.matikan();
    }
    
    void TambahSuhu(){
        this.ac.naikkanSuhu();
    }
    
    void KurangiSuhu(){
        this.ac.turunkanSuhu();
    }
}
