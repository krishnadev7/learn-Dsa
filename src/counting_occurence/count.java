package counting_occurence;

public class count {
    public static void main(String[] args) {
        int n = 1385757579;
        int ans = 0;
        for(int i = 0; i<n; i++){
            if(n%10 == 3){
                ans += 1;
            }
            n /= 10;
        }
        System.out.println(ans);
    }
}
