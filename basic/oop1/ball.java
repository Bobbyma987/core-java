package basic.oop1;

public class ball {
    String color;
    String material;
    int size;
    String game;

    static ball b1 = new ball("white", 180, "Rubber", "Football");
    static ball b2 = new ball("red", 80, "Rubber", "Cricket");

    public ball(String color, int size, String material, String game) {
        this.color = color; // setting the value
        this.size = size;
        this.material = material;
        this.game = game;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

     // Runner
     public static void main(String[] args) {
        System.out.println(b1.color = "red"); // it convert the object into String
        System.out.println(b2.toString());
    }

}
