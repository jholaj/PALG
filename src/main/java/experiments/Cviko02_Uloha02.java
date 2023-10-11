package experiments;

public class Cviko02_Uloha02
{
    public static void main(String[] args)
    {
        int [] testValues = new int[]{45, 678, 64};
        System.out.println(sumOfNumbers(testValues, 70));
    }

    // Doplň metodu, která vrátí součet těch čísel v poli, která jsou nižší než daný limit
    //public static ... sumOfSmall( ... )
    //{
    //}

    public static int sumOfNumbers (int values[], int limit) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum = 0;
            if (values[i] < limit) {
                sum = sum + values[i];
            }
        }
        return sum;
    }

}
