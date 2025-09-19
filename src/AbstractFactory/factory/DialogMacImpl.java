package AbstractFactory.factory;

import AbstractFactory.buttons.MacButtonImpl;
import AbstractFactory.checkboxes.MacCheckboxImpl;

public class DialogMacImpl implements IDialog {

    @Override
    public MacButtonImpl createButton() {
        return new MacButtonImpl();
    }

    @Override
    public MacCheckboxImpl createCheckbox() {
        return new MacCheckboxImpl();
    }
}
