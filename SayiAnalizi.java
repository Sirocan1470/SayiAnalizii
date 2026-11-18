
import java.util.Scanner;

public class SayiAnalizi {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        long sayi;
        int sayac = 1;
        
        int pztf = 0;
        int ngtf = 0;
        int tek = 0;
        int cft = 0;
        long enbyk = 0;
        long enkck = 0;
        long tplm = 0;
        float ortalama;
        
        boolean tyadaf = true;
        
        while (tyadaf) {            
            
            System.out.println(sayac+". sayiyi giriniz:");
            sayi = sc.nextLong();
            
            if (sayi != 0) {
                sayac++;
            }else{
                tyadaf = false;
                
            }
            
            if (tyadaf == true) {
                tplm += sayi;
            
            if (sayi>0) {
                pztf++;
            } else {ngtf++;
            }
            
            if (sayi%2==0) {
                cft++;
            } else {tek++;
            }
            
            if (sayac == 1) {
                enbyk = sayi;
                enkck = sayi;
            } else {
                if (sayi>enbyk) {
                    enbyk = sayi;
                }
                if (sayi<enkck) {
                    enkck = sayi;
            }
            }} 
            
        }
        
        ortalama = tplm/sayac;
        
        if (sayac == 1) {
            System.out.println("Hata! Sadece sifir girisi yapildi.");
        } else {
        
        System.out.println("Rapor:");
        System.out.println("Pozitif sayi: "+pztf+" adet.");
        System.out.println("Negatif sayi: "+ngtf+" adet.");
        System.out.println("Tek sayi: "+tek+" adet.");
        System.out.println("Cift sayi: "+cft+" adet.");
        System.out.println("En buyuk sayi: "+enbyk);
        System.out.println("En kucuk sayi: "+enkck);
        System.out.println("Girilen sayilarin toplami: "+tplm);
        System.out.println("Girilen sayilarin ortalamasi: "+ortalama);
            
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
