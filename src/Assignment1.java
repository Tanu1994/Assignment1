public class Assignment1 {

    private int n;

    public Assignment1(){
    }

    public void printAsterisk(){
        System.out.print("*");
    }

    public void printHorizontalLine(int n){
        for (int i = 0 ; i < n ; i++){
            System.out.print("*");
        }
    }

    public void printVerticalLine(int n){
        for (int i = 0 ; i < n ; i++){
            System.out.println("*");
        }
    }

    public void printRightTriangle(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printIsoscelesTriangle(int n){
        int k = 0;
        for (int i = 1 ; i <= n; i++){
            for (int j = 1 ; j <= 2*n-1; j++){
                if ((j <= n+k) && (j >= n-k)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            k++;
            System.out.println();
        }
    }

}
