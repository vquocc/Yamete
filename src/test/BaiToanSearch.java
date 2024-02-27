package test;

public class BaiToanSearch {
	
	// Tim Kiem Tuyen Tinh
	public static int LinearSearch(int x,int a[],int n) {
		for(int i=0;i<n;i++) {
			if(a[i]==x) {
				return i;
			}
		}return -1;
	}
	
	//Tim Kiem Nhi Phan De Quy
	public static int BinSearch(int x,int a[],int i,int j) {
		if(i<=j) {
			int c = (i+j)/2;
			if(x==a[c]) {
				 return c;
			}else if(x<a[c]) {
				   return BinSearch(x, a, i, c-1);
			}else {
				    return BinSearch(x, a, c+1, j);
			}
		}return -1;
	}
	
	//Tim Kiem Nhi Phan De Quy
	public static int BinSearchLoop(int x,int a[],int n) {
		int i = 0;
		int j = n,c;
		while(i<=j) {
			c=(i+j)/2;
			if(x==a[c]) {
				return c;
			}else if(x<a[c]) {
				j = c-1;
			}else {
				i = c+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
         int a[] = {1,2,3,4,5,6};
         System.out.println("BinarySearch: "+BinSearch(4, a, 0, a.length-1));
         System.out.println("BinarySearch Loop: "+BinSearchLoop(4, a, a.length-1));
         System.out.println("LinearSearch: "+LinearSearch(4, a, a.length));
	}
}
