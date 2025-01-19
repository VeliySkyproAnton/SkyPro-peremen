public class Main {
    public static void main(String[] args) {
        var box = 5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);

        var liftingCapasity = 50; //Грузоподъемность
        var staffWeight = 20;//Вес вещей
        var capasityLeft = liftingCapasity - staffWeight;// Остаток от грузоподъемности
        System.out.println("Еще можно положить " + capasityLeft + " кг вещей");

        var applesWeight = 20;
        var orangesWeight = 30;
        var fruitWeight = applesWeight + orangesWeight;
        System.out.println("Общий вес фруктов " + fruitWeight);

        var overload = (staffWeight + fruitWeight) % liftingCapasity; // Остаток от деления веса проддуктов на грузоподъемность
        System.out.println("Перегруз на " + overload + " кг");
    }
}