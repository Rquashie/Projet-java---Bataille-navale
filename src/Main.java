import java.time.Instant;
import java.util.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String pseudoJun = "", pseudoJdeux = "";
        String orientationPorteAvionJun = "", orientationCroiseurJun = "", orientationSousMarinJun = "", orientationDestroyerJun = "", orientationTorpilleurJun = "";
        boolean placementPorteAvionJun = false, placementCroiseurJun = false, placementSousMarinJun = false, placementDestroyerJun = false, placementTorpilleurJun = false;
        int coord_X_PorteAvionJun = 0, coord_X_CroiseurJun = 0, coord_X_SousMarinJun = 0, coord_X_DestroyerJun = 0, coord_X_TorpilleurJun = 0;
        int coord_Y_PorteAvionJun = 0, coord_Y_CroiseurJun = 0, coord_Y_SousMarinJun = 0, coord_Y_DestroyerJun = 0, coord_Y_TorpilleurJun = 0;
        int tir_X_Jun = 0, tir_Y_Jun = 0, nbTouchePorteAvionJun = 0, nbToucheCroiseurJun = 0, nbToucheSousMarinJun = 0, nbToucheDestroyerJun = 0, nbToucheTorpilleurJun = 0;
        boolean victoireJun = false;
        ArrayList<Object> listeTirsJun = new ArrayList<>();
        ArrayList<Object> listeTouchesCoulesJun = new ArrayList<>();
        String reponseJun = "";
        boolean rejouer = false;
        int nb_Tir_Jun = 0, nb_Touche_Coule_Jun = 0, nb_Victoire_Jun = 0, nb_Defaite_Jun = 0;

        int countLigneListe = 0;


        String orientationPorteAvionJdeux = "", orientationCroiseurJdeux = "", orientationSousMarinJdeux = "", orientationDestroyerJdeux = "", orientationTorpilleurJdeux = "";
        boolean placementPorteAvionJdeux = false, placementCroiseurJdeux = false, placementSousMarinJdeux = false, placementDestroyerJdeux = false, placementTorpilleurJdeux = false;
        int coord_X_PorteAvionJdeux = 0, coord_X_CroiseurJdeux = 0, coord_X_SousMarinJdeux = 0, coord_X_DestroyerJdeux = 0, coord_X_TorpilleurJdeux = 0;
        int coord_Y_PorteAvionJdeux = 0, coord_Y_CroiseurJdeux = 0, coord_Y_SousMarinJdeux = 0, coord_Y_DestroyerJdeux = 0, coord_Y_TorpilleurJdeux = 0;
        int tir_X_Jdeux = 0, tir_Y_Jdeux = 0, nbTouchePorteAvionJdeux = 0, nbToucheCroiseurJdeux = 0, nbToucheSousMarinJdeux = 0, nbToucheDestroyerJdeux = 0, nbToucheTorpilleurJdeux = 0;
        boolean victoireJdeux = false;
        ArrayList<Object> listeTirsJdeux = new ArrayList<>();
        ArrayList<Object> listeTouchesCoulesJdeux = new ArrayList<>();
        boolean reponseJdeux = true;
        int nb_tir_Jdeux = 0, nb_ToucheCoule_Jdeux = 0, nb_Defaite_Jdeux = 0, nb_Victoire_Jdeux = 0;

        ArrayList<Object> listeVainqueurs = new ArrayList<>();
        ArrayList<Object> listePerdants = new ArrayList<>();

        boolean[] bateauxCoulesJun = new boolean[5];
        bateauxCoulesJun[0] = false ; //PA
        bateauxCoulesJun[1] = false ; //Croiseur
        bateauxCoulesJun[2] = false ; //Sous-Marins
        bateauxCoulesJun[3] = false ; //Destroyer
        bateauxCoulesJun[4] = false ; // Torpilleur

        boolean[] bateauxCoulesJdeux = new boolean[5];
        bateauxCoulesJdeux[0] = false ; //PA
        bateauxCoulesJdeux[1] = false ; //Croiseur
        bateauxCoulesJdeux[2] = false ; //Sous-Marins
        bateauxCoulesJdeux[3] = false ; //Destroyer
        bateauxCoulesJdeux[4] = false ; // Torpilleur



        String[] porteAvions = {"PO", "RT", "E", "AV", "ION"}; // Taille 5
        int taillePA = 5;
        String[] croiseur = {"CR", "OI", "SE", "UR"}; // Taille 4
        int tailleCR = 4;
        String[] sousMarin = {"SOUS", "MA", "RIN"}; // Taille 3
        int tailleSM = 3;
        String[] destroyer = {"DE", "STR", "OYER"}; // Taille 3
        int tailleDestroyer = 3;
        String[] torpilleur = {"TOR", "PILLEUR"}; // Taille 2
        int tailleTorp = 2;

        int[] coordonnees = new int[2];
        int tailleGrille = 10;


        int nb_Partie = 0;

        Scanner scannerJun = new Scanner(System.in);
        Scanner scannerJdeux = new Scanner(System.in);



        do {
            nb_Partie++;
             bateauxCoulesJun = new boolean[5];
             bateauxCoulesJdeux = new boolean[5];

            nbTouchePorteAvionJun = 0 ;
            nbToucheCroiseurJun = 0 ;
            nbToucheSousMarinJun = 0 ;
            nbToucheDestroyerJun = 0 ;
            nbToucheTorpilleurJun = 0 ;

            nbTouchePorteAvionJdeux = 0 ;
            nbToucheCroiseurJdeux = 0 ;
            nbToucheSousMarinJdeux = 0 ;
            nbToucheDestroyerJdeux = 0 ;
            nbToucheTorpilleurJdeux = 0;
            listeTirsJun.clear();
            listeTouchesCoulesJun.clear();
            listeTirsJdeux.clear();
            listeTouchesCoulesJdeux.clear();

            nb_tir_Jdeux = 0;
            nb_ToucheCoule_Jdeux = 0;
            nb_Tir_Jun = 0;
            nb_Touche_Coule_Jun = 0;

            tir_X_Jun = 0 ;
            tir_Y_Jun = 0 ;
            tir_X_Jdeux = 0 ;
            tir_Y_Jdeux = 0 ;

            long debutJeu = Instant.now().getEpochSecond();
            System.out.println("Pseudo joueur 1 : ");
            pseudoJun = scannerJun.next();

            System.out.println("Pseudo joueur 2 : ");
            pseudoJdeux = scannerJdeux.next();

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

            System.out.println(pseudoJun + " : Placement porte Avions");
            coordonnees = demandeCoordonnees(scannerJun, tailleGrille);
            int x_PA_Jun = coordonnees[0];
            int y_PA_Jun = coordonnees[1];
            String orientation = demandeOrientation(scannerJun);
            while (!estCoordonneeValide(grilleJun, x_PA_Jun, y_PA_Jun, tailleCR, orientation)) {
                coordonnees = demandeCoordonnees(scannerJun, tailleGrille);
                x_PA_Jun = coordonnees[0];
                y_PA_Jun = coordonnees[1];
                orientation = demandeOrientation(scannerJun);
            }
            placerBateau(grilleJun, porteAvions, x_PA_Jun, y_PA_Jun, taillePA, orientation, tailleGrille);

            //-------------------------------------------J1 : Placer le Croiseur-----------------------------------------
            System.out.println(pseudoJun + " : Placement du croiseur");
            coordonnees = demandeCoordonnees(scannerJun, tailleGrille);
            int x_CR_Jun = coordonnees[0];
            int y_CR_Jun = coordonnees[1];
            orientation = demandeOrientation(scannerJun);
            while (!estCoordonneeValide(grilleJun, x_CR_Jun, y_CR_Jun, tailleCR, orientation)) {
                coordonnees = demandeCoordonnees(scannerJun, tailleGrille);
                x_CR_Jun = coordonnees[0];
                y_CR_Jun = coordonnees[1];
                orientation = demandeOrientation(scannerJun);
            }
            placerBateau(grilleJun, croiseur, x_CR_Jun, y_CR_Jun, tailleCR, orientation, tailleGrille);
            System.out.println('\n');
            //---------------------------------- J1 : PLacement Sous-Marin : 3 cases---------------------------------------------
            coordonnees = demandeCoordonnees(scannerJun, tailleGrille);
            int x_SM_Jun = coordonnees[0];
            int y_SM_Jun = coordonnees[1];
            orientation = demandeOrientation(scannerJun);
            while (!estCoordonneeValide(grilleJun, x_SM_Jun, y_SM_Jun, tailleSM, orientation)) {
                coordonnees = demandeCoordonnees(scannerJun, tailleGrille);
                x_SM_Jun = coordonnees[0];
                y_SM_Jun = coordonnees[1];
                orientation = demandeOrientation(scannerJun);
            }
            placerBateau(grilleJun, sousMarin, x_SM_Jun, y_SM_Jun, tailleSM, orientation, tailleGrille);

            System.out.println('\n');
            //------------------------------------------J1 : Placement Destroyer : 3 cases --> Destroyer--------------------------------------------
            coordonnees = demandeCoordonnees(scannerJun, tailleGrille);
            int x_DE_Jun = coordonnees[0];
            int y_DE_Jun = coordonnees[1];
            orientation = demandeOrientation(scannerJun);
            while (!estCoordonneeValide(grilleJun, x_DE_Jun, y_DE_Jun, tailleDestroyer, orientation)) {
                coordonnees = demandeCoordonnees(scannerJun, tailleGrille);
                x_DE_Jun = coordonnees[0];
                y_DE_Jun = coordonnees[1];
                orientation = demandeOrientation(scannerJun);
            }
            placerBateau(grilleJun, destroyer, x_DE_Jun, y_DE_Jun, tailleDestroyer, orientation, tailleGrille);

            System.out.println('\n');
            //-----------------------------------J1 : Placement torpilleur : 2 cases----------------------------------------------
            coordonnees = demandeCoordonnees(scannerJun, tailleGrille);
            int x_TOR_Jun = coordonnees[0];
            int y_TOR_Jun = coordonnees[1];
            orientation = demandeOrientation(scannerJun);
            while (!estCoordonneeValide(grilleJun, x_TOR_Jun, y_TOR_Jun, tailleCR, orientation)) {
                coordonnees = demandeCoordonnees(scannerJun, tailleGrille);
                x_TOR_Jun = coordonnees[0];
                y_TOR_Jun = coordonnees[1];
                orientation = demandeOrientation(scannerJun);
            }
            placerBateau(grilleJun, torpilleur, x_TOR_Jun, y_TOR_Jun, tailleTorp, orientation, tailleGrille);

            System.out.println('\n');
            //------------------------------J2 : Placer le Porte Avions-----------------------------------------------------------
            System.out.println(pseudoJdeux + " : Placement porte Avions");
            coordonnees = demandeCoordonnees(scannerJun, tailleGrille);
            int x_PA_Jdeux = coordonnees[0];
            int y_PA_Jdeux = coordonnees[1];
            orientation = demandeOrientation(scannerJdeux);
            while (!estCoordonneeValide(grilleJdeux, x_PA_Jdeux, y_PA_Jdeux, taillePA, orientation)) {
                coordonnees = demandeCoordonnees(scannerJun, tailleGrille);
                x_PA_Jdeux = coordonnees[0];
                y_PA_Jdeux = coordonnees[1];
                orientation = demandeOrientation(scannerJdeux);
            }
            placerBateau(grilleJdeux, porteAvions, x_PA_Jdeux, y_PA_Jdeux, taillePA, orientation, tailleGrille);

            System.out.println('\n');
            //-------------------------------------------J2 : Placer le Croiseur-----------------------------------------
            System.out.println(pseudoJdeux + " : Placement du croiseur");
            coordonnees = demandeCoordonnees(scannerJun, tailleGrille);
            int x_CR_Jdeux = coordonnees[0];
            int y_CR_Jdeux = coordonnees[1];
            orientation = demandeOrientation(scannerJdeux);
            while (!estCoordonneeValide(grilleJdeux, x_CR_Jdeux, y_CR_Jdeux, tailleCR, orientation)) {
                coordonnees = demandeCoordonnees(scannerJun, tailleGrille);
                x_CR_Jdeux = coordonnees[0];
                y_CR_Jdeux = coordonnees[1];
                orientation = demandeOrientation(scannerJdeux);
            }
            placerBateau(grilleJdeux, croiseur, x_CR_Jdeux, y_CR_Jdeux, tailleCR, orientation, tailleGrille);

            System.out.println('\n');
            //---------------------------------- J2 : PLacement Sous-Marin : 3 cases---------------------------------------------
            coordonnees = demandeCoordonnees(scannerJun, tailleGrille);
            int x_SM_Jdeux = coordonnees[0];
            int y_SM_Jdeux = coordonnees[1];
            orientation = demandeOrientation(scannerJdeux);
            while (!estCoordonneeValide(grilleJdeux, x_SM_Jdeux, y_SM_Jdeux, tailleSM, orientation)) {
                coordonnees = demandeCoordonnees(scannerJdeux, tailleGrille);
                x_SM_Jdeux = coordonnees[0];
                y_SM_Jdeux = coordonnees[1];
                orientation = demandeOrientation(scannerJdeux);
            }
            placerBateau(grilleJdeux, sousMarin, x_SM_Jdeux, y_SM_Jdeux, tailleSM, orientation, tailleGrille);

            System.out.println('\n');

            //------------------------------------------J2 : Placement Destroyer : 3 cases--------------------------------------------
            coordonnees = demandeCoordonnees(scannerJun, tailleGrille);
            int x_DES_Jdeux = coordonnees[0];
            int y_DES_Jdeux = coordonnees[1];
            orientation = demandeOrientation(scannerJdeux);
            while (!estCoordonneeValide(grilleJdeux, x_DES_Jdeux, y_DES_Jdeux, tailleDestroyer, orientation)) {
                coordonnees = demandeCoordonnees(scannerJdeux, tailleGrille);
                x_DES_Jdeux = coordonnees[0];
                y_DES_Jdeux = coordonnees[1];
                orientation = demandeOrientation(scannerJdeux);
            }
            placerBateau(grilleJdeux, destroyer, x_DES_Jdeux, y_DES_Jdeux, tailleDestroyer, orientation, tailleGrille);


            System.out.println('\n');

            //-----------------------------------J2 : Placement torpilleur : 2 cases----------------------------------------------
            coordonnees = demandeCoordonnees(scannerJun, tailleGrille);
            int x_TORP_Jdeux = coordonnees[0];
            int y_TORP_Jdeux = coordonnees[1];
            orientation = demandeOrientation(scannerJdeux);
            while (!estCoordonneeValide(grilleJdeux, x_TORP_Jdeux, y_TORP_Jdeux, tailleTorp, orientation)) {
                coordonnees = demandeCoordonnees(scannerJdeux, tailleGrille);
                x_TORP_Jdeux = coordonnees[0];
                y_TORP_Jdeux = coordonnees[1];
                orientation = demandeOrientation(scannerJdeux);
            }
            placerBateau(grilleJdeux, torpilleur, x_TORP_Jdeux, y_TORP_Jdeux, tailleTorp, orientation, tailleGrille);

            System.out.println('\n');

            //----------------------------------------------Choix tirs-----------------------------------------------------
            while (true) {
                //------------------------------------Tour J1---------------------------------------------------------------
                System.out.println("(Tir " + pseudoJun + ")");
                int[] coordonnes_Tir = demandeCoordonnees(scannerJun, tailleGrille);
                tir_X_Jun = coordonnes_Tir[0];
                tir_Y_Jun = coordonnes_Tir[1];

                while (!estTirValide(grilleJdeux, tir_X_Jun, tir_Y_Jun)) {
                    coordonnees = demandeCoordonnees(scannerJdeux, tailleGrille);
                    tir_X_Jun = coordonnees[0];
                    tir_Y_Jun = coordonnees[1];
                }

                listeTirsJun.add("[" + tir_X_Jun + "]\t");
                listeTirsJun.add("[" + tir_Y_Jun + "]\t\n");

                //contientBateau()  Porte-Avion
                if (contientBateau(grilleJdeux, tir_X_Jun, tir_Y_Jun, "Porte-Avions")) {
                    System.out.println("Touché\n");
                    grilleJdeux[tir_X_Jun][tir_Y_Jun].equals("  ~  ");
                    nbTouchePorteAvionJun++;
                    listeTouchesCoulesJun.add("[" + tir_X_Jun + "]\t");
                    listeTouchesCoulesJun.add("[" + tir_Y_Jun + "]\t\n");
                    if (nbTouchePorteAvionJun == 5) {
                        bateauxCoulesJdeux[0] = true ;
                        System.out.println("Porte-Avion coulé !\n");
                    }
                }


                //Croiseur
                else if (contientBateau(grilleJdeux, tir_X_Jun, tir_Y_Jun, "Croiseur")) {
                    System.out.println("Touché\n");
                    nbToucheCroiseurJun++;
                    grilleJdeux[tir_X_Jun][tir_Y_Jun].equals("  ~  ");
                    listeTouchesCoulesJun.add("[" + tir_X_Jun + "]\t");
                    listeTouchesCoulesJun.add("[" + tir_Y_Jun + "]\t\n");
                    if (nbToucheCroiseurJun == 4) {
                        bateauxCoulesJdeux[1]  = true ;
                        System.out.println("Croiseur coulé !\n");
                    }
                } else if (contientBateau(grilleJdeux, tir_X_Jun, tir_Y_Jun, "Sous-marin")) {
                    System.out.println("Touché \n");
                    nbToucheSousMarinJun++;
                    listeTouchesCoulesJun.add("[" + tir_X_Jun + "]\t");
                    listeTouchesCoulesJun.add("[" + tir_Y_Jun + "]\t\n");
                    if (nbToucheSousMarinJun == 3) {
                        bateauxCoulesJdeux[2]  = true ;
                        System.out.println("Sous-Marin coulé !\n");
                    }
                } else if (contientBateau(grilleJdeux, tir_X_Jun, tir_Y_Jun, "Destroyer")) {
                    System.out.println("Touché\n");
                    nbToucheDestroyerJun++;
                    listeTouchesCoulesJun.add("[" + tir_X_Jun + "]\t");
                    listeTouchesCoulesJun.add("[" + tir_Y_Jun + "]\t\n");
                    if (nbToucheDestroyerJun == 3) {
                        bateauxCoulesJdeux[3] = true ;
                        System.out.println("Destroyer coulé !\n");
                    }
                } else if (contientBateau(grilleJdeux, tir_X_Jun, tir_Y_Jun, "Torpilleur")) {
                    System.out.println("Touché\n");
                    nbToucheTorpilleurJun++;
                    listeTouchesCoulesJun.add("[" + tir_X_Jun + "]\t");
                    listeTouchesCoulesJun.add("[" + tir_Y_Jun + "]\t\n");
                    if (nbToucheTorpilleurJun == 2) {
                        bateauxCoulesJdeux[4] = true ;
                        System.out.println("Torpilleur coulé !\n");
                    }
                } else {
                    System.out.println("EAU");
                }

                if (tousBateauxCoules(bateauxCoulesJdeux)) {
                    victoireJun = true;
                    System.out.println(pseudoJun + " a gagné \n");
                    nb_Victoire_Jun++;
                    nb_Defaite_Jdeux++;
                    listeVainqueurs.add(pseudoJun);
                    listePerdants.add(pseudoJdeux);
                    break;
                }
                System.out.println("Bateaux coulés joueur 1 : " + Arrays.toString(bateauxCoulesJun));
                System.out.println("Bateaux coulés joueur 2 : " + Arrays.toString(bateauxCoulesJdeux));
                afficherGrille(grilleJun);
                System.out.println("--------------------------------------------------------------");
                afficherGrille(grilleJdeux);
                //-------------------------------------Tour J2-------------------------------------------------
                System.out.println("(Tir " + pseudoJdeux + ")");
                coordonnees = demandeCoordonnees(scannerJdeux, tailleGrille);
                tir_X_Jdeux = coordonnees[0];
                tir_Y_Jdeux = coordonnees[1];


                while (!estTirValide(grilleJun, tir_X_Jdeux, tir_Y_Jdeux)) {
                    coordonnees = demandeCoordonnees(scannerJdeux, tailleGrille);
                    tir_X_Jdeux = coordonnees[0];
                    tir_Y_Jdeux = coordonnees[1];
                }

                listeTirsJdeux.add("[" + tir_X_Jdeux + "]\t");
                listeTirsJdeux.add("[" + tir_Y_Jdeux + "]\t\n");

                //contientBateau()
                if (contientBateau(grilleJun, tir_X_Jdeux, tir_Y_Jdeux, "Porte-Avions")) {
                    System.out.println("Touché\n");
                    nbTouchePorteAvionJdeux++;
                    listeTouchesCoulesJdeux.add("[" + tir_X_Jdeux + "]\t");
                    listeTouchesCoulesJdeux.add("[" + tir_Y_Jdeux + "]\t\n");
                    if (nbTouchePorteAvionJdeux == 5) {
                        System.out.println("Porte-Avion coulé !\n");
                        bateauxCoulesJun[0] = true ;
                    }
                }


                //Croiseur
                else if (contientBateau(grilleJun, tir_X_Jdeux, tir_Y_Jdeux, "Croiseur")) {
                    System.out.println("Touché\n");
                    nbToucheCroiseurJdeux++;
                    listeTouchesCoulesJdeux.add("[" + tir_X_Jdeux + "]\t");
                    listeTouchesCoulesJdeux.add("[" + tir_Y_Jdeux + "]\t\n");
                    if (nbToucheCroiseurJdeux == 4) {
                        bateauxCoulesJun[1] = true ;
                        System.out.println("Croiseur coulé !\n");
                    }
                } else if (contientBateau(grilleJun, tir_X_Jdeux, tir_Y_Jdeux, "Sous-marin")) {
                    System.out.println("Touché \n");
                    nbToucheSousMarinJdeux++;
                    listeTouchesCoulesJdeux.add("[" + tir_X_Jdeux + "]\t");
                    listeTouchesCoulesJdeux.add("[" + tir_Y_Jdeux + "]\t\n");
                    if (nbToucheSousMarinJdeux == 3) {
                        listeTouchesCoulesJdeux.add("[" + tir_X_Jdeux + "]\t");
                        listeTouchesCoulesJdeux.add("[" + tir_Y_Jdeux + "]\t\n");
                        bateauxCoulesJun[2] = true ;
                        System.out.println("Sous-Marin coulé !\n");
                    }
                } else if (contientBateau(grilleJun, tir_X_Jdeux, tir_Y_Jdeux, "Destroyer")) {
                    System.out.println("Touché\n");
                    nbToucheDestroyerJdeux++;
                    if (nbToucheDestroyerJdeux == 3) {
                        listeTouchesCoulesJdeux.add("[" + tir_X_Jdeux + "]\t");
                        listeTouchesCoulesJdeux.add("[" + tir_Y_Jdeux + "]\t\n");
                        bateauxCoulesJun[3] = true ;
                        System.out.println("Destroyer coulé !\n");
                    }
                } else if (contientBateau(grilleJun, tir_X_Jdeux, tir_Y_Jdeux, "Torpilleur")) {
                    System.out.println("Touché\n");
                    nbToucheTorpilleurJdeux++;
                    listeTouchesCoulesJdeux.add("[" + tir_X_Jdeux + "]\t");
                    listeTouchesCoulesJdeux.add("[" + tir_Y_Jdeux + "]\t\n");
                    if (nbToucheTorpilleurJdeux == 2) {
                        listeTouchesCoulesJdeux.add("[" + tir_X_Jdeux + "]\t");
                        listeTouchesCoulesJdeux.add("[" + tir_Y_Jdeux + "]\t\n");
                        bateauxCoulesJun[4] = true ;
                        System.out.println("Torpilleur coulé !\n");
                    }
                } else {
                    System.out.println("Eau");
                }

                if (tousBateauxCoules(bateauxCoulesJun)) {
                    victoireJdeux = true;
                    System.out.println(pseudoJdeux + " a gagné \n");
                    nb_Victoire_Jdeux++;
                    nb_Defaite_Jun++;
                    listeVainqueurs.add(pseudoJdeux);
                    listePerdants.add(pseudoJun);
                    break;
                }
                System.out.println("Bateaux coulés joueur 1 : " + Arrays.toString(bateauxCoulesJun));
                System.out.println("Bateaux coulés joueur 2 : " + Arrays.toString(bateauxCoulesJdeux));
                afficherGrille(grilleJun);
                System.out.println("--------------------------------------");
                afficherGrille(grilleJdeux);
            }



            long finJeu = Instant.now().getEpochSecond();
            long totalSecondes = finJeu - debutJeu;
            int heures = (int) totalSecondes / 3600;
            int minutes = (int) (totalSecondes % 3600) / 60;
            int secondes = (int) totalSecondes % 60;

            System.out.print('\n');

            System.out.println("Historique des tirs effectués du joueur 1 : ");
            for (Object coordTirJun : listeTirsJun) {
                countLigneListe++;
                System.out.print(coordTirJun);
                if (countLigneListe % 2 == 0) {
                    System.out.print('\n');
                    nb_Tir_Jun++;

                }
            }
            System.out.print('\n');
            System.out.println("Historique des touchés/coules effectués du joueur 1 : ");
            for (Object coordToucheCouleJun : listeTouchesCoulesJun) {
                countLigneListe++;
                System.out.print(coordToucheCouleJun);
                if (countLigneListe % 2 == 0) {
                    System.out.print('\n');
                    nb_Touche_Coule_Jun++;
                }
            }
            System.out.print('\n');

            System.out.println("--------------------------------");
            System.out.println("Historique des tirs effectués du joueur 2 : ");
            for (Object coordTirJdeux : listeTirsJdeux) {
                countLigneListe++;
                System.out.print(coordTirJdeux);
                if (countLigneListe % 2 == 0) {
                    System.out.print('\n');
                    nb_tir_Jdeux++;
                }
            }
            System.out.print('\n');
            System.out.println("Historique des touches/coules effectués du joueur 2 : ");
            for (Object coordToucheCouleJdeux : listeTouchesCoulesJdeux) {
                countLigneListe++;
                System.out.print(coordToucheCouleJdeux);
                if (countLigneListe % 2 == 0) {
                    System.out.print('\n');
                    nb_ToucheCoule_Jdeux++;
                }
            }
            System.out.println("-----------------Statistiques-------------------------------------------- ");

            for (Object vainqueur : listeVainqueurs) {
                for (Object perdant : listePerdants) {
                    System.out.println("Vainqueur : " + vainqueur);
                    System.out.println("Perdant : " + perdant);
                }
                    System.out.println("Durée de la partie " + (nb_Partie) + " : "
                            + heures + " heures " + minutes + " minutes " + secondes + " secondes");
                }
            System.out.println(pseudoJun.toUpperCase());
            System.out.println("NOmbre de tirs : " + nb_Tir_Jun);
            System.out.println("Nombre de touche/coule : " + nb_Touche_Coule_Jun);
            float ratioJun = (float) nb_Touche_Coule_Jun / (nb_Tir_Jun);
            System.out.println("Ratio précision tir : " + (ratioJun * 100) + "%");

            System.out.println('\n');

            System.out.println(pseudoJdeux.toUpperCase());
            System.out.println("NOmbre de tirs : " + nb_tir_Jdeux);
            System.out.println("Nombre de touche/coule : " + nb_ToucheCoule_Jdeux);
            float ratioJdeux = (float) nb_ToucheCoule_Jdeux / nb_tir_Jdeux;
            System.out.println("Ratio précision tir : " + (ratioJdeux * 100) + "%");

            System.out.println("Voulez-vous rejouer ? (oui/non) : ");
            reponseJun = scannerJun.next();
            if (reponseJun.equals("non")) {
                rejouer = false; // Fin du jeu
            }
        }
        while(reponseJun.equals("oui"));
    }





    public static boolean ajouteCoordonnees(String[][] grille, int x, int y, String orientation, int taille, String[] sections) {
        // Vérification des limites et disponibilité des cases
        if (orientation.equals("H")) {
            for (int i = 0; i < taille; i++) {
                if (y + i >= grille[0].length || !grille[x][y + i].equals("  ~  ")) {
                    System.out.println("Impossible de placer le bateau horizontalement. Case occupée ou hors limites à [" + x + "][" + (y + i) + "].");
                    return false;
                }
            }
        } else if (orientation.equals("V")) {
            for (int i = 0; i < taille; i++) {
                if (x + i >= grille.length || !grille[x + i][y].equals("  ~  ")) {
                    System.out.println("Impossible de placer le bateau verticalement. Case occupée ou hors limites à [" + (x + i) + "][" + y + "].");
                    return false;
                }
            }
        } else {
            System.out.println("Orientation invalide. Utilisez 'H' pour horizontal ou 'V' pour vertical.");
            return false;
        }

        // Placement du bateau
        if (orientation.equals("H")) {
            for (int i = 0; i < taille; i++) {
                grille[x][y + i] = sections[i];
            }
        } else if (orientation.equals("V")) {
            for (int i = 0; i < taille; i++) {
                grille[x + i][y] = sections[i];
            }
        }

        System.out.println("Bateau ajouté avec succès !");
        return true;
    }


    public static void placerBateau(String[][] grille, String[] bateau, int x, int y, int tailleBateau, String orientation, int tailleGrille) {
        // Vérification si l'espace est libre pour le bateau (selon l'orientation)
        if (orientation.equals("H")) { // Placer horizontalement
            // Vérifier si le bateau peut être placé horizontalement sans dépasser la grille
            if (y + tailleBateau > tailleGrille) {
                System.out.println("Le bateau ne tient pas horizontalement !");
                return; // Le bateau ne peut pas être placé
            }

            // Vérifier si les cases sont libres
            for (int i = 0; i < tailleBateau; i++) {
                if (!grille[x][y + i].equals("  ~  ")) { // Vérifie si la case est vide
                    System.out.println("Espace occupé !");

                }
            }

            // Placer le bateau horizontalement dans la grille
            for (int i = 0; i < tailleBateau; i++) {
                grille[x][y + i] = bateau[i]; // Placer le bateau dans la case
            }

        } else if (orientation.equals("V")) { // Placer verticalement
            // Vérifier si le bateau peut être placé verticalement sans dépasser la grille
            if (x + tailleBateau > tailleGrille) {
                System.out.println("Le bateau ne tient pas verticalement !");
                return; // Le bateau ne peut pas être placé
            }

            // Vérifier si les cases sont libres
            for (int i = 0; i < tailleBateau; i++) {
                if (!grille[x + i][y].equals("  ~  ")) { // Vérifie si la case est vide
                    System.out.println("Espace occupé !");
                    return; // Si une case est déjà occupée, on ne peut pas placer le bateau
                }
            }

            // Placer le bateau verticalement dans la grille
            for (int i = 0; i < tailleBateau; i++) {
                grille[x + i][y] = bateau[i]; // Placer le bateau dans la case
            }

        } else {
            System.out.println("Orientation invalide !");
            return; // Orientation invalide
        }

        System.out.println("Bateau placé avec succès !");
    }


    public static int[] demandeCoordonnees(Scanner scanner, int tailleGrille) {
        int x, y;

            System.out.print("Entrez la coordonnée X (ligne, entre 0 et " + (tailleGrille - 1) + "): ");
            x = scanner.nextInt();

            System.out.print("Entrez la coordonnée Y (colonne, entre 0 et " + (tailleGrille - 1) + "): ");
            y = scanner.nextInt();

            // Vérification des limites
            if (x < 0 || x >= tailleGrille || y < 0 || y >= tailleGrille) {
                System.out.println("Les coordonnées doivent être entre 0 et " + (tailleGrille - 1) + ". Réessayez.");

            System.out.println("Entrée invalide. Veuillez entrer des nombres entiers.");
            scanner.nextLine();
        }
        return new int[]{x, y};
    }

    public static boolean estCoordonneeValide(String[][] grille, int x, int y, int tailleBateau, String orientation) {
        // Vérification des coordonnées
        if (x < 0 || x >= grille.length || y < 0 || y >= grille[0].length) {
            System.out.println("Coordonnée en dehors de la grille !");
            return false;
        }

        // Vérification de l'orientation et de l'espace disponible pour le bateau
        if (orientation.equals("H")) { // Placement horizontal
            if (y + tailleBateau > grille[0].length) {
                System.out.println("Le bateau dépasse de la grille !");
                return false;
            }
            for (int i = 0; i < tailleBateau; i++) {
                if (!grille[x][y + i].equals("  ~  ")) { // Si la case est occupée
                    System.out.println("L'emplacement est déjà occupé à la position (" + x + ", " + (y + i) + ") !");
                    return false;
                }
            }
        } else if (orientation.equals("V")) { // Placement vertical
            if (x + tailleBateau > grille.length) {
                System.out.println("Le bateau dépasse de la grille !");
                return false;
            }
            for (int i = 0; i < tailleBateau; i++) {
                if (!grille[x + i][y].equals("  ~  ")) { // Si la case est occupée
                    System.out.println("L'emplacement est déjà occupé à la position (" + (x + i) + ", " + y + ") !");
                    return false;
                }
            }
        } else {
            System.out.println("Orientation invalide !");
            return false;
        }

        return true; // Les coordonnées sont valides
    }

    public static boolean estTirValide(String[][] grille, int x, int y) {
        // Vérification des coordonnées
        if (x < 0 || x >= grille.length || y < 0 || y >= grille[0].length) {
            System.out.println("Coordonnée en dehors de la grille !");
            return false;

        }
        return true ;
    }

    public static String demandeOrientation(Scanner scanner) {
        System.out.println("Veuillez choisir l'orientation : ");
        return scanner.next();
    }

    public static void afficherGrille(String[][] grille) {
        for (int i = 0; i < grille.length; i++) {
            for (int j = 0; j < grille[i].length; j++) {
                System.out.print(grille[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static boolean contientBateau(String grille[][], int x, int y, String bateau) {
        if (bateau.equals("Porte-Avions")) {
            if (grille[x][y].equals("PO")) {
                grille[x][y] = "  ~  ";
                return true;
            }
            if (grille[x][y].equals("RT")) {
                grille[x][y] = "  ~  ";
                return true;
            }
            if (grille[x][y].equals("E")) {
                grille[x][y] = "  ~  ";
                return true;
            }
            if (grille[x][y].equals("AV")) {
                grille[x][y] = "  ~  ";
                return true;
            }
            if (grille[x][y].equals("ION")) {
                grille[x][y] = "  ~  ";
                return true;
            }
        } else if (bateau.equals("Croiseur")) {
            if (grille[x][y].equals("CR")) {
                grille[x][y] = "  ~  ";
                return true;
            }
            if (grille[x][y].equals("OI")) {
                grille[x][y] = "  ~  ";
                return true;
            }
            if (grille[x][y].equals("SE")) {
                grille[x][y] = "  ~  ";
                return true;
            }
            if (grille[x][y].equals("UR")) {
                grille[x][y] = "  ~  ";
                return true;
            }
        } else if (bateau.equals("Sous-marin")) {
            if (grille[x][y].equals("SOUS")) {
                grille[x][y] = "  ~  ";
                return true;
            }
            if (grille[x][y].equals("MA")) {
                grille[x][y] = "  ~  ";
                return true;
            }
            if (grille[x][y].equals("RIN")) {
                grille[x][y] = "  ~  ";
                return true;
            }
        } else if (bateau.equals("Destroyer")) {
            if (grille[x][y].equals("DE")) {
                grille[x][y] = "  ~  ";
                return true;
            }
            if (grille[x][y].equals("STR")) {
                grille[x][y] = "  ~  ";
                return true;
            }
            if (grille[x][y].equals("OYER")) {
                grille[x][y] = "  ~  ";
                return true;
            }
        } else if (bateau.equals("Torpilleur")) {
            if (grille[x][y].equals("TOR")) {
                grille[x][y] = "  ~  ";
                return true;
            }
            if (grille[x][y].equals("PILLEUR")) {
                grille[x][y] = "  ~  ";
                return true;
            }
        }
        return false;
    }

    public static boolean tousBateauxCoules(boolean[] bateauxCoules) {
        for (boolean coule : bateauxCoules) {
            if (!coule) { // Si un bateau n'est pas coulé, retournez false
                return false;
            }
        }
        return true; // Tous les bateaux sont coulés
    }

}






