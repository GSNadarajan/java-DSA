public class Reverse {
    public static void main(String[] args){
        int value = 12345 ,rem;
        int ans = 0;
        while(value > 0){
             rem = value % 10;
            value = value / 10;
            ans = ans * 10 + rem ;
        }
        System.out.println(ans);
    }
    
}
