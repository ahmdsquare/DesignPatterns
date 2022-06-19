package TemplateMethod;

public abstract class FinalMethod {
    final void finalMethod() {
        step1();
        step2();
        step3();
    }

    void step1() {
        System.out.println("Get a Papper !");
    }

    void step2() {
        System.out.println("Get a Pen !");
    }

    abstract void step3();
}
