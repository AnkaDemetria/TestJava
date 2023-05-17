public class Cat {
    
    public Cat(String name, int age, boolean vaccin, String action){
        System.out.println("Je suis le chat " + this); //va générer un universally unique identifiers (UUIDs) qui commence par @
        // this pour l'appeler lui même pour rappeler son contexte, this c'est le contexte ça dit à l'instance (objet qui va utiliser cette méthode) qu'on va utiliser cet objet
        // Instancier une classe consiste à créer un objet sur son modèle
        
        //Le constructeur :ce qui va permettre de construire chaque nouvelle instance en partant de la même base, un modèle/patron pour créer une instance de l'objet
        // Un constructeur est une méthode qui a la particularité de posséder le même nom que la classe à laquelle il appartient.
        //On met majuscule à la classe et à la méthode (sauf la méthode main)
        
        //DANS LE FICHIER APP.JAVA: on crée une instance de la classe chat, qui s'appelle tom et exécute la méthode Cat
        
        // Chaque instance chat aura un espace alloué (un emplacement mémoire dans java) représenté par un identifiant unique par objet et qui commence par @
        this.mName = name;
        this.mAge = age;
        this.mVaccin = vaccin;
        this.mAction = action;
        // on doit les placer plus hauts en arguments dans les parenthèses de la méthode pour qu'ils soient reconnus, et avec leur type
        
        // PREMIERE SOLUTION AVEC UN IF ( il faut rappeler le contexte avec this.mVaccin)
        // if(this.mVaccin)
        // System.out.println("Bonjour je m'appelle " + this.mName + " je suis un chat de " + this.mAge + " ans, Je suis vacciné");
        // else
        // System.out.println("Bonjour je m'appelle " + this.mName + " je suis un chat de " + this.mAge + " ans, Je ne suis pas vacciné");
        
        // DEUXIEME SOLUTION AVEC UNE TERNAIRE
        // System.out.println("Bonjour je m'appelle " + this.mName + " je suis un chat de " + this.mAge + " ans," +(this.mVaccin ? "Je suis vacciné" : " Je ne suis pas vacciné"));
    }
    
    private int mAge;

    public int getAge(){
            return mAge;
        }
    public void setmAge(int mAge) {
        this.mAge = mAge;
    }

    private String mName;

    public String getName(){
            return mName;
        }
    public void setmName(String mName) {
        this.mName = mName;
    }

    private boolean mVaccin;

    public boolean getVaccin(){
            return mVaccin;
        }
    public void setmVaccin(boolean mVaccin) {
        this.mVaccin = mVaccin;
}

    private String mAction;
    
    public String getAction(){
            return mAction;
        }
    public void setmAction(String mAction) {
        this.mAction = mAction;
    }

        // L'encapsulation : c est la visibilité ou la non visibilité des attributs et aussi desz données en dehors de la classe(en mettant public les variables ne sont visibles que dans la classe de ce fichier, mais elles seront non visibles si on les met dans le fichier App.java)Mais si on met public, les attributs sont visibles partout.
}

// L ACCESSIBILITE
// LES ACCESSEURS (getters en anglais)
// Un accesseur est une méthode permettant de récupérer le contenu d'une donnée membre protégée. Un accesseur, pour accomplir sa fonction :
// doit avoir comme type de retour le type de la variable à renvoyer
// ne doit pas nécessairement posséder d'arguments
// Une convention de nommage veut que l'on fasse commencer de façon préferrentielle le nom de l'accesseur par le préfixe get, afin de faire ressortir sa fonction première.
// les getters ont le modificateur d'accès public, ce qui signifie qu'ils sont disponibles depuis n'importe où dans le programme.

// Mais qu'en est-il de l'affectation de valeurs ? C'est à cela que les méthodes setter servent.
