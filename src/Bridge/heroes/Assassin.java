package Bridge.heroes;

import Bridge.skills.ISkill;
import Bridge.weapons.IWeapon;

public class Assassin extends Hero {
    public Assassin(IWeapon weapon, ISkill skill) { super(weapon, skill); }

    @Override
    public void fight() {
        System.out.print("Assassin ");
        weapon.attack();
        System.out.print("Assassin also ");
        skill.useSkill();
    }
}
