package experiments;

// Doplň metodu delkyJmen tak, aby vracela pole obsahující délky řetězců

public class Cviko01_Uloha04
{
    public static void main(String[] args)
    {
        String[] jmena = new String[]{"Honza", "Kuba", "Kryšpín"};
        int[] delky = delky(jmena);
        System.out.println("Delka prvniho jmena: "+delky[0]);
    }

    public static int[] delky(String[] hodnoty)
    {
        int[] poleDelky = new int[hodnoty.length];
        for(int i = 0; i < hodnoty.length; i++){
            poleDelky[i] = hodnoty[i].length();
        }
        return poleDelky;
    }
}
