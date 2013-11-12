package hayashi.kouki.kj.kbc;

public class TrumpetCreator extends AbstractCreator {

	@Override
	public WindInstrumentProduct createInstruent() {
		return new Trumpet();
	}

}