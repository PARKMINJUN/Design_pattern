package org.Strategy_Pattern;

public class GameCharacter {
    // 접근접
    private Weapon weapon;

    // 교환 가능
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    public void attack() {
        if(weapon == null) {
            System.out.println("맨손 공격");
        } else {
            weapon.attack();
        }
    }
}
