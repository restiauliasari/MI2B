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
public class Pendaftaran {
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
    }
    
}
