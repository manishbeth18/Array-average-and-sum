import java.util.*;
public class Arraysumavg {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n[] = new int[5];
    int sum=0;
    double average;
    int i;
    System.out.println("Enter the elements of the array:");
    for(i=0;i<n.length;i++){
        n[i]= sc.nextInt();


    }
    for(i=0;i<n.length;i++){
        sum = sum+n[i];
    }
    System.out.println("The sum of the elements are:"+sum);
    average = sum/n.length;
    System.out.println("The average of the elements are:"+average);


    }


}
