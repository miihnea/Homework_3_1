public class Ecuation {
    private EcuationParameters ecuationParameters;

    public Ecuation(EcuationParameters ecuationParameters) {
        this.ecuationParameters = ecuationParameters;
    }

    public JSONSolution solve(){
        if(ecuationParameters.getParameters().get(0)==0){
            return null;
        }else if(ecuationParameters.getParameters().get(1)==0 && ecuationParameters.getParameters().get(0)!=0){
            return new JSONSolution(0);
        }else{
            return new JSONSolution(-ecuationParameters.getParameters().get(1)/ecuationParameters.getParameters().get(0));
        }
    }
}
