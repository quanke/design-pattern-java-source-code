public class ComplexCipher extends CipherDecorator
{
	public ComplexCipher(Cipher cipher)
	{
		super(cipher);
	}
	
	public String encrypt(String plainText)
	{
		String result=super.encrypt(plainText);
		result= this.reverse(result);
		return result;
	}
	
	public String reverse(String text)
	{
		String str="";
		for(int i=text.length();i>0;i--)
		{
			str+=text.substring(i-1,i);
		}
		return str;
	}
}
