
public class IntTest {
	public static void main(String[] args)
	{
		IntTest.intTest(112);
	}
	
	private static void intTest(int liczba)
	{
		Integer a = liczba;
		Integer b = liczba;
		Integer c = new Integer(liczba);
		
		System.out.println(a == b);
		System.out.println(b == c);
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
	}
}
