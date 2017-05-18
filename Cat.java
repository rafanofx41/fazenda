package fazenda.br.edu.fameg;

public class Cat extends FarmAnimal {

	public Cat(String noise) {
		super(noise);
	}

	@Override
	public String makeNoise(FarmAnimal noise) {
		return noise.noise;
	}

}
