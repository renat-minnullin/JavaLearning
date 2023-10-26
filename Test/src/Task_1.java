
/*Напиши программу, которая сначала запрашивает на ввод строку (например, abc) и
натуральное число N, а потом выводит в консоль данную строку N раз. 
Строка должна быть выведена хотя бы один раз.*/
import java.util.Scanner;

public class Task_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Задача Повторения");
		System.out.println("Введите строку");
		String input_string = sc.nextLine();
		System.out.println("Введите число повторений");
		int num_rep = sc.nextInt();
		System.out.println(input_string);
		for (int i = 1; i<num_rep; i++) {
			System.out.println(input_string);
		}
		
	}
}
