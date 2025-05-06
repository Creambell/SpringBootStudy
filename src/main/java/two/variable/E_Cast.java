package two.variable;

public class E_Cast {
    public void cast1() {
        byte bNum = 3;
        int iNum = bNum; //byte type 1byte in thiy int 자동 형변환

        long lNum = 100;
        float fNum = lNum;

        int num = 'A';
        char ch = 97;

        System.out.print(num);



    }
    public void cast2() {
        int iNum = 10;
        long lNum = 100L;

        //int result = iNum + lNum;

        //1. 수행결과를 int로 강제 형변환
        int result1 = (int)(iNum + lNum);

        //2.long타입의 값을 int로 강제 형변환
        int result2 = iNum + (int)lNum;

        //3. 결과 값을 long타입으로 받기
        long result3 = iNum + lNum;



    }

}
