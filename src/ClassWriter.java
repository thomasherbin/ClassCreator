import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class ClassWriter {
    ArrayList<Class> classes;

    public ClassWriter(String file) throws Exception {
        File fl = new File("C:\\Users\\chewi\\Documents\\Ecole\\Isep\\a2\\[II.2315] Algorithmique et programmation avancée\\ClassCreator\\"+ file);
        BufferedReader bf = new BufferedReader(new FileReader(fl));
        String line;
        this.classes = new ArrayList<>();
        while ((line = bf.readLine()) != null) {
            if (!line.isEmpty()) {
                String className = line.split(",")[0];
                String variableName = line.split(",")[1];
                String variableType = line.split(",")[2];

                Variable variableToAdd = new Variable(variableName, variableType);
                Class classToAdd = new Class(className, variableToAdd);

                if (!classAlreadyExist(className)) {
                    this.classes.add(classToAdd);
                } else {
                    if (!this.getClass(className).variableAlreadyExist(variableName)) {
                        this.getClass(className).addVariable(variableToAdd);
                    }
                }
            }
        }
    }

    private Class getClass(String className) {
        for (Class classs : classes) {
            if (className.equals(classs.className)) {
                return classs;
            }
        }
        return null;
    }

    private boolean classAlreadyExist(String className) {
        for (Class classs : classes) {
            if (className.equals(classs.className)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String str = "";
        for (Class classs : classes) {
            str += classs.toString() + "\n";
        }
        return str;
    }
}
