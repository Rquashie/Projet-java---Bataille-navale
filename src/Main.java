import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scannerJun = new Scanner(System.in);
        Scanner scannerJdeux = new Scanner(System.in);
        String pseudoJun, pseudoJdeux = "";

        System.out.println("Pseudo joueur 1 : ");
        pseudoJun = scannerJun.nextLine();


        //Les grilles
        String[][] grilleJun = new String[10][10];
        String[][] grilleJdeux = new String[10][10];

        for (int i = 0; i < grilleJun.length; i++) {
            for (int j = 0; j < grilleJun.length; j++) {
                grilleJun[i][j] = "~";
                grilleJdeux[i][j] = "~";
            }
        }
        for (int i = 0; i < grilleJun.length; i++) {
            System.out.print((Arrays.deepToString(grilleJun[i]))+' '+Arrays.deepToString(grilleJdeux[i])+'\n');

        }
    }
}


