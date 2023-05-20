import java.util.ArrayList;

public class EcuationParameters {
    private ArrayList<Integer> parameters;

    public EcuationParameters(){
        this.parameters = new ArrayList<Integer>();
    }

    public void addParameter(Integer e){
        this.parameters.add(e);
    }
    public void  removeParameter(Integer e){
        this.parameters.remove(e);
    }

    public ArrayList<Integer> getParameters() {
        return parameters;
    }

    public void setParameters(ArrayList<Integer> parameters) {
        this.parameters = parameters;
    }
}
