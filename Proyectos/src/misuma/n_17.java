
package misuma;

public class n_17 {
    public static void main(String[] args) {
        int n=17;
        
        for(int i=0; i<13; i++){
            if(n==1){
                System.out.println("el número ya vale 1");
            } else if(n%2==0){
                n=n/2;
                System.out.println(n);
            }else{
                n= (n*3)+1;
                System.out.println(n);
            }
        }
    }
}
