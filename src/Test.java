/**
 * 测试
 * @author xuanzhou
 * @date 2020/6/23 10:15
 */
public class Test {

    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation("/");
        operation.setNumberA(1);
        operation.setNumberB(0);
        System.out.println(operation.operate());
    }

}
