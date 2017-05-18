package fazenda.br.edu.fameg;

public class Chicken extends FarmAnimal {

	public Chicken(String noise) {
		super(noise);
	}

	@Override
	public String makeNoise(FarmAnimal noise) {
		return noise.noise;
	}

}
