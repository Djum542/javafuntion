public class Buoi4 extends  Animal {
    public static void main(String[] args) {
        // class and object
        // Truyền tham trị/ chỉ dùng cho kiểu nguyên thủy
        int a =5;
        int b = 10;
        a = b;
        b = 15;
        System.out.println(a);
        System.out.println(b);
        //b thay doi thi a co thay doi không
       // Truyền tham chiếu \ thấy khi sử dụng kiểu tham chiếu
//Animal dog = new Animal();
//
//        System.out.println(dog);
        Animal meo = new Animal() {
            @Override
            public void setBody(String body) {
                super.setBody(body);
            }
        };
        meo.setName("Ni Ni");
        meo.setWeight(Float.parseFloat("3.5f"));
    }
Animal cat = new Cat();
    System.out.println(cat);

}
