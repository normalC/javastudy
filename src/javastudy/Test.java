package javastudy;

public class Test {
	 
	  public static void main( String args[] ) {
		//���͵����Ͳ���ֻ���������ͣ������Զ����ࣩ�������Ǽ�����
		//�����ʵ���������뷺�͵����Ͳ���������ͬ����ΪInteger.
		Generic<Integer> genericInteger = new Generic<Integer>(123456);

		//�����ʵ���������뷺�͵����Ͳ���������ͬ����ΪString.
		Generic<String> genericString = new Generic<String>("key_vlaue");
		
		System.out.printf("���Ͳ���","key is " + genericInteger.getKey());
		System.out.printf("���Ͳ���","key is " + genericString.getKey());
	  }
	  
	   

}
