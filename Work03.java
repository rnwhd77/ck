package net.hb.day31;

public class Work03 {
	public static void main(String[] args) {
	  int kor=0, eng=0, com=0, hap=0 ;
	  double avg = 0.0 ;
	  
	  //263/3=87.666666666
	  // 국어     영어   컴퓨터  합계     평균
      //  90     85     78    263     87.0
	  kor = 100;  eng = 85; com=78;
	  hap = kor + eng + com;
	  avg = (double)hap/3; //hap변수 실수형변환
	  
	  System.out.println("\t*** 2023 5월 결과출력 *** ");
	  System.out.println("국어\t영어\t컴퓨터\t합계\t평균");
	  System.out.print(kor+"\t"+eng+"\t"+com+"\t"+hap+"\t");
	  System.out.printf("%.2f", avg);
	  
	}
}//class END








