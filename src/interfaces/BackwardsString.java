package interfaces;

public class BackwardsString extends SpecialString{

public	BackwardsString(String GHIaba){
		super(GHIaba);
	}

	@Override
	public String funkifyText(String s) {
	String temp= "";
	
		for (int i = s.length()-1; i > -1; i--) {
			temp=temp+ s.charAt(i);
				
		}
		return temp;
	}
}
