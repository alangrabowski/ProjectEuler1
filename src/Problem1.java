public class Problem1 {
    public static void main(String[] args) {
        int i, x=0;
        for (i=0; i<1000; i++){
            if (i%3==0||i%5==0)
                x+=i;
        }
        System.out.println(x);
    }
}