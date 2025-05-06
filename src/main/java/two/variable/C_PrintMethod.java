package two.variable;

public class C_PrintMethod {
    public void printf(){
        String str1 = "안녕하세요";
        String str2 = "반갑습니다";
        int age = 26;
        String name = "조호선";
        String job = "학생";

        System.out.println(str1 + ", 저는 "  + age + "살 "+ name +
                " " + job + "입니다. 만나서 " + str2);
        System.out.printf("%s, 저는 %d살 %s %s입니다. 만나서 %s.\n"
                ,str1,age,name,job,str2);


    }
}
