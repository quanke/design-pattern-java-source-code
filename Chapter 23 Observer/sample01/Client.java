public class Client
{
	public static void main(String a[])
	{
		MySubject subject=new Cat();
		
		MyObserver obs1,obs2,obs3;
		obs1=new Mouse();
		obs2=new Mouse();
		obs3=new Dog();
		
		subject.attach(obs1);
		subject.attach(obs2);
		subject.attach(obs3);
		
		MyObserver obs4;
		obs4=new Pig();
		subject.attach(obs4);
		
		subject.cry();		
	}
}