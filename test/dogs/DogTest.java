package dogs;

public class DogTest {
    
    public static void main(String args[]) {
    
        Dog dog1 = new Dog("Cocker Spaniel", "Yellow", true);
        Dog dog2 = new Dog("Labrador Retriever", "Black", false);
        
        System.out.println("Dog 1 is a " + dog1.getColor() + " " + dog1.getBreed() + ".");
        System.out.println("Dog 2 is a " + dog2.getColor() + " " + dog2.getBreed() + ".");
        
        System.out.println("totalDogs called from dog1: " + dog1.getTotalDogs());
        System.out.println("totalDogs called from dog2: " + dog2.getTotalDogs());
    
    }
}
