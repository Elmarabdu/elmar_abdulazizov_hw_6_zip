class Boss extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo() {
        return "Boss: " + getName() + ", Health: " + getHealth() + ", Damage: " + getDamage() +
                ", Weapon: " + weapon.getName() + " (" + weapon.getType() + ")";
    }
}