
package com.mycompany.javaprojectatm;

import java.util.Scanner;

public class Javaprojectatm {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);               // ATM PROJECT
            int bakiye = 1000;
            String islemler = "1.Bakiye sorgulama" +
                              "2.Para cekme"+
                              "3.Para yatırma" +
                              "4.Cıkmak icin q'a basiniz.";
            System.out.println(islemler);
            
            
            while(true){
                
                System.out.println("islem seciniz: ");
                String islem = scanner.nextLine();
                
                if(islem.equals("q")){
                    System.out.println("Programdan cıkılıyor");
                    break;
                }
                else if(islem.equals("1")){
                    System.out.println("Bakiyeniz:" + bakiye);
                    
                }
                else if(islem.equals("2")){
                    System.out.println("Cekmek istediğiniz tutar:");
                    int tutar = scanner.nextInt();
                    scanner.nextLine();
                    
                    if(bakiye - tutar < 0){
                        System.out.println("Bakiyeniz yetersizdir... bakiye: " + bakiye);
                    }
                    
                    else{
                        bakiye -= tutar;
                        System.out.println("Yeni bakiyeniz: " + bakiye);
                    }
                            
                }
                
                else if(islem.equals("3")){
                    System.out.println("Yatırmak istediginiz tutar: ");
                    int tutar = scanner.nextInt();
                    scanner.nextLine();
                    
                    bakiye += tutar;
                    System.out.println("Yeni bakiyeniz: " + bakiye);
                }
                
                else {
                    System.out.println("Geçersiz islem...x");
                    
                }
                
            }
        
    }
}
