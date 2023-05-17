// public class Abonnement {
//     public Abonnement(int price, int time, String name) {
//         if(mLicence > 0) {
//             this.mPrice = price;
//             this.mTime = time;
//             this.mName = name;
//             mLicence --;
//             System.out.println(mLicence);
//         }else {
//         System.out.println("Vous n'avez pas de licence");
//         }
//     }
//     private String mName;
//     public String getName(){
//         return mName;
//     }
//     public void setmName(String mName) {
//         this.mName = mName;
//     }

//     private int mTime;
//     public int getmTime() {
//         return mTime;
//     }
//     public void setmTime(int mTime) {
//         this.mTime = mTime;
//     }


//     private int mPrice;
//     public int getmPrice() {
//         return mPrice;
//     }
//     public void setmPrice(int mPrice) {
//         this.mPrice = mPrice;
//     }

//     public static int mLicence = 2;
//     public static int getLicence() {
//         return mLicence;
//     }
//     public static void setmLicence(int licence) {
//         mLicence = licence;
//     }
// // METHODE STATIC VARIABLE DE CLASSE
//     // le static permet de dire que c est accessible depuis l'extérieur du constructeur, ça permet de créer des variables de classe.
//     // objet est une instance d 'une classe'
//     // Des objets qui partagent des valeurs communes: on va créer une variable de classe (variable de classe est partagée par tous le sobjets d'une même classe) c'est différent d'une variable d'instance qui est spécifique à un objet. On ne va donc plus créer une variable à chaque fois qu'on va créer un objet, chaque nouvelle variable est contenue dans l'objet elle est à part et pas dans le constructeur, mais elle peut etre utilisée par chacune des instances.Variable de classe est partagée par tous les objets de la classe.
// }
// Dans notre exemple, le constructeur est appelé chaque foisqu'on crée une nouvelle instance de la classe abonnement, on va décrémenter la valeur de la variable mLicence.

// Variable d’instance:Les variables d’instance sont déclarées dans une classe, mais en dehors d’une méthode, d’un constructeur ou de tout bloc.
// Les variables d’instance sont créées lorsqu’un objet est créé à l’aide du mot clé « new » et détruites lorsque l’objet est détruit.
// Les variables d’instance sont accessibles directement en appelant le nom de la variable dans la classe. Pourtant, dans les méthodes statiques, elles doivent être appelées en utilisant le nom complet: Object.VariableName.

// Variable de classe(variable statique):
// Les variables de classe, également appelées variables statiques, sont déclarées avec le mot clé « static » dans une classe, mais en dehors d’une méthode, d’un constructeur ou d’un bloc.
// Les variables statiques sont créées lors de l’exécution du programme et détruites à l’arrêt du programme.
// Les variables statiques sont accessibles en utilisant le nom de classe: ClassName.VariableName.