import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scannerJun = new Scanner(System.in), scannerJdeux = new Scanner(System.in);
        String pseudoJun = "", pseudoJdeux = "";
        String orientationPorteAvion = "", orientationCuirasse = "", orientationSousMarin = "" , orientationCroiseur = "";
        boolean placementPorteAvion = false , placementCuirasse = false, placementSousMarin = false , placementCroiseur = false;
        int coord_X_PorteAvion = 0, coord_X_Cuirasse = 0, coord_X_SousMarin = 0, coord_X_Croiseur, coord_X_Torpilleur = 0;
        int coord_Y_PorteAvion = 0, coord_Y_Cuirasse = 0, coord_Y_SousMarin = 0, coord_Y_Croiseur = 0, coord_Y_Torpilleur = 0;
        String navire ;

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
        //------------------------------Placer le Porte Avions-----------------------------------------------------------
        while(!placementPorteAvion) {
                System.out.println("Veuillez saisir la coordonne X de votre Porte-Avions :");
                coord_X_PorteAvion = scannerJun.nextInt();
                while(coord_X_PorteAvion > 9) {
                    System.out.println("Veuillez saisir une coordonnée X correcte pour le Porte-Avions :");
                    coord_X_PorteAvion = scannerJun.nextInt();
                }
                System.out.println("Veuillez saisir la coordonne Y de votre Porte-Avions :");
                coord_Y_PorteAvion = scannerJun.nextInt();
                while(coord_Y_PorteAvion > 9) {
                    System.out.println("Veuillez saisir une coordonnée Y correcte pour le Porte-Avions :");
                    coord_Y_PorteAvion = scannerJun.nextInt();
                }
                System.out.println("Veuillez saisir l'orientation de votre Porte-Avions : ");
                orientationPorteAvion = scannerJun.next();

                while(!orientationPorteAvion.equalsIgnoreCase("H") && !orientationPorteAvion.equalsIgnoreCase("V")) {
                System.out.println("Veuillez saisir une orientation correcte pour votre Porte-avion : ");
                orientationPorteAvion = scannerJun.next();
            }

                placementPorteAvion = ajoutePorteAvion(grilleJun, coord_X_PorteAvion, coord_Y_PorteAvion, orientationPorteAvion);
            }


        for (int i = 0; i < grilleJun.length; i++) {
            System.out.print((Arrays.deepToString(grilleJun[i]) + '\n'));
        }
        ;

        //-------------------------------------------Placer le cuirasse-----------------------------------------
        while (!placementCuirasse ) {
            System.out.println("Veuillez saisir la coordonne X de votre Cuirasse:");
            coord_X_Cuirasse = scannerJun.nextInt();

            while(coord_X_Cuirasse > 9) {
                System.out.println("Veuillez saisir une coordonnée X correcte pour le Cuirasse :");
                coord_X_Cuirasse = scannerJun.nextInt();
            }

            System.out.println("Veuillez saisir la coordonne Y de votre Cuirasse :");
            coord_Y_Cuirasse = scannerJun.nextInt();

            while(coord_Y_Cuirasse > 9) {
                System.out.println("Veuillez saisir une coordonnée Y correcte pour le Cuirasse :");
                coord_Y_Cuirasse = scannerJun.nextInt();
            }

            System.out.println("Veuillez saisir l'orientation de votre Cuirasse : ");
            orientationCuirasse = scannerJun.next();
            while(!orientationCuirasse.equalsIgnoreCase("H") && !orientationCuirasse.equalsIgnoreCase("V")) {
                System.out.println("Veuillez saisir une orientation correcte pour votre Cuirasse : ");
                orientationCuirasse = scannerJun.next();
            }


            placementCuirasse = ajouteCuirasse(grilleJun, coord_X_Cuirasse, coord_Y_Cuirasse, orientationCuirasse);
        }

        for (int i = 0; i < grilleJun.length; i++) {
            System.out.print((Arrays.deepToString(grilleJun[i]) + '\n'));
        }
        //---------------------------------- PLacement Sous-Marin : 3 cases---------------------------------------------
        while (!placementSousMarin) {
            System.out.println("Veuillez saisir la coordonne X de votre Sous-Marin :");
            coord_X_SousMarin = scannerJun.nextInt();
            while(coord_X_SousMarin > 9) {
                System.out.println("Veuillez saisir une coordonne X correct pour votre Sous-Marin :");
                coord_X_SousMarin = scannerJun.nextInt();
            }
            System.out.println("Veuillez saisir la coordonne Y de votre Sous-Marin :");
            coord_Y_SousMarin = scannerJun.nextInt();
            while(coord_Y_SousMarin > 9) {
                System.out.println("Veuillez saisir une coordonne X correct pour votre Sous-Marin :");
                coord_Y_SousMarin = scannerJun.nextInt();
            }

            System.out.println("Veuillez saisir l'orientation de votre Sous-Marin : ");
            orientationSousMarin = scannerJun.next();
            while(!orientationSousMarin.equalsIgnoreCase("H") && !orientationSousMarin.equalsIgnoreCase("V")) {
                System.out.println("Veuillez saisir une orientation correct pour votre Sous-Marin : ");
                orientationSousMarin = scannerJun.next();
            }
            placementSousMarin = ajouteSousMarinOuCroiseur(grilleJun, coord_X_SousMarin, coord_Y_SousMarin, orientationSousMarin,"Sous-Marin");
        }
        for (int i = 0; i < grilleJun.length; i++) {
            System.out.print((Arrays.deepToString(grilleJun[i]) + '\n'));
        }
        //------------------------------------------Placement Croiseur : 3 cases--------------------------------------------
        while (!placementCroiseur) {

            System.out.println("Veuillez saisir la coordonne X de votre Croiseur  :");
            coord_X_Croiseur = scannerJun.nextInt();
            while(coord_X_Croiseur > 9) {
                System.out.println("Veuillez saisir une coordonne X de votre Croiseur :");
                coord_X_Croiseur = scannerJun.nextInt();
            }
            System.out.println("Veuillez saisir la coordonne Y de votre Croiseur  :");
            coord_Y_Croiseur = scannerJun.nextInt();
            while(coord_Y_Croiseur > 9) {
                System.out.println("Veuillez saisir une coordonne Y correcte pour votre Croiseur :");
                coord_Y_Croiseur = scannerJun.nextInt();
            }

            System.out.println("Veuillez saisir l'orientation de votre Croiseur : ");
            orientationCroiseur = scannerJun.next();
            while(orientationCroiseur.equalsIgnoreCase("H") && orientationCroiseur.equalsIgnoreCase("V")) {
                System.out.println("Veuillez saisir une orientation correcte pour votre Croiseur : ");
                orientationCroiseur = scannerJun.next();
            }
            placementCroiseur = ajouteSousMarinOuCroiseur(grilleJun, coord_X_Croiseur, coord_Y_Croiseur, orientationCroiseur,"Croiseur");
        }
        for (int i = 0; i < grilleJun.length; i++) {
            System.out.print((Arrays.deepToString(grilleJun[i]) + '\n'));
        }
        //-----------------------------------Placement torpilleur : 2 cases----------------------------------------------
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
                grille[emplacement_x][emplacement_y] = "PO";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + emplacement_y + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y - 1].equals("~")) {
                grille[emplacement_x][emplacement_y - 1] = "RT";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y - 1) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y - 2].equals("~")) {
                grille[emplacement_x][emplacement_y - 2] = "E ";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y - 2) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y - 3].equals("~")) {
                grille[emplacement_x][emplacement_y - 3] = "AV";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y - 3) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y - 4].equals("~")) {
                grille[emplacement_x][emplacement_y - 4] = "ION";
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
            if (grille[emplacement_x + 1][emplacement_y].equals("~")) {
                grille[emplacement_x + 1][emplacement_y] = "RT";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x + 1) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x + 2][emplacement_y].equals("~")) {
                grille[emplacement_x + 2][emplacement_y] = "E ";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x + 2) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x + 3][emplacement_y].equals("~")) {
                grille[emplacement_x + 3][emplacement_y] = "AV";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x + 3) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x + 4][emplacement_y].equals("~")) {
                grille[emplacement_x + 4][emplacement_y] = "ION";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x + 4) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }


        } else if (emplacement_x > 5 && orientation.equals("V")) {
            if (grille[emplacement_x][emplacement_y].equals("~")) {
                grille[emplacement_x][emplacement_y] = "PO";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x - 1][emplacement_y].equals("~")) {
                grille[emplacement_x - 1][emplacement_y] = "RT";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x - 1) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x - 2][emplacement_y].equals("~")) {
                grille[emplacement_x - 2][emplacement_y] = "E ";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x - 1) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x - 3][emplacement_y].equals("~")) {
                grille[emplacement_x - 3][emplacement_y] = "AV";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x - 3) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y].equals("~")) {
                grille[emplacement_x - 4][emplacement_y] = "ION";
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
                grille[emplacement_x][emplacement_y] = "CU";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + emplacement_y + "]");
                return false;
            }

            if (grille[emplacement_x][emplacement_y + 1].equals("~")) {
                grille[emplacement_x][emplacement_y + 1] = "IR";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y + 1) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y + 2].equals("~")) {
                grille[emplacement_x][emplacement_y + 2] = "A";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y + 2) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y + 3].equals("~")) {
                grille[emplacement_x][emplacement_y + 3] = "SSE";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y + 3) + "]");
                return false;
            }
        } else if (emplacement_y > 5 && orientation.equals("H")) {
            if (grille[emplacement_x][emplacement_y].equals("~")) {
                grille[emplacement_x][emplacement_y] = "CU";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y - 1].equals("~")) {
                grille[emplacement_x][emplacement_y - 1] = "IR";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y - 1) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y - 2].equals("~")) {
                grille[emplacement_x][emplacement_y - 2] = "AS";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y - 2) + "]");
                return false;
            }

            if (grille[emplacement_x][emplacement_y - 3].equals("~")) {
                grille[emplacement_x][emplacement_y - 3] = "SE";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y - 3) + "]");
                return false;
            }

        } else if (emplacement_x <= 5 && orientation.equals("V")) {
            if (grille[emplacement_x][emplacement_y].equals("~")) {
                grille[emplacement_x][emplacement_y] = "CU";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x + 1][emplacement_y].equals("~")) {
                grille[emplacement_x + 1][emplacement_y] = "IR";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x + 1) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x + 2][emplacement_y].equals("~")) {
                grille[emplacement_x + 2][emplacement_y] = "AS";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x + 2) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x + 3][emplacement_y].equals("~")) {
                grille[emplacement_x + 3][emplacement_y] = "SE";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x + 3) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
        } else if (emplacement_x > 5 && orientation.equals("V")) {
            if (grille[emplacement_x][emplacement_y].equals("~")) {
                grille[emplacement_x][emplacement_y] = "CU";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x - 1][emplacement_y].equals("~")) {
                grille[emplacement_x - 1][emplacement_y] = "IR";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x - 1) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x - 2][emplacement_y].equals("~")) {
                grille[emplacement_x - 2][emplacement_y] = "AS";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x - 2) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x - 3][emplacement_y].equals("~")) {
                grille[emplacement_x - 3][emplacement_y] = "SE";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x - 3) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
        }
        return true;
    }


    public static boolean ajouteSousMarinOuCroiseur(String[][] grille, int emplacement_x, int emplacement_y, String orientation, String navire) {

        if (navire.equals("Sous-Marin")) {

            if (emplacement_y <= 5 && orientation.equals("H")) {
                if (grille[emplacement_x][emplacement_y].equals("~")) {
                    grille[emplacement_x][emplacement_y] = "SOUS";
                } else {
                    System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + emplacement_y + "]");
                    return false;
                }

                if (grille[emplacement_x][emplacement_y + 1].equals("~")) {
                    grille[emplacement_x][emplacement_y + 1] = "MA";
                } else {
                    System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y + 1) + "]");
                    return false;
                }
                if (grille[emplacement_x][emplacement_y + 2].equals("~")) {
                    grille[emplacement_x][emplacement_y + 2] = "RIN";
                } else {
                    System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y + 2) + "]");
                    return false;
                }

            } else if (emplacement_y > 5 && orientation.equals("H")) {
                if (grille[emplacement_x][emplacement_y].equals("~")) {
                    grille[emplacement_x][emplacement_y] = "SOUS";
                } else {
                    System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y) + "]");
                    return false;
                }
                if (grille[emplacement_x][emplacement_y - 1].equals("~")) {
                    grille[emplacement_x][emplacement_y - 1] = "MA";
                } else {
                    System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y - 1) + "]");
                    return false;
                }
                if (grille[emplacement_x][emplacement_y - 2].equals("~")) {
                    grille[emplacement_x][emplacement_y - 2] = "RIN";
                } else {
                    System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y - 2) + "]");
                    return false;
                }


            } else if (emplacement_x <= 5 && orientation.equals("V")) {
                if (grille[emplacement_x][emplacement_y].equals("~")) {
                    grille[emplacement_x][emplacement_y] = "SOUS";
                } else {
                    System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y) + "]");
                    return false;
                }
                if (grille[emplacement_x + 1][emplacement_y].equals("~")) {
                    grille[emplacement_x + 1][emplacement_y] = "MA";
                } else {
                    System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x + 1) + "]" + "[" + (emplacement_y) + "]");
                    return false;
                }
                if (grille[emplacement_x + 2][emplacement_y].equals("~")) {
                    grille[emplacement_x + 2][emplacement_y] = "RIN";
                } else {
                    System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x + 2) + "]" + "[" + (emplacement_y) + "]");
                    return false;
                }

            } else if (emplacement_x > 5 && orientation.equals("V")) {
                if (grille[emplacement_x][emplacement_y].equals("~")) {
                    grille[emplacement_x][emplacement_y] = "SOUS";
                } else {
                    System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x) + "]" + "[" + (emplacement_y) + "]");
                    return false;
                }
                if (grille[emplacement_x - 1][emplacement_y].equals("~")) {
                    grille[emplacement_x - 1][emplacement_y] = "MA";
                } else {
                    System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x - 1) + "]" + "[" + (emplacement_y) + "]");
                    return false;
                }
                if (grille[emplacement_x - 2][emplacement_y].equals("~")) {
                    grille[emplacement_x - 2][emplacement_y] = "RIN";
                } else {
                    System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x - 2) + "]" + "[" + (emplacement_y) + "]");
                    return false;
                }

            }
        }
        else if(navire.equals("Croiseur")) {
            if (emplacement_y <= 5 && orientation.equals("H")) {
                if (grille[emplacement_x][emplacement_y].equals("~")) {
                    grille[emplacement_x][emplacement_y] = "CR";
                } else {
                    System.out.println("Erreur Croiseur(H) : Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + emplacement_y + "]");
                    return false;
                }
                if (grille[emplacement_x][emplacement_y + 1].equals("~")) {
                    grille[emplacement_x][emplacement_y + 1] = "OI";
                } else {
                    System.out.println("Erreur Croiseur(H) : Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y + 1) + "]");
                    return false;
                }
                if (grille[emplacement_x][emplacement_y + 2].equals("~")) {
                    grille[emplacement_x][emplacement_y + 2] = "SEUR";
                } else {
                    System.out.println("Erreur Croiseur(H) : Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y + 2) + "]");
                    return false;
                }

            } else if (emplacement_y > 5 && orientation.equals("H")) {
                if (grille[emplacement_x][emplacement_y].equals("~")) {
                    grille[emplacement_x][emplacement_y] = "CR";
                } else {
                    System.out.println("Erreur Croiseur(H) : Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y) + "]");
                    return false;
                }
                if (grille[emplacement_x][emplacement_y - 1].equals("~")) {
                    grille[emplacement_x][emplacement_y - 1] = "OIS";
                } else {
                    System.out.println("Erreur Croiseur(H) : Un navire est déja à l'emplacement [" + (emplacement_x) + "]" + "[" + (emplacement_y - 1) + "]");
                    return false;
                }
                if (grille[emplacement_x][emplacement_y - 2].equals("~")) {
                    grille[emplacement_x][emplacement_y - 2] = "EUR";
                } else {
                    System.out.println("Erreur Croiseur(H) : Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y - 2) + "]");
                    return false;
                }


            } else if (emplacement_x <= 5 && orientation.equals("V")) {
                if (grille[emplacement_x][emplacement_y].equals("~")) {
                    grille[emplacement_x][emplacement_y] = "CR";
                } else {
                    System.out.println("Erreur Croiseur(V) : Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y) + "]");
                    return false;
                }
                if (grille[emplacement_x + 1][emplacement_y].equals("~")) {
                    grille[emplacement_x + 1][emplacement_y] = "OI";
                } else {
                    System.out.println("Erreur Croiseur(V) : Un navire est déja à l'emplacement [" + (emplacement_x + 1) + "]" + "[" + (emplacement_y) + "]");
                    return false;
                }
                if (grille[emplacement_x + 2][emplacement_y].equals("~")) {
                    grille[emplacement_x + 2][emplacement_y] = "SEUR";
                } else {
                    System.out.println("Erreur Croiseur(V) : Un navire est déja à l'emplacement [" + (emplacement_x + 2) + "]" + "[" + (emplacement_y) + "]");
                    return false;
                }

            } else if (emplacement_x > 5 && orientation.equals("V")) {
                if (grille[emplacement_x][emplacement_y].equals("~")) {
                    grille[emplacement_x][emplacement_y] = "CR";
                } else {
                    System.out.println("Erreur Croiseur(V) : Un navire est déja à l'emplacement [" + (emplacement_x) + "]" + "[" + (emplacement_y) + "]");
                    return false;
                }
                if (grille[emplacement_x - 1][emplacement_y].equals("~")) {
                    grille[emplacement_x - 1][emplacement_y] = "OI";
                } else {
                    System.out.println("Erreur Croiseur(V) : Un navire est déja à l'emplacement [" + (emplacement_x - 1) + "]" + "[" + (emplacement_y) + "]");
                    return false;
                }
                if (grille[emplacement_x - 2][emplacement_y].equals("~")) {
                    grille[emplacement_x - 2][emplacement_y] = "SEUR";
                } else {
                    System.out.println("Erreur Croiseur(V) : Un navire est déja à l'emplacement [" + (emplacement_x - 2) + "]" + "[" + (emplacement_y) + "]");
                    return false;
                }
            }
        }
        return true;
        }
        }







