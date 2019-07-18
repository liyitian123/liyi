package lianxi;
import java.util.Scanner;
public class custtest  {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lianxi c[]=new lianxi[100];//创建对象数组及其管理者
		c[0]=new lianxi("张一",111,1.2,14);//创建对象
		c[1]=new lianxi("张二",147,1.5,15);
		
		c[2]=new lianxi("张三",158,1.6,18);//调用第二个构造函数
		
		c[3]=new lianxi("张四",169,1.5,19);
		c[4]=new lianxi();//调用第一个构造函数
		
		new lianxi("张五",158,1.6,18).printfor();//匿名对象，不会保存，加载完直接消失，不会保存，想要保存可用static,生明为静态，放入静态存储区
		
		
//		c[0].name="张晓";
//		c[0].ID=111;
//		c[0].money=1000;
//		c[0].password=111;
//		
//		c[1].name="张一";
//		c[1].ID=222;
//		c[1].money=21;
//		c[1].password=222;
		
		lianxi.printnum();
		
		while (true)
		{
			int i=0;
			System.out.println("请输入你的账号");
			int id=new Scanner(System.in).nextInt();//读入数据
			for(i=0;i<c.length;i++)
			{
				if(id==c[i].ID)
				{
					boolean flag=true;
					while (flag)
					{
						System.out.println("取款请按1");
						System.out.println("存款请按2");
						System.out.println("查询请按3");
						System.out.println("退出请按0");
						int tempKey = new Scanner(System.in).nextInt();
						switch (tempKey)
						{
						case 1:c[i].draw();break;
						case 2:c[i].deposite();break;
						case 3:c[i].printfor();break;
						case 0:flag=false;break;
						default:System.out.println("没有该操作");break;
						}
					}
				}
					
			}
			
			
		}

	}

}
