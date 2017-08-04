 package day07;

public class Partition {
	public static int partition(int[] a,int lo,int hi){
		int i=lo,j=hi+1;
		int v=a[lo];
		while(true){
			while(a[++i]>v){
				if(i==hi) break;
			}while(v>a[--j]){
				if(j==lo) break;
			}
			if(i>=j) break;
			exch(a,i,j);
		}
		exch(a,lo,j);
		return j;
		
	}
	public static void exch(int[] a,int i,int j){
		int t=a[i];a[i]=a[j];a[j]=t;
	}

}
