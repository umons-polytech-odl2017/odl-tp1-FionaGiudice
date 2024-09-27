package exercise2;

class Person {
	private static int populationSize=0;
	private static long totalAge=0;
	private int age;

	public Person(int age){
		this.age=age;
        populationSize++;
        totalAge+= age;
}


public static int getPopulationSize(){
	return populationSize;
}

public static int computePopulationAverageAge() {
	return ((float) totalAge) / populationSize;
}
