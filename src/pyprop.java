import com.jetbrains.python.psi.PyKnownDecoratorProvider;
import org.jetbrains.annotations.Nullable;
import java.io.*;

public class pyprop implements PyKnownDecoratorProvider {

    private PrintWriter writer;

    public pyprop() throws IOException {
        this.writer = new PrintWriter(new FileWriter("/tmp/foo.txt"));
        this.writer.println("Plugin is initiated");
    }

    @Nullable
    @Override
    public String toKnownDecorator(String decoratorName) {
        this.writer.println(String.format("Processing decorator: %s", decoratorName));
        return decoratorName.equals("__property__") ? "property" : null;
    }
}
