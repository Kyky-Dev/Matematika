package com.mycompany.matematika;

public class matematikaCanggih extends Matematika{
    
    void setmodulus(int a, int b){
        mat = a % b;
        operasi = "%";
    }
    
    void display(){
        System.out.println("Hasil " + operasi + " " + mat);
    }
    
}
