package ua.hillel.dolhykh.homeworks.homework10;

class Burger {
    private String bun;
    private String meat;
    private String cheese;
    private String greens;
    private String mayonnaise;

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        printIngredients();
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = "No Mayonnaise";
        printIngredients();
    }

    public Burger(String bun, String meat1, String meat2, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat1 + meat2;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        printIngredients();
    }

    private void printIngredients() {
        System.out.println("Burger Ingredients:");
        System.out.println("Bun: " + bun);
        System.out.println("Meat: " + meat);
        System.out.println("Cheese: " + cheese);
        System.out.println("Greens: " + greens);
        System.out.println("Mayonnaise: " + mayonnaise);
        System.out.println();
    }
}





