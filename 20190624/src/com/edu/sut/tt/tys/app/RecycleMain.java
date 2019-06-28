package com.edu.sut.tt.tys.app;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.edu.sut.business.Recycle;
import com.edu.sut.business.Student;

public class RecycleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Recycle recycle1 = Recycle.getInstance();
		Recycle recycle2 = Recycle.getInstance();
		
		recycle1.add(123);
		recycle1.add(456);
	/*	recycle2.del(123);*/
		
		recycle1.getList();
		
		List<Object> list = recycle1.getList();
		
		
		//方案一:从小标开始,0开始,到len-1结束
		//方案二:增强型for循环
		//方案三:迭代器
		
		Iterator<Object> iter = list.iterator();
		
		while(iter.hasNext()){
			Object obj = iter.next();
			if(obj instanceof Student){
				Student s = (Student)obj;
				s.setID("001");
				s.setSEX("nv");
				System.out.println("I'm a student:-->"+s);
				continue;
			}else if(obj instanceof Integer){
				System.out.println("I'm a integer-->"+obj);
			}
			
		}
		
		//鎴彇閮ㄥ垎瀹瑰櫒
		List<Object> list2 = list.subList(0, 2);//宸﹂棴鍙冲紑
		for (Object o : list2) {
			System.out.println(o);
		}
		
		//List灏辨槸涓�涓暟缁勶紝浠栦滑涔嬮棿鍙互杩涜杞崲銆�
		Object[] objArray = list2.toArray();
		for (Object o1 : objArray) {
			System.out.println(o1);
		}
		
		//鎬庝箞鎶婁竴涓暟缁勮浆鍖栦负list   Arrays.aslist(),collections.aslist()
		List<Object> listObject = Arrays.asList(objArray);
		for (Object o2 : listObject) {
			System.out.println("o2->"+o2);
		}
		//鐜板湪鏄竴涓暣浣撳鍣紝鎴戞兂鑾峰彇閮ㄥ垎瀹瑰櫒銆係tring.subString(0,2)
	}

	
	//set
	
	//<>娉涘瀷
	//  娉涘瀷绫�
	//  娉涘瀷鏂规硶
	//list鐗圭偣锛氬彲浠ラ噸澶嶇殑瀵硅薄
	  //list鎬庝箞鍘婚噸锛�
	  //渚嬪锛歴tr = "abc" str1 = "abc" 鎬庝箞鎶妉ist涓璦bc鍘婚噸锛�
	
	//set 娌℃湁閲嶅鐨勬暟鎹��
	
}
