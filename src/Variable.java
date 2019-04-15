public class Variable {
    String variableName;
    String type;

    public Variable(String variableName, String type) {
        this.variableName = variableName;
        this.type = type;
    }

    @Override
    public String toString() {
        return type + " " + variableName + ";";
    }
}
