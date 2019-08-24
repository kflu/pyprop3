import com.jetbrains.python.psi.PyKnownDecoratorProvider;
import org.jetbrains.annotations.Nullable;

public class pyprop implements PyKnownDecoratorProvider {
    @Nullable
    @Override
    public String toKnownDecorator(String decoratorName) {
        return decoratorName.equals("__property__") ? "property" : null;
    }
}
