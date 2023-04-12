package JavaCode;
//单独列出只是为了演示重写item中的方法
public class LifePotion extends item {

    @Override
    public void Effect() {
        System.out.println("血瓶使用后的效果");
    }
    public static void main(String[]args){
        item i =new item();
        i.Effect();
        LifePotion lp =new LifePotion();
        lp.Effect();
    }
}
