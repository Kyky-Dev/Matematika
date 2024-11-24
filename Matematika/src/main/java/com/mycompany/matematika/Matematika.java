package com.mycompany.matematika;

public class Matematika {

     int mat;
     String operasi;
        void pertambahan(int a, int b){
            mat = a + b;
            operasi = "+";
        }
            
        void pengurangan(int a, int b){
            mat = a - b;
            operasi = "-";
        }
            
        void perkalian(int a, int b){
            mat = a * b;
            operasi = "x";
        }
            
        void pembagian(int a, int b){
            mat = a / b;
            operasi = ":";
        }
                
}
