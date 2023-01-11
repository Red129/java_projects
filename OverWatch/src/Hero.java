public class Hero {
    private String name = "";
    private String country = " ";


    public Hero(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public void say_hello() {
        System.out.println( getName()  + "正在说："+ "hello");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
