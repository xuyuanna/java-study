package Day1_9;/*
需求：电脑运行实例
电脑运行基于主板
 */


interface PCI{
    void open();
    void close();
}

class MainBoard{
    public void run(){
        System.out.println("Day1_9.MainBoard run");
    }

    public void usePCI(PCI pci){
        if (pci != null) {
            pci.open();
            pci.close();
        }
    }
}

class NetCard implements PCI{
    public void open(){
        System.out.println("Day1_9.NetCard open");
    }
    public void close(){
        System.out.println("Day1_9.NetCard close");
    }
}

class SoundCard implements PCI{
    public void open(){
        System.out.println("Day1_9.SoundCard open");
    }
    public void close(){
        System.out.println("Day1_9.SoundCard close");
    }
}

public class DuotaiDemo4 {
    public static void main(String[] args) {
       /*
        Day1_9.MainBoard mainboard = new Day1_9.MainBoard();
        mainboard.run();
        mainboard.useNetCard(new Day1_9.NetCard());
        */

        MainBoard mainboard = new MainBoard();
        mainboard.run();

        mainboard.usePCI(null);
        mainboard.usePCI(new NetCard());
        mainboard.usePCI(new SoundCard());
    }
}
