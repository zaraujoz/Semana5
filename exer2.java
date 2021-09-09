public class exer2{
    public static void main (String[]attrs){
        int x=13;
        
        while(x!=1){
            
            boolean isPar = x%2==0;
            
            if(isPar){
                x = x/2;
            } 
            else {
                x = 3*x+1;
            }
            System.out.println("Valor de x: "+x);
        }

        
    }
}

    