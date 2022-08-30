public class Investment {

    public static double investment(double c, double r, int t, double n){
        return c*Math.pow(1+r/n, t*n);
    }

    public static void main(String [] args)  {

        double c = 1.0;  // initial deposit
        double r = 1.0;     // 100% interest
        int t = 1;          // number of years
        double n = 1e9;     // compound a billion times
                // cast int to a double by  (int) 1e9 -> allows n to be an i

        System.out.println(investment(1.0, 1.0, 1, 2e9));
        System.out.println(investment(1000, .03, 10, 365));

    }

}
