package carpmapratik;
import java.util.Scanner;
import java.util.Random;
public class Carpmapratik {
public static void main(String[] args) {
      Scanner girilen=new Scanner(System.in);
      int secim;
      int d=0;
      int puan=0;
      int sayi=0;
     do
     {
      for(sayi=0;sayi<10;sayi++){
      
      d=0;
      System.out.println("2 sayili mi 3 sayili mi olsun ?");
      secim=girilen.nextInt();
      if(secim!=3 && secim!=2 ) {
         System.out.println("Hatali girdin.");
         System.out.println("Tekrar denemek icin 1'e bas.");
         d=girilen.nextInt();
     
      
      }
      else{    
          switch(secim){
             
          case 2 :
              Random r=new Random();
              int a=r.nextInt(10);
              int b=r.nextInt(10);
              int sonuc=a*b;
              System.out.println("Bil bakalim : " +a+"*"+b+"?");
              int cevap=girilen.nextInt();
              if(cevap==sonuc){
                Random sec=new Random();
                int cevaplar=sec.nextInt(4)+1;
                if(cevaplar==1){
                System.out.println("Bu soru senden kacar mi zaten :)");
                }
                if(cevaplar==2){
                System.out.println("Cevabin yanlis..Saka saka tabi ki dogru :)");
              
                }
                if(cevaplar==3){
                System.out.println("Afferin be :)");
              
                }
                if(cevaplar==4){
                System.out.println("Aslanim benim.");
              
                }
                if(cevaplar==5){
            
                 System.out.println("Bunlar cok calismanin faydalari,cevabın tabi ki dogru evlat :)");
                 
                 
                }
                puan=10+puan;
                
                 
             }
             else{
                 Random sec=new Random();
                int cevaplar=sec.nextInt(4)+1;
                if(cevaplar==1){
                System.out.println("Üzgünüm cevabin yanlis...");
              
                }
                if(cevaplar==2){
                System.out.println("Bu hatayi nasil yaptin sen..");
              
                }if(cevaplar==3){
                System.out.println("Az daha oyun oyna...");
              
                }if(cevaplar==4){
                System.out.println("Üzme morali ,calismaya devam...");
              
                }if(cevaplar==5){
                System.out.println("Üzdün beni cocuk...");
              
                }
             
             
             }
              
              break;
          case 3 :
              Random f=new Random();
              int c=f.nextInt(10);
              int e=f.nextInt(10);
              int k=f.nextInt(10);
              int sonuc2=c*e*k;
              System.out.println("Bil bakalim : " +c+"*"+k+"*"+e+"?");
              int cevap2=girilen.nextInt();
              
                if(cevap2==sonuc2){
                Random sec=new Random();
                int cevaplar=sec.nextInt(4)+1;
                if(cevaplar==1){
                System.out.println("Bu soru senden kacar mi zaten :)");
                }
                if(cevaplar==2){
                System.out.println("Cevabin yanlis..Saka saka tabi ki dogru :)");
              
                }
                if(cevaplar==3){
                System.out.println("Afferin be :)");
              
                }
                if(cevaplar==4){
                System.out.println("Aslanim benim.");
              
                }
                if(cevaplar==5){
            
                 System.out.println("Bunlar cok calismanin faydalari,cevabın tabi ki dogru evlat :)");
                 
                 
                }
                puan=10+puan;
                }
              else{
                Random sec=new Random();
                int cevaplar=sec.nextInt(4)+1;
                if(cevaplar==1){
                System.out.println("Üzgünüm cevabin yanlis...");
              
                }
                if(cevaplar==2){
                System.out.println("Bu hatayi nasil yaptin sen..");
              
                }if(cevaplar==3){
                System.out.println("Az daha oyun oyna...");
              
                }if(cevaplar==4){
                System.out.println("Üzme morali ,calismaya devam...");
              
                }if(cevaplar==5){
                System.out.println("Üzdün beni cocuk...");
              
                }
             }
              
              break;
      }
      }
      }
     }
     while(d==1);
      
      
      
      
      
      
      
      System.out.println("Cözdügün sorulara göre puanin :"+puan);
      if(puan>=50){
          System.out.println("Gercekten beni cok mutlu ettin.Calismaya devam evlat :)");
      }
      else
          System.out.println("Testi simdilik gecemedin.Biraz daha calisip bu testi tekrar cöz evlat.");
    }

    
}