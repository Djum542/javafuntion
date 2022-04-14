public abstract class Animal {
    // Thuộc tính
    private  String name;
    private  float weight;
    private  String body;
    private String food;
    private  String rum;
    private String noise;
    private  String state;
// Phương thức
    public  void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        System.out.println("ho");
        return body;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setNoise(String noise) {

        this.noise = noise;
    }

    public String getNoise() {
        return noise;
    }

    public void setRum(String rum) {
        this.rum = rum;
    }

    public String getRum() {
        return rum;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }
    public  Animal(){
        this.getBody();
        this.getFood();
        this.getName();
        this.getNoise();
        this.getRum();
        this.getState();
    }
    public  void  showInfo(){
        System.out.println("Name"+name);
        System.out.println("Ưeight"+weight);
    }
}
