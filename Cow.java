package fazenda.br.edu.fameg;

public class Cow extends FarmAnimal {

	public Cow(String noise) {
		super(noise);
	}

	@Override
	public String makeNoise(FarmAnimal noise) {
		return noise.noise;
	}

}
