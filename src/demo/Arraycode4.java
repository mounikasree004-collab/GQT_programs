package demo;

/*
 * lang    type     movie
 * 0        0         2
 *          1         2
 *          2         2
 *  1       0         2
 *          1         2
 *          2         2
 *  2       0         2
 *          1         2
 *          2         2
 */

import java.util.Scanner;

public class Arraycode4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lang count:");
		int lang=sc.nextInt();
		System.out.println("Enter the types  count:");
		int type=sc.nextInt();
		System.out.println("Enter the movie count:");
		int movie=sc.nextInt();
		long investment=70000001;
		long prev_profit=30000001;
		
		long overall_revenue = 0;
		//creating the array
		long arr[][][] = new long [lang][type][movie];
		
		//creating array for each language
		long lang_arr[] = new long[lang];
		int temp=0;
		
		//collecting the revenue made by each movie
		for(int i=0;i<arr.length;i++) {
			System.out.println(" Inside the lang no :"+(i+1));
			long lang_cnt = 0;
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside the Type no:"+(j+1));
					for(int k=0;k<arr[i][j].length;k++) {
						System.out.println("Enter the collection made by movie no:"+(k+1));
						arr[i][j][k]=sc.nextLong();
						overall_revenue = overall_revenue + arr[i][j][k];
						lang_cnt = lang_cnt + arr[i][j][k];
					}
			}
		}
		System.out.println("-------------");
	    System.out.println("Overall revenue made = "+overall_revenue);
	    System.out.println("-------------");
	    long prof_los=0;
	    System.out.println("Comparing the Investment and Revenue");
	    if(overall_revenue > investment) {
	    	prof_los = overall_revenue - investment;
	    	System.out.println("Jagadeesh has made a profit of:"+prof_los);
	    	}
	    else {
	    	prof_los = investment - overall_revenue;
	    	System.out.println("Jagadeesh has incured an loss of:"+prof_los);
	    	
	    }
	    System.out.println("-------------");
	    System.out.println("Comparing the prof/loss an loss and prev year profit");
	    if(prof_los>prev_profit) {
	    	System.out.println("Jagadeesh has incured an loss of:"+prof_los);
	    }
	   
	}
}
