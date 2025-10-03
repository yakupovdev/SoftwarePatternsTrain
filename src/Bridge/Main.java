package Bridge;

import Bridge.heroes.*;
import Bridge.weapons.*;
import Bridge.skills.*;

public class Main {
    public static void main(String[] args) {
        IWeapon weapon = new SwordImpl();
        ISkill skill = new HealImpl();

        Hero warrior = new Warrior(weapon, skill);
        warrior.fight();

        weapon = new BowImpl();
        skill = new TeleportImpl();

        Hero assassin = new Assassin(weapon, skill);
        assassin.fight();

        weapon = new MagicStaffImpl();
        skill = new CriticalStrikeImpl();

        Hero mage = new Mage(weapon, skill);
        mage.fight();
    }
}