package lesson8;

class Person {
	private String lastName;
	private String firstName;
	private int age;

	public Person(String last, String first, int a) { 
		// constructor to initialize the values
		this.lastName=last;
		this.firstName=first;
		this.age=a;
	}

	public void displayPerson() // Display fisrtName, lastName and age
	{
		System.out.println("Age of the Person is: "+age);
	}

	public String getLastName() // get only the last name
	{
		return lastName;
	}
} // end class Person

public class PersonArrayOpe {
	private Person[] a; // reference to array
	private int nElems; // number of data items
	private int size;

	public PersonArrayOpe(int max) // constructor to initialize person array  with size max and nElems;
	{
		a = new Person[max];
		size= 0;
		nElems ++;
	}

	public Person find(String searchName) // Pass Lastname as an argument
	{
		for(Person p : a)
		{
			if(p.equals(searchName))
				return p;
		}
		return null;
	}

	public void insert(String last, String first, int age)// Insert at last
	{
	   if(size == a.length)
	   {
		   resize();
	   }
	   a[size++]= new Person(last,first,age);
	}

	public boolean delete(String searchName) // Shift down the elements.
												// Argument should be lastname
	{
		if(size == 0) return false;
		int index = -1;
		for(int i = 0; i < size; ++i ){
			System.out.println(a[i].getLastName());
			if(a[i].equals(searchName)){
				index = i;
				break;
			}
		}
		if(index==-1) return false;
		Person[] temp = new Person[a.length];
		System.arraycopy(a,0,temp,0,index);
		System.arraycopy(a,index+1,temp,index,a.length-(index+1));
		a = temp;
		--size;
		return true;
	}

	public void displayAll() // displays array contents
	{
		for(Person p: a)
		{
			System.out.println(p);
		}
	}

	public int size() // Return the number of persons stored in the array
	{
		return size;
	}

	private void resize() {
		int length = a.length;
		int newlength = 2*length;
		Person[] temp = new Person[newlength];
		System.arraycopy(a,0,temp,0,length);
		a = temp;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < size-1; ++i){
			sb.append(a[i].getLastName()+", ");
		}
		sb.append(a[size-1]+"]");
		
		return sb.toString();
	}
	


public static void main(String[] args) {
	PersonArrayOpe p = new PersonArrayOpe(1);
	p.insert("Poudel", "Prabhat", 28);
	p.insert("Shakya", "Gunjan", 29);
	
//System.out.println("The list of size "+p.size());
    p.displayAll();
	p.delete("Shakya");
    p.displayAll();
	//System.out.println("The list of size1  "+p.size()+" is "+p);
	p.insert("Smith", "Joe", 30);
//    p.displayAll();
	//System.out.println("The list of size2  "+p.size()+" after "+p);
	
	
	
}
}