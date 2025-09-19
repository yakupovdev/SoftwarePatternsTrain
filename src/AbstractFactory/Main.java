package AbstractFactory;

import AbstractFactory.buttons.IButton;
import AbstractFactory.checkboxes.ICheckbox;
import AbstractFactory.factory.DialogMacImpl;
import AbstractFactory.factory.DialogWindowsImpl;
import AbstractFactory.factory.IDialog;

public class Main {
    public static void main(String[] args) {
        IDialog dialogMac = new DialogMacImpl();
        IButton macButton = dialogMac.createButton();
        ICheckbox macCheckbox = dialogMac.createCheckbox();

        IDialog dialogWin = new DialogWindowsImpl();
        IButton winButton = dialogWin.createButton();
        ICheckbox winCheckbox = dialogWin.createCheckbox();

        macButton.render();
        winButton.render();

        macCheckbox.check();
        winCheckbox.check();

    }
}
