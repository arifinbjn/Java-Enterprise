public class StatementIf{
	public static void main(String[] args){
		System.out.println("\n\n");
		boolean b = true;
		System.out.println("Nilai b = "+b);
		System.out.println("Statement Awal dieksekusi");
		if (b = true) b = false;
			else b = true;
			System.out.println("Nilai b = "+b);
			System.out.println("Statement Akhir dieksekusi");
			if (2 <= 7) b = true;
			System.out.println("2 <= 7 mengembalikan nilai "+b);
			if (3 > 9) b = false;
			System.out.println("3 > 9 mengembalikan nilai "+b);
			if (9 <= 9) b = true;
			System.out.println("9 <= 9 mengembalikan nilai "+b);
			}
	}