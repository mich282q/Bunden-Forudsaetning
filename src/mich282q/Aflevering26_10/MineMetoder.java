package mich282q.Aflevering26_10;

/*skal indeholde minimum 5 ting, der illustrerer det, du
har lært i september, f.eks. if, for, while, Random, Date, enum, Scanner,
String eller andet, vi har snakket om. Skriv kommentar, der viser din
forståelse af koden. */


import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class MineMetoder {
    {
        int randomlyNumber = (int) (Math.random() * 10 + 1); // en Random Generator som vælger et tal fra 1 til 10 (+ 1 så den ikke vælger 0)

// her får vi print overskrift ud
        System.out.println("Random print out of a Number");

        // tal fra 1 til 10
        switch (randomlyNumber) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            case 7:
                System.out.println("7");
                break;
            case 8:
                System.out.println("8");
                break;
            case 9:
                System.out.println("9");
                break;
            case 10:
                System.out.println("10");
                break;

        }
        // laver en string som skriver noget tekst i min anden class

        System.out.println("hej flotte kvinde");


        System.out.println("hello world ");


        // creater en scanner
        Scanner score = new Scanner(System.in);

        int eScore = 0;

        while (eScore != -1) {
            //printer ud at du skal skrive din point
            System.out.println(" indtast din point her ");
            eScore = score.nextInt();


            //her har du en if sætning som siger at hvis dine point som du indtast er under 40 har du bestået
            if (eScore >= 40) {
                System.out.println(" You did not pass the test");
            }
            //her har du en if sætning som siger at hvis dine point du indtast er over har du ikke bestået
            if (eScore < 40) {
                System.out.println(" You Passed the test");


            }
            int i, j, resultat;


            for (j = 1; j <= 5; j++) { //kolonner
                for (i = 1; i <= 5; i++) { //rækker


                    System.out.print(i * j + " ");
                }
                System.out.println();

            }

        }
    }}