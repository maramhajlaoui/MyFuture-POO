
import java.util.Scanner;
public class EtudiantPrep {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String nom;
String prenom;
double note1;
double note2;
double moyenne;
int choix;

System.out.print("Entrez le Nom : ");
nom = scanner.nextLine();
System.out.print("Entrez le Prenom : ");
prenom = scanner.nextLine();
System.out.print("Entrez la Note 1 : ");
note1 = scanner.nextDouble();
System.out.print("Entrez la Note 2 : ");
note2 = scanner.nextDouble();

moyenne = (note1 + note2) / 2;

System.out.println("1. Afficher la moyenne");
System.out.println("2. Afficher la mention");
System.out.print("Votre choix : ");
choix = scanner.nextInt();

switch (choix) {
case 1:
System.out.println("Etudiant : " + nom + " " + prenom);
System.out.println("Moyenne : " + moyenne);
break;

case 2:
if (moyenne >= 10) {
System.out.println("Etudiant passable");
} else {
System.out.println("Etudiant non passable");
}
break;

default:
System.out.println("Choix incorrect");
}

scanner.close();
}
}
