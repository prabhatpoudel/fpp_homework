package lesson7;

public class Question2 {
	public static void main(String [] args)
	{
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('w',"Willie");
		System.out.println(t);
		System.out.println(t.get('a'));

	}

}
