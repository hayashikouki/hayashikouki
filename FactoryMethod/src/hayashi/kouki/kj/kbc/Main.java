package hayashi.kouki.kj.kbc;

public class Main {
    public static void main(String[] args) {
    	WindInstrumentProduct product;
    	System.out.println("サックス作成");
    	product = new SaxopohneCreator().create();
    	product.setPlate("さっちゃん");
    	product.printPlate();
    	product.play();

    	System.out.println("");

    	System.out.println("トランペット作成");
    	product = new TrumpetCreator().create();
    	product.setPlate("トラちん");
    	product.printPlate();
    	product.play();

    }
}
