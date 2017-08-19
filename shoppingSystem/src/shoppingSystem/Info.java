package shoppingSystem;

public class Info {
//	显示欢迎信息
	public static void welcomeInfo() {
		System.out.println("===================================");
		System.out.println("**********欢迎使用Fay的购物系统**********");
	}
//显示功能菜单
	public static void menuInfo() {
		System.out.println("	请选择执行的操作	  ");
		System.out.println("  1  显示所有商品		");
		System.out.println("  2  添加商品		");
		System.out.println("  3  删除商品		");
		System.out.println("  4  显示总价钱		");
		System.out.println("  5  修改商品数量		");
		System.out.println("  6  清空购物车	");
		System.out.println("  7  退出系统	");
		System.out.println("  [回车] 确认	");
		
	}
	public static void finishInfo() {
		System.out.println("操作完成，请继续...");
		System.out.println("请输入菜单功能对应的数字");
		System.out.println("===================================");
		menuInfo();
		
	}
	public static void commandError() {
		System.err.println("\n错误操作，请选择菜单的功能再确认!\n");
		System.out.println("请输入菜单功能对应的数字");
		System.out.println("===================================");
	}
//	系统退出信息
	public static void systemExit() {
		System.out.println("正在退出系统...\n");
		System.out.println("===================================");
		System.out.println("************* 欢迎下次再来！************");
	}
	
}
