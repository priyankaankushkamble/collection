package collection;

import java.util.*;

class Player {
	private int id;
	private String name;
	private int run;

	public Player(int id, String name, int run) {
		this.id = id;
		this.name = name;
		this.run = run;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}
	@Override
	public String toString() {
	    return "ID: " + id + ", Name: " + name + ", Run: " + run;
	}

}

public class PlayerArrayList {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		ArrayList<Player> players = new ArrayList<>();

		Player[] a = new Player[5];
		a[0] = new Player(1, "Virat", 12000);
		a[1] = new Player(2, "Rajesh", 1100);
		a[2] = new Player(3, "Ram", 15000);
		a[3] = new Player(4, "Dinesh", 20000);
		a[4] = new Player(5, "Mahesh", 45000);

		int choice;
		do {
			System.out.println("-----Player Operations------");
			System.out.println("1:Add All Player");
			System.out.println("2:View All Player");
			System.out.println("3:Search Player by using id");
			System.out.println("4:Delete player by using id of player");
			System.out.println("5:Update name and run by using id of player");
			System.out.println("0:Exists");
			System.out.print("Enter Your Choice");

			choice = xyz.nextInt();

			switch (choice) {
			case 1:
				for (Player p : a) {
					players.add(p);
				}
				System.out.println("All players added successfully........");
				break;
			case 2:
				if (players.isEmpty()) {
					System.out.println("No players found.");
				} else {
					System.out.println("Player List:");
					for (Player p : players) {
						System.out.println(p);
					}

				}
				break;
			case 3:
				System.out.print("Enter Player ID to search: ");
				int searchId = xyz.nextInt();
				boolean found = false;
				for (Player p : players) {
					if (p.getId() == searchId) {
						System.out.println("Player Found: " + p);
						found = true;
						break;
					}
				}
				if (!found) {
					System.out.println("Player not found");
				}
				break;
			case 4:
				System.out.print("Enter Player ID to delete: ");
				int delId = xyz.nextInt();
				Player toRemove = null;
				for (Player p : players) {
					if (p.getId() == delId) {
						toRemove = p;
						break;
					}
				}
				if (toRemove != null) {
					players.remove(toRemove);
					System.out.println("Player deleted successfully........");
				} else {
					System.out.println("Player not found");
				}
				break;
			case 5:
				System.out.print("Enter Player ID to update: ");
				int updId = xyz.nextInt();
				boolean updated = false;
				for (Player p : players) {
					if (p.getId() == updId) {
						System.out.print("Enter new name: ");
						String newName = xyz.next();
						System.out.print("Enter new run: ");
						int newRun = xyz.nextInt();
						p.setName(newName);
						p.setRun(newRun);
						System.out.println("Player updated successfully.......");
						updated = true;
						break;

					}
				}
				if (!updated) {
					System.out.println("Player not found");
				}
				break;

			case 6:
				System.out.println("Exiting program...");
				break;

			default:
				System.out.println("Invalid choice. Try again.");
			}
		} while (choice != 6);
	}

}
