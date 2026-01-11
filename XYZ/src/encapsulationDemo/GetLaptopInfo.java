package encapsulationDemo;

public class GetLaptopInfo {

	public static void main(String[] args) {

		Laptop lp = new Laptop();

		lp.setName("Asus");
		lp.setPrize(68999);
		lp.setModelNo("AS10784");
		System.out.println(lp.getName());
		System.out.println(lp.getPrize());
		System.out.println(lp.getModelNo());

	}

}
