package Bridge.heroes;

import Bridge.skills.ISkill;
import Bridge.weapons.IWeapon;

public class Warrior extends Hero {
    public Warrior(IWeapon weapon, ISkill skill) { super(weapon, skill); }

    @Override
    public void fight() {
        System.out.print("Warrior ");
        weapon.attack();
        System.out.print("Warrior also ");
        skill.useSkill();
    }
}
