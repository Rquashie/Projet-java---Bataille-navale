import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scannerJun = new Scanner(System.in), scannerJdeux = new Scanner(System.in);
        String pseudoJun = "", pseudoJdeux = "";
        String orientationPorteAvionJun = "", orientationCuirasseJun = "", orientationSousMarinJun = "", orientationCroiseurJun = "" , orientationTorpilleurJun = "";
        boolean placementPorteAvionJun = false, placementCuirasseJun = false, placementSousMarinJun = false, placementCroiseurJun = false , placementTorpilleurJun=false;
        int coord_X_PorteAvionJun = 0, coord_X_CuirasseJun = 0, coord_X_SousMarinJun = 0, coord_X_CroiseurJun, coord_X_TorpilleurJun = 0;
        int coord_Y_PorteAvionJun = 0, coord_Y_CuirasseJun = 0, coord_Y_SousMarinJun = 0, coord_Y_CroiseurJun = 0, coord_Y_TorpilleurJun = 0;
        String sousMarinOuCroiseurJun;
        String orientationPorteAvionJdeux= "", orientationCuirasseJdeux = "", orientationSousMarinJdeux = "", orientationCroiseurJdeux = "" , orientationTorpilleurJdeux = "";
        boolean placementPorteAvionJdeux = false, placementCuirasseJdeux = false, placementSousMarinJdeux = false, placementCroiseurJdeux = false , placementTorpilleurJdeux=false;
        int coord_X_PorteAvionJdeux = 0, coord_X_CuirasseJdeux = 0, coord_X_SousMarinJdeux = 0, coord_X_CroiseurJdeux, coord_X_TorpilleurJdeux = 0;
        int coord_Y_PorteAvionJdeux = 0, coord_Y_CuirasseJdeux = 0, coord_Y_SousMarinJdeux = 0, coord_Y_CroiseurJdeux = 0, coord_Y_TorpilleurJdeux = 0;
        String sousMarinOuCroiseurJdeux;

        System.out.println("Pseudo joueur 1 : ");
        pseudoJun = scannerJun.nextLine();

        System.out.println("Pseudo joueur 2 : ");
        pseudoJdeux  = scannerJdeux.nextLine() ;

        //Configuration des grilles
        String[][] grilleJun = new String[10][10];
        String[][] grilleJdeux = new String[10][10];


        for (int i = 0; i < grilleJun.length; i++) {
            for (int j = 0; j < grilleJun.length; j++) {
                grilleJun[i][j] = "~";
                grilleJdeux[i][j] = "~";
            }
        }
        //------------------------------J1 : Placer le Porte Avions-----------------------------------------------------------
        while (!placementPorteAvionJun) {
            //Joueur 1
            System.out.println("("+pseudoJun+")"+" Veuillez saisir la coordonne X de votre Porte-Avions :");
            coord_X_PorteAvionJun = scannerJun.nextInt();
            while (coord_X_PorteAvionJun > 9) {
                System.out.println("("+pseudoJun+")"+" Veuillez saisir une coordonnée X correcte pour le Porte-Avions :");
                coord_X_PorteAvionJun = scannerJun.nextInt();
            }
            System.out.println("("+pseudoJun+")"+" Veuillez saisir la coordonne Y de votre Porte-Avions :");
            coord_Y_PorteAvionJun = scannerJun.nextInt();
            while (coord_Y_PorteAvionJun > 9) {
                System.out.println("("+pseudoJun+")"+" : Veuillez saisir une coordonnée Y correcte pour le Porte-Avions :");
                coord_Y_PorteAvionJun = scannerJun.nextInt();
            }
            System.out.println("("+pseudoJun+")"+" Veuillez saisir l'orientation de votre Porte-Avions : ");
            orientationPorteAvionJun = scannerJun.next();

            while (!orientationPorteAvionJun.equalsIgnoreCase("H") && !orientationPorteAvionJun.equalsIgnoreCase("V")) {
                System.out.println("("+pseudoJun+")"+" Veuillez saisir une orientation correcte pour votre Porte-avion : ");
                orientationPorteAvionJun = scannerJun.next();
            }
            placementPorteAvionJun = ajoutePorteAvion(grilleJun, coord_X_PorteAvionJun, coord_Y_PorteAvionJun, orientationPorteAvionJun);

        }


        for (int i = 0; i < grilleJun.length; i++) {
            System.out.print((Arrays.deepToString(grilleJun[i]) + '\n'));
        }
        ;

        //-------------------------------------------J1 : Placer le cuirasse-----------------------------------------
        while (!placementCuirasseJun) {
            System.out.println("("+pseudoJun+")"+" Veuillez saisir la coordonne X de votre Cuirasse:");
            coord_X_CuirasseJun = scannerJun.nextInt();

            while (coord_X_CuirasseJun > 9) {
                System.out.println("("+pseudoJun+")"+ " Veuillez saisir une coordonnée X correcte pour le Cuirasse :");
                coord_X_CuirasseJun = scannerJun.nextInt();
            }

            System.out.println("("+pseudoJun+")"+" Veuillez saisir la coordonne Y de votre Cuirasse :");
            coord_Y_CuirasseJun = scannerJun.nextInt();

            while (coord_Y_CuirasseJun > 9) {
                System.out.println("("+pseudoJun+")"+" Veuillez saisir une coordonnée Y correcte pour le Cuirasse :");
                coord_Y_CuirasseJun = scannerJun.nextInt();
            }

            System.out.println("("+pseudoJun+")"+" Veuillez saisir l'orientation de votre Cuirasse : ");
            orientationCuirasseJun = scannerJun.next();
            while (!orientationCuirasseJun.equalsIgnoreCase("H") && !orientationCuirasseJun.equalsIgnoreCase("V")) {
                System.out.println("("+pseudoJun+")"+" Veuillez saisir une orientation correcte pour votre Cuirasse : ");
                orientationCuirasseJun = scannerJun.next();
            }


            placementCuirasseJun = ajouteCuirasse(grilleJun, coord_X_CuirasseJun, coord_Y_CuirasseJun, orientationCuirasseJun);
        }

        for (int i = 0; i < grilleJun.length; i++) {
            System.out.print((Arrays.deepToString(grilleJun[i]) + '\n'));
        }
        //---------------------------------- J1 : PLacement Sous-Marin : 3 cases---------------------------------------------
        while (!placementSousMarinJun) {
            System.out.println("("+pseudoJun+")"+" Veuillez saisir la coordonne X de votre Sous-Marin :");
            coord_X_SousMarinJun = scannerJun.nextInt();
            while (coord_X_SousMarinJun > 9) {
                System.out.println("("+pseudoJun+")"+" Veuillez saisir une coordonne X correct pour votre Sous-Marin :");
                coord_X_SousMarinJun = scannerJun.nextInt();
            }
            System.out.println(pseudoJun+" Veuillez saisir la coordonne Y de votre Sous-Marin :");
            coord_Y_SousMarinJun = scannerJun.nextInt();
            while (coord_Y_SousMarinJun > 9) {
                System.out.println(pseudoJun+" Veuillez saisir une coordonne X correct pour votre Sous-Marin :");
                coord_Y_SousMarinJun = scannerJun.nextInt();
            }

            System.out.println(pseudoJun+" : Veuillez saisir l'orientation de votre Sous-Marin : ");
            orientationSousMarinJun = scannerJun.next();
            while (!orientationSousMarinJun.equalsIgnoreCase("H") && !orientationSousMarinJun.equalsIgnoreCase("V")) {
                System.out.println("("+pseudoJun+")"+" Veuillez saisir une orientation correct pour votre Sous-Marin : ");
                orientationSousMarinJun = scannerJun.next();
            }
            placementSousMarinJun = ajouteSousMarinOuCroiseur(grilleJun, coord_X_SousMarinJun, coord_Y_SousMarinJun, orientationSousMarinJun, "Sous-Marin");
        }
        for (int i = 0; i < grilleJun.length; i++) {
            System.out.print((Arrays.deepToString(grilleJun[i]) + '\n'));
        }
        System.out.println('\n') ;
        //------------------------------------------J1 : Placement Croiseur : 3 cases--------------------------------------------
        while (!placementCroiseurJun) {

            System.out.println("("+pseudoJun+")+"+" Veuillez saisir la coordonne X de votre Croiseur  :");
            coord_X_CroiseurJun = scannerJun.nextInt();
            while (coord_X_CroiseurJun > 9) {
                System.out.println(pseudoJun+" Veuillez saisir une coordonne X de votre Croiseur :");
                coord_X_CroiseurJun = scannerJun.nextInt();
            }
            System.out.println("("+pseudoJun+" Veuillez saisir la coordonne Y de votre Croiseur  :");
            coord_Y_CroiseurJun = scannerJun.nextInt();
            while (coord_Y_CroiseurJun > 9) {
                System.out.println("("+pseudoJun+")"+" Veuillez saisir une coordonne Y correcte pour votre Croiseur :");
                coord_Y_CroiseurJun = scannerJun.nextInt();
            }

            System.out.println("("+pseudoJun+")"+" Veuillez saisir l'orientation de votre Croiseur : ");
            orientationCroiseurJun = scannerJun.next();
            while (orientationCroiseurJun.equalsIgnoreCase("H") && orientationCroiseurJun.equalsIgnoreCase("V")) {
               System.out.println(pseudoJun+" Veuillez saisir une orientation correcte pour votre Croiseur : ");
                orientationCroiseurJun = scannerJun.next();
            }
            placementCroiseurJun = ajouteSousMarinOuCroiseur(grilleJun, coord_X_CroiseurJun, coord_Y_CroiseurJun, orientationCroiseurJun, "Croiseur");
        }
        for (int i = 0; i < grilleJun.length; i++) {
            System.out.print((Arrays.deepToString(grilleJun[i]) + '\n'));
        }
        System.out.println('\n') ;
        //-----------------------------------J1 : Placement torpilleur : 2 cases----------------------------------------------
        while (!placementTorpilleurJun) {

            System.out.println(pseudoJun+" Veuillez saisir la coordonne X de votre Torpilleur  :");
            coord_X_TorpilleurJun = scannerJun.nextInt();
            while (coord_X_TorpilleurJun > 9) {
                System.out.println("("+pseudoJun+")"+" Veuillez saisir une coordonne X de votre Torpilleur :");
                coord_X_TorpilleurJun = scannerJun.nextInt();
            }
            System.out.println(pseudoJun+" Veuillez saisir la coordonne Y de votre Torpilleur  :");
            coord_Y_TorpilleurJun = scannerJun.nextInt();
            while (coord_Y_TorpilleurJun > 9) {
                System.out.println(pseudoJun+" Veuillez saisir une coordonne Y correcte pour votre Torpilleur :");
                coord_Y_TorpilleurJun = scannerJun.nextInt();
            }

            System.out.println("("+pseudoJun+" Veuillez saisir l'orientation de votre Torpilleur : ");
            orientationTorpilleurJun = scannerJun.next();
            while (orientationTorpilleurJun.equalsIgnoreCase("H") && orientationTorpilleurJun.equalsIgnoreCase("V")) {
                System.out.println(pseudoJun+" : Veuillez saisir une orientation correcte pour votre Croiseur : ");
                orientationTorpilleurJun = scannerJun.next();
            }
            placementTorpilleurJun = ajouteTorpilleur(grilleJun, coord_X_TorpilleurJun, coord_Y_TorpilleurJun, orientationTorpilleurJun);
        }
        for (int i = 0; i < grilleJun.length; i++) {
            System.out.print((Arrays.deepToString(grilleJun[i]) + '\n'));
        }
        System.out.println('\n') ;
        //------------------------------J2 : Placer le Porte Avions-----------------------------------------------------------
        while (!placementPorteAvionJdeux) {
            //Joueur 1
            System.out.println(pseudoJdeux+" Veuillez saisir la coordonne X de votre Porte-Avions :");
            coord_X_PorteAvionJdeux = scannerJdeux.nextInt();
            while (coord_X_PorteAvionJdeux > 9) {
                System.out.println( pseudoJdeux+" Veuillez saisir une coordonnée X correcte pour le Porte-Avions :");
                coord_X_PorteAvionJdeux = scannerJdeux.nextInt();
            }
            System.out.println(pseudoJdeux+" Veuillez saisir la coordonne Y de votre Porte-Avions :");
            coord_Y_PorteAvionJdeux = scannerJdeux.nextInt();
            while (coord_Y_PorteAvionJdeux > 9) {
                System.out.println(pseudoJdeux+" Veuillez saisir une coordonnée Y correcte pour le Porte-Avions :");
                coord_Y_PorteAvionJdeux = scannerJdeux.nextInt();
            }
            System.out.println(pseudoJdeux+"  Veuillez saisir l'orientation de votre Porte-Avions : ");
            orientationPorteAvionJdeux = scannerJdeux.next();

            while (!orientationPorteAvionJdeux.equalsIgnoreCase("H") && !orientationPorteAvionJdeux.equalsIgnoreCase("V")) {
                System.out.println(pseudoJdeux+" Veuillez saisir une orientation correcte pour votre Porte-avion : ");
                orientationPorteAvionJdeux = scannerJdeux.next();
            }
            placementPorteAvionJdeux = ajoutePorteAvion(grilleJdeux, coord_X_PorteAvionJun, coord_Y_PorteAvionJun, orientationPorteAvionJun);

        }
        //-------------------------------------------J2 : Placer le cuirasse-----------------------------------------
        while (!placementCuirasseJdeux) {
            System.out.println(pseudoJdeux+ " Veuillez saisir la coordonne X de votre Cuirasse:");
            coord_X_CuirasseJdeux = scannerJdeux.nextInt();

            while (coord_X_CuirasseJdeux > 9) {
                System.out.println(pseudoJdeux+" : Veuillez saisir une coordonnée X correcte pour le Cuirasse :");
                coord_X_CuirasseJdeux = scannerJdeux.nextInt();
            }

            System.out.println(pseudoJdeux+" Veuillez saisir la coordonne Y de votre Cuirasse :");
            coord_Y_CuirasseJdeux = scannerJdeux.nextInt();

            while (coord_Y_CuirasseJdeux > 9) {
                System.out.println("("+pseudoJdeux+")"+" Veuillez saisir une coordonnée Y correcte pour le Cuirasse :");
                coord_Y_CuirasseJdeux = scannerJdeux.nextInt();
            }

            System.out.println("("+pseudoJdeux+")"+" Veuillez saisir l'orientation de votre Cuirasse : ");
            orientationCuirasseJdeux = scannerJdeux.next();
            while (!orientationCuirasseJdeux.equalsIgnoreCase("H") && !orientationCuirasseJdeux.equalsIgnoreCase("V")) {
                System.out.println("("+pseudoJdeux+")"+" Veuillez saisir une orientation correcte pour votre Cuirasse : ");
                orientationCuirasseJdeux = scannerJdeux.next();
            }


            placementCuirasseJdeux = ajouteCuirasse(grilleJdeux, coord_X_CuirasseJdeux, coord_Y_CuirasseJdeux, orientationCuirasseJdeux);
        }

        for (int i = 0; i < grilleJdeux.length; i++) {
            System.out.print((Arrays.deepToString(grilleJdeux[i]) + '\n'));
        }
        //---------------------------------- J2 : PLacement Sous-Marin : 3 cases---------------------------------------------
        while (!placementSousMarinJdeux) {
            System.out.println("("+pseudoJdeux+")"+" Veuillez saisir la coordonne X de votre Sous-Marin :");
            coord_X_SousMarinJdeux = scannerJdeux.nextInt();
            while (coord_X_SousMarinJdeux > 9) {
                System.out.println("("+pseudoJdeux+")" + " Veuillez saisir une coordonne X correct pour votre Sous-Marin :");
                coord_X_SousMarinJdeux = scannerJdeux.nextInt();
            }
            System.out.println("("+pseudoJdeux+")" + " Veuillez saisir la coordonne Y de votre Sous-Marin :");
            coord_Y_SousMarinJdeux = scannerJdeux.nextInt();
            while (coord_Y_SousMarinJdeux > 9) {
                System.out.println("("+pseudoJdeux+")" +" Veuillez saisir une coordonne X correct pour votre Sous-Marin :");
                coord_Y_SousMarinJdeux = scannerJdeux.nextInt();
            }

            System.out.println("("+pseudoJdeux+")" +"  Veuillez saisir l'orientation de votre Sous-Marin : ");
            orientationSousMarinJdeux = scannerJdeux.next();
            while (!orientationSousMarinJdeux.equalsIgnoreCase("H") && !orientationSousMarinJdeux.equalsIgnoreCase("V")) {
                System.out.println("("+pseudoJdeux+")"+" Veuillez saisir une orientation correct pour votre Sous-Marin : ");
                orientationSousMarinJdeux = scannerJdeux.next();
            }
            placementSousMarinJdeux = ajouteSousMarinOuCroiseur(grilleJdeux, coord_X_SousMarinJdeux, coord_Y_SousMarinJdeux, orientationSousMarinJdeux, "Sous-Marin");
        }
        for (int i = 0; i < grilleJdeux.length; i++) {
            System.out.print((Arrays.deepToString(grilleJdeux[i]) + '\n'));
        }
        System.out.println('\n') ;
        //------------------------------------------J2 : Placement Croiseur : 3 cases--------------------------------------------
        while (!placementCroiseurJdeux) {

            System.out.println("("+pseudoJdeux+")"+" Veuillez saisir la coordonne X de votre Croiseur  :");
            coord_X_CroiseurJdeux = scannerJdeux.nextInt();
            while (coord_X_CroiseurJdeux > 9) {
                System.out.println("("+pseudoJdeux+ " Veuillez saisir une coordonne X de votre Croiseur :");
                coord_X_CroiseurJdeux = scannerJdeux.nextInt();
            }
            System.out.println("("+pseudoJdeux+")"+ " Veuillez saisir la coordonne Y de votre Croiseur  :");
            coord_Y_CroiseurJdeux = scannerJdeux.nextInt();
            while (coord_Y_CroiseurJdeux > 9) {
                System.out.println(pseudoJdeux+ " Veuillez saisir une coordonne Y correcte pour votre Croiseur :");
                coord_Y_CroiseurJdeux = scannerJdeux.nextInt();
            }

            System.out.println("("+pseudoJdeux+")" +" Veuillez saisir l'orientation de votre Croiseur : ");
            orientationCroiseurJdeux = scannerJdeux.next();
            while (orientationCroiseurJdeux.equalsIgnoreCase("H") && orientationCroiseurJdeux.equalsIgnoreCase("V")) {
                System.out.println("("+pseudoJdeux+")"+" Veuillez saisir une orientation correcte pour votre Croiseur : ");
                orientationCroiseurJdeux = scannerJdeux.next();
            }
            placementCroiseurJdeux = ajouteSousMarinOuCroiseur(grilleJdeux, coord_X_CroiseurJdeux, coord_Y_CroiseurJdeux, orientationCroiseurJdeux, "Croiseur");
        }
        for (int i = 0; i < grilleJdeux.length; i++) {
            System.out.print((Arrays.deepToString(grilleJdeux[i]) + '\n'));
        }
        System.out.println('\n') ;
        //-----------------------------------Placement torpilleur : 2 cases----------------------------------------------
        while (!placementTorpilleurJdeux) {

            System.out.println(pseudoJdeux+" : Veuillez saisir la coordonne X de votre Torpilleur  :");
            coord_X_TorpilleurJdeux = scannerJdeux.nextInt();
            while (coord_X_TorpilleurJdeux > 9) {
                System.out.println(pseudoJdeux+" : Veuillez saisir une coordonne X de votre Torpilleur :");
                coord_X_TorpilleurJdeux = scannerJdeux.nextInt();
            }
            System.out.println(pseudoJdeux+" : Veuillez saisir la coordonne Y de votre Torpilleur  :");
            coord_Y_TorpilleurJdeux = scannerJdeux.nextInt();
            while (coord_Y_TorpilleurJdeux > 9) {
                System.out.println(pseudoJdeux+" : Veuillez saisir une coordonne Y correcte pour votre Torpilleur :");
                coord_Y_TorpilleurJdeux = scannerJdeux.nextInt();
            }

            System.out.println("("+pseudoJdeux+")"+" Veuillez saisir l'orientation de votre Torpilleur : ");
            orientationTorpilleurJdeux = scannerJdeux.next();
            while (orientationTorpilleurJdeux.equalsIgnoreCase("H") && orientationTorpilleurJdeux.equalsIgnoreCase("V")) {
                System.out.println("("+pseudoJdeux+")"+" Veuillez saisir une orientation correcte pour votre Croiseur : ");
                orientationTorpilleurJdeux = scannerJdeux.next();
            }
            placementTorpilleurJdeux = ajouteTorpilleur(grilleJdeux, coord_X_TorpilleurJdeux, coord_Y_TorpilleurJdeux, orientationTorpilleurJdeux);
        }
        System.out.println('\n');
        for (int i = 0; i < grilleJdeux.length; i++) {
            System.out.print((Arrays.deepToString(grilleJdeux[i]) + '\n'));
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
//---------------------------------------------ajouteSousMarinOuCroiseur--------------------------------------------------

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
        } else if (navire.equals("Croiseur")) {
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
    //----------------------------------------ajouteTorpilleur-----------------------------------------------

    public static boolean ajouteTorpilleur(String[][] grille, int emplacement_x, int emplacement_y, String orientation) {

        if (emplacement_y <= 5 && orientation.equals("H")) {
            if (grille[emplacement_x][emplacement_y].equals("~")) {
                grille[emplacement_x][emplacement_y] = "TOR";
            } else {
                System.out.println("Erreur Torpilleur(H) : Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + emplacement_y + "]");
                return false;
            }

            if (grille[emplacement_x][emplacement_y + 1].equals("~")) {
                grille[emplacement_x][emplacement_y + 1] = "PILLEUR";
            } else {
                System.out.println("Erreur Torpilleur(H) : Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y + 1) + "]");
                return false;
            }
        } else if (emplacement_y > 5 && orientation.equals("H")) {
            if (grille[emplacement_x][emplacement_y].equals("~")) {
                grille[emplacement_x][emplacement_y] = "TORP";
            } else {
                System.out.println("Erreur Torpilleur(H)Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y - 1].equals("~")) {
                grille[emplacement_x][emplacement_y - 1] = "ILLEUR";
            } else {
                System.out.println("Erreur Torpilleur(H) : Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y - 1) + "]");
                return false;
            }


        } else if (emplacement_x <= 5 && orientation.equals("V")) {
            if (grille[emplacement_x][emplacement_y].equals("~")) {
                grille[emplacement_x][emplacement_y] = "TORP";
            } else {
                System.out.println("Erreur Torpilleur(V) : Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x + 1][emplacement_y].equals("~")) {
                grille[emplacement_x + 1][emplacement_y] = "ILLEUR";
            } else {
                System.out.println("Erreur Torpilleur(V) : Un navire est déja à l'emplacement [" + (emplacement_x + 1) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }

        } else if (emplacement_x > 5 && orientation.equals("V")) {
            if (grille[emplacement_x][emplacement_y].equals("~")) {
                grille[emplacement_x][emplacement_y] = "TORP";
            } else {
                System.out.println("Erreur Torpilleur(V) : Un navire est déja à l'emplacement [" + (emplacement_x) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x - 1][emplacement_y].equals("~")) {
                grille[emplacement_x - 1][emplacement_y] = "ILLEUR";
            } else {
                System.out.println("Erreur Torpilleur(V) : Un navire est déja à l'emplacement [" + (emplacement_x - 1) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }

        }
        return true;

    }
}







