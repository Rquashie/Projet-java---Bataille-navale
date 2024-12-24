import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scannerJun = new Scanner(System.in);
        Scanner scannerJdeux = new Scanner(System.in);
        String pseudoJun, pseudoJdeux = "";
        String orientation_Porte_Avion , orientation_Croiseur= "";
        int coord_X_PorteAvion, coord_Y_PorteAvion,coord_X_Croiseur,coord_Y_Croiseur = 0;

        System.out.println("Pseudo joueur 1 : ");
        pseudoJun = scannerJun.nextLine();


        //Configuration des grilles
        String[][] grilleJun = new String[10][10];
        String[][] grilleJdeux = new String[10][10];


        for (int i = 0; i < grilleJun.length; i++) {
            for (int j = 0; j < grilleJun.length; j++) {
                grilleJun[i][j] = "  ~  ";
                grilleJdeux[i][j] = "  ~  ";
            }
        }
        //Placer le Porte Avions
        System.out.println("Veuillez saisir la coordonne X de votre Porte Avion :");
        coord_X_PorteAvion = scannerJun.nextInt();

        System.out.println("Veuillez saisir la coordonne Y de votre Porte Avion :");
        coord_Y_PorteAvion = scannerJun.nextInt();

        System.out.println("Veuillez saisir l'orientation de votre Porte Avion : ");
        orientation_Porte_Avion = scannerJun.next();

        ajoutePorteAvion(grilleJun, coord_X_PorteAvion, coord_Y_PorteAvion, orientation_Porte_Avion);

        for (int i = 0; i < grilleJun.length; i++) {
            System.out.print((Arrays.deepToString(grilleJun[i])) + "                                         " + Arrays.deepToString(grilleJdeux[i]) + '\n');
        }

        //Placer le croiseur
        System.out.println("Veuillez saisir la coordonne X de votre Croiseur:");
        coord_X_Croiseur = scannerJun.nextInt();

        System.out.println("Veuillez saisir la coordonne Y de votre Croiseur :");
        coord_Y_Croiseur = scannerJun.nextInt();

        System.out.println("Veuillez saisir l'orientation de votre Croiseur : ");
        orientation_Croiseur = scannerJun.next();

        ajouteCroiseur(grilleJun , coord_X_Croiseur,coord_Y_Croiseur, orientation_Croiseur);

        for (int i = 0; i < grilleJun.length; i++) {
            System.out.print((Arrays.deepToString(grilleJun[i])) + "                                         " + Arrays.deepToString(grilleJdeux[i]) + '\n');
        }
    }

    public static void ajoutePorteAvion(String[][] grille, int emplacement_x, int emplacement_y, String orientation) {
        if (emplacement_y <= 5 && orientation.equals("horizontal") || orientation.equals("H")) {
            for (int i = 0; i < emplacement_x; i++) {
                for (int j = 0; j < emplacement_y; j++) {
                    if (grille[i][j].equals("  ~  ")) {
                        grille[emplacement_x][emplacement_y] = "PO";
                        grille[emplacement_x][emplacement_y + 1] = "RT";
                        grille[emplacement_x][emplacement_y + 2] = "E ";
                        grille[emplacement_x][emplacement_y + 3] = "AV";
                        grille[emplacement_x][emplacement_y + 4] = "ION";
                    } else {
                        System.out.println("Un navire est déja à cet emplacement !");
                        break ;
                    }
                }
            }
        }  else if (emplacement_y > 5 && orientation.equals("horizontal") || orientation.equals("H")) {
            for (int i = 0; i < emplacement_x; i++) {
                for (int j = 0; j < emplacement_y; j++) {
                    if (grille[i][j].equals("  ~  ")) {
                        grille[emplacement_x][emplacement_y] = "ION";
                        grille[emplacement_x][emplacement_y - 1] = "AV";
                        grille[emplacement_x][emplacement_y - 2] = "E ";
                        grille[emplacement_x][emplacement_y - 3] = "RT";
                        grille[emplacement_x][emplacement_y - 4] = "PO";
                    } else {
                        System.out.println("Un navire est déja à cet emplacement !");
                        break ;
                    }
                }
            }
        }
        if (emplacement_x <= 5 && orientation.equals("vertical") || orientation.equals("V")) {
            for (int i = 0; i < emplacement_x; i++) {
                for (int j = 0; j < emplacement_y; j++) {
                    if (grille[i][j].equals("  ~  ")) {
                        grille[emplacement_x][emplacement_y] = "PO";
                        grille[emplacement_x + 1][emplacement_y] = "RT";
                        grille[emplacement_x + 2][emplacement_y] = "E ";
                        grille[emplacement_x + 3][emplacement_y] = "AV";
                        grille[emplacement_x + 4][emplacement_y] = "ION";
                    } else {
                        System.out.println("Un navire est déja à cet emplacement !");
                        break ;
                    }
                }
            }
        } if (emplacement_x > 5 && orientation.equals("vertical") || orientation.equals("V")) {
            for (int i = 0; i < emplacement_y; i++) {
                for (int j = 0; j < emplacement_x; j++) {
                    if (grille[i][j].equals("  ~  ")) {
                        grille[emplacement_x][emplacement_y] = "ION";
                        grille[emplacement_x - 1][emplacement_y] = "AV";
                        grille[emplacement_x - 2][emplacement_y] = "E ";
                        grille[emplacement_x - 3][emplacement_y] = "RT";
                        grille[emplacement_x - 4][emplacement_y] = "PO";
                    } else {
                        System.out.println("Un navire est déja à cet emplacement !");
                        break ;
                    }
                }
            }
        }
    }

    public static void ajouteCroiseur(String[][] grille, int emplacement_x, int emplacement_y, String orientation) {
        if (orientation.equals("horizontal") || orientation.equals("H") && emplacement_y <= 5) {
            for (int i = 0; i < emplacement_x; i++) {
                for (int j = 0; j < emplacement_y; j++) {
                    if (grille[i][j].equals("  ~  ")) {
                        grille[emplacement_x][emplacement_y] = "CR";
                        grille[emplacement_x][emplacement_y + 1] = "OI";
                        grille[emplacement_x][emplacement_y + 2] = "SE";
                        grille[emplacement_x][emplacement_y + 3] = "UR";
                    } else {
                        System.out.println("Placez le croiseur à un autre endroit : Un navire est déja à cet emplacement !");
                        break ;
                    }
                }
            }
        } else if (orientation.equals("horizontal") || orientation.equals("H") && emplacement_y > 5) {
            for (int i = 0; i < emplacement_x; i++) {
                for (int j = 0; j < emplacement_y; j++) {
                    if (grille[i][j].equals("  ~  ")) {
                        grille[emplacement_x][emplacement_y] = "CR";
                        grille[emplacement_x][emplacement_y - 1] = "OI";
                        grille[emplacement_x][emplacement_y - 2] = "SE";
                        grille[emplacement_x][emplacement_y - 3] = "UR";
                    } else {
                        System.out.println("Placez le croiseur à un autre endroit : Un navire est déja à cet emplacement !");
                        break  ;
                    }
                }
            }
        }
        else if (emplacement_x <= 5 && orientation.equals("vertical") || orientation.equals("V")) {
            for (int i = 0; i < emplacement_x; i++) {
                for (int j = 0; j < emplacement_y; j++) {
                    if (grille[i][j].equals("  ~  ")) {
                        grille[emplacement_x][emplacement_y] = "CR";
                        grille[emplacement_x + 1][emplacement_y] = "OI";
                        grille[emplacement_x + 2][emplacement_y] = "SE";
                        grille[emplacement_x + 3][emplacement_y] = "UR";
                    } else {
                        System.out.println("Placez le croiseur à un autre endroit : Un navire est déja à cet emplacement !");
                    }
                }
            }
        } else if (emplacement_x > 5 && orientation.equals("vertical") || orientation.equals("V")) {
            for (int i = 0; i < emplacement_x; i++) {
                for (int j = 0; j < emplacement_y; j++) {
                    if (grille[i][j].equals("  ~  ")) {
                        grille[emplacement_x][emplacement_y] = "UR";
                        grille[emplacement_x - 1][emplacement_y] = "SE";
                        grille[emplacement_x - 2][emplacement_y] = "OI";
                        grille[emplacement_x - 3][emplacement_y] = "CR";
                    } else {
                        System.out.println("Placez le croiseur à un autre endroit : Un navire est déja à cet emplacement !");
                        break ;
                    }
                }
            }
        }
    }
}



