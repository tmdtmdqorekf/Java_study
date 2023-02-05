public class ArrayApp {
	public static void main(String[] args) {
		String[] users = new String[3];
		users[0]="egoing";
		users[1]="jinhuck";
		users[2]="youbin";
		
		System.out.println(users[1]);
		System.out.println(users.length); //세칸짜리 배열
		
		int[] scores = {10, 100, 100};
		System.out.println(scores[1]);
		System.out.println(scores.length);
		
		String[] scores2 = {"a", "b", "c"};
		System.out.println(scores2[1]);
	}
}