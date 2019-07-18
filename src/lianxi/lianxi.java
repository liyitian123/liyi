package lianxi;
import java.util.Scanner;//调用util包下的Scanner类

public class lianxi {
	protected String name;
	protected int ID;
	protected double money;
	protected int password;
	protected static int number;//属于类而不属于任意一个对象，只分配一次内存
	
	public lianxi()
	{
		number++;
	}//一个类中可以有多个构造函数，函数名相同；但参数名不同
	
	public lianxi (String nam,int id,double mon,int word)
	{
		this.name=nam;
		this.ID=id;
		this.money=mon;
		this.password=word;
	}
	
	public void deposite()
	{
		System.out.println("请输入存款金额");
		int temp=new Scanner(System.in).nextInt();
		money=money+temp;
		
	}
	
	public void draw()
	{
		System.out.println("请输入取款金额");
		int a=new Scanner(System.in).nextInt();
	    money=money-a;
	}
	
	public void printfor()
	{
		System.out.println(ID+"你的账户还有："+money+"元");
	}
	
	
	public static void  printnum()//在静态函数中，只能调用静态变量，不能调用非static修饰变量；但可以间接调用；可以用类名直接调用该函数
	{
		lianxi c=new lianxi("zhang",1,1.2,1);
		System.out.println(c.money);
		
		
		System.out.println("该银行一共有"+number+"个客户");
	}
	
	
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//当前类的