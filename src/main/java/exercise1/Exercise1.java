package exercise1;

public class Exercise1 {
	static Person createPerson(String name, int age) {
		// Ajoutez les champs name et age à la classe Person.
		// Créez un constructeur public permettant d'initialiser ces valeurs au moment de la construction.
		// Créez des getters publics pour lire ces valeurs une fois la classe construite.
		return new Person(name,age);
	}

	public static void main(String[] args) {  //args représente les arguments passés en lignes de commande
		// Considérant que cette classe est démarrée en ligne de commande avec un premier paramètre donnant le nom
		// et un second donnant l'âge (nombre entier), créez un objet Person sur base de ceux-ci.
		// Ecrivez ensuite le nom et l'âge de cette personne sur la sortie standard.
		String name = args[0];
		int age= Integer.parseInt(args[1]); //Pour transformer la chaîne de caractères en un entier
		Person p= createPerson(name,age);    // Créer une personne en utilisant les paramètres entrés OU Person person= new Person(name,age);
		System.out.println("Nom: " + p.getName() + ", Age: " + p.getAge()); //OU ("Person: " + person.getName() + ", " + person.getAge())
	}
}
