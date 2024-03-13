package StringPrograms_2;

public class Pigalitin {

	public static void main(String[] args) {

		String s ="CLEAR";
		String pigalitin="";
		
		for(int i=0;i<s.length();i++)
		{
			char c= s.charAt(i);
			char u = Character.toUpperCase(c);
			if(u=='A'||u=='E'||u=='I'||u=='O'||u=='U')
			{
				if(i==0)
					pigalitin= s+"WAY";
				else
					pigalitin=s.substring(i)+s.substring(0,i)+"AY";
					break;
			}
			
		}
		System.out.println("Pigalitin word:" + pigalitin);
	}

}
