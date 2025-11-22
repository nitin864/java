import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

// Custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MarkerAnnotations {
    int value();
}

public class MyClass {

    @MarkerAnnotations(value = 45)
    public void sayHi() {
        System.out.println("my custom annotation!!");
    }

    public static void main(String[] args) throws Exception {

        MyClass h1 = new MyClass();

        // Correct method name
        Method methodVal = h1.getClass().getMethod("sayHi");

        // Correct getAnnotation usage
        MarkerAnnotations markerAnnotations = methodVal.getAnnotation(MarkerAnnotations.class);
        System.out.println("value is: " + markerAnnotations.value());
    }
}
