
package com.mycompany.metodlar;

import static java.time.InstantSource.system;
import java.util.Scanner;

public class Metodlar {
    
    
   /* public static void faktoriyel(){                    // FONKSİYONU BÖYLE TANIMLARIZ..
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayi giriniz: ");
        int sayi = scanner.nextInt();
        
        int faktoriyel = 1;
        while(sayi > 0){
            
            faktoriyel *= sayi;
            sayi--;
        }
            System.out.println("Faktoriyeö: " + faktoriyel);
    }
    */
       /* public static void selamlama(String isim){          // GÖNDERDİGİMİZ PARAMETREYİ(STRİNG) AŞAĞIDAN ÇAĞIRMAMIZ GEREKİYOR..
                
            System.out.println("Merhaba" + isim);
        }
        public static void toplama(int a, int b, int c){
            System.out.println("Toplamları = " + (a+b+c));
        }
        */
    
    
        /*public static int toplama(int a, int b, int c){
            return(a+b+c);                                  // FONKSİYONY BAŞKA YERLERDE DE KULLANABİLMEK İÇİN RETURN KULLANİRİZ..
        }
        */
    
       /* public static int ikilecarp(int a){                 // bu örnekte oldugu gibi ayni fonksiyonu bir cok kere kullandık.(return ile)
             return a *= 2;
        }
        
        public static int ikiiletopla(int a){
            return a += 2;
        }
        
        public static int dortilecarp(int a){
            
            return a *= 4;
        }
        */
    
           /*public static boolean asalMi(int sayi){              // 1-1000 arasindaki hangi sayılar asal programı..
               
               for(int i = 2; i < sayi; i++){
                
                if(sayi % i == 0){
                    return false;
                }
           }
               return true;
        }
        */
    
        public static int cıkarma(int a, int b){
            return(a-b);
        }
        public static double bolme(int a, int b){
            return ((double)a / b);
        }
        public static int toplama(int a, int b){
            return(a + b);
        }
        
        public static int toplama(int a, int b, int c){
            return (a + b + c);
        }
        
        public static int carpma(int a, int b){
            return (a*b);
        }
        public static int carpma(int a, int b ,int c){
            return(a*b*c);
        }
  
    public static void main(String[] args) {
        //faktoriyel();                                       // FONKSİYONU BÖYLE ÇAĞIRIRIZ.
        //selamlama("Yusuf");
        
       // System.out.println("Çıktı değeri: " + toplama(10,12,15));
       
       // System.out.println("Cıktı degeri: " + dortilecarp(ikiiletopla(ikilecarp(10))));
        
        /*for(int i = 2; i < 1000; i++){
            if(asalMi(i)){
                System.out.println(i);
            }
        }
        */
        Scanner scanner = new Scanner(System.in);
        String islemler = "1.Toplama islemi" +
                          "2.Cıkarma islemi" +
                          "3.Carpma islemi" +
                          "4.Bolme islemi";
        System.out.println(islemler);
        
        while(true){
            System.out.println("İslemi seciniz");
            String islem = scanner.nextLine();
            
            if(islem.equals("1")){
                System.out.println("Kac deger toplayacaksiniz: (2 veya 3) ");
                int kacsayi = scanner.nextInt();
                
                if(kacsayi == 2){
                    System.out.println("a: ");
                    int a = scanner.nextInt();
                    System.out.println("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayilarin toplami: " + toplama(a, b));
                    
                    
                }
                else if(kacsayi == 3){
                    
                     System.out.println("a: ");
                    int a = scanner.nextInt();
                    System.out.println("b: ");
                    int b = scanner.nextInt();
                    System.out.println("c: ");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayilarin toplami: " + toplama(a, b, c ));
                }
                else{
                    System.out.println("Bunun icin uygun metod bulunmuyor...");
                }
                
            }
            else if(islem.equals("2")){
                
                    System.out.println("a: ");
                    int a = scanner.nextInt();
                    System.out.println("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayilarin farkları: " + cıkarma(a, b));
            }
            
            else if(islem.equals("3")){
                
                 System.out.println("Kac deger carpacaksiniz: (2 veya 3) ");
                int kacsayi = scanner.nextInt();
                
                if(kacsayi == 2){
                    System.out.println("a: ");
                    int a = scanner.nextInt();
                    System.out.println("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayilarin carpimlari: " + carpma(a, b));
                    
                    
                }
                else if(kacsayi == 3){
                    
                     System.out.println("a: ");
                    int a = scanner.nextInt();
                    System.out.println("b: ");
                    int b = scanner.nextInt();
                    System.out.println("c: ");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayilarin carpımları: " + carpma(a, b, c ));
                }
                else{
                    System.out.println("Bunun icin uygun metod bulunmuyor...");
                }
                
                   
            }
            
            else if(islem.equals("4")){
                
                    System.out.println("a: ");
                    int a = scanner.nextInt();
                    System.out.println("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("bölümleri: " + bolme(a, b));
            
            }
            
            else{
                System.out.println("Gecersiz islem....");
            }
                
            
            
        }
         
          
    }
}
