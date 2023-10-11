package experiments;

public class Cviko02_Uloha03
{
    public static void main(String[] args)
    {
        int [] testValues = new int[]{45, 678, 64, 87, 55, 100};
        int [] testValues2 = new int[]{1, 2, 3, 4, 5, 6};

        System.out.println(isOrdered(testValues));
        System.out.println(isOrdered(testValues2));

    }

    // Doplň metodu, která informuje o tom, zda je dané pole seřazené
    //public static ... isOrdered( ... )
    //{
    //}

    public static boolean isOrdered(int values[]){
        for(int i = 1; i < values.length; i++){
            if(values[i-1] > values[i]){
                return false;
            }
        }
        return true;
    }
}
