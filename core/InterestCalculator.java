public class InterestCalculator {
    public static void main(String[] args) {
        Interest ii = new Interest(4000.0, 5, 2);
        print(ii.getInterest());
        Simple s = new Simple(8000.0, 4, 2);
        print(s.getInterest());
        print(((IInterest) s).getInterest());
    }
    private static void print(double interest) {
        System.out.print(String.format("~%5.2f~", interest));
    }
}
interface IInterest { double getInterest(); }
class Interest {
    double principal, rate, years;
    public Interest(double principal, double rate, double years) {
        this.principal = principal; this.rate = rate; this.years = years;
    }
    double getInterest() { return principal * rate * years;    }
}
class Simple extends Interest implements IInterest {
    public Simple(double principal, double rate, double years) {
        super(principal, years, rate);
    }
   public double getInterest() { return super.getInterest() / 100.0; }
}