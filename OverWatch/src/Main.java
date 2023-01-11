public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Althena", "America");
        Dva dva = new Dva("dva", "korean", "hebao");

        dva.say_hello();
        hero.say_hello();
    }
}