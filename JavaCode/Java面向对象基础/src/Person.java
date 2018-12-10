public class Person {
    public String name; // 成员变量
    private int age; // 成员变量
    
    // 构造方法
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // 成员方法
    public int getAge() {
        return age;
    }
    
    // 成员方法
    public void setAge(int age) {
        this.age = age;
    }
}