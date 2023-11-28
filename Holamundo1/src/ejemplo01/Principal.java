package ejemplo01;

public class Principal {

    public static void main(String[] args) {
        
        
        System.out.println("El factorial de 5 es "+factorial(5));

    }

    
    
    public static int factorial (int n) {
        
        int result = 1;
        for (int i = n; i<=1; i++) {
            result = result*i;
            
            
        }
        return result;
    }
    public static int multi(int a, int b) {
    	return a*b;
    }
    
}