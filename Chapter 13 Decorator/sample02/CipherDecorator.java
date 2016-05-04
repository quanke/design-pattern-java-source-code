public class CipherDecorator implements Cipher
{
	private Cipher cipher;
	
	public CipherDecorator(Cipher cipher)
	{
		this.cipher=cipher;
	}
	
	public String encrypt(String plainText)
	{
		return cipher.encrypt(plainText);
	}
}
