package sec2.exam01;

public class RectangleExample {

	public static void main(String[] args) {
		Rectangle myRec = new Rectangle();

		// 정사각형의 넓이 구하기
		double result1 = myRec.areaRectangle(10);

		// 직사각형의 넓이 구하기
		double result2 = myRec.areaRectangle(10, 20);

		// 결과 출력
		System.out.println("정사각형의 넓이:" + result1);
		System.out.println("직사각형의 넓이:" + result2);
	}

}
