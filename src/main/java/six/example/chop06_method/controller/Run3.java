package six.example.chop06_method.controller;

import java.util.Scanner;

public class Run3 {

	public static void main(String[] args) {
		Employee e =  new Employee();
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.print("empNo 입력 : ");
        e.setEmpNo(sc.nextInt()); 
        sc.nextLine();
        System.out.print("empName 입력 : ");
        e.setEmpName(sc.nextLine());
        System.out.print("dept 입력 : ");
        e.setDept(sc.nextLine());
        System.out.print("job 입력 : ");
        e.setJob(sc.nextLine());
        System.out.print("age 입력 : ");
        e.setAge(sc.nextInt());
        System.out.print("gender 입력 : ");
        e.setGender(sc.next().charAt(0));
        System.out.print("salary 입력 : ");
        e.setSalary(sc.nextInt());
        System.out.print("bonusPoint 입력 : ");
        e.setBonusPoint(sc.nextDouble());
        System.out.print("phone 입력 : ");
        sc.nextLine();
        e.setPhone(sc.nextLine());
        System.out.print("address 입력 : ");
        e.setAddress(sc.nextLine());
        
        ////////////////////////////////////////////
        
        System.out.print(e.getEmpNo() + " , ");
        System.out.print(e.getEmpName() + " , ");
        System.out.print(e.getDept() + " , ");
        System.out.print(e.getJob() + " , ");
        System.out.print(e.getAge() + " , ");
        System.out.print(e.getGender() + " , ");
        System.out.print(e.getSalary() + " , ");
        System.out.print(e.getBonusPoint() + " , ");
        System.out.print(e.getPhone() + " , ");
        System.out.print(e.getAddress() + " , "); 
	}

}
