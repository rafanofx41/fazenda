package fazenda.br.edu.fameg;

public class Pig extends FarmAnimal {

	public Pig(String noise) {
		super(noise);
	}

	@Override
	public String makeNoise(FarmAnimal noise) {
		return noise.noise;
	}

}
