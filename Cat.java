public class Cat extends Animal {
    //Ограничения для конкретного животного
    private float limitJump;
    private float limitRun;

    public Cat(float limitJump, float limitRun) {
        this.limitJump = limitJump;
        this.limitRun = limitRun;
    }

    @Override
    public boolean run(float d) {
        return d>0 &&  d<limitRun;
    }

    @Override
    public boolean swim(float d) {
        return false;
    }

    @Override
    public boolean jump(float d) {
        return d>0 &&  d<limitJump;
    }
}
