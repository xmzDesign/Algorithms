package day08;
import day07.Partition;
public class Quick {
	public static void sort(int[] a){
		sort(a,0,a.length-1);
	}
	public static void sort(int[] a,int lo,int hi){
		if(hi<=lo) return;
		Partition parttion=new Partition();
		int j=parttion.partition(a, lo, hi);
		sort(a,0,j-1);
		sort(a,j+1,hi);
	}
	public static void main(String[] args) {
		int[] a={42,93,21,24};
		sort(a);
//		int j=a.length;
//		while(21<a[--j]){
//			System.out.println(1);
//		}
		for(int i:a){
			System.out.print(i+"  ");
		}
	}

}
