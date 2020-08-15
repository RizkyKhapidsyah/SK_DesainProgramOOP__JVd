package com.rk.dpo;

public class C04_Konstruktor_Dengan_Parameter {
    public static void main(String[] args) {
        /* Instansiasi Object */
        bujurskr b1 = new bujurskr(2);
        bujurskr b2 = new bujurskr(3);
        bujurskr b3 = new bujurskr(7);

        System.out.println("===========================");
        System.out.println("       BUJUR SANGKAR");
        System.out.println("===========================");
        System.out.println("Sisi 1         = " + b1.getSisi());
        System.out.println("Luas 1         = " + b1.hitungLuas());
        System.out.println("Keliling 1     = " + b1.hitungKeliling());
        System.out.println("Sisi 2         = " + b2.getSisi());
        System.out.println("Luas 2         = " + b2.hitungLuas());
        System.out.println("Keliling 2     = " + b2.hitungKeliling());
        System.out.println("Sisi 3         = " + b3.getSisi());
        System.out.println("Luas 3         = " + b3.hitungLuas());
        System.out.println("Keliling 3     = " + b3.hitungKeliling());

    }

}


class bujurskr {
    private int sisi;

    bujurskr(int ss) {
        setSisi(ss);
    }


    public void setSisi(int s) {
        if (s > 5) {
            sisi = s;
        } else {
            sisi = 1;
        }
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
