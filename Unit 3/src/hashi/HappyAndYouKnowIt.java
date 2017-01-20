/**
 * 
 */
package hashi;

/**
 * @author 324350081
 *
 */
public class HappyAndYouKnowIt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] movements = new String[10];

		movements[0]="clap your hands";
		movements[1]="stomp your feet";
		movements[2]="hit the floor";
		movements[3]="touch the floor";
		movements[4]="say hooray";
		movements[5]="tap your head";
		movements[6]="rub your belly";
		movements[7]="touch the floor";
		movements[8]="grab your knees";
		movements[9]="do the dab";

		for(int i=0; i<10; i++){
			for(int x=0;x<2;x++){
				System.out.println("if your happy and you know it " + movements[i]);
			}
			System.out.println("if your happy and you know it and you really want to show it ");
			System.out.println("if your happy and you know it " + movements[i]+"\n");
		}

	}

}
