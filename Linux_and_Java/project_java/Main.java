package project_java;

public class Main {
    public static void main(String[] args) {
        Toy robot = new Toy(1, "Работ");
        Toy lego = new Toy(2, "Набор лего");
        Toy dool = new Toy(3, "Кукла барби");
        Toy car = new Toy(4, "Машина на пульте управления");

        Game game = new Game();
        game.add_toy_in_listToy(robot);
        game.add_toy_in_listToy(lego);
        game.add_toy_in_listToy(dool);
        game.add_toy_in_listToy(car);

        game.lottteryToy();
        game.readFile();
        game.lottteryToy();
        game.readFile();
        game.getToys();
        game.getToy_count();
    }
}