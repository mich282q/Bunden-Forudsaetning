package mich282q.Aflevering26_10;


import java.io.FileNotFoundException;
import java.util.Scanner;

/*skal indeholde main() metoden, som bringer de andre 3
klasser i spil. */
public class Start {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("hello Class");

        System.out.println("");

        DatHoldet hold = new DatHoldet();
        System.out.println("Name: " + hold.stud1.getName() + ",Holdet: " + hold.stud1.getHold() + ",TelefonNumber: " + hold.stud1.getTlf() + ",Alder: " + hold.stud1.getAge());
        System.out.println("Name: " + hold.stud2.getName() + ",Holdet: " + hold.stud2.getHold() + ",TelefonNumber: " + hold.stud2.getTlf());
        System.out.println("Name: " + hold.stud3.getName() + ",Holdet: " + hold.stud3.getHold());
        System.out.println("Name: " + hold.stud4.getName());


        System.out.println("");
        MineMetoder Metoder = new MineMetoder();

    }

}
