package interfaces;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
		
	}

	@Override
	public String funkifyText(String tasj) {
		String tempLower="";
		String tempUpper= "";
		String tempTote= "";
		
		for (int i = 0; i < s.length(); i++) {
			if(i%2==0) {
				tempLower += Character.toLowerCase(s.charAt(i));
				tempTote= tempTote +tempLower;
			}
			if(i%2 !=0) {
				tempUpper += Character.toUpperCase(s.charAt(i));
				tempTote= tempTote +tempUpper;
			}
			
		}
		return tempTote;
	}

}
