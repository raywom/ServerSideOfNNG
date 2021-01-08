package server.code;

import java.util.ArrayList;

class InitialFunction  {
    static public ArrayList<Weapon> generationOfRandomRangedWeapons()
    {
        var weapons = new ArrayList<Weapon>();
        weapons.add(new Weapon("Рогатка для рыбалки","Рогатка с хорошей точностью но плохим уроном",9, 11, 75));
        weapons.add(new Weapon("Арбалет","Много болтов и быстрая перезарядка",10, 15, 55));
        weapons.add(new Weapon("Тяжелый арбалет","Может пробить броню, хороший урон, долгая перезарядка, плохая точность", 30, 45, 40));
        weapons.add(new Weapon("Сюрикены","плохой урон, вызывают кровотечение",4, 7, 60));
        weapons.add(new Weapon("Револьвер","плохая точность издалека, хороший урон",20, 25, 40));
        weapons.add(new Weapon("Огнемет","маленький урон, поджигает, если противники стоят рядом может поджечь больше чем одну цель",3, 6, 90));

        return weapons;
    }

    static public ArrayList<Weapon> generationOfRandomMeleeWeapons()
    {
        var weapons = new ArrayList<Weapon>();
        weapons.add(new Weapon("Двуручный топор", "5% шанс оглушить, 5% шанс кровотичение, 5% шанс травмы", 25, 40, 70));
        weapons.add(new Weapon("Кувалда", "Может оглушить, с 6% модет оглушить на два хода", 20, 35, 70));
        weapons.add(new Weapon("Клеймор", "есть крит x1.50 шансом 25%", 35, 40, 70));
        weapons.add(new Weapon("Катана", "с каждой атакай урон увеличится ан 7", 10, 15, 80));
        weapons.add(new Weapon("Алебарда", "может контратакавать", 20, 25, 85));
        weapons.add(new Weapon("Кусаригама", "шанс обезоружить", 20, 25, 80));

        return weapons;
    }

    static public ArrayList<Perk> generationOfRandomPerks()
    {
        var perks = new  ArrayList<Perk>();
        perks.add(new Perk("Удачное попадание","С шансом 15% восстанавливает хп, в размере половины от атаки оружия"));
        perks.add(new Perk("Адреналин","увеличивает хп на 50"));
        perks.add(new Perk("Скромная плата","в каждый ход будет делать две атаки, но вы лишаетесь 50% хп"));
        perks.add(new Perk("Каннибализм","каждую атаку восстанавливает два хп"));
        perks.add(new Perk("Крит","дает 50% шанс x1.30 крит"));
        perks.add(new Perk("Зомби","после смерти дается 3 хода для мести"));
        perks.add(new Perk("Месть","После смерти товарища на несколько ходов дает повышание урона по тому кто его убил"));
        perks.add(new Perk("Узы","20% урона нанесено твоим товарищем будет делатся с тобой"));
        perks.add(new Perk("Шипы","возвращает 25% урона врагу "));
        //perks.add(new Perk("Кираса с шипами","возвращает 25% урона врагу "));

        return perks;
    }

}
