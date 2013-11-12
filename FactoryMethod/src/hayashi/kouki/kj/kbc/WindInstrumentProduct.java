package hayashi.kouki.kj.kbc;

public abstract class WindInstrumentProduct {
	private String plate;

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public void printPlate() {
		System.out.println("名前：" + plate);
	}

	public abstract void play();

}
