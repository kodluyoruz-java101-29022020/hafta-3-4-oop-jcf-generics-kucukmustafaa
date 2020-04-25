package LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList<String> liste=new LinkedList<String>();
		liste.add("merhaba");
		liste.add("cocykalr");
		liste.add("naber");
		liste.add("123123");
		liste.print();
		liste.remove("merhaba");
		System.out.println("----------------------------------");
		liste.print();
		System.out.println("getsize ....: "+liste.getSize());
		System.out.println("----------------------------------");
		liste.remove("cocykalr");
		System.out.println("----------------------------------");
		liste.print();
		System.out.println("getsize ....: "+liste.getSize());
		
		System.out.println("----------------------------------");
		liste.add("mustafa");
		liste.print();
		System.out.println("getsize ....: "+liste.getSize());
		
	

		System.out.println("----------------------------------");
		liste.add("hsansa");
		liste.add("23dasda", 2);
		liste.print();
		System.out.println("getsize ....: "+liste.getSize());
		
	


	}
}
