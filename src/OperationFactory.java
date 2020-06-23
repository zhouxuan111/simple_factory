/**
 * 运算工厂
 * @author xuanzhou
 * @date 2020/6/23 10:12
 */
public class OperationFactory {

    /**
     * 根据传入的参数获取不同的操作运算
     * @param operate
     * @return
     */
    public static Operation createOperation(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }
        return operation;
    }
}
