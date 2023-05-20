public class JSONSolution {
    private Integer solution;

    public JSONSolution(Integer solution) {
        this.solution = solution;
    }

    public Integer getSolution(){
        return solution;
    }


    public String JsonSolution(){
        return "{\"solution\":\""+this.solution+"\"}";
    }

}
