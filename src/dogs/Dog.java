package dogs;

public class Dog {
    private String breed;
    private String color;
    private boolean altered;
    private static int totalDogs = 0;

    public Dog(String breed, String color, boolean altered) {
      this.breed = breed;
      this.color = color;
      this.altered = altered;
      
      totalDogs += 1; 
    }
    
    public int getTotalDogs() {
        return totalDogs;
    }

    public void setBreed(String breed) {
    this.breed = breed;
    }

    public String getBreed() {
    return breed;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setAltered(boolean altered) {
        this.altered = altered;
    }
    
    public boolean getAltered() {
        return altered;
    }
}
