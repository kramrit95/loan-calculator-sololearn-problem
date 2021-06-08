import java.util.Scanner;

public class Program
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		//your code goes here
int r=0;
int x=0;
for(int i=1;i<=3;i++){
x=amount/10;
r=amount-x;
amount =r;

    
    
    
}
		
System .out.println (r);
	}
}
