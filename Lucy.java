package tutorial;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
public class Lucy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		int number = 5;
		System.out.println(number);
		double decimal = 5.0;
		System.out.println(decimal);
		boolean true_false = true;
		System.out.println(true_false);
		//use single quotation marks for characters
		char character = 'a';
		System.out.println(character);
		//use double quotation marks for strings
		//int double boolean and char are primitive data types
		String str = "Hello";
		System.out.println(str);
		int lucy = number;
		System.out.println(lucy);
		//+ - * / all work as normal, but exponents require a module to be called
		double x = 6;
		double y = 2;
		double z = Math.pow(6, 2);
		System.out.println(z);
		//type casting can be achieved by putting the data type in brackets in an operation
		int a = (int)x +(int)y;
		System.out.println(a);
		double b = 10 % 3;
		System.out.println(b);
		//scanner is a data type that can be used to collect user input
		Scanner scan = new Scanner(System.in);
		String scanned = scan.next();
		//you can also use nextInt, nextDouble or nextBoolean
		System.out.println(scanned);
		// comparison operators > < == >= <= !=
		boolean compare = !(false) == true;
		System.out.println(compare);
		// to compare use && for and || for or
		// .equals("") can be used to compare strings
		//arrays
		String[] newArray = new String[3];
		newArray[0] = "Penguin";
		newArray[1] = "Sloth";
		newArray[2] = "Duck";
		// OR
		int[] quickArray = {1,2,3,4,5};
		//for loops
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		for (int i = 0; i < quickArray.length; i++) {
			if (quickArray[i] == 5) {
				System.out.println("Found a 5 at position " + i);
			}
		}
		for (int element:quickArray) {
			System.out.println(element);
		}
		//to keep track of the index position of elements
		int count = 0;
		for (int element:quickArray) {
			System.out.println(element + " is at index: " + count);
			count++;
		}
		
		String[] names = new String[3];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("Enter a name:");
			String input = sc.nextLine();
			names[i] = input;
			if (input.equals("exit")) {
				break;
			}
		}
		
		for (String n:names) {
			System.out.println(n);
		}
		
		// you can also use do while loops, to ensure it runs at least once
		int p = 0;
		do {
			p++;
			System.out.println(p);
		} while(p <= 10);
	
		//sets and lists don't require you to know the size of input when you create them (unlike an array)
		//sets are unordered collections of unique elements
		//a hash set is a standard set, there are also TreeSets (ordered) and LinkedHashSets 
		Set<Integer> t = new HashSet<Integer>();
		t.add(5);
		//finding an element in a set occurs in constant time (unlike in an array)
		boolean tf = t.contains(5);
		System.out.println(tf);
		//t.remove();
		//t.isEmpty();
		//t.size();
		
		//lists - can change size but slower than arrays
		ArrayList<Integer> q = new ArrayList<Integer>();
		q.add(1);
		q.get(0);
		q.add(2);
		//you can change an element at a certain index using...
		//q.Set(0, 5);
		//to print a subset of the list:
		System.out.println(q.sublist(0, 1));
		//you can also use a linked list
		
		//maps in Java are like dictionaries in Python (key value pairs) - a fast data type, occurs in constant time
		//HashMaps contain unique, unordered elements
		Map m = new HashMap();
		m.put("Lucy",5);
		System.out.println(m.get("Lucy"));
		//TreeMaps - keys have to be the same data type as data is sorted
		//LinkedHashMaps remain in order of input
		
		//you can check if a value exists using
		m.containsValue("");
		m.containsKey("");
		//transferring characters from a string into a dictionary(HashMap) as the key, with a count as their value
		Map h = new HashMap(char,int);
		String sentence = "I am very tired";
		for(char r:sentence.toCharArray()) {
			if(h.containsKey(r)) {
				int old = (int)h.get(r);
				h.put(r, old+1);
			}
			else {
				h.put(r, 1);
			}
		}
		
		
		
		
		

	}

}
