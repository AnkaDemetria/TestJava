<u>**CREATION FICHIER JAVA**</u>
public class App {
    public static void main(String[] args) {}
}

// Une classe est un objet.On commence par déclarer la portée de la classe: public (private= quand c'est accessible seulement dans ce fichier là.) puis le mot clé "classe" qui nous permet de construire un objet comme une classe, puis le nom de classe, et accolade car c'est un objet. 

// La machine va chercher le point d'entrée de la classe, on définit la méthode cette fois-ci: public pour la portée et static car ça ne doit pas bouger (l'héritage des classes ne bouge pas), 3eme mot: le type (méthode sera de type void:aucun type, différent de any:tous les types mais c'est à éviter), 4eme mot : le nom de la méthode (main). (Il vaut mieux éviter any, et mêem void mais on utilise void avec la méthode main.)

// Puis les parenthèses vont contenir un tableau de type string qui contiendra des arguments, puis accolades pour les instructions



<u>**LA NOTION D'ACCESSIBILITE**</u>

**public :** un élément public est accessible de partout et sans aucune restriction. Certaines classes (comme la classe principale main) doivent obligatoirement être déclarées publiques (pour pouvoir exécuter l'application...)

**protected :** un élément protected (protégé) est accessible uniquement aux classes d'un package et à ses classes filles

**private :** un élément private (privé) est accessible uniquement au sein de la classe dans laquelle il est déclaré. Ces éléments ne peuvent être manipulés qu'à l'aide de méthode spécifiques appelés accesseur et mutateur


<u>**LES MUTATEURS(SETTERS) ET LES ACCESSEURS (GETTERS)**</u>

Les accesseurs et les mutateurs sont utilisés pour protéger les données, particulièrement lorsqu'on crée des classes.
Par convention, la première lettre du nom de la variable est en majuscule

**La méthode getter** renvoie **la valeur** de l'attribut. 
Un accesseur est une méthode permettant de récupérer le contenu d'une donnée membre protégée. Un accesseur, pour accomplir sa fonction :
* doit avoir comme type de retour le type de la variable à renvoyer
* ne doit pas nécessairement posséder d'arguments
* commence par le mot "get"

```
private String couleur;
public String getCouleur() {
    return couleur;
  }
```
  
**La méthode setter** prend un paramètre et l'attribue à l'attribut/**définit ou met à jour sa valeur**
Un mutateur est une méthode permettant de modifier le contenu d'une donnée membre protégée. Un mutateur, pour accomplir sa fonction :
* doit avoir comme paramètre la valeur à assigner à la donnée membre. Le paramètre doit donc être du type de la donnée membre
* ne doit pas nécessairement renvoyer de valeur (il possède dans sa plus simple expression le type void)
* commence par le mot "set"

```
private String couleur;
public void setCouleur(String c) {
    this.couleur = c;
```



<u>**LES VARIABLES D INSTANCE ET LES VARIABLES DE CLASSE**</u>

le static permet de dire que c est accessible depuis l'extérieur du constructeur, ça permet de créer des variables de classe.
objet est une instance d 'une classe
Des objets qui partagent des valeurs communes: on va créer une variable de classe (variable de classe est partagée par tous le sobjets d'une même classe) c'est différent d'une variable d'instance qui est spécifique à un objet. On ne va donc plus créer une variable à chaque fois qu'on va créer un objet, chaque nouvelle variable est contenue dans l'objet elle est à part et pas dans le constructeur, mais elle peut etre utilisée par chacune des instances.Variable de classe est partagée par tous les objets de la classe.
// 
// Dans notre exemple, le constructeur est appelé chaque foisqu'on crée une nouvelle instance de la classe abonnement, on va décrémenter la valeur de la variable mLicence.

// **Variable d’instance:**
Les variables d’instance sont déclarées dans une classe, mais en dehors d’une méthode, d’un constructeur ou de tout bloc.
// Les variables d’instance sont créées lorsqu’un objet est créé à l’aide du mot clé « new » et détruites lorsque l’objet est détruit.
// Les variables d’instance sont accessibles directement en appelant le nom de la variable dans la classe. Pourtant, dans les méthodes statiques, elles doivent être appelées en utilisant le nom complet: Object.VariableName.

// **Variable de classe (variable statique):**
// Les variables de classe, également appelées variables statiques, sont déclarées avec le mot clé « static » dans une classe, mais en dehors d’une méthode, d’un constructeur ou d’un bloc.
// Les variables statiques sont créées lors de l’exécution du programme et détruites à l’arrêt du programme.
// Les variables statiques sont accessibles en utilisant le nom de classe: ClassName.VariableName.

**Exemple:**
```
public class MaClasse{
  
   int value;
   // Variable de classe
   static int nbr = 5;
   
   public static void main(String args[]){
      //Variable d'instance
      MaClasse obj = new MaClasse();
      obj.value = 6;
      
      System.out.println("Variable d'instance: "+obj.value);
      System.out.println("Variable de classe: "+MaClasse.nbr);
   }
}
```
 
Sortie:
Variable d'instance: 6
Variable de classe: 5

<u>**FONCTION CONSTRUCTEUR**</u>

this pour l'appeler lui même pour rappeler son contexte, this c'est le contexte ça dit à l'instance (objet qui va utiliser cette méthode) qu'on va utiliser cet objet
Instancier une classe consiste à créer un objet sur son modèle

 Le constructeur :ce qui va permettre de construire chaque nouvelle instance en partant de la même base, un modèle/patron pour créer une instance de l'objet
    Un constructeur est une méthode qui a la particularité de posséder le même nom que la classe à laquelle il appartient.
    On met majuscule à la classe et à la méthode (sauf la méthode main)

**Exemple:**
Dans un fichier APP.JAVA: on crée une instance de la classe chat, qui s'appelle tom et exécute la méthode Cat

```
public class Cat {
    
    public Cat(String name, int age, boolean vaccin, String action){
        System.out.println("Je suis le chat " + this);
        }

        this.mName = name;
        this.mAge = age;
        this.mVaccin = vaccin;
        this.mAction = action;

        /( il faut rappeler le contexte avec this.mVaccin)
        // if(this.mVaccin)
        // System.out.println("Bonjour je m'appelle " + this.mName + " je suis un chat de " + this.mAge + " ans, Je suis vacciné");
        // else
        // System.out.println("Bonjour je m'appelle " + this.mName + " je suis un chat de " + this.mAge + " ans, Je ne suis pas vacciné");

    }
    ```