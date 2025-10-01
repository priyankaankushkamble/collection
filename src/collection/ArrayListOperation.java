package collection;

import java.util.*;

public class ArrayListOperation {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		Scanner xyz = new Scanner(System.in);
		int choice;
		do {
			System.out.println("-----ArrayList Operations-------");
			System.out.println("1:Add New Element");
			System.out.println("2:View All Element");
			System.out.println("3:Search Value using indexOf");
			System.out.println("4:Search element using get");
			System.out.println("5:Delete element using index");
			System.out.println("6:Check Size");
			System.out.println("7:Check ArrayList is empty or not");
			System.out.println("0:Exists");
			System.out.print("Enter Your Choice");
			choice = xyz.nextInt();
			xyz.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Enter Element to Add");
				String ele = xyz.nextLine();
				list.add(ele);
				System.out.print("Element Added.....");
				break;

			case 2:
				System.out.println("ArrayList element" + list);
				break;

			case 3:
				System.out.print("Enter element to search indexOf: ");
				String searchElement = xyz.nextLine();
				int index = list.indexOf(searchElement);
				if (index != -1) {
					System.out.println("Element found at index: " + index);
				} else {
					System.out.println("Element not found.");
				}
				break;
			case 4:
				System.out.print("Enter index to get element: ");
				int getIndex = xyz.nextInt();
				xyz.nextLine(); // consume newline
				if (getIndex >= 0 && getIndex < list.size()) {
					System.out.println("Element at index " + getIndex + " is: " + list.get(getIndex));
				} else {
					System.out.println("Invalid index.");
				}
				break;

			case 5:
				System.out.print("Enter index to delete element: ");
				int deleteIndex = xyz.nextInt();
				xyz.nextLine(); // consume newline
				if (deleteIndex >= 0 && deleteIndex < list.size()) {
					String removed = list.remove(deleteIndex);
					System.out.println("Removed element: " + removed);
				} else {
					System.out.println("Invalid index.");
				}
				break;
			case 6:
				System.out.println("Size of ArrayList: " + list.size());
				break;

			case 7:
				if (list.isEmpty()) {
					System.out.println("ArrayList is empty.");
				} else {
					System.out.println("ArrayList is not empty.");
				}
				break;

			case 8:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice. Try again.");
			}

		} while (choice != 8);

	}

}
