/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filkombikinibottom;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
 public class Main {
     public static void main(String[] args) {
            Manusia mns1 = new Manusia("Nabila", "215150601111019", false, true);
            Manusia mns2 = new Manusia("Zaein", "215150601111019", true, true);
            Manusia mns3 = new Manusia("Dwi Kensiwi", "215150601111019", true, false);
            ArrayList<Manusia> output = new ArrayList<Manusia>();
            output.add(mns1);
            output.add(mns2);
            output.add(mns3);

            System.out.println("========== CLASS MANUSIA ==========");
            for(int i=0;i<output.size();i++){
                System.out.println(output.get(i).toString());
            }
            System.out.println("=====================================");

            Mahasiswa mhs1 = new Mahasiswa("Nabila", "3576447103910003", false, false, "215150601111019", 3.5);
            Mahasiswa mhs2 = new Mahasiswa("Zaein", "3576447103910003", false, true, "215150601111019", 4.0);
            Mahasiswa mhs3 = new Mahasiswa("Dwi Kensiwi", "3576447103910003", false, false, "215150601111019", 3.2);
            ArrayList<Mahasiswa> output1 = new ArrayList<Mahasiswa>();
            output1.add(mhs1);
            output1.add(mhs2);
            output1.add(mhs3);

            System.out.println();
            System.out.println("====== DAFTAR MAHASISWA ======");
            for(int i=0;i<output1.size();i++){
                System.out.println(output1.get(i).toString());
            }
            System.out.println("=====================================");

            Pekerja pkj1 = new Pekerja("Nabila", "3576447103910003", false, true, 8, 30, "1234567");
            Pekerja pkj2 = new Pekerja("Zaein", "3576447103910003", true, false, 9, 28, "1234567");
            Pekerja pkj3 = new Pekerja("Dwi Kensiwi", "3576447103910003", false, true, 10, 26, "1234567");
            ArrayList<Pekerja> output2 = new ArrayList<Pekerja>();
            output2.add(pkj1);
            output2.add(pkj2);
            output2.add(pkj3);

            System.out.println();
            System.out.println("========== CLASS PEKERJA ==========");
            for(int i=0;i<output2.size();i++){
                System.out.println(output2.get(i).toString());
            }
            System.out.println("===================================");

            Manager mnj1 = new Manager("Nabila", "3576447103910003", false, true, 9, 25,"1987654", 3789);
            Manager mnj2 = new Manager("Zaein", "3576447103910003", false, false, 8, 28,"1987654", 3789);
            Manager mnj3 = new Manager("Dwi Kensiwi", "3576447103910003", true, true, 6, 25,"1987654", 3432);
            ArrayList<Manager> output3 = new ArrayList<Manager>();
            output3.add(mnj1);
            output3.add(mnj2);
            output3.add(mnj3);

            System.out.println();
            System.out.println("=========== CLASS MANAGER ==========");
            for(int i=0;i<output3.size();i++){
                System.out.println(output3.get(i).toString());
            }
            System.out.println("=====================================");

        }
    }

