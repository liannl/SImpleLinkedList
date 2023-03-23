import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SimpleLinkedListWrapper<Integer> list = new SimpleLinkedListWrapper<>();
        Scanner scan = new Scanner(System.in);
        int ind = 0, stop = 4;

        while (stop != ind){
            System.out.println("-------\n1.Add\n2.Remove\n3.Print\n4.Exit\n-------");

            if(scan.hasNextInt()){
                ind = scan.nextInt();

                switch (ind){
                    case 1:
                        System.out.println("Enter number");
                        if(scan.hasNextInt()) {
                            list.add(scan.nextInt());
                        }
                        break;
                    case 2:
                        System.out.println("Enter index from 0 to " + list.size());
                        if(scan.hasNextInt()) {
                            try {
                                list.remove(scan.nextInt());
                            } catch (IndexOutOfBoundsException e) {
                                System.out.println("Index out of range");
                            }
                        }
                        break;
                    case 3:
                        list.print();
                        break;
                }
            }
        }
    }
}