package day07;

public class Merge {
	public static void merge(int []a,int lo,int mid,int hi){
		int i=lo,j=mid+1;
		int[] aux = new int[a.length];
		for(int k=lo;k<=hi;k++){
			aux[k]=a[k];
		}
		for(int k=lo;k<=hi;k++){
				 if(i>mid) a[k]=aux[j++];
			else if(j>hi) a[k]=aux[i++];
			else if(aux[i]>aux[j]) a[k]=aux[j++];
			else a[k]=aux[i++];
		}
	}

}
