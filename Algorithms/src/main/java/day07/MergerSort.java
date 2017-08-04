package day07;

import java.util.Random;

public class MergerSort {
	private static int[] aux;
	private static void sort(int[] a){
		aux=new int[a.length];
		sort(a,0,a.length-1);
	}
	private static void sort(int[] a,int lo,int hi){
		if(hi<=lo){
			return;
		}
		int mid=lo+(hi-lo)/2;
		sort(a,lo,mid);
		sort(a,mid+1,hi);
		Merge.merge(a,lo,mid,hi);
	}
	private static void sort1(int[] a){
		int N=a.length;
		for(int i=1;i<N;i+=i){
			for(int lo=0;lo<N-i;lo+=i+i){
				Merge.merge(a,lo,lo+i-1,Math.min(lo+i+i-1, N-1));
			}
		}
	}
	public static void main(String[] args) {
		int[] a={42,93,44,1,42,30,14,55,97,41,59,0,59,11,20,16,63,12,42,52};
		sort(a);
		
		System.out.println();
		for(int i:a){
			System.out.print(i+"  ");
		}
	}
	

}
