package lianxi;
import java.util.Scanner;
public class custtest  {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lianxi c[]=new lianxi[100];//�����������鼰�������
		c[0]=new lianxi("��һ",111,1.2,14);//��������
		c[1]=new lianxi("�Ŷ�",147,1.5,15);
		
		c[2]=new lianxi("����",158,1.6,18);//���õڶ������캯��
		
		c[3]=new lianxi("����",169,1.5,19);
		c[4]=new lianxi();//���õ�һ�����캯��
		
		new lianxi("����",158,1.6,18).printfor();//�������󣬲��ᱣ�棬������ֱ����ʧ�����ᱣ�棬��Ҫ�������static,����Ϊ��̬�����뾲̬�洢��
		
		
//		c[0].name="����";
//		c[0].ID=111;
//		c[0].money=1000;
//		c[0].password=111;
//		
//		c[1].name="��һ";
//		c[1].ID=222;
//		c[1].money=21;
//		c[1].password=222;
		
		lianxi.printnum();
		
		while (true)
		{
			int i=0;
			System.out.println("����������˺�");
			int id=new Scanner(System.in).nextInt();//��������
			for(i=0;i<c.length;i++)
			{
				if(id==c[i].ID)
				{
					boolean flag=true;
					while (flag)
					{
						System.out.println("ȡ���밴1");
						System.out.println("����밴2");
						System.out.println("��ѯ�밴3");
						System.out.println("�˳��밴0");
						int tempKey = new Scanner(System.in).nextInt();
						switch (tempKey)
						{
						case 1:c[i].draw();break;
						case 2:c[i].deposite();break;
						case 3:c[i].printfor();break;
						case 0:flag=false;break;
						default:System.out.println("û�иò���");break;
						}
					}
				}
					
			}
			
			
		}

	}

}
