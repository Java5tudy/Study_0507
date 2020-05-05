package studyJava.ObjectEx;

/***
 * 다음과 같은 실행결과를 얻도록 코드를 완성하시오
 * 메서드명 : action
 * 기능 : 주어진 객체의 메서드를 호출한다. 
 * 		DanceRobot - dance()
 * 		SingRobot - sing()
 * 		DrawRobot - draw()
 * 반환타입 : 없음
 * 매개변수 : Robot r - Robot instance or Robot instance's inherit.
 * 
 * class Exercise7_18{
 * 		// action method
 * 
 * 		public static void main(String[]args){
 * 			Robot[]arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
 * 	
 * 			for (int i=0; i<arr.length;i++)
 * 				action(arr[i]);
 * 		}
 * }
 * class Robot {}
 * class DanceRobot extends Robot{
 * 		void dance(){System.out.println("춤을 춥니다");}
 * }
 * class SingRobot extends Robot{
 * 		void sing(){System.out.println("노래를 합니다");}
 * }
 * class DrawRobot extends Robot{
 * 		void draw(){System.out.println("그림을 그립니다");}
 * }
 * @author kate
 */

class Exercise7_18{
 		static void action(Robot r) {
 			if (r instanceof DanceRobot) {
 				((DanceRobot)r).dance();
 			} if (r instanceof SingRobot) {
 				((SingRobot) r).sing();
 			}if (r instanceof DrawRobot) {
 				((DrawRobot)r).draw();
 			}
 			
 		}
 
 		public static void main(String[]args){
 			Robot[]arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
 	
 			for (int i=0; i<arr.length;i++)
 				action(arr[i]);
 		}
 }

 class Robot {}
 class DanceRobot extends Robot{
 		void dance(){System.out.println("춤을 춥니다");}
 }
 class SingRobot extends Robot{
 		void sing(){System.out.println("노래를 합니다");}
 }
 class DrawRobot extends Robot{
 		void draw(){System.out.println("그림을 그립니다");}
 }
