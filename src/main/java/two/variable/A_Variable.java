package two.variable;

public class A_Variable {

    public void declareVariable() {

        //논리형
        boolean isTrue;

        //숫자형
        byte bNum;
        short sNum;
        int iNum;
        long lNum;

        //실수
        float fNum;
        double dNum;

        //문자
        char ch;
        String str;

        isTrue = false;
        bNum = 1;
        sNum = 2;
        iNum = 4;
        lNum = 8L;
        //실수와 바이트
        fNum = 4.0f; // float은 f를 붙여줘야함
        dNum = 8.0d;
        //문자는 한개만 문자열은 0개이상
        ch = '6';
        str = "Hello World!!";

        //declare~ 메소드에 print를 호출
        System.out.println(isTrue);
        System.out.println(bNum);
        System.out.println(sNum);
        System.out.println(iNum);
        System.out.println(lNum);
        System.out.println(fNum);
        System.out.println(dNum);
        System.out.println(ch);
        System.out.println(str);
    }

    public void intVariable() {

        //논리형
        boolean isTrue = true;
        //숫자형
        byte bNum = 10;
        short sNum = 20;
        int iNum = 30;
        long lNum = 40;
        float fNum = 8.0f;
        double dNum = 4.0d;

        //문자형
        char ch = 'a';
        String str = "Hello World!!";

        System.out.println(isTrue);
        System.out.println(bNum);
        System.out.println(sNum);
        System.out.println(iNum);
        System.out.println(lNum);
        System.out.println(fNum);
        System.out.println(dNum);
        System.out.println(ch);
        System.out.println(str);


    }


}