package implementation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CircularlylinkedLIst<Integer>list = new CircularlylinkedLIst<>();
		int a =1;
		int b=2;
		int c=3;
		int d=4;
		
		System.out.println(list.getsize());
		System.out.println("first element in the list ="+list.getfisrt());
		System.out.println("last element in the list = "+list.getlast());
		
		System.out.println();
		list.addfisrt(a);
		System.out.println("first element in the list ="+list.getfisrt());
		System.out.println("last element in the list = "+list.getlast());
		System.out.println();
		list.addfisrt(b);
		System.out.println("first element in the list ="+list.getfisrt());
		System.out.println("last element in the list = "+list.getlast());
		System.out.println();
		list.addlast(c);
		System.out.println("first element in the list ="+list.getfisrt());
		System.out.println("last element in the list = "+list.getlast());
		System.out.println();
		list.addfisrt(d);
		System.out.println("first element in the list ="+list.getfisrt());
		System.out.println("last element in the list = "+list.getlast());
		System.out.println();
		list.removefirst();
		System.out.println("first element in the list ="+list.getfisrt());
		System.out.println("last element in the list = "+list.getlast());
		System.out.println();
		System.out.println(list.isEmpty());
		
	}

}
