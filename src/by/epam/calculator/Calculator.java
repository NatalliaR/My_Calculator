package by.epam.calculator;

/**
 * Created by natalynka on 10/25/15.
 */
public class Calculator { //Создаем публичный класс Calculator

//    public int calculate(int first, int second, String operation) {//Объявляем метод с тремя параметрами

    public enum Operator {
        ADD("+") {
            public int apply(int first, int second) {
                return first + second;
            }
        },
        SUBTRACT("-") {
            public int apply(int first, int second) {
                return first - second;
            }
        },
        MULTIPLY("*") {
            public int apply(int first, int second) {
                return first * second;
            }
        },
        DIVIDE("/") {
            public int apply(int first, int second) {
                return first / second;
            }
        };

        public abstract int apply(int first, int second);

        private final String sign;

        Operator(String sign) {

            this.sign = sign;
        }

        private String getSign() {
            return sign;
        }

        public static Operator getOperation(String operation) {
            for (Operator operator : Operator.values()) {
                if (operator.getSign().equals(operation)) {
                    return operator;
                }
            }
            throw new IllegalArgumentException(Constants.ERROR_UNSUPPORTED_OPERATION);
        }


        /**       if (operation == null) { //Проверяем введен ли оператор, если нет, то
         throw new IllegalArgumentException(Constants.ERROR_NULL_OPERATION);//Выводим в консоль Operation must not be null
         }

         operation = operation.trim();//Убираем пробелы

         if (operation.length() != 1) {//Проверяем, если оператор состоит из больше, чем один знак
         throw new IllegalArgumentException(Constants.ERROR_UNSUPPORTED_OPERATION);//Выводим в консоль Unsupported operation
         }

         switch (operation.charAt(0)) {//Проверяем переданный operator
         case '+':// если +, то производим сложение
         return first + second;
         case '-':// и т.д
         return first - second;
         case '/':
         return first / second;
         case '*':
         return first * second;
         default:// если оператор не соответствует ни одному из проверенных, то выводим ошибку
         throw new IllegalArgumentException(Constants.ERROR_UNSUPPORTED_OPERATION);
         */
    }
}


