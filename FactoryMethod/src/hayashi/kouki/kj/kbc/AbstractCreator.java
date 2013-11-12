package hayashi.kouki.kj.kbc;

public abstract class AbstractCreator {
	private String name;

	private void mark(WindInstrumentProduct product) {
		product.setPlate(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public WindInstrumentProduct create() {
		//
		WindInstrumentProduct product = createInstruent();

		mark(product);
		return product;
	}

	public abstract WindInstrumentProduct createInstruent();

}
