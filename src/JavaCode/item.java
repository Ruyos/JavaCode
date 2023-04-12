package JavaCode;
public class item{
    String Name;
    int Price;
    public void Buy(){
        System.out.println("购买物品");
    }
    public void Effect(){
        System.out.println("物品使用后的效果");
    }
    public static void main(String[] args){
        item BloodBottle =new item();
        BloodBottle.Name="血瓶";
        BloodBottle.Price=50;

        item Shoes=new item();
        Shoes.Name="草鞋";
        Shoes.Price=300;

        item Sword =new item();
        Sword.Name="大宝剑";
        Sword.Price=300;
    }
}