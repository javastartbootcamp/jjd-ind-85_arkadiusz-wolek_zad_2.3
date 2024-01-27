package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Drink mojito = new Drink();
        mojito.name = "Mojito";
        mojito.price = 13.0;
        mojito.containsAlcohol = true;
        mojito.ingredientA.name = "woda";
        mojito.ingredientA.volumeInMl = 80;
        mojito.ingredientB.name = "sok cytrynowy";
        mojito.ingredientB.volumeInMl = 90;
        mojito.ingredientC.name = "wódka";
        mojito.ingredientC.volumeInMl = 40;
        int totalVolume = mojito.ingredientA.volumeInMl + mojito.ingredientB.volumeInMl + mojito.ingredientC.volumeInMl;
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
