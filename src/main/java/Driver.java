import java.util.Random;
import java.util.function.*;
import java.util.logging.Logger;

public class Driver {

    //provides filter operation based on condition check returns boolean
    static Predicate<Integer> isEven = (num) -> num % 2 == 0;
    static Consumer<String> toUpCase=(str)->System.out.println(str.toUpperCase());
    //provides functionality by taking a single input and no return value
    static Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt(100);

    static BiPredicate<Integer,Integer> remainderEqualsZero=(num1,num2)->num1%num2==0;
    static BiConsumer<String,String> concatString=(str1,str2)->System.out.println(str1+str2);
    //returns desired functionality without accepting argument


    public static void main(String[] args) {

        System.out.println(isEven.test(2));
        System.out.println(isEven.test(7));
        System.out.println();
        toUpCase.accept("manu");
        toUpCase.accept("RaM");
        System.out.println();
        System.out.println(randomNumberSupplier.get());
        System.out.println(randomNumberSupplier.get());
        System.out.println();
        concatString.accept("Man","oja");
        System.out.println();
        System.out.println(remainderEqualsZero.test(12,6));
        System.out.println();
        GreetMorning greetMorning=(str)->{
            System.out.println("Good Morning "+str);
        };
        greetMorning.greet("Manoj");
        greetMorning.greet("Modi");
    }
}
