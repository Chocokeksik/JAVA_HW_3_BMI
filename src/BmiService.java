public class BmiService {
    public float calculate(float kg, float m) {
        float m2 = m * m;
        float bmi = kg / m2;
        return bmi;
    }
}


