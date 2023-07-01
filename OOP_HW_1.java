//        Крестьянин, разбойник, снайпер, колдун, копейщик, арбалетчик, монах.
//        Для каждого сформировать список свойств и возможных действий.
//        Напрнимер свойство скорость, действие нанести удар.
//        Проанализировать получившиеся свойства и действия персонажей и создать
//        Обобщённый класс описывающий свойства и действия имеющиеся у всех персонажей.
//        Создать этот класс. Создать классы для каждого типа персонажей наследующие
//        и расширяющие абстрактный(обобщённый) класс.
//        В основной программе создать по одному экземпляру каждого типа персонажей.

public class OOP_HW_1 {
    public static void main(String[] args) {

        // Крестьянин
        Peasant peasant = new Peasant("Ermak", 5, 100);
        // Разбойник
        Rogue rogue = new Rogue("Solovei", 5, 150);
        // Снайпер
        Sniper sniper = new Sniper("Zaitsev", 5, 120);
        // Колдун
        Warlock warlock = new Warlock("Harry Potter", 5, 80);
        // Копейщик
        Spearman spearman = new Spearman("Aleksandr", 5, 200);
        // Арбалетчик
        Crossbowman crossbowman = new Crossbowman("Ronan", 5, 110);
        // Монах
        Monk monk = new Monk("Kirill", 5, 90);

        // можем использовать каждый персонаж и вызывать их методы
        System.out.println(  );
        peasant.attack(rogue);
        peasant.harvest();
        rogue.attack(spearman);
        rogue.die();
        sniper.rest(50);
        sniper.aim();
        warlock.rest(30);
        warlock.curse();
        crossbowman.attack(monk);
        crossbowman.reload();
        spearman.takeDamage(50);
        spearman.brace();
        monk.rest(20);
        monk.heal();

        System.out.println( "\n" + peasant );
        System.out.println( rogue );
        System.out.println( sniper );
        System.out.println( warlock );
        System.out.println( crossbowman );
        System.out.println( spearman );
        System.out.println( monk + "\n" );
    }
}
