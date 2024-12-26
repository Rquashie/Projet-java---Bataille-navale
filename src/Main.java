import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scannerJun = new Scanner(System.in), scannerJdeux = new Scanner(System.in);
        String pseudoJun = "", pseudoJdeux = "";
        String orientationPorteAvionJun = "", orientationCroiseurJun = "", orientationSousMarinJun = "", orientationDestroyerJun = "", orientationTorpilleurJun = "";
        boolean placementPorteAvionJun = false, placementCroiseurJun = false, placementSousMarinJun = false, placementDestroyerJun = false, placementTorpilleurJun = false;
        int coord_X_PorteAvionJun = 0, coord_X_CroiseurJun = 0, coord_X_SousMarinJun = 0, coord_X_DestroyerJun = 0, coord_X_TorpilleurJun = 0;
        int coord_Y_PorteAvionJun = 0, coord_Y_CroiseurJun = 0, coord_Y_SousMarinJun = 0, coord_Y_DestroyerJun = 0, coord_Y_TorpilleurJun = 0;
        int tir_X_Jun = 0, tir_Y_Jun = 0, nbTouchePorteAvionJun = 0, nbToucheCroiseurJun = 0, nbToucheSousMarinJun = 0, nbToucheDestroyerJun = 0, nbToucheTorpilleurJun = 0;
        boolean coulePorteAvionJun = false, couleCroiseurJun = false, couleSousMarinJun = false, couleDestroyerJun = false, couleTorpilleurJun = false;
        boolean estTouche = false ;
        boolean victoireJun = false;
        ArrayList<Object> liste = new ArrayList<>();
        int countLigneListe = 0 ;


        String orientationPorteAvionJdeux = "", orientationCroiseurJdeux = "", orientationSousMarinJdeux = "", orientationDestroyerJdeux = "", orientationTorpilleurJdeux = "";
        boolean placementPorteAvionJdeux = false, placementCroiseurJdeux = false, placementSousMarinJdeux = false, placementDestroyerJdeux = false, placementTorpilleurJdeux = false;
        int coord_X_PorteAvionJdeux = 0, coord_X_CroiseurJdeux = 0, coord_X_SousMarinJdeux = 0, coord_X_DestroyerJdeux = 0, coord_X_TorpilleurJdeux = 0;
        int coord_Y_PorteAvionJdeux = 0, coord_Y_CroiseurJdeux = 0, coord_Y_SousMarinJdeux = 0, coord_Y_DestroyerJdeux = 0, coord_Y_TorpilleurJdeux = 0;
        int tir_X_Jdeux = 0, tir_Y_Jdeux = 0, nbToucheJdeux;

        System.out.println("Pseudo joueur 1 : ");
        pseudoJun = scannerJun.nextLine();

        System.out.println("Pseudo joueur 2 : ");
        pseudoJdeux = scannerJdeux.nextLine();

        //Configuration des grilles
        String[][] grilleJun = new String[10][10];
        String[][] grilleJdeux = new String[10][10];


        for (int i = 0; i < grilleJun.length; i++) {
            for (int j = 0; j < grilleJun.length; j++) {
                grilleJun[i][j] = "  ~  ";
                grilleJdeux[i][j] = "  ~  ";
            }
        }
        //------------------------------J1 : Placer le Porte Avions-----------------------------------------------------------
        while (!placementPorteAvionJun) {
            //Joueur 1
            System.out.println("(" + pseudoJun + ")" + " Veuillez saisir la coordonne X de votre Porte-Avions :");
            coord_X_PorteAvionJun = scannerJun.nextInt();
            while (coord_X_PorteAvionJun > 9) {
                System.out.println("(" + pseudoJun + ")" + " Veuillez saisir une coordonnée X correcte pour le Porte-Avions :");
                coord_X_PorteAvionJun = scannerJun.nextInt();
            }
            System.out.println("(" + pseudoJun + ")" + " Veuillez saisir la coordonne Y de votre Porte-Avions :");
            coord_Y_PorteAvionJun = scannerJun.nextInt();
            while (coord_Y_PorteAvionJun > 9) {
                System.out.println("(" + pseudoJun + ")" + " : Veuillez saisir une coordonnée Y correcte pour le Porte-Avions :");
                coord_Y_PorteAvionJun = scannerJun.nextInt();
            }
            System.out.println("(" + pseudoJun + ")" + " Veuillez saisir l'orientation de votre Porte-Avions : ");
            orientationPorteAvionJun = scannerJun.next();

            while (!orientationPorteAvionJun.equalsIgnoreCase("H") && !orientationPorteAvionJun.equalsIgnoreCase("V")) {
                System.out.println("(" + pseudoJun + ")" + " Veuillez saisir une orientation correcte pour votre Porte-avion : ");
                orientationPorteAvionJun = scannerJun.next();
            }
            placementPorteAvionJun = ajoutePorteAvion(grilleJun, coord_X_PorteAvionJun, coord_Y_PorteAvionJun, orientationPorteAvionJun);

        }


        for (int i = 0; i < grilleJun.length; i++) {
            System.out.print((Arrays.deepToString(grilleJun[i]) + '\n'));
        }
        System.out.println('\n');
        ;
        //-------------------------------------------J1 : Placer le Croiseur-----------------------------------------
        while (!placementCroiseurJun) {
            System.out.println("(" + pseudoJun + ")" + " Veuillez saisir la coordonne X de votre Croiseur :");
            coord_X_CroiseurJun = scannerJun.nextInt();

            while (coord_X_CroiseurJun > 9) {
                System.out.println("(" + pseudoJun + ")" + " Veuillez saisir une coordonnée X correcte pour le Croiseur :");
                coord_X_CroiseurJun = scannerJun.nextInt();
            }

            System.out.println("(" + pseudoJun + ")" + " Veuillez saisir la coordonne Y de votre Croiseur :");
            coord_Y_CroiseurJun = scannerJun.nextInt();

            while (coord_Y_CroiseurJun > 9) {
                System.out.println("(" + pseudoJun + ")" + " Veuillez saisir une coordonnée Y correcte pour le Croiseur :");
                coord_Y_CroiseurJun = scannerJun.nextInt();
            }

            System.out.println("(" + pseudoJun + ")" + " Veuillez saisir l'orientation de votre Croiseur : ");
            orientationCroiseurJun = scannerJun.next();
            while (!orientationCroiseurJun.equalsIgnoreCase("H") && !orientationCroiseurJun.equalsIgnoreCase("V")) {
                System.out.println("(" + pseudoJun + ")" + " Veuillez saisir une orientation correcte pour votre Croiseur : ");
                orientationCroiseurJun = scannerJun.next();
            }


            placementCroiseurJun = ajouteCroiseur(grilleJun, coord_X_CroiseurJun, coord_Y_CroiseurJun, orientationCroiseurJun);
        }

        for (int i = 0; i < grilleJun.length; i++) {
            System.out.print((Arrays.deepToString(grilleJun[i]) + '\n'));
        }
        System.out.println('\n');
        //---------------------------------- J1 : PLacement Sous-Marin : 3 cases---------------------------------------------
        while (!placementSousMarinJun) {
            System.out.println("(" + pseudoJun + ")" + " Veuillez saisir la coordonne X de votre Sous-Marin :");
            coord_X_SousMarinJun = scannerJun.nextInt();
            while (coord_X_SousMarinJun > 9) {
                System.out.println("(" + pseudoJun + ")" + " Veuillez saisir une coordonne X correct pour votre Sous-Marin :");
                coord_X_SousMarinJun = scannerJun.nextInt();
            }
            System.out.println(pseudoJun + " Veuillez saisir la coordonne Y de votre Sous-Marin :");
            coord_Y_SousMarinJun = scannerJun.nextInt();
            while (coord_Y_SousMarinJun > 9) {
                System.out.println("(" + pseudoJun + ")" + " Veuillez saisir une coordonne X correct pour votre Sous-Marin :");
                coord_Y_SousMarinJun = scannerJun.nextInt();
            }

            System.out.println(pseudoJun + " : Veuillez saisir l'orientation de votre Sous-Marin : ");
            orientationSousMarinJun = scannerJun.next();
            while (!orientationSousMarinJun.equalsIgnoreCase("H") && !orientationSousMarinJun.equalsIgnoreCase("V")) {
                System.out.println("(" + pseudoJun + ")" + " Veuillez saisir une orientation correct pour votre Sous-Marin : ");
                orientationSousMarinJun = scannerJun.next();
            }
            placementSousMarinJun = ajouteSousMarinOuDestroyer(grilleJun, coord_X_SousMarinJun, coord_Y_SousMarinJun, orientationSousMarinJun, "Sous-Marin");
        }
        for (int i = 0; i < grilleJun.length; i++) {
            System.out.print((Arrays.deepToString(grilleJun[i]) + '\n'));
        }
        System.out.println('\n');
        //------------------------------------------J1 : Placement Croiseur : 3 cases --> Destroyer--------------------------------------------
        while (!placementDestroyerJun) {

            System.out.println("(" + pseudoJun + ")" + " Veuillez saisir la coordonne X de votre Destroyer  :");
            coord_X_DestroyerJun = scannerJun.nextInt();
            while (coord_X_DestroyerJun > 9) {
                System.out.println("(" + pseudoJun + ")" + " Veuillez saisir une coordonne X de votre Destroyer : ");
                coord_X_DestroyerJun = scannerJun.nextInt();
            }
            System.out.println("(" + pseudoJun + " Veuillez saisir la coordonne Y de votre Destroyer :");
            coord_Y_DestroyerJun = scannerJun.nextInt();
            while (coord_Y_DestroyerJun > 9) {
                System.out.println("(" + pseudoJun + ")" + " Veuillez saisir une coordonne Y correcte pour votre Destroyer :");
                coord_Y_DestroyerJun = scannerJun.nextInt();
            }

            System.out.println("(" + pseudoJun + ")" + " Veuillez saisir l'orientation de votre Destroyeur : ");
            orientationDestroyerJun = scannerJun.next();
            while (orientationDestroyerJun.equalsIgnoreCase("H") && orientationDestroyerJun.equalsIgnoreCase("V")) {
                System.out.println(pseudoJun + " Veuillez saisir une orientation correcte pour votre Destroyer : ");
                orientationDestroyerJun = scannerJun.next();
            }
            placementDestroyerJun = ajouteSousMarinOuDestroyer(grilleJun, coord_X_DestroyerJun, coord_Y_DestroyerJun, orientationDestroyerJun, "Destroyer");
        }
        for (int i = 0; i < grilleJun.length; i++) {
            System.out.print((Arrays.deepToString(grilleJun[i]) + '\n'));
        }
        System.out.println('\n');
        //-----------------------------------J1 : Placement torpilleur : 2 cases----------------------------------------------
        while (!placementTorpilleurJun) {

            System.out.println("(" + pseudoJun + ")" + " Veuillez saisir la coordonne X de votre Torpilleur  :");
            coord_X_TorpilleurJun = scannerJun.nextInt();
            while (coord_X_TorpilleurJun > 9) {
                System.out.println("(" + pseudoJun + ")" + " Veuillez saisir une coordonne X de votre Torpilleur :");
                coord_X_TorpilleurJun = scannerJun.nextInt();
            }
            System.out.println(pseudoJun + " Veuillez saisir la coordonne Y de votre Torpilleur  :");
            coord_Y_TorpilleurJun = scannerJun.nextInt();
            while (coord_Y_TorpilleurJun > 9) {
                System.out.println("(" + pseudoJun + ")" + " Veuillez saisir une coordonne Y correcte pour votre Torpilleur :");
                coord_Y_TorpilleurJun = scannerJun.nextInt();
            }

            System.out.println("(" + pseudoJun + " Veuillez saisir l'orientation de votre Torpilleur : ");
            orientationTorpilleurJun = scannerJun.next();
            while (orientationTorpilleurJun.equalsIgnoreCase("H") && orientationTorpilleurJun.equalsIgnoreCase("V")) {
                System.out.println("(" + pseudoJun + ")" + " Veuillez saisir une orientation correcte pour votre Croiseur : ");
                orientationTorpilleurJun = scannerJun.next();
            }
            placementTorpilleurJun = ajouteTorpilleur(grilleJun, coord_X_TorpilleurJun, coord_Y_TorpilleurJun, orientationTorpilleurJun);
        }
        for (int i = 0; i < grilleJun.length; i++) {
            System.out.print((Arrays.deepToString(grilleJun[i]) + '\n'));
        }
        System.out.println('\n');
        //------------------------------J2 : Placer le Porte Avions-----------------------------------------------------------
        while (!placementPorteAvionJdeux) {
            //Joueur 1
            System.out.println("(" + pseudoJdeux + ")" + " Veuillez saisir la coordonne X de votre Porte-Avions :");
            coord_X_PorteAvionJdeux = scannerJdeux.nextInt();
            while (coord_X_PorteAvionJdeux > 9) {
                System.out.println("(" + pseudoJdeux + ")" + " Veuillez saisir une coordonnée X correcte pour le Porte-Avions :");
                coord_X_PorteAvionJdeux = scannerJdeux.nextInt();
            }
            System.out.println(pseudoJdeux + " Veuillez saisir la coordonne Y de votre Porte-Avions :");
            coord_Y_PorteAvionJdeux = scannerJdeux.nextInt();
            while (coord_Y_PorteAvionJdeux > 9) {
                System.out.println("(" + pseudoJdeux + ")" + " Veuillez saisir une coordonnée Y correcte pour le Porte-Avions :");
                coord_Y_PorteAvionJdeux = scannerJdeux.nextInt();
            }
            System.out.println("(" + pseudoJdeux + ")" + "  Veuillez saisir l'orientation de votre Porte-Avions : ");
            orientationPorteAvionJdeux = scannerJdeux.next();

            while (!orientationPorteAvionJdeux.equalsIgnoreCase("H") && !orientationPorteAvionJdeux.equalsIgnoreCase("V")) {
                System.out.println("(" + pseudoJdeux + ")" + " Veuillez saisir une orientation correcte pour votre Porte-avion : ");
                orientationPorteAvionJdeux = scannerJdeux.next();
            }
            placementPorteAvionJdeux = ajoutePorteAvion(grilleJdeux, coord_X_PorteAvionJdeux, coord_Y_PorteAvionJdeux, orientationPorteAvionJdeux);

        }
        for (int i = 0; i < grilleJdeux.length; i++) {
            System.out.print((Arrays.deepToString(grilleJdeux[i]) + '\n'));
        }
        System.out.println('\n');
        //-------------------------------------------J2 : Placer le Croiseur-----------------------------------------
        while (!placementCroiseurJdeux) {
            System.out.println("(" + pseudoJdeux + ")" + " Veuillez saisir la coordonne X de votre Croiseur :");
            coord_X_CroiseurJdeux = scannerJdeux.nextInt();

            while (coord_X_CroiseurJdeux > 9) {
                System.out.println("(" + pseudoJdeux + ")" + " Veuillez saisir une coordonnée X correcte pour le Croiseur :");
                coord_X_CroiseurJdeux = scannerJdeux.nextInt();
            }

            System.out.println("(" + pseudoJdeux + ")" + " Veuillez saisir la coordonne Y de votre Croiseur :");
            coord_Y_CroiseurJdeux = scannerJdeux.nextInt();

            while (coord_Y_CroiseurJdeux > 9) {
                System.out.println("(" + pseudoJdeux + ")" + " Veuillez saisir une coordonnée Y correcte pour le Cuirasse :");
                coord_Y_CroiseurJdeux = scannerJdeux.nextInt();
            }

            System.out.println("(" + pseudoJdeux + ")" + " Veuillez saisir l'orientation de votre Croiseur : ");
            orientationCroiseurJdeux = scannerJdeux.next();
            while (!orientationCroiseurJdeux.equalsIgnoreCase("H") && !orientationCroiseurJdeux.equalsIgnoreCase("V")) {
                System.out.println("(" + pseudoJdeux + ")" + " Veuillez saisir une orientation correcte pour votre Cuirasse : ");
                orientationCroiseurJdeux = scannerJdeux.next();
            }


            placementCroiseurJdeux = ajouteCroiseur(grilleJdeux, coord_X_CroiseurJdeux, coord_Y_CroiseurJdeux, orientationCroiseurJdeux);
        }

        for (int i = 0; i < grilleJdeux.length; i++) {
            System.out.print((Arrays.deepToString(grilleJdeux[i]) + '\n'));
        }
        System.out.println('\n');
        //---------------------------------- J2 : PLacement Sous-Marin : 3 cases---------------------------------------------
        while (!placementSousMarinJdeux) {
            System.out.println("(" + pseudoJdeux + ")" + " Veuillez saisir la coordonne X de votre Sous-Marin :");
            coord_X_SousMarinJdeux = scannerJdeux.nextInt();
            while (coord_X_SousMarinJdeux > 9) {
                System.out.println("(" + pseudoJdeux + ")" + " Veuillez saisir une coordonne X correct pour votre Sous-Marin :");
                coord_X_SousMarinJdeux = scannerJdeux.nextInt();
            }
            System.out.println("(" + pseudoJdeux + ")" + " Veuillez saisir la coordonne Y de votre Sous-Marin :");
            coord_Y_SousMarinJdeux = scannerJdeux.nextInt();
            while (coord_Y_SousMarinJdeux > 9) {
                System.out.println("(" + pseudoJdeux + ")" + " Veuillez saisir une coordonne X correct pour votre Sous-Marin :");
                coord_Y_SousMarinJdeux = scannerJdeux.nextInt();
            }

            System.out.println("(" + pseudoJdeux + ")" + "  Veuillez saisir l'orientation de votre Sous-Marin : ");
            orientationSousMarinJdeux = scannerJdeux.next();
            while (!orientationSousMarinJdeux.equalsIgnoreCase("H") && !orientationSousMarinJdeux.equalsIgnoreCase("V")) {
                System.out.println("(" + pseudoJdeux + ")" + " Veuillez saisir une orientation correct pour votre Sous-Marin : ");
                orientationSousMarinJdeux = scannerJdeux.next();
            }
            placementSousMarinJdeux = ajouteSousMarinOuDestroyer(grilleJdeux, coord_X_SousMarinJdeux, coord_Y_SousMarinJdeux, orientationSousMarinJdeux, "Sous-Marin");
        }
        for (int i = 0; i < grilleJdeux.length; i++) {
            System.out.print((Arrays.deepToString(grilleJdeux[i]) + '\n'));
        }
        System.out.println('\n');
        //------------------------------------------J2 : Placement Destroyer : 3 cases--------------------------------------------
        while (!placementDestroyerJdeux) {

            System.out.println("(" + pseudoJdeux + ")" + " Veuillez saisir la coordonne X de votre Destroyer :");
            coord_X_DestroyerJdeux = scannerJdeux.nextInt();
            while (coord_X_DestroyerJdeux > 9) {
                System.out.println("(" + pseudoJdeux + " Veuillez saisir une coordonne X de votre Destroyer :");
                coord_X_DestroyerJdeux = scannerJdeux.nextInt();
            }
            System.out.println("(" + pseudoJdeux + ")" + " Veuillez saisir la coordonne Y de votre Destroyer  :");
            coord_Y_DestroyerJdeux = scannerJdeux.nextInt();
            while (coord_Y_DestroyerJdeux > 9) {
                System.out.println(pseudoJdeux + " Veuillez saisir une coordonne Y correcte pour votre Destroyer :");
                coord_Y_DestroyerJdeux = scannerJdeux.nextInt();
            }

            System.out.println("(" + pseudoJdeux + ")" + " Veuillez saisir l'orientation de votre Destroyer : ");
            orientationDestroyerJdeux = scannerJdeux.next();
            while (orientationCroiseurJdeux.equalsIgnoreCase("H") && orientationCroiseurJdeux.equalsIgnoreCase("V")) {
                System.out.println("(" + pseudoJdeux + ")" + " Veuillez saisir une orientation correcte pour votre Destroyer : ");
                orientationDestroyerJdeux = scannerJdeux.next();
            }
            placementDestroyerJdeux = ajouteSousMarinOuDestroyer(grilleJdeux, coord_X_DestroyerJdeux, coord_Y_DestroyerJdeux, orientationDestroyerJdeux, "Destroyer");
        }
        for (int i = 0; i < grilleJdeux.length; i++) {
            System.out.print((Arrays.deepToString(grilleJdeux[i]) + '\n'));
        }
        System.out.println('\n');
        //-----------------------------------Placement torpilleur : 2 cases----------------------------------------------
        while (!placementTorpilleurJdeux) {

            System.out.println("(" + pseudoJdeux + ")" + " Veuillez saisir la coordonne X de votre Torpilleur  :");
            coord_X_TorpilleurJdeux = scannerJdeux.nextInt();
            while (coord_X_TorpilleurJdeux > 9) {
                System.out.println("(" + pseudoJdeux + ")" + " Veuillez saisir une coordonne X de votre Torpilleur :");
                coord_X_TorpilleurJdeux = scannerJdeux.nextInt();
            }
            System.out.println("(" + pseudoJdeux + ")" + " : Veuillez saisir la coordonne Y de votre Torpilleur  :");
            coord_Y_TorpilleurJdeux = scannerJdeux.nextInt();
            while (coord_Y_TorpilleurJdeux > 9) {
                System.out.println("(" + pseudoJdeux + ")" + " : Veuillez saisir une coordonne Y correcte pour votre Torpilleur :");
                coord_Y_TorpilleurJdeux = scannerJdeux.nextInt();
            }

            System.out.println("(" + pseudoJdeux + ")" + " Veuillez saisir l'orientation de votre Torpilleur : ");
            orientationTorpilleurJdeux = scannerJdeux.next();
            while (orientationTorpilleurJdeux.equalsIgnoreCase("H") && orientationTorpilleurJdeux.equalsIgnoreCase("V")) {
                System.out.println("(" + pseudoJdeux + ")" + " Veuillez saisir une orientation correcte pour votre Croiseur : ");
                orientationTorpilleurJdeux = scannerJdeux.next();
            }
            placementTorpilleurJdeux = ajouteTorpilleur(grilleJdeux, coord_X_TorpilleurJdeux, coord_Y_TorpilleurJdeux, orientationTorpilleurJdeux);
        }
        System.out.println('\n');
        for (String[] ligneJun : grilleJun) {
            System.out.println(Arrays.deepToString(ligneJun) + "\n");
        }
        System.out.println("----------------------------------------------------------------\n\n");
        for (String[] ligneJdeux : grilleJdeux) {
            System.out.println(Arrays.deepToString(ligneJdeux) + "\n");
        }


        //----------------------------------------------Choix tirs-------------------------------------------------------


        while (!(coulePorteAvionJun && couleCroiseurJun && couleDestroyerJun && couleSousMarinJun && couleTorpilleurJun)) {

            System.out.println("(" + pseudoJun + " - Tir )" + "Veuillez choisir une coordonnee X  : ");
            tir_X_Jun = scannerJun.nextInt();

            System.out.println("(" + pseudoJun + " - Tir )" + "Veuillez choisir une coordonnee Y  : ");
            tir_Y_Jun = scannerJun.nextInt();


            liste.add("[" + tir_X_Jun + "]\t");
            liste.add("[" + tir_Y_Jun + "]\t\n");

            //contientBateau()  Porte-Avion
            if (contientBateau(grilleJdeux, tir_X_Jun, tir_Y_Jun, "Porte-Avions")) {
                System.out.println("Touché\n");
                nbTouchePorteAvionJun ++;
                estTouche = true ;
                if (nbTouchePorteAvionJun == 5) {
                    coulePorteAvionJun = true;
                    System.out.println("Porte-Avion coulé !\n");
                }
            }

            //Croiseur
            if (contientBateau(grilleJdeux, tir_X_Jun, tir_Y_Jun, "Croiseur")) {
                System.out.println("Touché\n");
                nbToucheCroiseurJun += 1;
                estTouche=true ;
                if (nbToucheCroiseurJun == 4) {
                    couleCroiseurJun = true;
                    System.out.println("Croiseur coulé !\n");
                }

            }if (contientBateau(grilleJdeux, tir_X_Jun, tir_Y_Jun, "Sous-marin")) {
                System.out.println("Touché \n");
                nbToucheSousMarinJun += 1;
                estTouche = true ;
                if (nbToucheSousMarinJun == 3) {
                    couleSousMarinJun = true;
                    System.out.println("Sous-Marin coulé !\n");
                }

            }if (contientBateau(grilleJdeux, tir_X_Jun, tir_Y_Jun, "Destroyer")) {
                System.out.println("Touché\n");
                nbToucheDestroyerJun += 1;
                estTouche = true ;
                if (nbToucheDestroyerJun == 3) {
                    couleDestroyerJun = true;
                    System.out.println("Destroyer coulé !\n");
                }

            }if (contientBateau(grilleJdeux, tir_X_Jun, tir_Y_Jun, "Torpilleur")) {
                System.out.println("Touché\n");
                nbToucheTorpilleurJun +=1;
                estTouche = true ;
                if (nbToucheTorpilleurJun == 2) {
                    couleTorpilleurJun = true;
                    System.out.println("Torpilleur coulé !\n");
                }
            } if(!estTouche){
                System.out.println("Eau");
            }
            for (String[] ligneJdeux : grilleJdeux) {
                System.out.println(Arrays.deepToString(ligneJdeux) + "\n");
            }
        }



        if (coulePorteAvionJun && couleCroiseurJun && couleDestroyerJun && couleSousMarinJun && couleTorpilleurJun) {
            victoireJun = true;
            System.out.println(pseudoJun + " a gagné \n");
        }

        System.out.println("Historique des choix du joueur 1 : ");
        for (Object coord : liste) {
            countLigneListe++;
            System.out.print(coord);
            if (countLigneListe % 2 == 0) {
                System.out.print('\n');
            }
        }
    }


    public static boolean ajoutePorteAvion(String[][] grille, int emplacement_x, int emplacement_y, String orientation) {

        if (emplacement_y <= 5 && orientation.equals("H")) {
            if (grille[emplacement_x][emplacement_y].equals("  ~  ")) {
                grille[emplacement_x][emplacement_y] = "PO";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + emplacement_y + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y + 1].equals("  ~  ")) {
                grille[emplacement_x][emplacement_y + 1] = "RT";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y + 1) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y + 2].equals("  ~  ")) {
                grille[emplacement_x][emplacement_y + 2] = "E ";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y + 2) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y + 3].equals("  ~  ")) {
                grille[emplacement_x][emplacement_y + 3] = "AV";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y + 3) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y + 4].equals("  ~  ")) {
                grille[emplacement_x][emplacement_y + 4] = "ION";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y + 4) + "]");
                return false;
            }
            // Si l'index de la colonne est superieur à 5 on va inverser l'incrementation pour éviter les ajouts hors de champs
        } else if (emplacement_y > 5 && orientation.equals("H")) {
            if (grille[emplacement_x][emplacement_y].equals("  ~  ")) {
                grille[emplacement_x][emplacement_y] = "PO";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + emplacement_y + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y - 1].equals("  ~  ")) {
                grille[emplacement_x][emplacement_y - 1] = "RT";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y - 1) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y - 2].equals("  ~  ")) {
                grille[emplacement_x][emplacement_y - 2] = "E ";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y - 2) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y - 3].equals("  ~  ")) {
                grille[emplacement_x][emplacement_y - 3] = "AV";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y - 3) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y - 4].equals("  ~  ")) {
                grille[emplacement_x][emplacement_y - 4] = "ION";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y - 4) + "]");
                return false;
            }

            //Verification placement vertical
        } else if (emplacement_x <= 5 && orientation.equals("V")) {
            if (grille[emplacement_x][emplacement_y].equals("  ~  ")) {
                grille[emplacement_x][emplacement_y] = "PO";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x + 1][emplacement_y].equals("  ~  ")) {
                grille[emplacement_x + 1][emplacement_y] = "RT";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x + 1) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x + 2][emplacement_y].equals("  ~  ")) {
                grille[emplacement_x + 2][emplacement_y] = "E ";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x + 2) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x + 3][emplacement_y].equals("  ~  ")) {
                grille[emplacement_x + 3][emplacement_y] = "AV";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x + 3) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x + 4][emplacement_y].equals("  ~  ")) {
                grille[emplacement_x + 4][emplacement_y] = "ION";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x + 4) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }


        } else if (emplacement_x > 5 && orientation.equals("V")) {
            if (grille[emplacement_x][emplacement_y].equals("  ~  ")) {
                grille[emplacement_x][emplacement_y] = "PO";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x - 1][emplacement_y].equals("  ~  ")) {
                grille[emplacement_x - 1][emplacement_y] = "RT";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x - 1) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x - 2][emplacement_y].equals("  ~  ")) {
                grille[emplacement_x - 2][emplacement_y] = "E ";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x - 1) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x - 3][emplacement_y].equals("  ~  ")) {
                grille[emplacement_x - 3][emplacement_y] = "AV";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x - 3) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y].equals("  ~  ")) {
                grille[emplacement_x - 4][emplacement_y] = "ION";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x - 4) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
        }
        return true;
    }


    public static boolean ajouteCroiseur(String[][] grille, int emplacement_x, int emplacement_y, String orientation) {


        if (emplacement_y <= 5 && orientation.equals("H")) {
            if (grille[emplacement_x][emplacement_y].equals("  ~  ")) {
                grille[emplacement_x][emplacement_y] = "CR";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + emplacement_y + "]");
                return false;
            }

            if (grille[emplacement_x][emplacement_y + 1].equals("  ~  ")) {
                grille[emplacement_x][emplacement_y + 1] = "OI";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y + 1) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y + 2].equals("  ~  ")) {
                grille[emplacement_x][emplacement_y + 2] = "SE ";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y + 2) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y + 3].equals("  ~  ")) {
                grille[emplacement_x][emplacement_y + 3] = "UR";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y + 3) + "]");
                return false;
            }
        } else if (emplacement_y > 5 && orientation.equals("H")) {
            if (grille[emplacement_x][emplacement_y].equals("  ~  ")) {
                grille[emplacement_x][emplacement_y] = "CR";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y - 1].equals("  ~  ")) {
                grille[emplacement_x][emplacement_y - 1] = "OI";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y - 1) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y - 2].equals("  ~  ")) {
                grille[emplacement_x][emplacement_y - 2] = "SE";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y - 2) + "]");
                return false;
            }

            if (grille[emplacement_x][emplacement_y - 3].equals("  ~  ")) {
                grille[emplacement_x][emplacement_y - 3] = "UR";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y - 3) + "]");
                return false;
            }

        } else if (emplacement_x <= 5 && orientation.equals("V")) {
            if (grille[emplacement_x][emplacement_y].equals("  ~  ")) {
                grille[emplacement_x][emplacement_y] = "CR";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x + 1][emplacement_y].equals("  ~  ")) {
                grille[emplacement_x + 1][emplacement_y] = "OI";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x + 1) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x + 2][emplacement_y].equals("  ~  ")) {
                grille[emplacement_x + 2][emplacement_y] = "SE";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x + 2) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x + 3][emplacement_y].equals("  ~  ")) {
                grille[emplacement_x + 3][emplacement_y] = "UR";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x + 3) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
        } else if (emplacement_x > 5 && orientation.equals("V")) {
            if (grille[emplacement_x][emplacement_y].equals("  ~  ")) {
                grille[emplacement_x][emplacement_y] = "CR";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x - 1][emplacement_y].equals("  ~  ")) {
                grille[emplacement_x - 1][emplacement_y] = "OI";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x - 1) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x - 2][emplacement_y].equals("  ~  ")) {
                grille[emplacement_x - 2][emplacement_y] = "SE";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x - 2) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x - 3][emplacement_y].equals("  ~  ")) {
                grille[emplacement_x - 3][emplacement_y] = "UR";
            } else {
                System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x - 3) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
        }
        return true;
    }
//---------------------------------------------ajouteSousMarinOuDestroyer--------------------------------------------------

    public static boolean ajouteSousMarinOuDestroyer(String[][] grille, int emplacement_x, int emplacement_y, String orientation, String navire) {

        if (navire.equals("Sous-Marin")) {

            if (emplacement_y <= 5 && orientation.equals("H")) {
                if (grille[emplacement_x][emplacement_y].equals("  ~  ")) {
                    grille[emplacement_x][emplacement_y] = "SOUS";
                } else {
                    System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + emplacement_y + "]");
                    return false;
                }

                if (grille[emplacement_x][emplacement_y + 1].equals("  ~  ")) {
                    grille[emplacement_x][emplacement_y + 1] = "MA";
                } else {
                    System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y + 1) + "]");
                    return false;
                }
                if (grille[emplacement_x][emplacement_y + 2].equals("  ~  ")) {
                    grille[emplacement_x][emplacement_y + 2] = "RIN";
                } else {
                    System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y + 2) + "]");
                    return false;
                }

            } else if (emplacement_y > 5 && orientation.equals("H")) {
                if (grille[emplacement_x][emplacement_y].equals("  ~  ")) {
                    grille[emplacement_x][emplacement_y] = "SOUS";
                } else {
                    System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y) + "]");
                    return false;
                }
                if (grille[emplacement_x][emplacement_y - 1].equals("  ~  ")) {
                    grille[emplacement_x][emplacement_y - 1] = "MA";
                } else {
                    System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y - 1) + "]");
                    return false;
                }
                if (grille[emplacement_x][emplacement_y - 2].equals("  ~  ")) {
                    grille[emplacement_x][emplacement_y - 2] = "RIN";
                } else {
                    System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y - 2) + "]");
                    return false;
                }


            } else if (emplacement_x <= 5 && orientation.equals("V")) {
                if (grille[emplacement_x][emplacement_y].equals("  ~  ")) {
                    grille[emplacement_x][emplacement_y] = "SOUS";
                } else {
                    System.out.println("Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y) + "]");
                    return false;
                }
                if (grille[emplacement_x + 1][emplacement_y].equals("  ~  ")) {
                    grille[emplacement_x + 1][emplacement_y] = "MA";
                } else {
                    System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x + 1) + "]" + "[" + (emplacement_y) + "]");
                    return false;
                }
                if (grille[emplacement_x + 2][emplacement_y].equals("  ~  ")) {
                    grille[emplacement_x + 2][emplacement_y] = "RIN";
                } else {
                    System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x + 2) + "]" + "[" + (emplacement_y) + "]");
                    return false;
                }

            } else if (emplacement_x > 5 && orientation.equals("V")) {
                if (grille[emplacement_x][emplacement_y].equals("  ~  ")) {
                    grille[emplacement_x][emplacement_y] = "SOUS";
                } else {
                    System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x) + "]" + "[" + (emplacement_y) + "]");
                    return false;
                }
                if (grille[emplacement_x - 1][emplacement_y].equals("  ~  ")) {
                    grille[emplacement_x - 1][emplacement_y] = "MA";
                } else {
                    System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x - 1) + "]" + "[" + (emplacement_y) + "]");
                    return false;
                }
                if (grille[emplacement_x - 2][emplacement_y].equals("  ~  ")) {
                    grille[emplacement_x - 2][emplacement_y] = "RIN";
                } else {
                    System.out.println("Un navire est déja à l'emplacement [" + (emplacement_x - 2) + "]" + "[" + (emplacement_y) + "]");
                    return false;
                }
            }
        } else if (navire.equals("Destroyer")) {
            if (emplacement_y <= 5 && orientation.equals("H")) {
                if (grille[emplacement_x][emplacement_y].equals("  ~  ")) {
                    grille[emplacement_x][emplacement_y] = "DE";
                } else {
                    System.out.println("Erreur Destroyer(H) : Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + emplacement_y + "]");
                    return false;
                }
                if (grille[emplacement_x][emplacement_y + 1].equals("  ~  ")) {
                    grille[emplacement_x][emplacement_y + 1] = "STR";
                } else {
                    System.out.println("Erreur Destroyer(H) : Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y + 1) + "]");
                    return false;
                }
                if (grille[emplacement_x][emplacement_y + 2].equals("  ~  ")) {
                    grille[emplacement_x][emplacement_y + 2] = "OYER";
                } else {
                    System.out.println("Erreur Destroyer(H) : Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y + 2) + "]");
                    return false;
                }

            } else if (emplacement_y > 5 && orientation.equals("H")) {
                if (grille[emplacement_x][emplacement_y].equals("  ~  ")) {
                    grille[emplacement_x][emplacement_y] = "DE";
                } else {
                    System.out.println("Erreur Destroyer(H) : Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y) + "]");
                    return false;
                }
                if (grille[emplacement_x][emplacement_y - 1].equals("  ~  ")) {
                    grille[emplacement_x][emplacement_y - 1] = "STR";
                } else {
                    System.out.println("Erreur Destroyer(H) : Un navire est déja à l'emplacement [" + (emplacement_x) + "]" + "[" + (emplacement_y - 1) + "]");
                    return false;
                }
                if (grille[emplacement_x][emplacement_y - 2].equals("  ~  ")) {
                    grille[emplacement_x][emplacement_y - 2] = "OYER";
                } else {
                    System.out.println("Erreur Destroyer(H) : Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y - 2) + "]");
                    return false;
                }


            } else if (emplacement_x <= 5 && orientation.equals("V")) {
                if (grille[emplacement_x][emplacement_y].equals("  ~  ")) {
                    grille[emplacement_x][emplacement_y] = "DE";
                } else {
                    System.out.println("Erreur Croiseur(V) : Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y) + "]");
                    return false;
                }
                if (grille[emplacement_x + 1][emplacement_y].equals("  ~  ")) {
                    grille[emplacement_x + 1][emplacement_y] = "STR";
                } else {
                    System.out.println("Erreur Destroyer(V) : Un navire est déja à l'emplacement [" + (emplacement_x + 1) + "]" + "[" + (emplacement_y) + "]");
                    return false;
                }
                if (grille[emplacement_x + 2][emplacement_y].equals("  ~  ")) {
                    grille[emplacement_x + 2][emplacement_y] = "OYER";
                } else {
                    System.out.println("Erreur Destroyer(V) : Un navire est déja à l'emplacement [" + (emplacement_x + 2) + "]" + "[" + (emplacement_y) + "]");
                    return false;
                }

            } else if (emplacement_x > 5 && orientation.equals("V")) {
                if (grille[emplacement_x][emplacement_y].equals("  ~  ")) {
                    grille[emplacement_x][emplacement_y] = "DE";
                } else {
                    System.out.println("Erreur Destroyer(V) : Un navire est déja à l'emplacement [" + (emplacement_x) + "]" + "[" + (emplacement_y) + "]");
                    return false;
                }
                if (grille[emplacement_x - 1][emplacement_y].equals("  ~  ")) {
                    grille[emplacement_x - 1][emplacement_y] = "STR";
                } else {
                    System.out.println("Erreur Destroyer(V) : Un navire est déja à l'emplacement [" + (emplacement_x - 1) + "]" + "[" + (emplacement_y) + "]");
                    return false;
                }
                if (grille[emplacement_x - 2][emplacement_y].equals("  ~  ")) {
                    grille[emplacement_x - 2][emplacement_y] = "OYER";
                } else {
                    System.out.println("Erreur Destroyer(V) : Un navire est déja à l'emplacement [" + (emplacement_x - 2) + "]" + "[" + (emplacement_y) + "]");
                    return false;
                }
            }
        }
        return true;

    }
    //----------------------------------------ajouteTorpilleur-----------------------------------------------

    public static boolean ajouteTorpilleur(String[][] grille, int emplacement_x, int emplacement_y, String orientation) {

        if (emplacement_y <= 5 && orientation.equals("H")) {
            if (grille[emplacement_x][emplacement_y].equals("  ~  ")) {
                grille[emplacement_x][emplacement_y] = "TORP";
            } else {
                System.out.println("Erreur Torpilleur(H) : Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + emplacement_y + "]");
                return false;
            }

            if (grille[emplacement_x][emplacement_y + 1].equals("  ~  ")) {
                grille[emplacement_x][emplacement_y + 1] = "ILLEUR";
            } else {
                System.out.println("Erreur Torpilleur(H) : Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y + 1) + "]");
                return false;
            }
        } else if (emplacement_y > 5 && orientation.equals("H")) {
            if (grille[emplacement_x][emplacement_y].equals("  ~  ")) {
                grille[emplacement_x][emplacement_y] = "TORP";
            } else {
                System.out.println("Erreur Torpilleur(H)Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x][emplacement_y - 1].equals("  ~  ")) {
                grille[emplacement_x][emplacement_y - 1] = "ILLEUR";
            } else {
                System.out.println("Erreur Torpilleur(H) : Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y - 1) + "]");
                return false;
            }


        } else if (emplacement_x <= 5 && orientation.equals("V")) {
            if (grille[emplacement_x][emplacement_y].equals("  ~  ")) {
                grille[emplacement_x][emplacement_y] = "TORP";
            } else {
                System.out.println("Erreur Torpilleur(V) : Un navire est déja à l'emplacement [" + emplacement_x + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x + 1][emplacement_y].equals("  ~  ")) {
                grille[emplacement_x + 1][emplacement_y] = "ILLEUR";
            } else {
                System.out.println("Erreur Torpilleur(V) : Un navire est déja à l'emplacement [" + (emplacement_x + 1) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }

        } else if (emplacement_x > 5 && orientation.equals("V")) {
            if (grille[emplacement_x][emplacement_y].equals("  ~  ")) {
                grille[emplacement_x][emplacement_y] = "TORP";
            } else {
                System.out.println("Erreur Torpilleur(V) : Un navire est déja à l'emplacement [" + (emplacement_x) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }
            if (grille[emplacement_x - 1][emplacement_y].equals("  ~  ")) {
                grille[emplacement_x - 1][emplacement_y] = "ILLEUR";
            } else {
                System.out.println("Erreur Torpilleur(V) : Un navire est déja à l'emplacement [" + (emplacement_x - 1) + "]" + "[" + (emplacement_y) + "]");
                return false;
            }

        }
        return true;

    }

    public static boolean contientBateau(String grille [][] ,int x ,int y , String bateau) {
        if(bateau.equals("Porte-Avions")){
            if(grille[x][y].equals("PO")){
                grille[x][y] = "  ~  ";
                return true;
            }
            if(grille[x][y].equals("RT")){
                grille[x][y] = "  ~  ";
                return true;
            }
            if(grille[x][y].equals("E ")){
                grille[x][y] = "  ~  ";
                return true;
            }
            if(grille[x][y].equals("AV")){
                grille[x][y] = "  ~  ";
                return true;
            }
            if(grille[x][y].equals("ION")){
                grille[x][y] = "  ~  ";
                return true;
            }
        }
        else if(bateau.equals("Croiseur")){
            if(grille[x][y].equals("CR")){
                grille[x][y] = "  ~  ";
                return true;
            }
            if(grille[x][y].equals("OI")){
                grille[x][y] = "  ~  ";
                return true;
            }
            if(grille[x][y].equals("SE")){
                grille[x][y] = "  ~  ";
                return true;
            }
            if(grille[x][y].equals("UR")){
                grille[x][y] = "  ~  ";
                return true;
            }
        }
        else if(bateau.equals("Sous-marin")){
            if(grille[x][y].equals("SOUS")){
                grille[x][y] = "  ~  ";
                return true;
            }
            if(grille[x][y].equals("MA")){
                grille[x][y] = "  ~  ";
                return true;
            }
            if(grille[x][y].equals("RIN")){
                grille[x][y] = "  ~  ";
                return true;
            }
        }
        else if(bateau.equals("Destroyer")){
            if(grille[x][y].equals("DE")){
                grille[x][y] = "  ~  ";
                return true;
            }
            if(grille[x][y].equals("STR")){
                grille[x][y] = "  ~  ";
                return true;
            }
            if(grille[x][y].equals("OYER")){
                grille[x][y] = "  ~  ";
                return true;
            }
        }
        else if(bateau.equals("Torpilleur")){
            if(grille[x][y].equals("TORP")){
                grille[x][y] = "  ~  ";
                return true;
            }
            if(grille[x][y].equals("ILLEUR")){
                grille[x][y] = "  ~  ";
                return true;
            }
        }
        return false ;
    }

}







