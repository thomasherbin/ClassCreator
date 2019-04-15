import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassWriterTest {
    @Test
    void ClassWriter() throws Exception {
        ClassWriter classWriter = new ClassWriter("sqlResults.txt");
        System.out.println(classWriter.toString());
    }
}