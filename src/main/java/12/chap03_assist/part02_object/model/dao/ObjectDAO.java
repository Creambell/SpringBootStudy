package com.kh.example.chap03_assist.part02_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.kh.example.chap03_assist.part02_object.model.vo.Member;

public class ObjectDAO {
	public void fileSave() {
		ArrayList<Member> list = new ArrayList<Member>();
		
		Member[] mArr = {new Member("user01","pass01","강건강","kang111@kh.or.kr",25,'남',1340.4)
						,new Member("user02","pass02","퍼펙트","kang5987@kh.or.kr",17,'남',3542.4)
						,new Member("user03","pass03","마벨러스","kang1852@kh.or.kr",22,'여',2648.4)};
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_object.txt"));
		) {
//			while(true) {
//				list.add((Member)oos.writeObject());
//			}
//			for(int i = 0; i < mArr.length;i++) {
//				oos.writeObject(mArr[i]);
//			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(EOFException e) {
			System.out.println(list);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
//	public void fileOpen() {
//		Member[] mArr = new Member[3];
//		
//		try(ObjectInputStream ois = new ObjectInputStream(FileInputStream("d_object.txt"));) {
//			for(int i = 0; i< mArr.length;i++) {
//				mArr[i] = ois.readObject();
//			
//		}
//		
//		
//		}
//	}
	
	public void exampleWrite() {
		// 객체 추가해서 파일에 덮어 씌우기
		// 0 .파일에 있는 데이터(객체)를 읽어오기
		// 1. 읽어온 데이터(객체)를 배열에 담기
		// 2. 배열에 새로운 데이터 추가하기
		// 3. 새 데이터까지 들어간 배열을 파일에 데이터 덮어쓰기
		
		ArrayList<Member> list = new ArrayList<Member>();
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_object.txt"));
		) {
			
			while(true) {
				Member m = (Member)ois.readObject(); // 0.파일에 있는 데이터 읽어오기
				list.add(m); // 1. 읽어온 데이터를 배열에 담기
			}
			
		} catch (EOFException e) {
			// 2. 배열에 새로운 데이터 추가하기
			list.add(new Member("user04","pass04","비비빅","big9999@kh.or.kr",11,'여',231.4));
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// 3. 새 데이터까지 들어간 배열을 파일에 데이터 덮어쓰기
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_object.txt"));
			){
			for(int i = 0; i <list.size();i++) {
				oos.writeObject(list.get(i));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
