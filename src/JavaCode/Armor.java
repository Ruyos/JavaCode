package JavaCode;

public class Armor extends item{
    int ArmorValue;
    public static void main(String args[]){
        Armor RattanBeetle=new Armor();
        RattanBeetle.Name="藤甲";
        RattanBeetle.Price=3000;
        RattanBeetle.ArmorValue=250;

        Armor Antiarmour=new Armor();
        Antiarmour.Name="反伤刺甲";
        Antiarmour.Price=3500;
        RattanBeetle.ArmorValue=250;

        System.out.println("");
    }
}
