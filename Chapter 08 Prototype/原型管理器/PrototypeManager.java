import java.util.*;

interface MyColor extends Cloneable
{
	public Object clone();
	public void display();
}

class Red implements MyColor
{
   public Object clone()
   {
     Red r=null;
     try
     {
       r=(Red)super.clone();
     }
     catch(CloneNotSupportedException e)
     {  
  
     }
     return r;
   }
   public void display()
   {
     System.out.println("This is Red!");
   }
}

class Blue implements MyColor
{
   public Object clone()
   {
     Blue b=null;
     try
     {
       b=(Blue)super.clone();
     }
     catch(CloneNotSupportedException e)
     {  
  
     }
     return b;
   }
   public void display()
   {
     System.out.println("This is Blue!");
   }
}

class PrototypeManager 
{
   private Hashtable ht=new Hashtable();
   
   public PrototypeManager()
   {
   	  ht.put("red",new Red());
   	  ht.put("blue",new Blue());
   }
   
   public void addColor(String key,MyColor obj)
   {
      ht.put(key,obj);
   }
   
   public MyColor getColor(String key)
   {
      return (MyColor)((MyColor)ht.get(key)).clone();
   }
}

class Client
{
   public static void main(String args[])
   {
      PrototypeManager pm=new PrototypeManager();  
      
      MyColor obj1=(MyColor)pm.getColor("red");
      obj1.display();
      
      MyColor obj2=(MyColor)pm.getColor("red");
      obj2.display();
      
      System.out.println(obj1==obj2);
   }
}