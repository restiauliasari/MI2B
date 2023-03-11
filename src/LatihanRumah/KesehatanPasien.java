/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanRumah;

/**
 *
 * @author USER
 */
public class KesehatanPasien {
    public static void main(String[] args){
        System.out.println("test");
        
        Pasien pasien1 = new Pasien("Aulia","demam");
        Kesehatan pasien2 = new Kesehatan("Abdi","Asma");
        
        pasien1.display();
        pasien2.display();
        
    }
}
