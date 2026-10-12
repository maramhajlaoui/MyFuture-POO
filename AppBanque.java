import java.util.Scanner;

public class AppBanque {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cin;
        String nom;
        String prenom;
        int nCompte;
        final double plafondRetrait = 500.00;

        System.out.println("Veuillez saisir le CIN :");
        cin = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Veuillez saisir le nom :");
        nom = scanner.nextLine();

        System.out.println("Veuillez saisir le prenom :");
        prenom = scanner.nextLine();

        System.out.println("Veuillez saisir le numero de compte :");
        nCompte = scanner.nextInt();

        int choix;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Consulter compte");
            System.out.println("2. Quitter");
            System.out.print("Saisissez votre choix : ");

            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("Nom : " + nom);
                    System.out.println("Prenom : " + prenom);
                    System.out.println("CIN : " + cin);
                    System.out.println("N° compte : " + nCompte);
                    System.out.println("Plafond retrait : " + plafondRetrait);
                    break;
                case 2:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez reessayer.");
            }

        } while (choix != 2);

        scanner.close();
    }
}