package software.ulpgc.kata6;

public class Calculator {
    public int sum(int i, int i1) {
        return i+i1;
    }

    public int subs(int i, int i1) {
        return i-i1;
    }

    public int mult(int i, int i1) {
        return i*i1;
    }

    public int div(int i, int i1) {
        if (i1==0) return 0;
        return i/i1;
    }

    public int squareRoot(int i) {
        return (int) Math.sqrt(i);
    }

    public int powerOf(int i, int i1) {
        return (int) Math.pow(i,i1);
    }

    public int factorial(int i) {
        int result =1;
        for(int j = i; j>0; j--){
            result*=j;
        }
        return result;
    }
}
