package HomeWorkPc;

import org.junit.jupiter.api.Test;

public class FamilyHeadphones {
    @Test
    public void MyHeadphones(){
        Headphones firstHeadphones = new Headphones();

        firstHeadphones.setModel("Sony WH-1000XM4");
        firstHeadphones.setEarCoupling("Intraaural");
        firstHeadphones.setColor("Black");
        firstHeadphones.setWearingStyle("In-ear");
        firstHeadphones.setWight(13);

        Headphones secondHeadphones = new Headphones();

        secondHeadphones.setModel("Apple AirPods 3");
        secondHeadphones.setEarCoupling("Intraaural");
        secondHeadphones.setColor("White");
        secondHeadphones.setWearingStyle("In-ear");
        secondHeadphones.setWight(4);


        System.out.println("Family Headphones");
        System.out.println("1st Headphones ");
        System.out.println(firstHeadphones.getModel());
        System.out.println(firstHeadphones.getEarCoupling());
        System.out.println(firstHeadphones.getColor());
        System.out.println(firstHeadphones.getWearingStyle());
        System.out.println(firstHeadphones.getWight());
        System.out.println("2st Headphones ");
        System.out.println(secondHeadphones.getModel());
        System.out.println(secondHeadphones.getEarCoupling());
        System.out.println(secondHeadphones.getColor());
        System.out.println(secondHeadphones.getWearingStyle());
        System.out.println(secondHeadphones.getWight());

    }
}
