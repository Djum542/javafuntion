public class PizzaCheese extends  Pizza {
    @Override
    public void setPrepare(String prepare) {
        super.setPrepare(prepare);
        System.out.println("prepare : luamach");
    }

    @Override
    public String getPrepare() {
        return super.getPrepare();
    }

    @Override
    public void setBake(String bake) {
        super.setBake(bake);
        System.out.println("bake : 250");
    }

    @Override
    public String getBake() {
        return super.getBake();
    }

    @Override
    public void setCut(String cut) {
        super.setCut(cut);
    }

    @Override
    public String getCut() {
        return super.getCut();
    }

    @Override
    public void setBox(String box) {
        super.setBox(box);
    }

    @Override
    public String getBox() {
        return super.getBox();
    }

    public PizzaCheese() {
        super();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
