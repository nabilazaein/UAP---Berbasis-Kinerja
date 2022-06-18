/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakpbopakirwan;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {

            PegawaiTetap p1 = new PegawaiTetap("Nabila Zaein", "351657809325673497532", 7000000);
            PegawaiTetap p2 = new PegawaiTetap("Nabila", "351657809325673497532", 400000);
            PegawaiTetap p3 = new PegawaiTetap("Zaein", "351657809325673497532", 120000);
            System.out.println(p1.toString());
            System.out.println(p2.toString());
            System.out.println(p3.toString());

            PegawaiHarian ph1 = new PegawaiHarian("Dwi", "351657809325673497543", 35000, 31);
            PegawaiHarian ph2 = new PegawaiHarian("Kensiwi", "351657809325673496845", 50000, 45);
            PegawaiHarian ph3 = new PegawaiHarian("Habsary", "351657809325677946256", 30000, 30);
            System.out.println(ph1.toString());
            System.out.println(ph2.toString());
            System.out.println(ph3.toString());

            Sales s1 = new
                    Sales("Aldjun", "351657809327328910234", 60, 50000);
            Sales s2 = new
                    Sales("Habsa", "351657573568920346837", 45, 35000);
            Sales s3 = new
                    Sales("Siwi", "351657809325679354026", 90, 50000);
            System.out.println(s1.toString());
            System.out.println(s2.toString());
            System.out.println(s3.toString());
        }
    }



