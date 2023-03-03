package JavaCode;

public class Hero{
    String Name;//姓名
    float Hp;//血量
    float Armor;//护甲
    int MoveSpeed;//移速
    int kill;//人头
    int killed;//送头
    int GoldCoin;//金币
    void Keng(){//坑队友加金币
        System.out.println("谢谢你，泰罗");
        GoldCoin+=50;
    }
    float GetArmor(){//返回护甲值
        return Armor;
    }
    void addSpeed(int Speed){//增加移速
        MoveSpeed+=Speed;
    }
    void legendary(){//超神提示
        System.out.println("超神！");
    }
    float GetHp(){//返回血量
        return Hp;
    }
    void recovery(float blood){//加血
        Hp+=blood;
    }


    public static void main(String[] args){
        Hero GaRen = new Hero();
        GaRen.Hp=10000f;
        GaRen.Name="盖伦";
        GaRen.Armor=1200f;
        GaRen.MoveSpeed=345;
        GaRen.addSpeed(50);

        Hero TeeMo = new Hero();
        TeeMo.Hp=4800f;
        TeeMo.Name="提莫";
        TeeMo.Armor=800f;
        TeeMo.MoveSpeed=345;
        TeeMo.addSpeed(80);

        System.out.println(GaRen.Name+"的血量是"+GaRen.GetHp());
        System.out.println(GaRen.Name+"的护甲是"+GaRen.GetArmor());
        System.out.println(GaRen.Name+"的移速是"+GaRen.MoveSpeed);
        System.out.println("-------------------");
        System.out.println(TeeMo.Name+"的血量是"+TeeMo.GetHp());
        System.out.println(TeeMo.Name+"的护甲是"+TeeMo.GetArmor());
        System.out.println(TeeMo.Name+"的移速是"+TeeMo.MoveSpeed);

        TeeMo.recovery(1000f);
        System.out.println(TeeMo.Name+"的血量是"+TeeMo.GetHp());
        GaRen.Keng();
        System.out.println(GaRen.Name+"的金币是"+GaRen.GoldCoin);
        TeeMo.legendary();
    }
}