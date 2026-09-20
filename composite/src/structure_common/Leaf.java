package structure_common;

public class Leaf implements IComponent {
    @Override
    public void execute() {
        System.out.println("Leaf execute");
    }
}
