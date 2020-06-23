/**
 * 除法运算
 * @author xuanzhou
 * @date 2020/6/23 10:08
 */
public class OperationDiv extends Operation {

    @Override
    public double operate() {
        if (numberB == 0) {
            throw new RuntimeException("除数不能为0");
        }
        return numberA / numberB;
    }
}
