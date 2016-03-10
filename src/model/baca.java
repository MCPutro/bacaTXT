/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JFileChooser;

/**
 *
 * @author Mu'ti C Putro
 */
public class baca {
    int jumlahKota;
    int kapasitasMax;
    ArrayList<kota> Kota = new ArrayList<>();
    ArrayList<Double> list = new ArrayList<>();
    
    public void baca(String file){
        try {
            String line;
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null) {                
//                if(line.contains("DIMENSION")){
//                    String[] s = line.split(":");
//                    jumlahKota = Integer.parseInt(s[1].trim());
//                }else
                if(line.contains("CAPACITY")){
                    String[] s = line.split(":");
                    kapasitasMax = Integer.parseInt(s[1].trim());
                }    
                else
                if(!line.contains("NODE :")){
                    String[] path = line.split(" ");
                    double id = Double.parseDouble(path[0].trim());
                    double x = Double.parseDouble(path[1].trim());
                    double y = Double.parseDouble(path[2].trim());
                    double berat = Double.parseDouble(path[3].trim());
                    //Kota.add(new kota(id, x, y, berat));
                    
                }
                
            }
            
            for(kota k : Kota){
                k.display();
            }
            
            System.out.println(jumlahKota+"-"+kapasitasMax);
            
        } catch (Exception e) {
            System.out.println(e.getMessage()+" <<");
        }
    }
    
    public static void main(String[] args) {
        baca b = new baca();
//        JFileChooser cari = new JFileChooser();
//        cari.showOpenDialog(null);
//        File f = cari.getSelectedFile();
//        System.out.println(f.getAbsolutePath());
        //b.baca(f.getAbsolutePath());
        b.baca("C:\\Users\\Mu'ti C Putro\\Documents\\NetBeansProjects\\baca TXT\\src\\model\\A-n45-k6-in.txt");
    }
}
