package experiments;

public class Cviko02_Uloha05
{
    public static void main(String[] args)
    {
        int [] testValues = new int[]{45, 678, 0, 0, 55, 100, 55, 0, 0, 0, 555, 541};
        System.out.println(maxZeroIntervalLength(testValues));
    }

    // Doplň metodu, která informuje o tom, jaký nejvyšší počet nul se v poli vyskytuje za sebou
    //public static ... maxZeroIntervalLength( ... )
    //{
    //}

    public static int maxZeroIntervalLength(int[] values){
        int maxIntervalLength = 0;
        int current = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] == 0) {
                current++;
            } else {
                if(current > maxIntervalLength){
                    maxIntervalLength = current;
                }
                current = 0;
            }
        }

        if(current > maxIntervalLength){
            maxIntervalLength = current;
        }

        return maxIntervalLength;

    }
}
