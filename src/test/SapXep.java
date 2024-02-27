package test;

import java.util.ArrayList;

public class SapXep {

	
	public static void Swap(int a[],int i,int j) {
		int temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	public static void SapXepNoiBot(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					Swap(a,i,j);
				}
			}
		}
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
	
	public static void SapXepChen(int a[]) {
		for(int i=1;i<a.length;i++) {
			int x = a[i];
			int pos = i-1;
			while(pos>=0&&a[pos]>x) {
				a[pos+1]=a[pos];
				pos--;
			}a[pos+1]=x;
		}
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
	
	public static void ThamLam(int a[],int target) {
		ArrayList<Integer>temp = new ArrayList<Integer>();
	for (int i = 0; i < a.length; i++) 
	{ 
	    int sum=0;
		if (a[i] <= target) 
		{ 
			temp.add(a[i]);
			sum += a[i]; 
			
			if (sum > target) 
			{ 
				sum -= temp.get(temp.size()-1);
				temp.remove(temp.size()-1); 
			} 
		} 
	 } for (int i : temp) {
			System.out.print(i+" ");
		}
	 
	}
	
	public static void main(String[] args) {
        int a[] = {2,5,2,1,6,8,4,10};
        SapXepNoiBot(a);
        System.out.println("\n");
        SapXepChen(a);
        System.out.println("\n");
        ThamLam(a, a.length);
	}
}
