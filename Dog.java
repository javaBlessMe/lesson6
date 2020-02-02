public class Dog extends Animal {
    //Ограничения для конкретного животного
    private float limitRun;
    private float limitJump;
    private float limitSwim;

    public Dog(float limitRun, float limitJump, float limitSwim) {
        this.limitRun = limitRun;
        this.limitJump = limitJump;
        this.limitSwim = limitSwim;
    }

    @Override
    public boolean run(float d) {
       return d>0  && d<limitRun;
    }

    @Override
    public boolean swim(float d) {
        return d>0 &&  d<limitSwim;
    }

    @Override
    public boolean jump(float d) {
        return d>0 && d<limitJump;
    }
}
