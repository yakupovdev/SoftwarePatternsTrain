package Bridge.heroes;


import Bridge.skills.ISkill;
import Bridge.weapons.IWeapon;

public abstract class Hero {
    protected final IWeapon weapon;
    protected final ISkill skill;

    public Hero(IWeapon weapon, ISkill skill) {
        this.weapon = weapon;
        this.skill = skill;
    }

    public abstract void fight();

}
