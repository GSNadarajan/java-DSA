public class Occurence {
    public static void main(String[] args) {
        //no of occurence in a string
        int value = 222222, count = 0;
        while(value> 0){
            int rem = value % 10;
            if(rem == 2){
                count++;
            }
            value = value / 10;

        }
        System.out.println("No of occurence is:"+ count);

        
    }
    
}
