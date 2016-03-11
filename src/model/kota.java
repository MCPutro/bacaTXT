/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Mu'ti C Putro
 */
public class kota {
    private double id;
    private double x,y;
    private double berat;

    public kota(double id, double x, double y, double berat) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.berat = berat;
    }

    public void display(){
        System.out.println("id : "+this.id);
        System.out.println("("+this.x+","+this.y+") "+this.berat);
    }
    
    public void getJarak(){
        int a = 3-1;
    }
    
    public void getKOtaTerdekat(){
        System.out.println("hahahah");
        System.out.println("ojrojr");
        System.out.println("hahahah");
        System.out.println("ojrojr");
        System.out.println("hahahah");
        System.out.println("ojrojr");
        
    }
}
