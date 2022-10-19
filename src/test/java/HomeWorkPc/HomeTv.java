package HomeWorkPc;

import org.junit.jupiter.api.Test;

public class HomeTv {
    @Test
    public void MyHomeTv(){
        Tv firstTV = new Tv();

        firstTV.setModel("Sony");
        firstTV.setDisplayDiagonal("52");
        firstTV.setDisplayTchnology("LED");
        firstTV.setResolution("1080");
        firstTV.setColor("BLACK");

        Tv secondTV = new Tv();

        secondTV.setModel("Samsung");
        secondTV.setDisplayDiagonal("58");
        secondTV.setDisplayTchnology("SUPER-LED");
        secondTV.setResolution("4k");
        secondTV.setColor("BLACK");

        System.out.println("My TV Home");
        System.out.println("1st TV");
        System.out.println(firstTV.getModel());
        System.out.println(firstTV.getDisplayDiagonal());
        System.out.println(firstTV.getColor());
        System.out.println(firstTV.getDisplayTchnology());

        System.out.println("2nd TV");
        System.out.println(secondTV.getModel());
        System.out.println(secondTV.getDisplayDiagonal());
        System.out.println(secondTV.getColor());
        System.out.println(secondTV.getDisplayTchnology());
    }
}
