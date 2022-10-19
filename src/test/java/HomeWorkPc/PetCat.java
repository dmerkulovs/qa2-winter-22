package HomeWorkPc;

import org.junit.jupiter.api.Test;

public class PetCat {
    @Test
    public void myCat() {
       Pet firstPet = new Pet();

       firstPet.setClas("Cat");
       firstPet.setName("Persik");
       firstPet.setAge(3);
       firstPet.setColor("Ginger");
       firstPet.setFamily("Felidae");
       firstPet.setOrder("Carnivora");

       System.out.println("The cat is a domestic species of small carnivorous mammal");
       System.out.println("My 1st Pet");
       System.out.println(firstPet.getClas());
       System.out.println(firstPet.getName());
       System.out.println(firstPet.getAge());
       System.out.println(firstPet.getColor());
       System.out.println(firstPet.getFamily());
       System.out.println(firstPet.getOrder());
    }
}
