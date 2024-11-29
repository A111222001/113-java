public class Calculator {
    class Operation {
        public int calculate(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }

        public int multiply(int a, int b) {
            return a * b;
        }

        public int divide(int a, int b) {
            return a / b;
        }
    }

    public void performOperation(int a, String operator, int b) {
        Operation operation = new Operation();
        switch(operator) {
            case "+" -> System.out.println(operation.calculate(a, b));
            case "-" -> System.out.println(operation.subtract(a, b));
            case "*" -> System.out.println(operation.multiply(a, b));
            case "/" -> System.out.println(operation.divide(a, b));
            default -> System.out.println("不支援的運算符號");
        }
    }
}
