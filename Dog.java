package fazenda.br.edu.fameg;

public class Dog extends FarmAnimal {

	public Dog(String noise) {
		super(noise);
	}

	@Override
	public String makeNoise(FarmAnimal noise) {
		return noise.noise;
	}

}
