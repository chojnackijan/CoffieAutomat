import java.util.Scanner;

public class CoffieType {

    String type = "Americano";
    int sizeS=150;
    int sizeL = 250 ;
    int beansUse = 30 ;

    public CoffieType() {

    }


    void helloCafe (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Wybierz napój");
        System.out.println("Jeśli nie chcesz wybierz : 0 ");
        System.out.println("1.Americano");
        System.out.println("2.Caffe late");
        System.out.println("3.Espresso");
        System.out.println("4.Late machiato");
    }



    void allAmericano (){
        System.out.println("Wybrałeś Americano, czy chcesz dodać cukier ?");
        System.out.println("Jeśli chcesz dodać cukier wybierz : 1 ");
        System.out.println("Jeśli nie dodasz cukieru wybierz  : 2 ");
    }




    void mleko (){
        System.out.println();
        System.out.println("Czy chcesz dodać mleko?");
        System.out.println("Jeśli tak wybierz :1 ");
        System.out.println("Jeśli nie wybierz :2 ");
    }
    void allCaffeLatte (){
        System.out.println("Wybrałeś Caffe Latte, czy chcesz dodać cukier ?");
        System.out.println("Jeśli chcesz dodać cukier wybierz : 1 ");
        System.out.println("Jeśli nie dodasz cukieru wybierz  : 2 ");
}}


