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
				System.out.println("请输入要添加商品的编号：");
				gno=in.next();
				old=shop.getGoodsByNo(gno);
				if(old!=null) {
					System.out.println("请输入商品的数量：");
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
							System.err.println("大于现有商品数量或者输入的数字小于0，请确认后输入");
							System.out.println("===================================");
							Info.menuInfo();
							}
						}
					else{
						System.err.println("\n输入的不是数字，请确认后重新输入！\n");
						System.out.println("===================================");
						Info.menuInfo();
	
						}
				}
				else {
					System.err.println("\n没有找到您输入的商品，请确认后重新输入！\n");
					System.out.println("===================================");
					Info.menuInfo();
				}
				break;
			case 3:
				System.out.println("请输入要删除商品的编号：");
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
					System.err.println("在购物车中没有找到该商品，请确认后重新输入！");
					System.out.println("===================================");
					Info.menuInfo();
				}
				break;
				
			case 4:
				cart.show();
				Info.finishInfo();
				break;
			case 5:
				System.out.println("请输入要修改商品的编号：");
				gno=in.next();
				g=cart.getGoodsByNo(CartFile.readCart(),gno);
				if(g!=null) {
					System.out.println("请输入商品的数量：");
					gnum=in.nextInt();
					old=shop.getGoodsByNo(gno);
					int oldnum=g.getGnum();
					cart.changeNum(gno, gnum);
					old.setGnum(old.getGnum()+oldnum-gnum);
					Info.finishInfo();
				}
				else {
					System.err.println("在购物车中没有找到该商品，请确认后重新输入！");
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
