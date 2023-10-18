package experiments;

import java.util.ArrayList;
import java.util.LinkedList;

public class Cviko05
{
    public static final double[] HradecKralove = new double[]{15.8329925,50.2107875};
    public static final double[] Pardubice = new double[]{15.7793483,50.0375589};
    public static final double[] Praha = new double[]{14.4309158,50.085946};
    public static final double[] Brno = new double[]{16.6134186,49.1906197};
    public static final double[] KarlovyVary = new double[]{12.8609008, 50.2344114};
    public static final double[] Munchen = new double[]{11.5761872, 48.1376225};
    public static final double[] Beograd = new double[]{20.4709931, 44.8039419};

    public static void main(String[] args)
    {
        // Ukázka 1
        double d1 = Cviko05_Utils.geoDistance(Brno, Beograd);
        System.out.println("Vzdálenost: " + Math.round(d1/1000) + " km");

        // Ukázka 2
        Cviko05_List routeList = new Cviko05_List();
        routeList.addFirst(new Cviko05_Item(Brno, "Brno"));
        routeList.addFirst(new Cviko05_Item(Praha, "Praha"));
        routeList.addFirst(new Cviko05_Item(KarlovyVary, "KarlovyVary"));
        routeList.addFirst(new Cviko05_Item(Munchen, "Munchen"));


        double d2 = Cviko05_Utils.geoDistance(routeList);
        System.out.println("Celková vzdálenost: " + Math.round(d2/1000)+" km");

    }
}
