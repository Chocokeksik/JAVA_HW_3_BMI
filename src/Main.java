public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();

        float bmi1 = service.calculate(100, 1.98F);
        System.out.println("ИМТ1: " + bmi1);

        float bmi2 = service.calculate(55, 1.64F);
        System.out.println("ИМТ2: " + bmi2);
    }

}
