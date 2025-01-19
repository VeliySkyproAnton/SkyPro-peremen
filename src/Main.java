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

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var dogAdd = dog + 4;
        var catAdd = cat + 4;
        var paperAdd = paper + 4;

        var dogDelete = dogAdd - 3.5;
        var catDelete = catAdd - 1.6;
        var paperDelete = paperAdd - 7639;
        System.out.println(dogDelete);
        System.out.println(catDelete);
        System.out.println(paperDelete);

        var friend = 19;
        System.out.println(friend);
        var friendAdd = friend + 2;
        System.out.println(friendAdd);
        var friendDelete = friendAdd / 7;
        System.out.println(friendDelete);

        var frog = 3.5;
        System.out.println(frog);
        var frogAdd = frog * 10;
        System.out.println(frogAdd);
        var frogDelete = frogAdd / 3.5;
        System.out.println(frogDelete);
        var frogAll = frogDelete + 4;
        System.out.println(frogAll);

        var people = 78.2;
        var peopleTwo = 82.7;
        var peopleAll = people + peopleTwo;
        System.out.println(peopleAll);
        var peopledDifference = peopleTwo - people;
        System.out.println(peopledDifference);

        var peopledDifferenceTwo = peopleTwo % people;
        System.out.println(peopledDifferenceTwo);

        var hour = 640;
        var worker = hour / 8;
        System.out.println("Всего работников в компании " + worker + " человек");
        var workerAdd = worker + 94;
        var hourNew = hour / workerAdd;
        System.out.println("Если в компании работает " + workerAdd + " человек, то всего " + hourNew + " часов работы может быть поделено между сотрудниками");
    }
}