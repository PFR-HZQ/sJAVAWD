class AndroidDeveloper {
    private String name;//开发者的名字
    private String[] programs;//会的编程语言
    private int age;//开发者的年龄
    //构造方法
    public AndroidDeveloper(String name, String[] programs, int age) {
        this.name = name;
        this.programs = programs;
        this.age = age;
    }
    //公有的写代码方法
    public void code(){
        System.out.println(name + "正在写代码");
    }
    //公有的吃饭方法
    public void eat() {
        System.out.println( name + "正在吃饭" );
    }
    //公有的睡觉方法
    public void sleep(){
        System.out.println(name + "正在睡觉");
    }
    //get set方法
    public void setName(String name) {
        this.name = name;
    }
    public void setPrograms(String[] programs) {
        this.programs = programs;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String[] getPrograms() {
        return programs;
    }
    public int getAge() {
        return age;
    }
}
class RayleighZ extends AndroidDeveloper {
    public RayleighZ(String[] programs, int age) { super("RayleighZ", programs, age); }



    //添加独特的方法
    public void lickSisterTaoTao(){
        System.out.println("涛の姐世界一です");
    }
    //覆写父类中的方法
    @Override
    public void code(){
//Tip：这里不能通过this直接访问父类的私有域，必须要通过父类提供的get和set接口来获取
        System.out.println(this.getName()+"在划水");
    }
    //在原有的基础上拓展sleep方法
    @Override
    public void sleep(){
        System.out.println("睡之前听6小时摇滚");
        super.sleep();
    }
}

public class gaoshi {
    public static void main( String[] args ) {
        zhangyu sad = new zhangyu();
     RayleighZ  rayleighZ= new RayleighZ(new String[]{"java","kotlin"},10);
     rayleighZ.eat();
     rayleighZ.sleep();
        rayleighZ.code();
        rayleighZ.lickSisterTaoTao();




    }
}
