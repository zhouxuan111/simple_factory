/**
 * 运算父类2
 * @author xuanzhou
 * @date 2020/6/23 10:03
 */
public abstract class Operation {

    public double numberA;

    public double numberB;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    /**
     * 运算方法
     * @return
     */
    public abstract double operate();
}
