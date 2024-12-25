import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scannerJun = new Scanner(System.in);
        Scanner scannerJdeux = new Scanner(System.in);
        String pseudoJun, pseudoJdeux = "";
        String orientationPorteAvion = "";
        String orientationCroiseur = "";
        boolean placementCuirasse = false;
        boolean placementPorteAvion = false;
        int coord_X_PorteAvion, coord_Y_PorteAvion, coord_X_Croiseur, coord_Y_Croiseur = 0;

        System.out.println("Pseudo joueur 1 : ");
        pseudoJun = scannerJun.nextLine();


        //Configuration des grilles
        String[][] grilleJun = new String[10][10];
        String[][] grilleJdeux = new String[10][10];


        for (int i = 0; i < grilleJun.length; i++) {
            for (int j = 0; j < grilleJun.length; j++) {
                grilleJun[i][j] = "~";
                grilleJdeux[i][j] = "~";
            }
        }
        //Placer le Porte Avions
        while(!placementPorteAvion) {
            System.out.println("Veuillez saisir la coordonne X de votre Porte Avion :");
            coord_X_PorteAvion = scannerJun.nextInt();

            System.out.println("Veuillez saisir la coordonne Y de votre Porte Avion :");
            coord_Y_PorteAvion = scannerJun.nextInt();

            System.out.println("Veuillez saisir l'orientation de votre Porte Avion : ");
            orientationPorteAvion = scannerJun.next();

            placementPorteAvion = ajoutePorteAvion(grilleJun, coord_X_PorteAvion, coord_Y_PorteAvion, orientationPorteAvion);
        }

        for (int i = 0; i < grilleJun.length; i++) {
            System.out.print((Arrays.deepToString(grilleJun[i]) + '\n'));
        }
        ;

        //Placer le croiseur
        while (!placementCuirasse) {
            System.out.println("Veuillez saisir la coordonne X de votre Croiseur:");
            coord_X_Croiseur = scannerJun.nextInt();

            System.out.println("Veuillez saisir la coordonne Y de votre Croiseur :");
            coord_Y_Croiseur = scannerJun.nextInt();

            System.out.println("Veuillez saisir l'orientation de votre Croiseur : ");
            orientationCroiseur = scannerJun.next();

            placementCuirasse = ajouteCuirasse(grilleJun, coord_X_Croiseur, coord_Y_Croiseur, orientationCroiseur);
        }

        for (int i = 0; i < grilleJun.length; i++) {
            System.out.print((Arrays.deepToString(grilleJun[i]) + '\n'));
        }
    }


    public static boolean ajoutePorteAvion(String[][] grille, int emplacement_x, int emplacement_y, String orientation) {
        if (emplacement_y <= 5 && orientation.equals("H")) {
            if (grille[emplacement_x][emplacement_y].equals("~")) {
                grille[emplacement_x][emplacement_y] = "PO";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + emplacement_y + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y + 1].equals("~")) {
                grille[emplacement_x][emplacement_y + 1] = "RT";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y + 1) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y + 2].equals("~")) {
                grille[emplacement_x][emplacement_y + 2] = "E ";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y + 2) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y + 3].equals("~")) {
                grille[emplacement_x][emplacement_y + 3] = "AV";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y + 3) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y + 4].equals("~")) {
                grille[emplacement_x][emplacement_y + 4] = "ION";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y + 4) + "]");
                return false;
            }
        // Si l'index de la colonne est superieur à 5 on va inverser l'incrementation pour éviter les ajouts hors de champs
        } else if (emplacement_y > 5 && orientation.equals("H")) {
            if (grille[emplacement_x][emplacement_y].equals("~")) {
                grille[emplacement_x][emplacement_y] = "ION";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + emplacement_y + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y-1].equals("~")) {
                grille[emplacement_x][emplacement_y - 1] = "AV";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y - 1) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y-2].equals("~")) {
                grille[emplacement_x][emplacement_y - 2] = "E ";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y - 2) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y-3].equals("~")) {
                grille[emplacement_x][emplacement_y - 3] = "RT";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y - 3) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y-4].equals("~")) {
                grille[emplacement_x][emplacement_y - 4] = "PO";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y - 4) + "]");
                return false;
            }

            //Verification placement vertical
        } else if (emplacement_x <= 5 && orientation.equals("V")) {
            if (grille[emplacement_x][emplacement_y].equals("~")) {
                grille[emplacement_x][emplacement_y] = "PO";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x+1][emplacement_y].equals("~")) {
                grille[emplacement_x + 1][emplacement_y] = "RT";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x + 1) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x+2][emplacement_y].equals("~")) {
                grille[emplacement_x + 2][emplacement_y] = "E ";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x + 2) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x+3][emplacement_y].equals("~")) {
                grille[emplacement_x + 3][emplacement_y] = "AV";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x + 3) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x+4][emplacement_y].equals("~")) {
                grille[emplacement_x + 4][emplacement_y] = "ION";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x + 4) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }


        } else if (emplacement_x > 5 && orientation.equals("V")) {
            if (grille[emplacement_x][emplacement_y].equals("~")) {
                grille[emplacement_x][emplacement_y] = "ION";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x-1][emplacement_y].equals("~")) {
                grille[emplacement_x - 1][emplacement_y] = "AV";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x - 1) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y].equals("~")) {
                grille[emplacement_x - 2][emplacement_y] = "E ";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x - 1) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y].equals("~")) {
                grille[emplacement_x - 3][emplacement_y] = "RT";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x - 3) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y].equals("~")) {
                grille[emplacement_x - 4][emplacement_y] = "PO";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x - 4) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
        }
        return true;
    }


    public static boolean ajouteCuirasse(String[][] grille, int emplacement_x, int emplacement_y, String orientation) {


        if (emplacement_y <= 5 && orientation.equals("H")) {
            if (grille[emplacement_x][emplacement_y].equals("~")) {
                grille[emplacement_x][emplacement_y] = "CR";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + emplacement_y + "]");
                return false;
            }

            if (grille[emplacement_x][emplacement_y + 1].equals("~")) {
                grille[emplacement_x][emplacement_y + 1] = "OI";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y + 1) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y + 2].equals("~")) {
                grille[emplacement_x][emplacement_y + 2] = "SE";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y + 2) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y + 3].equals("~")) {
                grille[emplacement_x][emplacement_y + 3] = "UR";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y + 3) + "]");
                return false;
            }
        } else if (emplacement_y > 5 && orientation.equals("H")) {
            if (grille[emplacement_x][emplacement_y].equals("~")) {
                grille[emplacement_x][emplacement_y] = "CR";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y - 1].equals("~")) {
                grille[emplacement_x][emplacement_y - 1] = "OI";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y - 1) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y - 2].equals("~")) {
                grille[emplacement_x][emplacement_y - 2] = "SE";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y - 2) + "]");
                return false;
            }

            if (grille[emplacement_x][emplacement_y - 3].equals("~")) {
                grille[emplacement_x][emplacement_y - 3] = "UR";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y - 3) + "]");
                return false;
            }

        } else if (emplacement_x <= 5 && orientation.equals("V")) {
            if (grille[emplacement_x][emplacement_y].equals("~")) {
                grille[emplacement_x][emplacement_y] = "CR";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y].equals("~")) {
                grille[emplacement_x + 1][emplacement_y] = "OI";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x + 1) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y].equals("~")) {
                grille[emplacement_x + 2][emplacement_y] = "SE";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x + 2) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y].equals("~")) {
                grille[emplacement_x + 3][emplacement_y] = "UR";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x + 3) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
        } else if (emplacement_x > 5 && orientation.equals("V")) {
            if (grille[emplacement_x][emplacement_y].equals("~")) {
                grille[emplacement_x][emplacement_y] = "UR";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y].equals("~")) {
                grille[emplacement_x - 1][emplacement_y] = "SE";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x - 1) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y].equals("~")) {
                grille[emplacement_x - 2][emplacement_y] = "OI";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x - 2) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y].equals("~")) {
                grille[emplacement_x - 3][emplacement_y] = "CR";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x - 3) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
        }
        return true;
    }
}





