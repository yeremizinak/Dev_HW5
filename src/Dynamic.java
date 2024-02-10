import java.util.ArrayList;
import java.util.List;

public class Dynamic {
    /**
     * Цей метод реалізує динамічний пошук числа Фібоначчі
     * Сумарна часова складність - O(n^2), де n - довжина отриманого списку
     * Просторова складність - O(n) - оскільки потрібно зберігати n елементів у списку
     *
     * Доречний тип UML діаграми: діаграма компонентів
     */
    public static long dynamicFib(int n){
        List<Integer> fib = new ArrayList<>();
        fib.add(0);
        fib.add(1);
        for (int i=2;i<=n;i++){
            fib.add(fib.get(fib.size() - 1) + fib.get(fib.size() -2));
        }
        return (long) fib.get(fib.size() - 1);
    }
}
