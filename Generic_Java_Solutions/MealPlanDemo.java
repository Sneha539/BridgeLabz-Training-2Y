import java.util.List;
import java.util.Arrays;

interface MealPlan {}
class VegetarianMeal implements MealPlan { public String toString(){return "Vegetarian";} }
class VeganMeal implements MealPlan { public String toString(){return "Vegan";} }
class KetoMeal implements MealPlan { public String toString(){return "Keto";} }

class Meal<T extends MealPlan> {
    private T plan;
    public Meal(T plan){ this.plan = plan; }
    public T getPlan(){ return plan; }
}

public class MealPlanDemo {
    public static <T extends MealPlan> boolean validate(T plan){
        // simple validation example
        return plan != null;
    }
    public static void main(String[] args){
        Meal<VegetarianMeal> m = new Meal<>(new VegetarianMeal());
        System.out.println("Meal plan: " + m.getPlan());
        System.out.println("Valid: " + validate(m.getPlan()));
    }
}
