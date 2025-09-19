package AbstractFactory.factory;

import AbstractFactory.buttons.WindowsButtonImpl;
import AbstractFactory.checkboxes.WindowsCheckboxImpl;

public class DialogWindowsImpl implements IDialog {

    @Override
    public WindowsButtonImpl createButton() {
        return new WindowsButtonImpl();
    }

    @Override
    public WindowsCheckboxImpl createCheckbox() {
        return new WindowsCheckboxImpl();
    }

}
