package shoppingSystem;

import java.io.Serializable;

public class Goods implements Serializable {
private String gno;
private String gname;
private float gprice;
private int gnum;
public Goods(String gno, String gname, float gprice, int gnum) {
	super();
	this.gno = gno;
	this.gname = gname;
	this.gprice = gprice;
	this.gnum = gnum;
}
public Goods(Goods g) {
	this.gno = g.getGno();
	this.gname = g.getGname();
	this.gprice = g.getGprice();
	this.gnum=g.getGnum();
}
public String getGno() {
	return gno;
}
public void setGno(String gno) {
	this.gno = gno;
}
public String getGname() {
	return gname;
}
public void setGname(String gname) {
	this.gname = gname;
}
public float getGprice() {
	return gprice;
}
public void setGprice(float gprice) {
	this.gprice = gprice;
}
public int getGnum() {
	return gnum;
}
public void setGnum(int gnum) {
	this.gnum = gnum;
}
public Goods() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "商品编号：" + gno + ", 商品名称：" + gname + ", 商品价格：" + gprice + ", 商品数量：" + gnum + ",小计："+
gnum*gprice;
}

}
