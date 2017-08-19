package shoppingSystem;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	public void addGoods(Goods goods) {
		 List<Goods> list=CartFile.readCart();
		Goods old=getGoodsByNo(list,goods.getGno());
		if(old==null) {
			list.add(goods);
		}
		else {
			old.setGnum(old.getGnum()+goods.getGnum());
		}
		CartFile.writeCart(list);
	}
	public Goods getGoodsByNo(List<Goods>list,String gno) {
		
		for(int i=0;i<list.size();i++) {
			Goods old=list.get(i);
			if(gno.equals(old.getGno())){
				return old;
			}
		}
		return null;
	}
	public void show() {
		List<Goods> list=CartFile.readCart();
		System.out.println("您购买的商品如下");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("总计："+getTotal());
	}
	public void changeNum(String gno,int num) {
		List<Goods> list=CartFile.readCart();
		Goods old=getGoodsByNo(list,gno);
		if(old!=null) {
			old.setGnum(num);
		}
		if(num==0) {
			list.remove(old);
		}
		CartFile.writeCart(list);
	}
	public float getTotal() {
		List<Goods> list=CartFile.readCart();
		float s=0;
		for(int i=0;i<list.size();i++) {
			Goods old=list.get(i);
			s+=old.getGprice()*old.getGnum();
		}
		return s;
	}
}
