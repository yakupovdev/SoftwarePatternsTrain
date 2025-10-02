package Bridge;

import Bridge.heroes.*;
import Bridge.weapons.*;
import Bridge.skills.*;

public class Main {
    public static void main(String[] args) {
        Hero warrior = new Warrior(new SwordImpl(), new HealImpl());
        warrior.fight();

        Hero assassin = new Assassin(new BowImpl(), new TeleportImpl());
        assassin.fight();

        Hero mage = new Mage(new MagicStaffImpl(), new CriticalStrikeImpl());
        mage.fight();
    }
}