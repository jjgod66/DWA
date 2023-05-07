package e_oop;

public class Calculator {

	// + - * / % 를 연산해주는 5개의 메서드를 만들어주세요.
	// 각각의 메서드는 2개의 파라미터를 받는다. 그 후 결과값 리턴.
	double plRtn;
	double miRtn;
	double muRtn;
	double diRtn;
	double reRtn;
	
	double pl(double a, double b) {
		plRtn = a + b;
		return plRtn;
	}
	double mi(double a, double b) {
		miRtn = a - b;
		return miRtn;
	}
	double mu(double a, double b) {
		muRtn = a * b;
		return muRtn;
	}	
	double di(double a, double b) {
		diRtn = a / b;
		return diRtn;
	}	
	double re(double a, double b) {
		reRtn = a % b;
		return reRtn;
	}	
	
	
	
	
}
