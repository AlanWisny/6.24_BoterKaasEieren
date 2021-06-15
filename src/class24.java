

import java.util.Scanner;

public class class24 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String XofO;
        String coord;

        String test[][] = new String[3][3];

        test[0][0] = "A1";
        test[0][1] = "A2";
        test[0][2] = "A3";

        test[1][0] = "B1";
        test[1][1] = "B2";
        test[1][2] = "B3";

        test[2][0] = "C1";
        test[2][1] = "C2";
        test[2][2] = "C3";

        for (int li = 0; li < test.length; li++)
        {

            System.out.println("[ " + test[li][0] + " ] [" + test[li][1] + " ] [ " + test[li][2]	+ " ]" ); //+  test[li][3] + " ]"
        }

        loop: {
            for(int j = 0; j < 10; j++) {

                System.out.println("Speler1 voer een 'X' of 'O' in.");
                XofO = input.nextLine();
                System.out.println("Op welke plek zou u deze willen zetten?");
                coord = input.nextLine();

                if(test[0][0].equals("O") || test[0][0].equals("X") || test[0][1].equals("X") || test[0][1].equals("O") || test[0][2].equals("X") || test[0][2].equals("O")
                        || test[1][0].equals("X") || test[1][0].equals("O") || test[1][1].equals("X") || test[1][1].equals("O") || test[1][2].equals("X") || test[1][2].equals("O")
                        || test[2][0].equals("X") || test[2][0].equals("O") || test[2][1].equals("X") || test[2][1].equals("O") || test[2][2].equals("X") || test[2][2].equals("O")) {
                    System.out.println("Op de positie staat al iets, voer een andere coordinatie in:");
                    coord = input.nextLine();
                }

                int coordNumber = Integer.parseInt(coord.substring(1,2));

                if(coord.substring(0,1).equals("A")){
                    System.out.println("A");
                    for(int i = 1; i < 5; i++) {
                        if(coordNumber == i) {
                            test[0][i-1] = XofO;

                            for (int li = 0; li < test.length; li++)
                            {

                                System.out.println("[ " + test[li][0] + " ] [" + test[li][1] + " ] [ " + test[li][2]	+ " ]" );
                            }

                            if(		   test[0][0].equals("X") && test[0][1].equals("X") && test[0][2].equals("X") || test[1][0].equals("X") && test[1][1].equals("X") && test[1][2].equals("X")
                                    || test[2][0].equals("X") && test[2][1].equals("X") && test[2][2].equals("X") || test[0][0].equals("X") && test[1][0].equals("X") && test[2][0].equals("X")
                                    || test[0][1].equals("X") && test[1][1].equals("X") && test[2][1].equals("X") || test[0][2].equals("X") && test[1][2].equals("X") && test[2][2].equals("X")
                                    || test[0][0].equals("X") && test[1][1].equals("X") && test[2][2].equals("X") || test[0][2].equals("X") && test[1][1].equals("X") && test[2][0].equals("X")

                                    || test[0][0].equals("O") && test[0][1].equals("O") && test[0][2].equals("O") || test[1][0].equals("O") && test[1][1].equals("O") && test[1][2].equals("O")
                                    || test[2][0].equals("O") && test[2][1].equals("O") && test[2][2].equals("O") || test[0][0].equals("O") && test[1][0].equals("O") && test[2][0].equals("O")
                                    || test[0][1].equals("O") && test[1][1].equals("O") && test[2][1].equals("O") || test[0][2].equals("O") && test[1][2].equals("O") && test[2][2].equals("O")
                                    || test[0][0].equals("O") && test[1][1].equals("O") && test[2][2].equals("O") || test[0][2].equals("O") && test[1][1].equals("O") && test[2][0].equals("O")) {
                                System.out.println("Je hebt gewonnen!");
                                break loop;
                            }
                        }
                    }
                }

                if(coord.substring(0,1).equals("B")) {
                    System.out.println("B");
                    for(int i = 1; i < 5; i++) {
                        if(coordNumber == i) {
                            test[1][i-1] = XofO;

                            for (int li = 0; li < test.length; li++)
                            {

                                System.out.println("[ " + test[li][0] + " ] [" + test[li][1] + " ] [ " + test[li][2]	+ " ]" );
                            }

                            if(  test[0][0].equals("X") && test[0][1].equals("X") && test[0][2].equals("X") || test[1][0].equals("X") && test[1][1].equals("X") && test[1][2].equals("X")
                                    || test[2][0].equals("X") && test[2][1].equals("X") && test[2][2].equals("X") || test[0][0].equals("X") && test[1][0].equals("X") && test[2][0].equals("X")
                                    || test[0][1].equals("X") && test[1][1].equals("X") && test[2][1].equals("X") || test[0][2].equals("X") && test[1][2].equals("X") && test[2][2].equals("X")
                                    || test[0][0].equals("X") && test[1][1].equals("X") && test[2][2].equals("X") || test[0][2].equals("X") && test[1][1].equals("X") && test[2][0].equals("X")

                                    || test[0][0].equals("O") && test[0][1].equals("O") && test[0][2].equals("O") || test[1][0].equals("O") && test[1][1].equals("O") && test[1][2].equals("O")
                                    || test[2][0].equals("O") && test[2][1].equals("O") && test[2][2].equals("O") || test[0][0].equals("O") && test[1][0].equals("O") && test[2][0].equals("O")
                                    || test[0][1].equals("O") && test[1][1].equals("O") && test[2][1].equals("O") || test[0][2].equals("O") && test[1][2].equals("O") && test[2][2].equals("O")
                                    || test[0][0].equals("O") && test[1][1].equals("O") && test[2][2].equals("O") || test[0][2].equals("O") && test[1][1].equals("O") && test[2][0].equals("O")) {
                                System.out.println("Je hebt gewonnen!");
                                break loop;
                            }
                        }
                    }
                }

                if(coord.substring(0,1).equals("C")) {
                    System.out.println("C");
                    for(int i = 1; i < 5; i++) {
                        if(coordNumber == i) {
                            test[2][i-1] = XofO;

                            for (int li = 0; li < test.length; li++)
                            {

                                System.out.println("[ " + test[li][0] + " ] [" + test[li][1] + " ] [ " + test[li][2]	+ " ]" );
                            }

                            if(  test[0][0].equals("X") && test[0][1].equals("X") && test[0][2].equals("X") || test[1][0].equals("X") && test[1][1].equals("X") && test[1][2].equals("X")
                                    || test[2][0].equals("X") && test[2][1].equals("X") && test[2][2].equals("X") || test[0][0].equals("X") && test[1][0].equals("X") && test[2][0].equals("X")
                                    || test[0][1].equals("X") && test[1][1].equals("X") && test[2][1].equals("X") || test[0][2].equals("X") && test[1][2].equals("X") && test[2][2].equals("X")
                                    || test[0][0].equals("X") && test[1][1].equals("X") && test[2][2].equals("X") || test[0][2].equals("X") && test[1][1].equals("X") && test[2][0].equals("X")

                                    || test[0][0].equals("O") && test[0][1].equals("O") && test[0][2].equals("O") || test[1][0].equals("O") && test[1][1].equals("O") && test[1][2].equals("O")
                                    || test[2][0].equals("O") && test[2][1].equals("O") && test[2][2].equals("O") || test[0][0].equals("O") && test[1][0].equals("O") && test[2][0].equals("O")
                                    || test[0][1].equals("O") && test[1][1].equals("O") && test[2][1].equals("O") || test[0][2].equals("O") && test[1][2].equals("O") && test[2][2].equals("O")
                                    || test[0][0].equals("O") && test[1][1].equals("O") && test[2][2].equals("O") || test[0][2].equals("O") && test[1][1].equals("O") && test[2][0].equals("O")) {
                                System.out.println("Je hebt gewonnen!");
                                break loop;
                            }
                        }
                    }
                }



            }
        }

    }

}