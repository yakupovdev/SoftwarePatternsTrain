package Bridge.heroes;

import Bridge.skills.ISkill;
import Bridge.weapons.IWeapon;

public class Mage extends Hero {
    public Mage(IWeapon weapon, ISkill skill) { super(weapon, skill); }

    @Override
    public void fight() {
        System.out.print("Mage ");
        weapon.attack();
        System.out.print("Mage also ");
        skill.useSkill();
    }
}