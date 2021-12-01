import java.util.Scanner;

public class Switch {
    CoffieType myCoffe = new CoffieType();
    Scanner scan = new Scanner(System.in);


    void switchCaffe() {

        int userChoice = scan.nextInt();
        switch (userChoice){
        case 1 -> {
            int cukierChoice = scan.nextInt();
            switch (cukierChoice) {
                case 1 -> {
                    System.out.println("Dodałeś curkier");
                    myCoffe.mleko();
                    int mlekoChoice = scan.nextInt();
                    switch (mlekoChoice) {
                        case 1 -> {
                            System.out.println("Dodano mleko");
                            break;
                        }
                        case 2 -> {
                            System.out.println("Bez mleka");
                        }
                    }

                }
                case 2 -> {
                    System.out.println("Bez cukru");
                    myCoffe.mleko();
                    int mlekoChoice = scan.nextInt();
                    switch (mlekoChoice) {
                        case 1 -> {
                            System.out.println("Dodano mleko");
                            break;
                        }
                        case 2 -> {
                            System.out.println("Bez mleka");
                        }
                    }
                    System.out.println();
                    System.out.println("Wybierz rozmiar napoju:");

                    System.out.println("1= 500ml lub 2=250ml");
                    int sizeChoice = scan.nextInt();


                    switch (sizeChoice) {
                        case 1 -> {
                            System.out.println("Wybrałeś duży napój");
                        }
                        case 2 -> {
                            System.out.println("Wybrałeś mały napój");
                        }

                    }
                }
            }
        }
    }
}}
