import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Repeatable;

// Marking the @Meal annotation as repeatable by using the @Repeatable annotation
@Repeatable(Meals.class)
@Retention(RetentionPolicy.RUNTIME)
@interface Meal {
    String mealType();
    String mainDish();
}

// Container for the repeatable annotations
@Retention(RetentionPolicy.RUNTIME)
@interface Meals {
    Meal[] value();
}

public class T8Q8 {

    @Meal(mealType = "breakfast", mainDish = "cereal")
    @Meal(mealType = "lunch", mainDish = "pizza")
    @Meal(mealType = "dinner", mainDish = "salad")
    public void evaluateDiet() {
        // Evaluation logic can go here, but for now it's just a method with annotations
    }

    public static void main(String[] args) {
        T8Q8 dietEvaluator = new T8Q8();
        // In a real application, you would use reflection to read the annotations at runtime
        System.out.println("Diet evaluation complete.");
    }
}
