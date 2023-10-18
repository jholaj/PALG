package experiments;

public class Cviko05_Utils
{
    public static double geoDistance(double[] lonLat1, double[] lonLat2)
    {
        double lon1 = lonLat1[0];
        double lat1 = lonLat1[1];
        double lon2 = lonLat2[0];
        double lat2 = lonLat2[1];
        final int earthRadius = 6371000;
        double latDistance = Math.toRadians(lat2 - lat1);
        double lonDistance = Math.toRadians(lon2 - lon1);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = earthRadius * c;
        distance = Math.pow(distance, 2);
        return Math.sqrt(distance);
    }

    public static double geoDistance(Cviko05_List list)
    {
        double sum = 0;
        for(int i = 0; i < list.size() - 1; i++){
            double[] coords1 = list.get(i).getCoords(); // index i
            double[] coords2 = list.get(i+1).getCoords(); // index i + 1
            double distance = geoDistance(coords1, coords2);
            sum += distance;
        }
        return sum;
    }
}
