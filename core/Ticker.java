import java.awt.Component;
public class Ticker extends Component {
    public static void main(String[] args) {
        Ticker t = new Ticker();
        /* Missing Statements ? */
// boolean test = (Component instanceof t);
 boolean test = (t instanceof Ticker);   
boolean test1 = (t instanceof Component); 
}
}