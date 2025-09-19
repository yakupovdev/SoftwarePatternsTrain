package AbstractFactory.buttons;

public class MacButtonImpl implements IButton {
    @Override
    public void render() {
        System.out.println("Mac Button");
    }
}
