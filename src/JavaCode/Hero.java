package JavaCode;

public class Hero {
    String Name;//姓名
    float Hp;//血量
    float Armor;//护甲
    int MoveSpeed;//移速
    int kill;//人头
    int killed;//送头
    int GoldCoin;//金币

    void Keng() {//坑队友加金币
        System.out.println("noob");
        GoldCoin -= 50;
    }

    float GetArmor() {//返回护甲值
        return Armor;
    }

    void addSpeed(int Speed) {//增加移速
        MoveSpeed += Speed;
    }

    void legendary() {//超神提示
        System.out.println("超神！");
    }

    float GetHp() {//返回血量
        return Hp;
    }

    void recovery(float blood) {//加血
        Hp += blood;
    }
    public static void main(String[]args){
        ADHero ad = new ADHero();
        Hero h = ad;
        AD adi = (AD) h;
        APHero ap = (APHero) adi;
    }
}