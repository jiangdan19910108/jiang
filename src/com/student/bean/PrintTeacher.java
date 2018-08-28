/**
 *
 */
package com.student.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jiangdan
 *
 */
public class PrintTeacher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Teacher teacherOne = new Teacher();
		teacherOne.setId(1);
		teacherOne.setTeachername("teacher01");
		teacherOne.setCourse("Chinese");

		Teacher teacherTwo = new Teacher();
		teacherTwo.setId(1);
		teacherTwo.setTeachername("teacher02");
		teacherTwo.setCourse("Chinese");

		Teacher teacherThree = new Teacher();
		teacherThree.setId(1);
		teacherThree.setTeachername("teacher01\3");
		teacherThree.setCourse("Chinese");

		Teacher teacherFour = new Teacher();
		teacherFour.setId(1);
		teacherFour.setTeachername("teacher04");
		teacherFour.setCourse("Chinese");



		//先生のhashmapを新規生成
		Map<Integer,Teacher> teacherMap = new HashMap<Integer,Teacher>();
		//先生1をhashmapに入れる
		teacherMap.put(1, teacherOne);
		teacherMap.put(2, teacherTwo);
		teacherMap.put(3, teacherThree);

		//先生のIDの初期化
		int IdSum = 0;
		//LOOP合計
		for(Teacher teacher: teacherMap.values()){
			//毎回先生のidを取り出し
			IdSum = teacher.getId() + IdSum ;
			//System.out.println("先生id" + teacher.getId());
		}

		System.out.println("先生idを合計" + IdSum);
		System.out.println("先生idを平均値" + IdSum/teacherMap.size());
	}
}