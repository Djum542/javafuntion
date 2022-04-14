public class Cat extends Animal {
    private String Color;

    public void setColor(String color) {
        Color = color;
    }

    public String getColor() {
        return Color;
    }
    public Cat(){
        super();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("color : green");
    }


}
