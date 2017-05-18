package fazenda.br.edu.fameg;

public abstract class FarmAnimal implements INoise {

	protected String noise;

	public FarmAnimal(String noise) {
		super();
		this.noise = noise;
	}

}
