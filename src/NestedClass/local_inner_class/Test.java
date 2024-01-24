package NestedClass.local_inner_class;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        t.get_result();
    }
    public void get_result(){
        class Division{
            private int divisible;
            private int divisor;

            public void setDivisible(int divisible) {
                this.divisible = divisible;
                System.out.println("set  " + divisible);
            }

            public void setDivisor(int divisor) {
                this.divisor = divisor;
                System.out.println("set  " + divisor);

            }

            public int getDivisible() {
                return divisible;
            }

            public int getDivisor() {
                return divisor;
            }

            public double quotient(){
                return  (double)Math.round(((double)divisible/divisor)*100)/100;
            }

        }



        Division divis = new Division();
        divis.setDivisible(30);
        divis.setDivisor(7);
        System.out.println("quotien " + divis.quotient() );

    }

}
