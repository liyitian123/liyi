package lianxi;
import java.util.Scanner;//����util���µ�Scanner��

public class lianxi {
	protected String name;
	protected int ID;
	protected double money;
	protected int password;
	protected static int number;//�����������������һ������ֻ����һ���ڴ�
	
	public lianxi()
	{
		number++;
	}//һ�����п����ж�����캯������������ͬ������������ͬ
	
	public lianxi (String nam,int id,double mon,int word)
	{
		this.name=nam;
		this.ID=id;
		this.money=mon;
		this.password=word;
	}
	
	public void deposite()
	{
		System.out.println("����������");
		int temp=new Scanner(System.in).nextInt();
		money=money+temp;
		
	}
	
	public void draw()
	{
		System.out.println("������ȡ����");
		int a=new Scanner(System.in).nextInt();
	    money=money-a;
	}
	
	public void printfor()
	{
		System.out.println(ID+"����˻����У�"+money+"Ԫ");
	}
	
	
	public static void  printnum()//�ھ�̬�����У�ֻ�ܵ��þ�̬���������ܵ��÷�static���α����������Լ�ӵ��ã�����������ֱ�ӵ��øú���
	{
		lianxi c=new lianxi("zhang",1,1.2,1);
		System.out.println(c.money);
		
		
		System.out.println("������һ����"+number+"���ͻ�");
	}
	
	
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//��ǰ���