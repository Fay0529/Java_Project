package shoppingSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class CartFile {
//	将集合写入到文件
	public static void writeCart(List<Goods>list) {
		OutputStream file =null;
		ObjectOutputStream out=null;
		try {
			file =new FileOutputStream("cart.txt");
			out=new ObjectOutputStream(file);
			out.writeObject(list);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("File cart.txt not find ！ ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				out.close();
				file.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
//	读入文件
	public static List<Goods> readCart(){
		File file=new File("cart.txt");
		if(file.exists()) {
			InputStream is=null;
			ObjectInputStream in=null;
			try {
				is = new FileInputStream(file);
				in=new ObjectInputStream(is);
				return (List<Goods>)in.readObject();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				try {
					in.close();
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			}
			
		}
		return new ArrayList<Goods>();
	}
//	清空文件
	public static void clearCart() {
		File file =new File("cart.txt");
		if(file.exists()) {
			file.delete();
		}
	}
	
}	
