class Student implements Cloneable
{
	private String stuName;
	private String stuSex;
	private int stuAge;
	private String stuMajor;
	private String stuCollege;
	private String stuUniversity;
	
	public Student(String stuName,String stuSex,int stuAge,String stuMajor,String stuCollege,String stuUniversity)
	{
		this.stuName=stuName;
		this.stuSex=stuSex;
		this.stuAge=stuAge;
		this.stuMajor=stuMajor;
		this.stuCollege=stuCollege;
		this.stuUniversity=stuUniversity;
	}
	
	public void setStuName(String stuName) {
		this.stuName = stuName; 
	}

	public void setStuSex(String stuSex) {
		this.stuSex = stuSex; 
	}

	public void setStuAge(int stuAge) {
		this.stuAge = stuAge; 
	}

	public void setStuMajor(String stuMajor) {
		this.stuMajor = stuMajor; 
	}

	public void setStuCollege(String stuCollege) {
		this.stuCollege = stuCollege; 
	}

	public void setStuUniversity(String stuUniversity) {
		this.stuUniversity = stuUniversity; 
	}

	public String getStuName() {
		return (this.stuName); 
	}

	public String getStuSex() {
		return (this.stuSex); 
	}

	public int getStuAge() {
		return (this.stuAge); 
	}

	public String getStuMajor() {
		return (this.stuMajor); 
	}

	public String getStuCollege() {
		return (this.stuCollege); 
	}

	public String getStuUniversity() {
		return (this.stuUniversity); 
	}
	
	public Student clone()
	{
		Student cpStudent=null;
		try
		{
			cpStudent=(Student)super.clone();
		}
		catch(CloneNotSupportedException e)
		{
		}
		return cpStudent;
	}
}

class MainClass 
{
	public static void main(String args[])
	{
		Student stu1,stu2,stu3;
		
		stu1=new Student("张无忌","男",24,"软件工程","软件学院","中南大学"); //状态相似
		
		//使用原型模式
		stu2=stu1.clone();
		stu2.setStuName("杨过");
		
		//使用原型模式
		stu3=stu1.clone();
		stu3.setStuName("小龙女");
		stu3.setStuSex("女");		
		
		System.out.print("姓名：" + stu1.getStuName());
		System.out.print("，性别：" + stu1.getStuSex());
		System.out.print("，年龄：" + stu1.getStuAge());
		System.out.print("，专业：" + stu1.getStuMajor());
		System.out.print("，学院：" + stu1.getStuCollege());
		System.out.print("，学校：" + stu1.getStuUniversity());
		System.out.println();
		
		System.out.print("姓名：" + stu2.getStuName());
		System.out.print("，性别：" + stu2.getStuSex());
		System.out.print("，年龄：" + stu2.getStuAge());
		System.out.print("，专业：" + stu2.getStuMajor());
		System.out.print("，学院：" + stu2.getStuCollege());
		System.out.print("，学校：" + stu2.getStuUniversity());
		System.out.println();

		System.out.print("姓名：" + stu3.getStuName());
		System.out.print("，性别：" + stu3.getStuSex());
		System.out.print("，年龄：" + stu3.getStuAge());
		System.out.print("，专业：" + stu3.getStuMajor());
		System.out.print("，学院：" + stu3.getStuCollege());
		System.out.print("，学校：" + stu3.getStuUniversity());
		System.out.println();
	}
}