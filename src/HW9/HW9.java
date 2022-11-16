package HW9;

import Chap9ImmutableObjects.BigIntegerPlay;

import java.math.BigInteger;

public class HW9 {

    public static BigInteger bigPow(BigInteger x, int y){
        BigInteger prod = BigInteger.ONE;

        for (int i = 0; i < y; i++)
            prod = prod.multiply(x);

        return prod;
    }


    public static BigInteger fastBigPow(BigInteger x, int y){
        if (y == 0)
            return BigInteger.ONE;
        else if (y % 2 == 0)
            return fastBigPow(x, y /2).multiply(fastBigPow(x, y / 2));
        else
            return x.multiply(fastBigPow(x, y - 1));
    }



    public static void main(String[] args) {
        System.out.println(bigPow(BigInteger.TWO, 3));
        System.out.println(fastBigPow(BigInteger.TWO, 3));
    }
}
