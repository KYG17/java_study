package com.gn.practice03.run;

import com.gn.practice03.model.vo.Circle;
import com.gn.practice03.model.vo.Point;
import com.gn.practice03.model.vo.Rectangle;

public class Run {
	public static void main(String[] args) {
		
		 // 크기가 2인 Circle, Rectangle 각각 객체 배열 할당 
		Circle[] a = new Circle[2];
		Rectangle[] b = new Rectangle[2];
		
		Circle[] arr1 = new Circle[2];
		
		
		 // 위의 사용 데이터를 참고하여 각각 초기화 
		Circle c1 = new Circle(1,2,3);
		Circle c2 = new Circle(3,3,4);
		a[0] = c1 ;
		a[1] = c2;
		
		Rectangle d1 = new Rectangle(-1,-2,5,2);
		Rectangle d2 = new Rectangle(-2,5,2,8);
		b[0] = d1;
		b[1] = d2;
		 
		 // 각 도형의 draw 메소드 실행(for each) 
		
		}
		
		
		}
		
		
		
//		Point a = new Point(1 ,2);
//		a.draw();
	}


