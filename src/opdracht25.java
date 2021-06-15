package opdracht25;

import java.util.Scanner;

public class opdracht25 {

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

                System.out.println("Speler voer een 'X' of 'O' in.");
                XofO = input.nextLine();
                System.out.println("Op welke plek zou u deze willen zetten?");
                coord = input.nextLine();

		/*if(test[0][0].equals("O") || test[0][0].equals("X") || test[0][1].equals("X") || test[0][1].equals("O") || test[0][2].equals("X") || test[0][2].equals("O")
				|| test[1][0].equals("X") || test[1][0].equals("O") || test[1][1].equals("X") || test[1][1].equals("O") || test[1][2].equals("X") || test[1][2].equals("O")
				|| test[2][0].equals("X") || test[2][0].equals("O") || test[2][1].equals("X") || test[2][1].equals("O") || test[2][2].equals("X") || test[2][2].equals("O")) {
			System.out.println("Op de positie staat al iets, voer een andere coordinatie in:");
			coord = input.nextLine();

		}*/

                int coordNumber = Integer.parseInt(coord.substring(1,2));

                if(coord.substring(0,1).equals("A")){
                    System.out.println("A");
                    for(int i = 1; i < 5; i++) {
                        if(coordNumber == i) {

                            if(test[0][i-1].equals("X") || test[0][i-1].equals("O")) {
                                System.out.println("Op de positie staat al iets, voer een andere coordinatie in:");
                                String nieuw = input.nextLine();
                                int nieuwInt = Integer.parseInt(nieuw.substring(1,2));

                                if(nieuw.substring(0,1).equals("A")){
                                    System.out.println("A");
                                    for(int t = 1; t < 5; t++) {
                                        if(nieuwInt == t) {
                                            test[0][t-1] = XofO;

                                            //for (int lii = 0; lii < test.length; lii++)
                                            //{

                                            //		System.out.println("[ " + test[lii][0] + " ] [" + test[lii][1] + " ] [ " + test[lii][2]	+ " ]" );
                                            //}

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

                                if(nieuw.substring(0,1).equals("B")) {
                                    System.out.println("B");
                                    for(int t = 1; t < 5; t++) {
                                        if(nieuwInt == t) {
                                            test[1][t-1] = XofO;

                                            //for (int lii = 0; lii < test.length; lii++)
                                            //{

                                            //	System.out.println("[ " + test[lii][0] + " ] [" + test[lii][1] + " ] [ " + test[lii][2]	+ " ]" );
                                            //}

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

                                if(nieuw.substring(0,1).equals("C")) {
                                    System.out.println("C");
                                    for(int t = 1; t < 5; t++) {
                                        if(nieuwInt == t) {
                                            test[2][t-1] = XofO;

                                            //for (int lii = 0; lii < test.length; lii++)
                                            //{

                                            //	System.out.println("[ " + test[lii][0] + " ] [" + test[lii][1] + " ] [ " + test[lii][2]	+ " ]" );
                                            //}

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
                             else {
                                test[0][i - 1] = XofO;
                            }
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

                            if(test[1][i-1].equals("X") || test[1][i-1].equals("O")) {
                                System.out.println("Op de positie staat al iets, voer een andere coordinatie in:");
                                String nieuw = input.nextLine();
                                int nieuwInt = Integer.parseInt(nieuw.substring(1,2));

                                if(nieuw.substring(0,1).equals("A")){
                                    System.out.println("A");
                                    for(int t = 1; t < 5; t++) {
                                        if(nieuwInt == t) {
                                            test[0][t-1] = XofO;

                                            //for (int lii = 0; lii < test.length; lii++)
                                            //{

                                            //	System.out.println("[ " + test[lii][0] + " ] [" + test[lii][1] + " ] [ " + test[lii][2]	+ " ]" );
                                            //}

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

                                if(nieuw.substring(0,1).equals("B")) {
                                    System.out.println("B");
                                    for(int t = 1; t < 5; t++) {
                                        if(nieuwInt == t) {
                                            test[1][t-1] = XofO;

                                            //for (int lii = 0; lii < test.length; lii++)
                                            //{

                                            //	System.out.println("[ " + test[lii][0] + " ] [" + test[lii][1] + " ] [ " + test[lii][2]	+ " ]" );
                                            //}

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

                                if(nieuw.substring(0,1).equals("C")) {
                                    System.out.println("C");
                                    for(int t = 1; t < 5; t++) {
                                        if(nieuwInt == t) {
                                            test[2][t-1] = XofO;

                                            //for (int lii = 0; lii < test.length; lii++)
                                            //{
                                            //
                                            //	System.out.println("[ " + test[lii][0] + " ] [" + test[lii][1] + " ] [ " + test[lii][2]	+ " ]" );
                                            //}

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
                            else {
                                test[1][i - 1] = XofO;
                            }

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

                            if(test[2][i-1].equals("X") || test[2][i-1].equals("O")) {
                                System.out.println("Op de positie staat al iets, voer een andere coordinatie in:");
                                String nieuw = input.nextLine();
                                int nieuwInt = Integer.parseInt(nieuw.substring(1,2));

                                if(nieuw.substring(0,1).equals("A")){
                                    System.out.println("A");
                                    for(int t = 1; t < 5; t++) {
                                        if(nieuwInt == t) {
                                            test[0][t-1] = XofO;

                                            //for (int lii = 0; lii < test.length; lii++)
                                            //{

                                            //	System.out.println("[ " + test[lii][0] + " ] [" + test[lii][1] + " ] [ " + test[lii][2]	+ " ]" );
                                            //}

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

                                if(nieuw.substring(0,1).equals("B")) {
                                    System.out.println("B");
                                    for(int t = 1; t < 5; t++) {
                                        if(nieuwInt == t) {
                                            test[1][t-1] = XofO;

                                            //for (int lii = 0; lii < test.length; lii++)
                                            //{

                                            //	System.out.println("[ " + test[lii][0] + " ] [" + test[lii][1] + " ] [ " + test[lii][2]	+ " ]" );
                                            //}

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

                                if(nieuw.substring(0,1).equals("C")) {
                                    System.out.println("C");
                                    for(int t = 1; t < 5; t++) {
                                        if(nieuwInt == t) {
                                            test[2][t-1] = XofO;

                                            //for (int lii = 0; lii < test.length; lii++)
                                            //{

                                            //	System.out.println("[ " + test[lii][0] + " ] [" + test[lii][1] + " ] [ " + test[lii][2]	+ " ]" );
                                            //}

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
                            else {
                                test[2][i - 1] = XofO;
                            }

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
            System.out.println("Gelijkspel.");
        }
    }
}