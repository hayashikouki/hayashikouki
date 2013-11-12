package hayashi.kouki.kj.kbc;

public class Main {
    public static void main(String[] args) {
    	AbstractCreator create;
    	WindInstrumentProduct product;

    	System.out.println("サックス作成");
    	create = new SaxopohneCreator();
    	create.setName("さっちゃん");
    	product = create.create();
    	product.printPlate();
    	product.play();

    	System.out.println("");

    	System.out.println("トランペット作成");
    	create = new SaxopohneCreator();
    	create.setName("トラちん");
    	product = create.create();
    	product.setPlate("トラちん");
    	product.printPlate();
    	product.play();

    }
}
