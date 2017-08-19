package shoppingSystem;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info.welcomeInfo();
		Shop shop=new Shop();
		Cart cart=new Cart();
		Info.menuInfo();
		String gno=null;
		int gnum=0;
		Goods old=null;
		Goods g=null;
		String a=null;
		while(true) {
			
			Scanner in = new Scanner(System.in);
			int i=in.nextInt();
			switch(i) {
			case 1:
				shop.display();
				Info.finishInfo();
				break;
			case 2:
				System.out.println("������Ҫ�����Ʒ�ı�ţ�");
				gno=in.next();
				old=shop.getGoodsByNo(gno);
				if(old!=null) {
					System.out.println("��������Ʒ��������");
					a=in.next();
					if(a.matches("^[0-9]*$")) {
						gnum=Integer.parseInt(a);
						if(old.getGnum()-gnum>=0&&gnum>=0) {
							g=new Goods(old);
							g.setGnum(gnum);
							cart.addGoods(g);
							old.setGnum(old.getGnum()-gnum);
							Info.finishInfo();
							}
						else{
							System.err.println("����������Ʒ�����������������С��0����ȷ�Ϻ�����");
							System.out.println("===================================");
							Info.menuInfo();
							}
						}
					else{
						System.err.println("\n����Ĳ������֣���ȷ�Ϻ��������룡\n");
						System.out.println("===================================");
						Info.menuInfo();
	
						}
				}
				else {
					System.err.println("\nû���ҵ����������Ʒ����ȷ�Ϻ��������룡\n");
					System.out.println("===================================");
					Info.menuInfo();
				}
				break;
			case 3:
				System.out.println("������Ҫɾ����Ʒ�ı�ţ�");
				gno=in.next();
				old=cart.getGoodsByNo(CartFile.readCart(),gno);
				if(old!=null) {
					int oldnum=old.getGnum();
					cart.changeNum(gno, 0);
					g=shop.getGoodsByNo(gno);
					g.setGnum(g.getGnum()+oldnum);
					Info.finishInfo();
				}
				else {
					System.err.println("�ڹ��ﳵ��û���ҵ�����Ʒ����ȷ�Ϻ��������룡");
					System.out.println("===================================");
					Info.menuInfo();
				}
				break;
				
			case 4:
				cart.show();
				Info.finishInfo();
				break;
			case 5:
				System.out.println("������Ҫ�޸���Ʒ�ı�ţ�");
				gno=in.next();
				g=cart.getGoodsByNo(CartFile.readCart(),gno);
				if(g!=null) {
					System.out.println("��������Ʒ��������");
					gnum=in.nextInt();
					old=shop.getGoodsByNo(gno);
					int oldnum=g.getGnum();
					cart.changeNum(gno, gnum);
					old.setGnum(old.getGnum()+oldnum-gnum);
					Info.finishInfo();
				}
				else {
					System.err.println("�ڹ��ﳵ��û���ҵ�����Ʒ����ȷ�Ϻ��������룡");
					System.out.println("===================================");
					Info.menuInfo();
				}
				break;
			case 6:
				CartFile.clearCart();
				Info.finishInfo();
				break;
			case 7:
				Info.systemExit();
				System.exit(0);
				break;
			default:
				Info.commandError();
				break;
			}
		}
	}

}
