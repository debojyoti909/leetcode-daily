import java.util.*;
class Odd_Thread extends Thread{
    public void run(){
        try{
            for(int i=1;i<10;i=i+2){
                System.err.println(i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.err.println(e.getMessage());
        }
    }
}
class Even_Thread extends Thread{
    public void run(){
        try{
        for(int i=2;i<10;i+=2){
            System.err.println(i);
            Thread.sleep(500);
        }
        }catch(InterruptedException e){
            System.err.println(e.getMessage());
        }
    }
}
class Num_Thread extends Thread{
    public void run(){
        try{
            for(int i=0;i<20;i++){
                System.err.println("number print thread - "+i);;
                Thread.sleep(100);
            }
        }catch (InterruptedException e){
            System.err.println(e.getMessage());
        }
    }
}
public class Threading {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Odd_Thread o=new Odd_Thread();
        Even_Thread ev= new Even_Thread();
        Num_Thread n= new Num_Thread();

        o.start();
        ev.start();
        n.start();

    }
}
