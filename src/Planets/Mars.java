package Planets;

public class Mars extends MainPlanets.Planet implements MainPlanets.PlanetInterface {
    float G = (float) 3.721 ;
    int number = 4;
    double mas = 997360000;

    int getNumber() {
        return number;
    }
    double getMas() {
        return mas;
    }

    public float getG() {
        return G;
    }
}