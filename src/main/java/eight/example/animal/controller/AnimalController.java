package eight.example.animal.controller;

import com.kh.example.test.model.vo.Animal;
import com.kh.example.test.model.vo.Dog;
import com.kh.example.test.model.vo.Snake;

public class AnimalController {
	public void method() {
		Animal a = new Animal("고양이",9,6.3);
		System.out.println(a.toString());
		
		Dog d = new Dog("말티즈",1,5.2,50,"장모");
		System.out.println(d.toString());
		
		Snake s = new Snake("뱀",4,10.2,"빗살");
		System.out.println(s); 
		System.out.println();
		
		
		
	}
}
