package lesson7;

public class MyTable {

	private Entry[] entries;

	public MyTable() {
		entries = new Entry[26];
	}

	// returns the String that is matched with char c in the table
	public String get(char c) {

		// implement
		Entry e = entries[(c - 97)];
		if (e == null) {
			return null;
		}
		return e.value;

	}

	// adds to the table a pair (c, s) so that s can be looked up using c
	public void add(char c, String s) {
		// implement
		int i = 0;
		i = (c - 97);
		Entry e = new Entry(s, c);
		entries[i] = e;

	}
	// returns a String consisting of nicely formatted display
	// of the contents of the table

	public String toString() {
		// implement
		String output = "";
		for (Entry ent : entries) {
			// System.out.println("************");
			if (ent == null) {

				output += "";
			} else {
				output += ent.toString() + "\n";
			}
		}
		return output.trim();

	}

	private class Entry {
		String value;
		char chr;

		Entry(String str, char ch) {
			// implement
			this.value = str;
			this.chr = ch;

		}

		// returns a String of the form "ch->str"
		public String toString() {
			if (value == null)
				return "";
			else
				return chr + "->" + value;

		}
	}

}
