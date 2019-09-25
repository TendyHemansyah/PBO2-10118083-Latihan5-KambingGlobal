/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.latihan5;

/**
 *
 * @author Tendy
 * NAMA     : Tendy Hermansyah
 * KELAS    : PBO2
 * NIM      : 10118083
 * Deskripsi Program : Kambing Global
 */
public class KambingGlobal {
    int jumlahKambing = 88;
    
//    Method untuk menampilkan jumlah kambing
    public void getJumlahKambing(){
        System.out.println("Jumlah Kambing: = "+ jumlahKambing);
    }
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
    }
    public static void main(String[] args) {
        KambingGlobal kambingSusu = new KambingGlobal();
        
//      menampilkan jumlah kambing yang ada saat program pertama berjalan
        kambingSusu.getJumlahKambing();
        
//      Menambahkan satu kambing
        kambingSusu.tambahKambing();
        
//      menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
}
