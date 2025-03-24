import java.util.*;

public class Contact {
    String name;
    long number;
    String email;

    Contact(String name, long number, String email) {
        this.name = name;
        this.number = number;
        this.email = email;
    }

    public String getContname() {
        return name;
    }

    public long getContno() {
        return number;
    }

    public String getContE() {
        return email;
    }

    public String toString() {
        return name + " " + number + " " + email;
    }
}

class Crud {
    public static void main(String[] args) {
        List<Contact> c = new ArrayList<>();
        int choice;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        do {
            System.out.println("1.Create\n2.Read\n3.Search\n4.Delete\n5.Update\n0.Exit");
            System.out.println("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc1.nextLine();
                    System.out.print("Enter Number: ");
                    long number = sc.nextLong();
                    System.out.print("Enter Email: ");
                    String email = sc1.nextLine();
                    c.add(new Contact(name, number, email));
                    break;

                case 2:
                    System.out.println("Contacts List:");
                    for (Contact e : c) {
                        System.out.println(e);
                    }
                    break;

                case 3:
                    System.out.print("Enter Number to Search: ");
                    number = sc.nextLong();
                    boolean found = false;
                    for (Contact e : c) {
                        if (e.getContno() == number) {
                            System.out.println(e);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Not Registered!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Number to Delete: ");
                    number = sc.nextLong();
                    found = false;
                    Iterator<Contact> i = c.iterator();
                    while (i.hasNext()) {
                        Contact e = i.next();
                        if (e.getContno() == number) {
                            i.remove();
                            found = true;
                        }
                    }
                    System.out.println(found ? "Record Deleted" : "Not Registered!");
                    break;

                case 5:
                    System.out.print("Enter Number to Update: ");
                    number = sc.nextLong();
                    found = false;
                    ListIterator<Contact> li = c.listIterator();
                    while (li.hasNext()) {
                        Contact e = li.next();
                        if (e.getContno() == number) {
                            System.out.print("Enter New Number: ");
                            int newNumber = sc.nextInt();
                            System.out.print("Enter New Name: ");
                            String newName = sc1.nextLine();
                            System.out.print("Enter New Email: ");
                            String newEmail = sc1.nextLine();
                            li.set(new Contact(newName, newNumber, newEmail));
                            found = true;
                        }
                    }
                    System.out.println(found ? "Record Updated" : "Not Registered!");
                    break;

                case 0:
                    System.out.println("Exiting Program.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 0);

        sc.close();
        sc1.close();
    }
}
