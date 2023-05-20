public class Main {
    public static void main(String[] args) {
        EcuationParameters ecuationParameters = new EcuationParameters();
        ecuationParameters.addParameter(3);
        ecuationParameters.addParameter(-3);

        Ecuation ecuation = new Ecuation(ecuationParameters);
        JSONSolution jsonSolution = ecuation.solve();

        System.out.println(jsonSolution.getSolution());

    }
}
