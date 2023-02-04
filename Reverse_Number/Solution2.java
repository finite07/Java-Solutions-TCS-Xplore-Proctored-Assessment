import java.util.Scanner;

class test{
        public static void main(String[] args){
            Scanner scan=new Scanner(System.in);
                String str= scan.next();
               String nstr=" ";
               char ch;

               for(int i=0;i<str.length();i++){
                   ch=str.charAt(i);
                   nstr=ch+nstr;



               }
            System.out.println(nstr);



        }
}
