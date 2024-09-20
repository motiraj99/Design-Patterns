

public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;
    
    
    // List<String> toppings = new ArrayList<>();    

    //prepare, bake, cut, box are properties of pizza, so we put them in Pizza class
    // abstract void prepare(){
    //     System.out.println("Preparing " + name);
    //     System.out.println("Tossing dough..." + dough);
    //     System.out.println("Adding sauce..." + sauce);
    //     System.out.println("Adding toppings: ");
    //     for (String topping : toppings) {
    //         System.out.println(" " + topping);
    //     }
    // }
    abstract void prepare();
    
    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }

}



