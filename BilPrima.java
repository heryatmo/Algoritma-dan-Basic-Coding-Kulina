package com.example.heryatmo.kulinatest;

public class BilPrima {

    private static  String find(int angka){

        int a = 0;
        boolean result = false;
        double check = Math.sqrt(a);

        if(Math.floor(check)==check){
            result = false;
        }

        else if( ((a%2!=0 && a%3!=0 && a%5!= 0 && a%7!=0) || (a==2 || a==3 || a==5 || a==7)))
        {

            result = true;

        }
        if(result)
        {
            System.out.println("Prima");
        }
        else
        {
            System.out.println("Bukan Prima");
        }

        return "";
    }
}
