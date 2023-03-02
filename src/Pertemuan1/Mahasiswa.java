/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;

/**
 *
 * @author USER
 */
public class Mahasiswa {
    
    String nama,nobp,kelas,prodi,jurusan;
    
    public static void main (String[] args){
        //object
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama ="Resti";
        mhs.nobp ="2101092018";
        mhs.kelas ="MI2B";
        mhs.prodi ="Manajemen Informatika";
        mhs.jurusan ="Teknologi Informasi";
        
        //pemanggilan fungsi
        System.out.println("Nama : "+mhs.nama+"\n"
                +"No Bp : "+mhs.nobp+"\n"
                        + "Kelas : "+mhs.kelas+"\n"
                                + "Prodi :"+mhs.prodi+"\n"
                                        + "Jurusan : "+mhs.jurusan); 
        
        System.out.println(" ");
   
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama ="Aulia";
        mhs1.nobp ="2101092020";
        mhs1.kelas ="MI2A";
        mhs1.prodi ="Manajemen Informatika";
        mhs1.jurusan ="Teknologi Informasi";
        
        //pemanggilan fungsi
        System.out.println("Nama : "+mhs1.nama+"\n"
                +"No Bp : "+mhs1.nobp+"\n"
                        + "Kelas : "+mhs1.kelas+"\n"
                                + "Prodi :"+mhs1.prodi+"\n"
                                        + "Jurusan : "+mhs1.jurusan);     
    
    }
    
}
