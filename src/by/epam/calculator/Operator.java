package by.epam.calculator;

/**
 * Created by Natallia_Ramanchyk on 10/29/2015.
 */
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

    public static Operator fromString(String operation) {
        for (Operator operator : Operator.values()) {
            if (operator.getSign().equals(operation)) {
                return operator;
            }
        }
        throw new IllegalArgumentException(Constants.ERROR_UNSUPPORTED_OPERATION);
    }
}
