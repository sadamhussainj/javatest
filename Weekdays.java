import java.util.*;
class Weekdays{
public static void main(String[] args){
System.out.println("enter the N:");
Scanner scan=new Scanner(System.in);
int N=scan.nextInt();
switch(N)
{
case 1:
    System.out.println("Monday");
    break;
case 2:
    System.out.println("Tuesday");
    break;
case 3:
    System.out.println("Wednesday");
    break;
case 4:
    System.out.println("Thursday");
    break;
case 5:
    System.out.println("friday");
    break;
case 6:
    System.out.println("Saturday");
    break;
case 7:
    System.out.println("Sunday");
    break;
default:
    System.out.println("WEEKDAY");
    break;
}
}
}
