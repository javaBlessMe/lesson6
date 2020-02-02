public class Animal {


public boolean run(float d){
    return d>0;
}

public boolean swim(float d){
    return d>0;
}

public boolean jump(float d){
    return d>0;
}

    public static void main(String[] args) {

        System.out.println("Собака");
        Dog sharik = new Dog(600,0.5f,10);
        System.out.println(sharik.run(400));
        System.out.println(sharik.swim(1.0f));
        System.out.println(sharik.jump(10));

        System.out.println("\nКот");
        Cat murzik = new Cat(3,150);
        System.out.println(murzik.run(170));
        System.out.println(murzik.jump(2));
        System.out.println(murzik.swim(44));
        System.out.println("\n Еще кот");

        Cat murzik2 = new Cat(4,220.9f);
        System.out.println(murzik2.run(170));
        System.out.println(murzik2.jump(2));
        System.out.println(murzik2.swim(44));

    }
}
