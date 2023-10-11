package experiments;

public class Cviko02_Uloha04
{
    public static void main(String[] args)
    {
        System.out.println(isLeapYear(2100));
    }

    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    // Doplň metodu, která informuje o tom, zda je daný rok přestupný
    //public static ... isLeapYear( ... )
    //{
    //}
}
