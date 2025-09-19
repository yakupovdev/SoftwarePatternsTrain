package AbstractFactory.buttons;

public class WindowsButtonImpl implements IButton {
    @Override
    public void render() {
        System.out.println("Windows Button");
    }
}
