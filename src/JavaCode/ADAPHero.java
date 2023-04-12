package JavaCode;

public class ADAPHero extends Hero implements AD,AP{
    @Override
    public void MagicAttack() {
        System.out.println("魔法攻击");
    }

    @Override
    public void PhysicAttack() {
        System.out.println("物理攻击");
    }
}
