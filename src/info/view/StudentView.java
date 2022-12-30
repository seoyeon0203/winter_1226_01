package info.view;

import java.util.ArrayList;

import info.vo.SchoolInfo;
import info.vo.StudentVO;

public class StudentView {
	public void view(ArrayList<StudentVO> svoList) {
		System.out.println("학교명 : "+ SchoolInfo.SCHOOL_NAME);
		// 개선된(enhanced) for문
		for(StudentVO svo : svoList) {
			System.out.print("성명: "+svo.getName()+"\t");
			System.out.print("학번: "+svo.getStuID()+"\t");
			System.out.print("학년: "+svo.getGrade()+"\t");
			System.out.print("전공: "+svo.getMajor()+"\t");
			System.out.print("주소: "+svo.getAddress()+"\n");
		}
		System.out.println("학교 전화 : "+SchoolInfo.PHONE_NUMBER);
		System.out.println("학교 주소 : "+SchoolInfo.SCHOOL_ADDRESS);
	}
}
