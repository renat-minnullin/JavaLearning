/*При отборе в IT-клуб студентов спрашивают, сколько раз в неделю и как много литров пива они выпивают за каждый раз.
Студента принимают в клуб, если за семестр (16 недель) он выпивает не менее 120 литров. 
На вход подается два натуральных числа: количество раз и количество литров.
Необходимо вывести нарастающей суммой, сколько студент суммарно за семестр выпьет к каждой неделе, и выдать решение о принятии в клуб.
Если введены некорректные данные, программа не должна исполняться.
*/
import java.util.Scanner;
public class Task_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int NUM_WEEKS = 16;
		int MAX_VOLUME = 120;
		int volume = 0;
		System.out.println("Задача Собеседования");
		System.out.println("Введите сколько раз в неделю выпивает студент");
		int num_times = sc.nextInt();
		System.out.println("Введите количество выпитых литров за раз");
		int num_litres = sc.nextInt();
		
		if (num_times < 0 | num_litres < 0) {
			System.out.println("Введены некорректные данные");
		}
		else {
			for (int i = 0; i<NUM_WEEKS; i++) {
				int number_week = i + 1;
				volume += num_times * num_litres;
				System.out.println("К " + number_week + " неделе будет выпито " + volume + " литров жидкости");
			}
			if (volume < MAX_VOLUME) {
				System.out.println("К сожалению, студент не принят в клуб");
			}
				else {
					System.out.println("Студент принят в IT-клуб");
			}
			
		}
		
	}

}
