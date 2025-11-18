public class 1-bit_and_2-bit_Characters_717 {
    
    public boolean isOneBitCharacter(int[] bits) {
        int i=0;
        while(i<bits.length-1){
            i+=bits[i]+1;
        }
        return i==bits.length-1;
    }
}

