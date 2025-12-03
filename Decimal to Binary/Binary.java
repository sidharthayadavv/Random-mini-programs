import java.util.Scanner;
class Binary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,n;
        int r,d;
        int bin;
        int newbin;
        char q='a';
        while(q!='q'){
            System.out.println("Enter a value: ");
            a=sc.nextInt();
            n=a;
            bin=0;
            d=0;
            newbin=0;
            while(n/2!=0){
                r=n%2;
                n=(int)n/2;
                bin=bin*10+r;
                d++;
            }

            bin=bin*10+n;
            while(d!=0){
                d--;
                newbin=(newbin*10)+(bin%10);
                bin=bin/10;
            }
            newbin=(newbin*10)+(bin%10);
            System.out.println("Binary of "+a+" = "+newbin);
            System.out.println("Press q to quit");
            q=sc.next().charAt(0);
        }
        
    }
}