package lesson8;

public class PhoneDirectoryAPP {
	public static void main(String [] args)
	{
		DirectoryOpr do1= new DirectoryOpr();
		System.out.println("Directory is empty?" +do1.isEmpty());
		System.out.println("****************");
		do1.insertFirst("Prabhat", 123);
		do1.insertFirst("Poudel", 124);
		do1.displayList();
		System.out.println("****************");
		do1.insertLast("Govinda", 125);
		do1.displayList();
		System.out.println("****************");
		do1.deleteFirst();
		System.out.println("****************");
		Directory d =do1.find(123);
		System.out.println("****************");
		d.displayDirectory();
		System.out.println("****************");
		System.out.println(do1.size());
		System.out.println(do1.isEmpty());
	}

}

class Directory {
	String name;
	long pno; // Phone number
	Directory next;

	public Directory(String name, long pno) { // Initialize values
		this.name = name;
		this.pno = pno;

	}

	// -------------------------------------------------------------
	public void displayDirectory() // display values of single element
	{
		System.out.println("Name : " + name + " Phone Number: " + pno);
	}
}

class DirectoryOpr {
	private Directory first; // ref to first Directory
	private Directory last; // ref to last Directory

	// -------------------------------------------------------------
	public DirectoryOpr() // constructor
	{
		first = null;
		last = null;
	}

	// -------------------------------------------------------------
	public boolean isEmpty() // true if no Directory in your list
	{
		if (first == null)
			return true;

		else
			return false;
	}

	// -------------------------------------------------------------
	public void insertFirst(String name, long pno) // insert at front of list
	{
		if(first ==null)
		{
			first =new Directory(name, pno);
			last=first;
		}
		else
		{
			Directory temp =first;
		first = new Directory(name, pno);
		first.next = temp;
//		d = first;
		}

	}

	// -------------------------------------------------------------
	public void insertLast(String name, long pno) // insert at end of list
	{
		if(first ==null)
		{
			last =new Directory(name, pno);
			first=last;
		}
		else
		{
			Directory temp=last;
		last = new Directory(name, pno);
		temp.next = last;

		}
	}

	// -------------------------------------------------------------
	public Directory deleteFirst() // delete first Directory
	{
		if(first==null)
		{
			return null;
		}
		else
		{
		Directory temp = first;
		first= first.next;
		return temp;
		}
	}

	// -------------------------------------------------------------
	public int size() {
		int count = 0;
		if (first == null)
			return 0;

		Directory temp = first;
		while (temp.next != null) {
			count++;
			temp = temp.next;
		}
		return count+1;
	}

	// -------------------------------------------------------------
	public void displayList() {
		Directory temp=first;

		if(first.next == null && first != null)
		{
			first.displayDirectory();
		}
		while(temp!=null)
		{
			temp.displayDirectory();
			temp=temp.next;
		}
	}

	// -------------------------------------------------------------
	public Directory find(long key) // find link with given key
	{
	  Directory temp=first;
	  while(temp.next!=null)
	  {
	  if(temp.pno ==key)
	  {
		return temp;
	  }
	  temp=temp.next;
	  }
	  return null;
	}
}
