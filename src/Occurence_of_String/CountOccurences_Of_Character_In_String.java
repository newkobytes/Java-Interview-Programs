package Occurence_of_String;

public class CountOccurences_Of_Character_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Sharmila Loves Shiva";
		int Totlength = s.length();
		// to find occurence of a:
		int Lenwithoutspace=s.replace("a", "").length();
		
		int OccurenceofA = Totlength - Lenwithoutspace;
		System.out.println("The letter 'a' occured " + OccurenceofA + " times");
		
	}

}
