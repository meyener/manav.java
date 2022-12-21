import java.util.Scanner;

/**
 * manav
 */
public class manav {

    public static void main(String[] args) {
        double armut=2.14, Elma=3.67, Domates=1.11, Muz=0.95, Patlican=5.00,a,e,d,m,p,toplam;
        Scanner scn= new Scanner(System.in);
        System.out.println("Kaç kilo armut aldiniz ? : ");
        a=scn.nextDouble();
        System.out.println("Kaç kilo elma aldiniz ? : ");
        e=scn.nextDouble();
        System.out.println("Kaç kilo domates aldiniz ? : ");
        d=scn.nextDouble();
        System.out.println("Kaç kilo muz aldiniz ? : ");
        m=scn.nextDouble();
        System.out.println("Kaç kilo patlican aldiniz ? : ");
        p=scn.nextDouble();

        toplam= (a*armut)+(e*Elma)+(d*Domates)+(m*Muz)+(p*Patlican);
        System.out.println("toplam fiyat : "+toplam);

    }
}