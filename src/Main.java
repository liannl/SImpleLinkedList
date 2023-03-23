import java.util.Scanner;

public class Main {
    public static Integer enterNumber()
    {
        Scanner scan = new Scanner(System.in);
        String s ="";
        Integer number = null;
        s =scan.next();

        try{
            number = Integer.parseInt(s);
        }catch (NumberFormatException e){
            System.out.println("Incorrect input");
        }
        return number;
    }
    public static void main(String[] args) {
        SimpleLinkedListWrapper<Integer> list = new SimpleLinkedListWrapper<>();

        Integer ind = 0, stop = 4;
        while (!stop.equals(ind)){
            System.out.println("-------\n1.Add\n2.Remove\n3.Print\n4.Exit\n-------");
            ind = enterNumber();

            switch (ind){
                case 1:
                    System.out.println("Enter number");
                    Integer number = enterNumber();
                    if(number != null)
                        list.add(number);
                    break;
                case 2:
                    System.out.println("Enter index");
                    Integer index = enterNumber();
                    if(index != null){
                        try {
                            list.remove(index);
                        }catch (IndexOutOfBoundsException e){
                            System.out.println("Index out of range");
                        }
                    }
                    break;
                case 3:
                    list.print();
            }
        }
    }
}