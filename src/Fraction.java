public class Fraction {
    private double numerator;
    private double denominator;

    public Fraction(double numerator, double denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public double GetterAbove(){
        return this.numerator;
    }

    public double GetterBelow(){
        return this.denominator;
    }

    public Fraction addFraction(Fraction f1){
        Fraction sum = new Fraction((this.numerator*f1.GetterBelow()+
             f1.GetterAbove()*this.denominator) ,  (this.denominator*f1.GetterBelow()));
        return sum;
    }

    public Fraction multiplyFraction(Fraction f1){
        Fraction sum = new Fraction(this.numerator*f1.GetterAbove(), this.denominator*f1.GetterBelow());
        return sum;
    }

    public static Fraction SimplifyFraction(Fraction f1){
        if (f1.GetterAbove() == f1.GetterBelow()){
            return new Fraction(1.0,1.0);
        }
        if (f1.GetterAbove() > f1.GetterBelow()){
            for(int i = (int) f1.GetterAbove(); i != 1; i--){
                if( f1.GetterAbove()%i ==0 &&  f1.GetterBelow()%i ==0 ){
                    return new Fraction( f1.GetterAbove()/i, f1.GetterBelow()/i);
                }
            }
        }

        if (f1.GetterAbove() < f1.GetterBelow()){
             for(int i = (int) f1.GetterBelow(); i != 1; i--){
                if( f1.GetterAbove()%i ==0 &&  f1.GetterBelow()%i ==0 ){
                    return new Fraction( f1.GetterAbove()/i, f1.GetterBelow()/i);
                }
            }
        }
        return f1;
    }

    public static void main(String[]args){
        Fraction r1 = new Fraction(1 , 2);
        Fraction r2 = new Fraction(2,3);
        Fraction r3 = new Fraction(17,34);
        Fraction a = r1.addFraction(r2);
        Fraction b = r1.multiplyFraction(r2);
        Fraction c = SimplifyFraction(r3);
        System.out.println(a.GetterAbove()+ "/" + a.GetterBelow()); 
        System.out.println(b.GetterAbove()+ "/" + b.GetterBelow()); 
        System.out.println(c.GetterAbove()+ "/" + c.GetterBelow());
    }
}