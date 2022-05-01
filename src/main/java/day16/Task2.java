package day16;

import java.util.Scanner;

public class  Task2 {
    private static void zhuanzhi(String s,int a[]) {
        int len=s.length();
        for(int i=0;i<len;i++) {
            a[len-1-i]=Integer.parseInt(String.valueOf(s.charAt(i)));
        }
    }
    private static void XiangCheng(int a[],int b[],int c[]) {
        for(int i=0;i<100;i++) {
            for(int j=0;j<100;j++) {
                c[i+j]+=a[i]*b[j];
            }
        }
        for(int i=0;i<200-1;i++){
            c[i+1]+=c[i]/10;
            c[i]=c[i]%10;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String num1=s.nextLine();
        String num2=s.nextLine();
        int []a=new int[100];
        int []b=new int[100];
        int []c=new int[2*100];
        zhuanzhi(num1,a);
        zhuanzhi(num2,b);
        XiangCheng(a,b,c);
        int tmp=199;
        while(c[tmp]==0) {
            if(tmp==0) {
                System.out.println("0");
                return ;
            }
            tmp--;
        }
        for(int i=tmp;i>=0;i--) {
            System.out.print(c[i]);
        }
    }
}