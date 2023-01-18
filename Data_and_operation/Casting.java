public class Casting {
	public static void main(String[] args) {
		double b=1;
		System.out.println(b);
		
		double d=1.1;
		int e=(int)1.1;
		System.out.println(e);
		
		String f=Integer.toString(1);
		System.out.println(f);
		System.out.println(f.getClass());
	}
}