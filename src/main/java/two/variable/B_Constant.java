package two.variable;

public class B_Constant {
    public void Constant() {
        int age = 20;
        final int AGE = 30;
        //상수란 1개의 값을 한번만 저장하는 변수 final은 상수
        System.out.println("age : " + age);
        System.out.println("AGE : " + AGE);

        age = 10;
        System.out.println("age : " + age);


    }

}
