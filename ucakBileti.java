import java.util.Scanner;
public class ucakBileti {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int age,mesafe,yon;

        System.out.print("Yaşınızı giriniz:");
        age=input.nextInt();
        System.out.print("Gideceğiniz mesafeyi km cinsinden giriniz:");
        mesafe= input.nextInt();
        System.out.print("Yolculuk tipini seçiniz( 1=> tek yön uçuş , 2=> çift yön uçuş ):");
        yon= input.nextInt();

        double fiyat=mesafe*0.60;

        if(yon==1 && age>=0 && age<12){
            double ucret1=fiyat-(fiyat*50/100);
            System.out.print("BİLET FİYATINIZ:"+ ucret1 + " TL");
        }
        else if(yon==2 && age>=0 && age<12){
            double ucret2=fiyat-((fiyat*50/100)+(fiyat*20/100));
            System.out.print("BİLET FİYATINIZ:"+ ucret2 + " TL");
        }
        else if(yon==1 && age>=12 && age<=24){
            double ucret3=fiyat-(fiyat*10/100);
            System.out.print("BİLET FİYATINIZ:"+ ucret3 + " TL");
        }
        else if(yon==2 && age>=12 && age<=24){
            double ucret4=fiyat-((fiyat*10/100)+(fiyat*20/100));
            System.out.print("BİLET FİYATINIZ:"+ ucret4 + " TL");
        }
        else if(yon==1 && age>24 && age<=65){
            System.out.print("BİLET FİYATINIZ:"+ fiyat + " TL");
        }
        else if(yon==2 && age>24 && age<=65){
            double ucret5=fiyat-(fiyat*20/100);
            System.out.print("BİLET FİYATINIZ:"+ ucret5 + " TL");
        }
        else if(yon==1 && age>65 && age<=150){
            double ucret6=fiyat-(fiyat*30/100);
            System.out.print("BİLET FİYATINIZ:"+ ucret6 + " TL");
        }
        else if(yon==2 && age>65 && age<=150){
            double ucret7=fiyat-((fiyat*30/100)+(fiyat*20/100));
            System.out.print("BİLET FİYATINIZ:"+ ucret7 + " TL");
        }
        else{
            System.out.println("Hatalı giriş yaptınız!");
        }

    }
}
