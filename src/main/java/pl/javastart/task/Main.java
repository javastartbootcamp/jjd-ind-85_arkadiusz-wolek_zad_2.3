package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Drink mojito = new Drink();
        Ingredient ing1 = new Ingredient();
        ing1.name = "woda";
        ing1.volumeInMl = 80;
        Ingredient ing2 = new Ingredient();
        ing2.name = "sok cytrynowy";
        ing2.volumeInMl = 90;
        Ingredient ing3 = new Ingredient();
        ing3.name = "wódka";
        ing3.volumeInMl = 40;
        mojito.name = "Mojito";
        mojito.price = 13.0;
        mojito.containsAlcohol = true;
        mojito.ingredientA = ing1;
        mojito.ingredientB = ing2;
        mojito.ingredientC = ing3;
        int totalVolume = ing1.volumeInMl + ing2.volumeInMl + ing3.volumeInMl;
        System.out.println("Drink: " + mojito.name);
        System.out.println("Cena: " + mojito.price + "zł");
        System.out.println("Czy zawiera alkohol? " + mojito.containsAlcohol);
        System.out.println("Składniki:");
        System.out.println(mojito.ingredientA.name);
        System.out.println(mojito.ingredientB.name);
        System.out.println(mojito.ingredientC.name);
        System.out.println("Pojemność: " + totalVolume + "ml");
    }
}
