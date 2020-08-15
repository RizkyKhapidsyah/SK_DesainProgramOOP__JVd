package com.rk.dpo;

public class C02_Enkapsulasi {
    public static void main(String[] args) {
        //Instansiasi Object
        BujurSangkar bjsangkar1 = new BujurSangkar();

        bjsangkar1.setSisi(10);

        System.out.println("===========================");
        System.out.println("       BUJUR SANGKAR");
        System.out.println("===========================");
        System.out.println("Sisi        =  " + bjsangkar1.getSisi());
        System.out.println("Luas        =  " + bjsangkar1.hitungLuas());
        System.out.println("Keliling    =  " + bjsangkar1.hitungKeliling());
    }
}

class BujurSangkar {
    private int sisi;

    public void setSisi(int s) {
        sisi = s;
    }


    public int getSisi() {
        return (sisi);
    }

    public int hitungLuas() {
        return (sisi * sisi);
    }

    public int hitungKeliling() {
        return (4 * sisi);
    }
}
