package shoppingSystem;

public class Info {
//	��ʾ��ӭ��Ϣ
	public static void welcomeInfo() {
		System.out.println("===================================");
		System.out.println("**********��ӭʹ��Fay�Ĺ���ϵͳ**********");
	}
//��ʾ���ܲ˵�
	public static void menuInfo() {
		System.out.println("	��ѡ��ִ�еĲ���	  ");
		System.out.println("  1  ��ʾ������Ʒ		");
		System.out.println("  2  �����Ʒ		");
		System.out.println("  3  ɾ����Ʒ		");
		System.out.println("  4  ��ʾ�ܼ�Ǯ		");
		System.out.println("  5  �޸���Ʒ����		");
		System.out.println("  6  ��չ��ﳵ	");
		System.out.println("  7  �˳�ϵͳ	");
		System.out.println("  [�س�] ȷ��	");
		
	}
	public static void finishInfo() {
		System.out.println("������ɣ������...");
		System.out.println("������˵����ܶ�Ӧ������");
		System.out.println("===================================");
		menuInfo();
		
	}
	public static void commandError() {
		System.err.println("\n�����������ѡ��˵��Ĺ�����ȷ��!\n");
		System.out.println("������˵����ܶ�Ӧ������");
		System.out.println("===================================");
	}
//	ϵͳ�˳���Ϣ
	public static void systemExit() {
		System.out.println("�����˳�ϵͳ...\n");
		System.out.println("===================================");
		System.out.println("************* ��ӭ�´�������************");
	}
	
}
