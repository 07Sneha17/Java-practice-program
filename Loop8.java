public class Loop8{
    public static void main(String[] args){
        int n=10;
        int s=0;
        for(int i=1; i<=n;i++) {
            if(i%2!=0) {
                s+=i;
            }
        }



        System.out.println(s);
    }
}