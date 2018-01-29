
public class Main {

	public static void main(String[] args) {
		Vektor v1 = new Vektor(5,4);
		Vektor v2 = new Vektor(2,5);
		Vektor v3 = new Vektor(3,6);
		
		System.out.println((v1.add(v2).toString()));
		
		System.out.println(v1.times(v2));
		System.out.println(v1.equals(v1));
		System.out.println(v1.equals(v2));
		System.out.println(v1.equals(v3));
	}

}
