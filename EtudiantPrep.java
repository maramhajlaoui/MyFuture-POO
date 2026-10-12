
import java.util.Scanner;
public class EtudiantPrep {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String nom;
String prenom;
double note1;
double note2;
double moyenne;

System.out.print("Entrez le Nom : ");
nom = scanner.nextLine();
System.out.print("Entrez le Prenom : ");
prenom = scanner.nextLine();
System.out.print("Entrez la Note 1 : ");
note1 = scanner.nextDouble();
System.out.print("Entrez la Note 2 : ");
note2 = scanner.nextDouble();

moyenne = (note1 + note2) / 2;

int choix;

do {
System.out.println("\n--- MENU ETUDIANT ---");
System.out.println("1. Afficher la moyenne");
System.out.println("2. Afficher la mention");
System.out.println("3. Quitter");
System.out.print("Votre choix (1-3) : ");
choix = scanner.nextInt();

switch (choix) {
case 1:
System.out.println("Etudiant : " + nom + " " + prenom);
System.out.println("Moyenne : " + moyenne);
break;

case 2:
if (moyenne >= 16) {
System.out.println("Mention : Excellent");
} else if (moyenne >= 14) {
System.out.println("Mention : Bien");
} else if (moyenne >= 10) {
System.out.println("Mention : Passable");
} else {
System.out.println("Mention : Refusable");
}
break;

case 3:
System.out.println("Au revoir !");
break;

default:
System.out.println("Choix incorrect, veuillez choisir entre 1 et 3.");
}
} while (choix != 3);

scanner.close();
}
}
