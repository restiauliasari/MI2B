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
public class Rapor {
    public static void main (String[] args){
        System.out.println("UAS");
        
        Mahasiswa mahasiswa1 = new Mahasiswa ("Resti",90);
        Nilai mahasiswa2 = new Nilai("Aulia",95);
        
        mahasiswa1.display();
        mahasiswa2.display();
    }
}
