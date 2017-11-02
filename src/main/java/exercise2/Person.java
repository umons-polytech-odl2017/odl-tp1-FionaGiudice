package exercise2;

class Person {
	private static int populationSize = 0;
	private static long totalAge = 0;
	private int age;

	public Person(int age) {
		this.age = age;
		populationSize++;
		totalAge += age;
	}

	public static int getPopulationSize() {
		return populationSize;
	}

	public static float computeAveragePopulationAge() {
		return ((float)totalAge) / populationSize;
	}


	public static void resetPopulation() {
		populationSize=0;
		totalAge=0;
	}
}
