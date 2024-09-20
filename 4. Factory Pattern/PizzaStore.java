
public abstract class PizzaStore {
    protected abstract Pizza createPizza(String item);
    //this is our Factory method
    //it is made protected so that only member functions can access it, particularly orderPizza().
    //We don't want outsiders to just call createPizza()
    //abstract - so that subclass must implement createPizza()
    //our orderPizza doesnt know what kind of pizza is actually created
    
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;

    }
}





