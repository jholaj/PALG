package experiments;

public class Cviko02_Uloha01
{
    public static void main(String[] args)
    {
        float [] testValues = new float[]{45.5f, 678.5f, 64.4f};
        odmocniny(testValues); // TOHLE JE OK



        float x = 64.846f;
        odmocnina(x); // TOHLE NENÍ OK
        System.out.println(x);

        for(int i = 0; i < testValues.length; i++){
            System.out.println(testValues[i]);
        }
    }

    // Doplň metodu, která všechny čísla v zadaném poli nahradí jejich odmocninami
    public static void odmocniny(float[] values) // float[] primitivní není
    {
        for(int i = 0; i < values.length; i++){
            values[i] = (float) Math.sqrt(values[i]);
        }

    }

    // Doplň metodu, která jedno zadané číslo nahradí jeho odmocninou
    public static void odmocnina(float value) // float je primitivní
    {
        value = (float) Math.sqrt(value);

    }
}
