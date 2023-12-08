package ex2;

public class PerecheNumere {

    private int nr1;
    private int nr2;

    public PerecheNumere(int nr1, int nr2) {
        this.nr1 = nr1;
        this.nr2 = nr2;
    }

    public PerecheNumere() {
    }

    public int getNr1() {
        return nr1;
    }

    public void setNr1(int nr1) {
        this.nr1 = nr1;
    }

    public int getNr2() {
        return nr2;
    }

    public void setNr2(int nr2) {
        this.nr2 = nr2;
    }

    @Override
    public String toString() {
        return nr1 + " " + nr2;
    }

    public boolean suntConsecutiveInFibonacci() {
        int a = Math.min(nr1, nr2);
        int b = Math.max(nr1, nr2);

        int fib1 = 0;
        int fib2 = 1;

        if(nr1==0&&nr2==1)
            return true;

        if(nr1==1&&nr2==1)
            return true;

        while (fib2 <= a) {
            int fibNext = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibNext;
        }

        if (fib1 == a && fib2 == b)
            return true;

        return false;
    }


    public int CMMDC() {
        int x = nr1;
        int y = nr2;

        while (x != 0 && y != 0)
            if (x > y)
                x = x - y;
            else
                y = y - x;

        return x;
    }

    public int suma()
    {
        return nr1+nr2;
    }

}

