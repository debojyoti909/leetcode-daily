import java.util.*;
class AgeException extends Exception{
    public AgeException(String mag){
        super(mag);
    }
}

class Error_Handling{
static void agechk(int age) throws AgeException{
    if(age<18)
{
    throw new AgeException("Age is less");
}else{
    System.err.println("Age is valid");
}
}

public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    Error_Handling er=new Error_Handling();
    int a=sc.nextInt();
    try{
        er.agechk(a);
    }catch (AgeException e){
        System.err.println(e.getMessage());
    }
}
}