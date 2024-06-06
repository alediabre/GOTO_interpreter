package org.lenguajegoto;

public class GodelUtils {

    public static int nextPrime(int num) {
        if (num <= 1) {return 2;}
        int nextNumber = num + 1;
        while (!isPrime(nextNumber)) {
            nextNumber++;
        }
        return nextNumber;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {return false;}
        if (num <= 3) {return true;}
        if (num % 2 == 0) {return false;}
        for (int i = 5; i * i <= num; i += 2) {
            if (num % i == 0) {return false;}
        }
        return true;
    }
}

