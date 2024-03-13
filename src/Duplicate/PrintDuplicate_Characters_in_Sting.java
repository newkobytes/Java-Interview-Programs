package Duplicate;

public class PrintDuplicate_Characters_in_Sting {

	
	    public static void main(String[] args) {
	        String str = "KumaranKEEDFDRJR";
	        char[] characters = str.toCharArray();

	     /*   System.out.println("Duplicate characters in the string '" + str + "':");
	        
	        // Iterate through each character in the string
	        for (int i = 0; i < characters.length; i++) {
	            char currentChar = characters[i];
	            // Check if the character has been processed before
	            boolean isDuplicate = false;
	            for (int j = 0; j < i; j++) {
	                if (characters[j] == currentChar) {
	                    isDuplicate = true;
	                    break;
	                }
	            }
	            // If the character is not a duplicate and it repeats later in the string, print it
	            if (!isDuplicate) {
	                for (int k = i + 1; k < characters.length; k++) {
	                    if (characters[k] == currentChar) {
	                        System.out.println(currentChar);
	                        break;
	                    }
	                }
	            }
	        } */
	        
	        for(int i=0;i<str.length();i++)
	        {
	        	for(int j=i+1; j<str.length();j++)
	        	{
	        		if(str.charAt(i)==str.charAt(j))
	        		{
	        			System.out.println(str.charAt(i));
	        		}
	        	}
	        	
	        }
	    }
	}
