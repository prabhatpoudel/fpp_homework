package lesson10;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

// Demo code for the user implemenation of Binary search tree
public class MyBST {
	/** The tree root. */
	private BinaryNode root;

	public MyBST() {
		root = null;
	}

	/**
	 * Prints the values in the nodes of the tree in sorted order. Inorder
	 * Traversal
	 */
	public void printTree() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTree(root);
	}

	// Inorder Traversal to print the nodes in Ascending order
	private void printTree(BinaryNode t) {
		if (t != null) {
			printTree(t.left);
			System.out.print(t.element + ",");
			printTree(t.right);
		}
	}

	// Assume the data in the Node is an Integer.

	public void insert(Integer x) {
		if (root == null) {
			root = new BinaryNode(x);
			return;
		} else {
			BinaryNode n = root;
			boolean inserted = false;

			while (!inserted)// true
			{
				if (x.compareTo(n.element) < 0) {
					// space found on the left
					if (n.left == null) {
						n.left = new BinaryNode(x, null, null);
						inserted = true;
					}
					// keep looking for a place to insert (a null)
					else {
						n = n.left;
					}
				} else if (x.compareTo(n.element) > 0) {
					// space found on the right
					if (n.right == null) {
						n.right = new BinaryNode(x, null, null);
						inserted = true;
					}
					// keep looking for a place to insert (a null)
					else {
						n = n.right;
					}

				}
				// if a node already exists
				else {
					inserted = true;
				}

			}

		}
	}

	public void printPreorder() {
		System.out.println("*******Pre Order*********");
		preOrder(root);

		System.out.println("*******Pre Order*********");

	}

	private void preOrder(BinaryNode t) {
		String output = "";
		if (t == null) {
			return;
		} else {
			output += t.element + " ";
			System.out.println(output);
			preOrder(t.left);
			preOrder(t.right);

		}

	}

	public void printPostorder() {
		System.out.println("*******Post Order*********");
		postOrder(root);

		System.out.println("*******Post Order*********");

	}

	private void postOrder(BinaryNode t) {
		String output = "";
		if (t == null) {
			return;
		} else {

			postOrder(t.left);
			postOrder(t.right);
			output += t.element + " ";
			System.out.println(output);

		}

	}
	public boolean contains(int key){
		if(root ==null)
		return false;
		else
		{
			BinaryNode b = root;
			
			while(b != null)
			{  
				if(b.element==key) return true;
				else if(key < b.element)
				{	
				   b=b.left;
				}
				else
				{
					b=b.right;
				}
			}
		}
		return false;
	}
	
	public BinaryNode getRoot()
	{
		return this.root;
	}
	
	public void printleafNodes()
	{
		System.out.println(leafNodes(root));
		
	}
	int leafCount = 0;
	public int leafNodes(BinaryNode t){
		
		if (t == null) {
			return 0;
		} 
		else {
               if(t.left == null && t.right ==null)
               {
            	   leafCount++;
               }
			leafNodes(t.left);
			leafNodes(t.right);
			return leafCount;
		}
		
		
	}
    
	int size=0;
	public int size(){
		if(root == null)
		{
			size =0;
		}
		 
		BinaryNode b = root;
		while(b !=null)
		{
			size++;
			b=b.left;
		}
		
		BinaryNode c = root;
		while(c !=null)
		{
			size++;
			c=c.left;
		}
		
		return size;
	}
	
	public boolean isLeaf(){
		if(root.left ==null && root.right ==null )
		{
			return true;
		}
		return false;
		
	} // check the tree is leaf or not

	
	private class BinaryNode {

		private Integer element;// The data in the node
		private BinaryNode left; // Left child
		private BinaryNode right; // Right child

		// Constructors

		BinaryNode(Integer theElement) {
			this(theElement, null, null);
		}

		BinaryNode(Integer element, BinaryNode left, BinaryNode right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}

	}

	public static void main(String[] args) {

		MyBST mybst = new MyBST();

		// int [] a = {15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25};
		int[] a = { 43, 15, 60, 8, 30, 50, 82, 20, 35, 70 };

		for (int j = 0; j < a.length; j++) {
			mybst.insert(a[j]);

		}
		// mybst.insert(12);
		// mybst.printTree();
		mybst.printPreorder();
		mybst.printPostorder();
		System.out.println(mybst.contains(50));//true
		System.out.println(mybst.contains(51));//false
		System.out.println(mybst.contains(43));//true
		System.out.println(mybst.contains(35));//true
		
		System.out.println(mybst.getRoot().element);
		mybst.printleafNodes();

		TreeSet<Integer> ts = new TreeSet<Integer>();

		for (int j = 0; j < a.length; j++) {
			ts.add(a[j]);
			System.out.println("\nAfter inserting " + j + "th item " + a[j]);
			Iterator<Integer> it = ts.iterator();
			Integer nextItem = null;
			while (it.hasNext()) {
				nextItem = it.next();
				System.out.print(nextItem + " ");
			}
			System.out.println();
		}

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(8, "Hello");
		map.put(10, "World!");
		map.put(11, "Welcome");
		map.remove(8);
		String str = map.get(11) + ", " + map.get(10);
		System.out.println(str);

	}
}