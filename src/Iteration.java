public class Iteration {
    /**
     * Цей метод реалізує ітераційний пошук числа Фібоначчі
     * Сумарна часова складність - O(n), де n - кількість операцій, проведена в iterationFib(int n)
     * Просторова складність - O(1) - константа - оскільки обсяг використовуваної пам'яті не змінюється
     *
     * Доречний тип UML діаграми: діаграма послідовностей
     */
    public static long iterationFib(int n){
        if(n<=1){
            return n;
        }
        int preLast = 1;
        int result = 1;
        int last = 1;
        for (int i=2;i<n;i++){
            result = last + preLast;
            preLast = last;
            last = result;
        }
        return result;
    }
}
