package interfaces;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
		
	}

	@Override
	public String funkifyText(String s) {
		String Comp= "";

		
		for (int i = 0; i < s.length(); i++) {
			if(i%2==0) {
				Comp= Comp + Character.toLowerCase(s.charAt(i));
			
			}
			if(i%2 !=0) {
				Comp= Comp + Character.toUpperCase(s.charAt(i));
				
			}
			
		}
		return Comp;
	}

}
