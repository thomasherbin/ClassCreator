import java.util.ArrayList;

public class Class {
    String className;
    ArrayList<Variable> variables;

    public Class(String className, Variable variable) {
        this.className = className;
        this.variables = new ArrayList<>();
        this.variables.add(variable);
    }

    public void addVariable(Variable variable) {
        this.variables.add(variable);
    }

    public boolean variableAlreadyExist(String variableName) {
        for (Variable variable : variables) {
            if (variableName.equals(variable.variableName)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String str = "";
        str += "public class "+ className + " { \n";
        for (Variable variable : variables) {
            str += "    private ";
            str += variable.toString()+ "\n";
        }
        str += "}";
        return str;

    }
}
