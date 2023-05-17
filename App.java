// Une classe est un objet.On commence par déclarer la portée de la classe: public (private= quand c'est accessible seulement dans ce fichier là.) puis le mot clé "classe" qui nous permet de construire un objet comme une classe, puis le nom de classe, et accolade car c'est un objet. 

// La machine va chercher le point d'entrée de la classe, on définit la méthode cette fois-ci: public pour la portée et static car ça ne doit pas bouger (l'héritage des classes ne bouge pas), 3eme mot: le type (méthode sera de type void:aucun type, différent de any:tous les types mais c'est à éviter), 4eme mot : le nom de la méthode (main). (Il vaut mieux éviter any, et mêem void mais on utilise void avec la méthode main.)

// Puis les parenthèses vont contenir un tableau de type string qui contiendra des arguments, puis accolades pour les instructions

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        // Cat c = new Cat("Tom", 1, true, "miaoww");
        // name(c);
        Cat c1 = new Cat("Felix", 8, false, "miaoww");
        c1.setmVaccin(true);
        name(c1);
    }
//         System.out.println(Abonnement.getLicence());

//         Abonnement a = new Abonnement(10, 2024, "dsi");
//         System.out.println("ref instance : "+ a.getLicence());
//         System.out.println("ref classe : " + Abonnement.getLicence());

//         Abonnement a1 = new Abonnement (10, 2024, "dsi");
//         System.out.println(getLicence());
//     }
// } 

    // public static void name(Cat cat) {
    //     System.out.println("Age du cat : " + cat.mAge);
    //     System.out.println("Nom du cat : " + cat.mName);

    // public static void name(Cat cat) {
    //     // System.out.println("Age du cat : " + cat.getAge());
    //     // System.out.println("Nom du cat : " + cat.getName());
    //     System.out.println(("Bonjour je m'appelle " + cat.getName() + " je suis un chat de " + cat.getAge() + " ans," +(cat.getVaccin() ? "Je suis vacciné" : " Je ne suis pas vacciné")));

    //     Scanner actionChat = new Scanner(System.in);
    //     System.out.println("Voulez-vous que je miaule? (y/n): ");
    //     String rep = actionChat.nextLine();
        
        // if(rep.equals("yes")){
        //         System.out.println(cat.getAction());
        // }else {
        //         System.out.println(" Rrr");
        // }  
        // actionChat.close();
//     }
// }

// DEUXIEME METHODE AVEC UNE BOUCLE DO...WHILE pour demander àl'utilisateur et attendre sa réponse: on commence par mettre 2 variables puis la boucle do...while

    public static void name(Cat cat) {//appel de la méthode "name"
        String question = "Bonjour je m'appelle " + cat.getName() + " je suis un chat de " + cat.getAge() + " ans, " +(cat.getVaccin() ? "Je suis vacciné  " : " Je ne suis pas vacciné") + " Voulez-vous que je miaule? (y/n): ";
        boolean continuePresentation = true;
        do {
            System.out.println(question);
            Scanner saisieUtilisateur = new Scanner(System.in);
            String resp = saisieUtilisateur.next();

        if (resp.equals("y")){
            System.out.println(cat.getAction());
            continuePresentation = false;
            saisieUtilisateur.close();
        } else if(resp.equals("n")) {
            System.out.println("ok, au revoir!");
            continuePresentation = false;
            saisieUtilisateur.close();
        } else {
            question = "Je n'ai pas compris votre réponse. Voulez-vous que je miaule? (y/n)";
            continuePresentation = true;
        }
    } while (continuePresentation);

    }
}
