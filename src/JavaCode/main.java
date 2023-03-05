package JavaCode;

public class main {
    public static void main(String[] args) {
        Hero GaRen = new Hero();
        GaRen.Hp = 10000f;
        GaRen.Name = "盖伦";
        GaRen.Armor = 1200f;
        GaRen.MoveSpeed = 345;
        GaRen.addSpeed(50);

        Hero TeeMo = new Hero();
        TeeMo.Hp = 4800f;
        TeeMo.Name = "提莫";
        TeeMo.Armor = 800f;
        TeeMo.MoveSpeed = 345;
        TeeMo.addSpeed(80);

        System.out.println(GaRen.Name + "的血量是" + GaRen.GetHp());
        System.out.println(GaRen.Name + "的护甲是" + GaRen.GetArmor());
        System.out.println(GaRen.Name + "的移速是" + GaRen.MoveSpeed);
        System.out.println("-------------------");
        System.out.println(TeeMo.Name + "的血量是" + TeeMo.GetHp());
        System.out.println(TeeMo.Name + "的护甲是" + TeeMo.GetArmor());
        System.out.println(TeeMo.Name + "的移速是" + TeeMo.MoveSpeed);

        TeeMo.recovery(1000f);
        System.out.println(TeeMo.Name + "的血量是" + TeeMo.GetHp());
        GaRen.Keng();
        System.out.println(GaRen.Name + "的金币是" + GaRen.GoldCoin);
        TeeMo.legendary();

    }
}