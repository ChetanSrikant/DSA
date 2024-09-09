import static java.lang.Math.abs;

public class Newton_Sqrt {
    public static void main(String[] args) {
        System.out.println(sqrt(3));
    }

    static double sqrt(double n){
        double x = n;

        double root;

        while(true){
            root = 0.5*(x+n/x);

            if (abs(root-x)== 0){
                break;
            }

            x = root;
        }

        return root;
    }
}
