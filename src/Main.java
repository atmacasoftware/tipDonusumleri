import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenlerin tanımlanması
        int secim, sayi;
        double doubleSayi;

        //Scanner sınıfının import edilmesi
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan seçim alınması
        System.out.println("Hangi tür dönüşüm yapacaksınız?");
        System.out.println("1-Integer'dan Double'a\n2-Double'dan Integer'a");
        secim = input.nextInt();

        //Dönüşüm işlemleri
        if(secim == 1){
            System.out.print("Integar sayı giriniz : ");
            //Integar harici sayı girilmesi durumunda oluşacak hatanın yakalanması
            try{
                //Kullanıcıdan int türünde sayı alınması
                sayi = input.nextInt();

                doubleSayi = (double) sayi;
                System.out.println("Dönüşüm Soncu : " + doubleSayi);

            }catch (Exception e){
                System.out.println("Integar türünde sayı girmeniz gerekmektedir.");
            }
        } else if(secim == 2){
            System.out.print("Double sayı giriniz : ");
            //Double harici sayı girilmesi durumunda oluşacak hatanın yakalanması
            try{
                //Kullanıcıdan double türünde sayı alınması
                doubleSayi = input.nextDouble();

                sayi = (int) doubleSayi;
                System.out.println("Dönüşüm Soncu : " + sayi);

            }catch (Exception e){
                System.out.println("Double türünde sayı girmeniz gerekmektedir.");
            }
        }else{
            System.out.println("Hatalı bir seçim yaptınız.");
        }

    }
}