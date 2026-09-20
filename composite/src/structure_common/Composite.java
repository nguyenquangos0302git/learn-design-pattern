package structure_common;

import java.util.ArrayList;
import java.util.List;

public class Composite implements IComponent {

    private List<IComponent> children = new ArrayList<>();

    public void addChildren(IComponent iComponent) {
        children.add(iComponent);
    }

    @Override
    public void execute() {
        for (IComponent child : children) {
            child.execute();
        }
    }

}
