package shoppingSystem;

import java.util.ArrayList;
import java.util.List;

public class Shop {
	private List<Goods> list=new ArrayList<Goods>();
	public Shop() {
		Goods g1=new Goods("1001","洗发水",40.0f,100);
		Goods g2=new Goods("1002","护发素",20.0f,80);
		Goods g3=new Goods("1003","沐浴液",30.0f,100);
		list.add(g1);
		list.add(g2);
		list.add(g3);
	}
	public void display() {
		System.out.println("商店有如下商品，请选购:");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	public Goods getGoodsByNo(String gno) {
		for(int i=0;i<list.size();i++) {
			Goods old=list.get(i);
			if(gno.equals(old.getGno())){
				return old;
			}
		}
		return null;
	}
	
}
