package chap6;
import javassist.gluonj.util.Loader;

// To run,
// java -cp ./bin:gluonj.jar chap6.FileRunner src/chap6/sum.stone

public class FileRunner {
    public static void main(String[] args) throws Throwable {
        Loader.run(BasicFileInterpreter.class, args, BasicEvaluator.class);
    }
}
