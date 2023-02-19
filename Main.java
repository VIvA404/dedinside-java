
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ты гуль?: ");
        String answer = input.nextLine();
        if(answer.equals("Да") | answer.equals("да")){
            int i = 1000;
            while(i>7){
                System.out.print(i + "-7=");
                i-=7;
                System.out.print(i);
                System.out.println("");

                try{
                    Thread.sleep(100);
                } catch (Exception e){}

            }
        }
        else{
            System.out.println("че то не то написал");
        }
    }
}