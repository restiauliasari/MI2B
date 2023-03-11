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
public class Kesehatan {
    public String namaPasien;
    private String health;
    
    Kesehatan (String namaPasien,String health){
        this.namaPasien = namaPasien;
        this.health = health;
    }
    
    void display(){
        System.out.println(this.namaPasien+" "+"mempunyai penyakit "+" "+this.health);
    }
}
