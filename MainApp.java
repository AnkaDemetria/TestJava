//Pour un commentaire sur une seule ligne

/*
 Pour un commentaire sur plusieurs lignes
 */

 /*
*base numérique: décimale (10 -> 0 à 9)
*                binaire (2 -> 0 à 1)
*                  octale (8 -> 0 à 7)
*                  hexadécimale (16 -> 0 à F)
* nombre entier: 12
                12_333 (12333 pour que ce soit plus lisible)
* binaire -> 0b1100011
*               1_100_011 (peut s'écrire aussi)
*hexadécimale -> 0xFB2333
\n: retour à la ligne
\t: tabulation (crée un espace,2 ou 4 espaces selon organisation de la tabulation)
\r: retour chariot, saut de la ligne
\b: retour arrière
\f: nouvelle page (file)
== (egal en valeur) ===(égal en valeur et en type)
!= (différent de)

comme JS: Pas de caractères spéciaux, pas d'espaces, commence par une lettre ou un underscore (mais pas par un chiffre)
Par convention, on utilise soit kamalcase (maVariable différent pascalcase: MaVariable) soit snakecase (ma_variable différent du kebabacase: ma-variable)
  */


/*public class MainApp 
{
    public static void main(String[] args)
    {
        final float PI = 3.14f;
        System.out.println(PI);
    }
}
*/ 

/* public class MainApp 
{
    public static void main(String[] args)
    {
        long PI = 151525256L ;
        System.out.println(PI);
    }
}
*/

// public class MainApp 
// {
//     public static void main(String[] args)
//     {
//         Boolean PI = true ;
//         System.out.println(PI);
//     }
// }

// public class MainApp 
// {
//     public static void main(String[] args)
//     {
//         int value = 24;
//         if (value != 24){
//         System.out.println(value);//ne renvoie rien car c est différent de
//         }
//     }
// }

// METHODE AVEC DES OPERATEURS DE COMPARAISON ET ET OU
// public class MainApp 
// {
//     public static void main(String[] args)
//     {
//         int age = 18;
//         if (age >= 18 && age > 64){//operateur ET &&, OU ||
//         System.out.println(age);
//         } else{
//             System.out.println("non");
//         }
//     }
// }

// METHODE AVEC DES IF
// public class MainApp 
// {
//     public static void main(String[] args)
//     {
//         int age = 18;
//         if (age >= 18){
//             System.out.println("vous êtes majeur");
//             if (age >= 21){
//                 System.out.println("dans tous les pays");
//             }else{
//                 System.out.println("en France");
//             }
//          }else{
//             System.out.println("en France");
//          }
//     }
// }

// METHODE AVEC SWITCH
// public class MainApp 
// {
//     public static void main(String[] args)
//     {
//         int age = 25;
//         String cas = "mineur";

//         if (age >=18) {
//             if (age >= 21) {
//             cas ="majeur absolu";
//             }else{
//             cas ="majeur";
//             }
//         }
    
//         switch (cas) {
//             case "majeur":
//                 System.out.println("vous êtes majeur en france");
//                 break; 
//             case "majeur absolu":
//                 System.out.println("vous êtes majeur partout");
//                 break; 
//             default:
//                 System.out.println("vous êtes mineur");
//                 break;
//         }
//     }
// }

// BOUCLES INFINIES
// public class MainApp 
// {
//     public static void main(String[] args)
//     {
//         int i = 0;
//         while (i != 20){
//         System.out.println(i);
//         i+=2;//condition d arret, à chaque tour on ajoute 2 à i jusqu'à 20 (20 excepté)
//         //break; on peut aussi mettre "break;" comme condition d'arret
//         // si on l'enlève on est dans une boucle infinie
//         }
//     }
// }

// BOUCLE AVEC BREAK COMME CONDITION D ARRET
// public class MainApp 
// {
//     public static void main(String[] args)
//     {
//         int i = 0;
//         while (i != 20){//tant que i différent de 20 alors on renvoie i
//         System.out.println(i);
//         if(i == 10) {
//             break;
//         }
//         i++;//A chaque tour de boucle, j'ajoute 1 à i, et je n'exécute pas le break,jusqu'à i =10
//         //i+=3; si on change et qu'on ajoute de 3, jamais ça ira jusqu'à 10, donc ça renverra une boucle infinie, et l'utilisateur sera bloqué
//         }
//     }
// }

// public class MainApp 
// {
//     public static void main(String[] args)
//     {
//         int i = 0;
//         while (i != 20){//tant que i différent de 20 alors on renvoie i
//         System.out.println(i);
//         if(i == 10) {
//             continue;
//         }
//         i++;//A chaque tour de boucle, ça continue puis ça ajoute 1, mais à partir de 10 ça va revenir au début de la boucle (while i !=20) et aller jusqu'à continue et ça va continuer le code en boucle et afficher 10 mais ça ne lit plus l'incrémentation de 1, dc ça fait des aller retour entre la ligne while et la ligne continue
//         }
//     }
// }

// BOUCLE DO ... while: POUR AFFICHER LES NOMBRES IMPAIRS AVEC MODULO 2
// public class MainApp 
// {
//     public static void main(String[] args)
//     {
//         int i = 0;

//         do {
//             i++;
//             if(i % 2 == 0) {
//                 continue;
//             }
//             System.out.println(i);
//         }
//         while (i != 20);
//         }
//     }

// POUR AFFICHER LES NOMBRES PAIRS AVEC MODULO 2
// public class MainApp 
// {
//     public static void main(String[] args)
//     {
//         int i = 0;

//         do {
//             i++;
//             if(i % 2 != 0) {
//                 continue;
//             }
//             System.out.println(i);
//         }
//         while (i != 20);
//         }
//     }

// METHODE AVEC UTILISATEUR QUI DONNE VALEUR DE I ET LA VALEUR DE FIN(condition d'arret) et on n'affiche que les nombres pairs en évitant de faire une boucle infinie
// import java.util.Scanner;

// public class MainApp 
// {
//     public static void main(String[] args)
//     {
//         Scanner valeurDebut = new Scanner(System.in);
//         System.out.println("Veuillez saisir une valeur de début : ");
//         int ent = valeurDebut.nextInt();
//         Scanner valeurFin = new Scanner(System.in);
//         System.out.println("Veuillez saisir une valeur de fin :");
//         int fin = valeurFin.nextInt();
//         valeurDebut.close();
//         valeurFin.close();

//         if (ent > fin) {
//             System.out.println("la valeur de début doit etre supérieure à celle de fin ");
//         } else {
//             System.out.println("Les chiffres pairs entre ces deux intervalles sont:");
//             do {
//                 ent++;
//                 if(ent % 2 != 0) {
//                     continue;
//                 }
//                 System.out.println(ent);
//             }
//             while (ent != fin);
//         }
//     }
// }

// FAIRE une boucle for
// public class MainApp 
// {
//     public static void main(String[] args)
//     {
//         for (int i = 0; i < 10; i++) {
//             System.out.println(i);
//         }
//     }
// }
// deuxieme façon de faire une boucle for
// public class MainApp 
// {
//     public static void main(String[] args)
//     {
//         int i;
//         for (i = 0; i < 10; i++) {
//             System.out.println(i);
//         }
//     }
// }


