package factory.simpleFactory;

import factory.simpleFactory.pizza.CheesePizza;
import factory.simpleFactory.pizza.GreekPizza;
import factory.simpleFactory.pizza.Pizza;

public class PizzaFactory {
    public Pizza makePizza(String type){
        switch (type){
            case "cheese":
                return new CheesePizza();
            case "greek":
                return new GreekPizza();
            default:
                return null;
        }
    }

    /**
     * 单例写法1静态内部类
     *
     */
//    private static class PizzaFactoryInstance{
//        private static final PizzaFactory INSTANCE = new PizzaFactory();
//    }
//
//    public static PizzaFactory getInstance(){
//        return PizzaFactoryInstance.INSTANCE;
//    }

    /**
     * 单例写法2双重锁
     */
    private static volatile PizzaFactory pizzaFactory;

    public static PizzaFactory getInstance(){
        if(pizzaFactory==null){
            synchronized (PizzaFactory.class){
                if(pizzaFactory==null){
                    pizzaFactory = new PizzaFactory();
                }
            }
        }
        return pizzaFactory;
    }

}
