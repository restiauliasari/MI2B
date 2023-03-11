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
public class Mahasiswa {
    public String nama;
    private double skor;
    
    Mahasiswa(String nama, double skor){
        this.nama = nama;
        this.skor = skor;
        
    }
    
    void display(){
        System.out.println(this.nama+" "+"memiliki nilai UAS"+" "+this.skor);
    }
}
