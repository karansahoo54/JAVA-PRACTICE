import java.util.ArrayList;


public class Day2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Python");
        list.remove(1);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
}
}