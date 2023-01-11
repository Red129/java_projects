public class Dva extends Hero{
    private String big_move = "";
    public Dva(String name, String country, String big_move) {
        super(name, country);
        this.big_move = big_move;
    }

    public void say_hello() {
        System.out.println(getName()+ "正在说：" + "小白脸！");
    }
}
