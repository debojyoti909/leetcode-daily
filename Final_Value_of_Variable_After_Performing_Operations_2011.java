public class Final_Value_of_Variable_After_Performing_Operations_2011 {
    public int finalValueAfterOperations(String[] operations) {
        int res=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("--X")|| operations[i].equals("X--")){
                res=res-1;
            }else{
                res=res+1;
            }
        }
        return res;
    }
}
