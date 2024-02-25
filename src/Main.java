
public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр босса
        Boss boss = new Boss();
        boss.setName("Big Boss");
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setWeapon(new Weapon(Weapon.WeaponType.SWORD, "Excalibur"));

        // Вывод информации о боссе
        System.out.println(boss.printInfo());

        // Создаем два экземпляра скелета
        Skeleton skeleton1 = new Skeleton();
        skeleton1.setName("Skeleton Warrior");
        skeleton1.setHealth(100);
        skeleton1.setDamage(10);
        skeleton1.setWeapon(new Weapon(Weapon.WeaponType.AXE, "Bone Cleaver"));
        skeleton1.setArrowCount(20);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setName("Archer Skeleton");
        skeleton2.setHealth(80);
        skeleton2.setDamage(8);
        skeleton2.setWeapon(new Weapon(Weapon.WeaponType.BOW, "Death Bow"));
        skeleton2.setArrowCount(30);

        // Вывод информации о скелетах
        System.out.println(skeleton1.printInfo());
        System.out.println(skeleton2.printInfo());
    }
}
