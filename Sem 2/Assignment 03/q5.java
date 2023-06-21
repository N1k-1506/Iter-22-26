package Dsa_03;

import java.util.Scanner;
public class q5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer[] array=new Integer[5];
        System.out.println("Enter elements of array ");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter element to search for: ");
        int n=sc.nextInt();
        int a=count(array,n );
        System.out.printf("Number of times %d present in the array is %d",n,a);

    }
    public static <T> int count(T[] array, T item){
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i].equals(item)){
                count++;
            }
        }
        return count;
    }

}
