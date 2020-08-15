package com.rk.dpo;

public class C05_Multiple_Konstruktor {
    public static void main(String[] args) {
        //Instansiasi Object
        bjrskr_multiple bm1 = new bjrskr_multiple();
        bjrskr_multiple bm2 = new bjrskr_multiple(6);
        bjrskr_multiple bm3 = new bjrskr_multiple();

        bm3.setSisi(8);

        System.out.println("===========================");
        System.out.println("       BUJUR SANGKAR");
        System.out.println("===========================");
        System.out.println("Sisi 1         = " + bm1.getSisi());
        System.out.println("Luas 1         = " + bm1.hitungLuas());
        System.out.println("Keliling 1     = " + bm1.hitungKeliling());
        System.out.println("Sisi 2         = " + bm2.getSisi());
        System.out.println("Luas 2         = " + bm2.hitungLuas());
        System.out.println("Keliling 2     = " + bm2.hitungKeliling());
        System.out.println("Sisi 3         = " + bm3.getSisi());
        System.out.println("Luas 3         = " + bm3.hitungLuas());
        System.out.println("Keliling 3     = " + bm3.hitungKeliling());
    }

}

class bjrskr_multiple {
    private int sisi;

    bjrskr_multiple() {
        setSisi(10);
    }

    bjrskr_multiple(int ss) {
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
