


import java.util.Scanner;

        public class main {


            public static void main(String[] args) {


                CoffieType myCoffe = new CoffieType();
                Switch switchCaffe = new Switch();

                int coffeeBeans = 0;
                int water = 0;
                int milk = 0;

                boolean temp = true;

                Scanner scan = new Scanner(System.in);
                myCoffe.helloCafe();

               // do {


                    int userChoice = scan.nextInt();



                    switch (userChoice) {
                        case 1 -> {
                            myCoffe.allAmericano();
                            switchCaffe.switchCaffe();




                        }
                        case 2 -> {
                            myCoffe.allCaffeLatte();
                            switchCaffe.switchCaffe();
                            int cukierchoice = scan.nextInt();
                            switch (cukierchoice) {
                                case 1 -> {
                                    System.out.println("1.dodaj curkie");

                                }
                                case 2 -> {
                                    System.out.println("2.bez cukru");

                                }

                            }

                            break;
                        }
                        case 3 -> {
                            System.out.println("Wybrałeś Espresso");
                            break;
                        }
                        case 4 -> {
                            System.out.println("Wybrałeś Late Machiato");
                            System.out.println("Jeśli chcesz dodać cukier wybierz : 1 ");
                            System.out.println("Jeśli nie dodasz cukieru wybierz  : 2 ");

                        }
                        case 0 -> {
                            System.out.println("exit");
                            temp = false;
                        }
                        default -> {
                            System.out.println("Napój nie istnieje, wybierz liczbę 1-4");
                        }

                    }

              //  } while (temp == true);


            }}