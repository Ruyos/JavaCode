package JavaCode;

public class MagicPotion extends item{
    @Override
    public void Effect() {
        System.out.println("蓝瓶使用后的效果");
    }
    public static void main(String[]args){
        MagicPotion mp=new MagicPotion();
        mp.Effect();
    }
}
