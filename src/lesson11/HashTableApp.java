package lesson11;

//demonstrates hash table user defined implementation with linear probing

import java.io.*;
import java.util.Scanner;

class PersonItem {
	private String mail_id; // Person E_Mail-id-Key
	private String name; // Name of the person

	public PersonItem(String mail, String name) {
		this.mail_id = mail;
		this.name = name;
	}

	public String getKey() {
		return mail_id;
	}

	public String getValue() {
		return name;
	}
}

class HashTable {
	private PersonItem[] hashArray;
	private int arraySize;
	private PersonItem nonItem;

	public HashTable(int size) {
		arraySize = size;
		hashArray = new PersonItem[arraySize];
		nonItem = null;
	}

	public void displayTable() {
		for (int i = 0; i < arraySize; i++) {
			if (hashArray[i] != null) {
				System.out.println("Index is: " + i + " " + hashArray[i].getKey() + " " + hashArray[i].getValue());
			} else
				System.out.println("Index is: " + i + " " + "*****");
		}
	}

	public int hashFunction(String key) {
		int hashkey = key.hashCode();
		return hashkey % arraySize;
	}

	public void insert(String key, String val) {
		int hashValue = hashFunction(key);
		while (hashArray[hashValue] != null && !hashArray[hashValue].getKey().equals(key)) {
			++hashValue;
			hashValue %= arraySize;
		}
		PersonItem perItm = new PersonItem(key, val);
		hashArray[hashValue] = perItm;
	}

	public PersonItem delete(String key) {
		int hashValue = hashFunction(key);

		while (hashArray[hashValue] != null) {
			if (hashArray[hashValue].getKey().equals(key)) {
				PersonItem temp = hashArray[hashValue];
				hashArray[hashValue] = nonItem;
				return temp;
			}
			++hashValue;
			hashValue %= arraySize;
		}
		return null;
	}

	public boolean find(String key) {
		int hashValue = hashFunction(key);

		while (hashArray[hashValue] != null) {
			if (hashArray[hashValue].getKey().equals(key)) {
				return true;
			}
			++hashValue;
			hashValue %= arraySize;
		}
		return false;
	}
}

class HashTableApp {
	public static void main(String[] args) throws IOException {
		String aKey;
		String value;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter size of hash table: ");
		int size = in.nextInt();

		HashTable theHashTable = new HashTable(size);

		theHashTable.insert("A", "FPP");
		theHashTable.insert("B", "Java");
		theHashTable.insert("C", "SE");
		theHashTable.insert("D", "C#");

		while (true) {
			System.out.print("Enter first letter of ");
			System.out.print("show, insert, delete, or find: ");
			char choice = in.next().charAt(0);
			switch (choice) {
			case 's':
				theHashTable.displayTable();
				break;
			case 'i':
				System.out.print("Enter key and value to insert: ");
				aKey = in.next();
				value = in.next();
				theHashTable.insert(aKey, value);
				break;
			case 'd':
				System.out.print("Enter key value to delete: ");
				aKey = in.next();
				theHashTable.delete(aKey);
				break;
			case 'f':
				System.out.print("Enter key value to find: ");
				aKey = in.next();
				System.out.println("Key Found status" + theHashTable.find(aKey));
				break;
			default:
				System.out.print("Invalid entry\n");
			}
		}
	}
}
