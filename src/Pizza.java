public abstract class Pizza {

private  String prepare;
private  String bake;
private  String cut;
private  String box;
private  String orderPizza;

    public void setPrepare(String prepare) {
        this.prepare = prepare;
    }

    public String getPrepare() {
        return prepare;
    }

    public void setBake(String bake) {
        this.bake = bake;
    }

    public String getBake() {
        return bake;
    }

    public void setCut(String cut) {
        this.cut = cut;
    }

    public String getCut() {
        return cut;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public String getBox() {
        return box;
    }

    public void setOrderPizza() {
        this.orderPizza = orderPizza;
    }

    public String getOrderPizza() {
        return orderPizza;
    }

    public Pizza(){
        this.getPrepare();
        this.getBake();
        this.getCut();
        this.getBox();
}

    @Override
    public String toString() {
        return "Pizza{" +
                "prepare='" + prepare + '\'' +
                ", bake='" + bake + '\'' +
                ", cut='" + cut + '\'' +
                ", box='" + box + '\'' +
                '}';
    }
}
