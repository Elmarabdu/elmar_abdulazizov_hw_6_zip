class Skeleton extends Boss {
    private int arrowCount;

    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    @Override
    public String printInfo() {
        return "Skeleton: " + getName() + ", Health: " + getHealth() + ", Damage: " + getDamage() +
                ", Weapon: " + getWeapon().getName() + " (" + getWeapon().getType() + ")" +
                ", Arrow Count: " + arrowCount;
    }
}