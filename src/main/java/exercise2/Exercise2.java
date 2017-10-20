package exercise2;

public class Exercise2 {

	// Ajoutez un champ age à chaque instance de la classe Person.
	// Créez-y une méthode statique "computePopulationSize" pour retourner la taille de la population.
	// Créez-y une méthode statique "computeAveragePopulationAge" pour calculer l'âge moyen de la population.
	// Implémentez-y une méthode statique "resetPopulation" pour remettre les compteurs à zéro.

	static void createPerson(int age) {
		new Person(age);
	}

	static int computePopulationSize() {
		// TODO remove comment when implemented
		 return Person.computePopulationSize();

	}

	static float computeAveragePopulationAge() {
		// TODO remove comment when implemented
		 return Person.computeAveragePopulationAge();

	}

	static void resetPopulation() {
		// TODO remove comment when implemented
		 Person.resetPopulation();
	}
}
