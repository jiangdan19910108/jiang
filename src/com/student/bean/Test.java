package com.student.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

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


	//先生のListを新規生成
	List<Teacher> TeacherList = new ArrayList();
	TeacherList.add(teacherOne);
	TeacherList.add(teacherTwo);
	TeacherList.add(teacherThree);

	//ListでLOOP合計
	int IdSum1 = 0;
	for(Teacher teacher:TeacherList) {
		IdSum1 = teacher.getId()+IdSum1;
	}
	Integer avgID = IdSum1/TeacherList.size();
	System.out.println("先生idを平均値(List方法)" + avgID);

	//ListでLOOP合計
	int IdSum2 = 0;
	int max = 0;
	int min = 0;
	int num = 0;
	for(Teacher teacher:TeacherList) {
		IdSum2 = teacher.getId()+IdSum2;
		if (teacher.getId()>max) {
			 max = teacher.getId();
		}
		//Lisｔ中一番目はmin値
		if (num == 0 ) {
		min = teacher.getId();
		}else {
			//min値比較計算
			if (teacher.getId()<min) {
				min = teacher.getId();
			}
		}
		num++;


	Integer avgID1 = IdSum2/TeacherList.size();
	System.out.println("先生idを平均値(List方法)" + avgID1);
	System.out.println("先生idを最大値(List方法)" + max);
	System.out.println("先生idを最小値(List方法)" + min);
}
}
}



