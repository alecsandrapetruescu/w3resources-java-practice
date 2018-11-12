package base_part1;

enum OperationType {
    SUM("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
    MOD("%");

    private String operator;

    OperationType(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }
}
