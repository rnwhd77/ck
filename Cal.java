package net.hb.day31;

public class Cal {
	public static void main(String[] args) {
		//문제1 총점,평균 출력
		int kor=0, eng=0, hap=0; //4Byte 정수기억
		double avg=0.0 ; //8Byte 실수기억
	
		kor = 90 ;
		eng = 85 ;
		
		hap = kor + eng ; 
		avg = (double)hap/2; // 175/2 = 87.5 
	
		System.out.println("총점 = " + hap ) ;
		System.out.println("평균 = " + avg ) ; //87.0출력
	}
}//class END



