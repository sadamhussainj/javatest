import java.util.*;
class AverageofNums{
public static void main(String[] args){
System.out.println("enter the N:");
Scanner scan=new Scanner(System.in);
int N=scan.nextInt();
float c=0,sum=0,v;
float a=N;
while(N!=0){
v=N%10;
sum=sum+v;
N=N/10;
c++;
}
System.out.println("count"+c);
System.out.println("sum="+sum);
float avg=sum/c;
System.out.println("avg="+avg);
}
}
