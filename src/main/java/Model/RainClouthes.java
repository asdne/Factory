package Model;

public class RainClouthes implements Clouthes {
    @Override
    public void takeWith() {
        System.out.println("берем зонт");
    }

    @Override
    public void putOn() {
        System.out.println("Одеваем  дождевую одежду 5 минут");
    }
}
