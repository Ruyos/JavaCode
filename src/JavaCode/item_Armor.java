package JavaCode;

public class item_Armor extends item{
    int ArmorValue;
    public static void main(String[] args){
        item_Armor RattanBeetle=new item_Armor();
        RattanBeetle.Name="藤甲";
        RattanBeetle.Price=3000;
        RattanBeetle.ArmorValue=250;

        item_Armor Antiarmour=new item_Armor();
        Antiarmour.Name="反伤刺甲";
        Antiarmour.Price=3500;

        System.out.println("");
    }
}
