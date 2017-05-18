package fazenda.br.edu.fameg;

public class Barn {

	public String makeNoise(FarmAnimal noise) {
		return noise.makeNoise(noise);
	}

	public static void main(String[] args) {

		FarmAnimal animal1 = new Cat("miau");
		FarmAnimal animal2 = new Pig("oinc oinc");
		FarmAnimal animal3 = new Cow("mumu");
		FarmAnimal animal4 = new Chicken("pópópó");
		FarmAnimal animal5 = new Dog("au au au");

		Barn barn = new Barn();

		System.out.println(barn.makeNoise(animal1));
		System.out.println(barn.makeNoise(animal2));
		System.out.println(barn.makeNoise(animal3));
		System.out.println(barn.makeNoise(animal4));
		System.out.println(barn.makeNoise(animal5));

	}

}
