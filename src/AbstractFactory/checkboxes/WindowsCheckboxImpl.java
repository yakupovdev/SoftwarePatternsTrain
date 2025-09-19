package AbstractFactory.checkboxes;

public class WindowsCheckboxImpl implements ICheckbox {
    @Override
    public void check() {
        System.out.println("Windows Checkbox");
    }
}
