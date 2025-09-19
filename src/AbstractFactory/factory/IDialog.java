package AbstractFactory.factory;

import AbstractFactory.buttons.IButton;
import AbstractFactory.checkboxes.ICheckbox;

public interface IDialog {
    IButton createButton();
    ICheckbox createCheckbox();
}
