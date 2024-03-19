import java.util.Arrays;
import java.util.Scanner;

public class Kaprekar {
    public static int kaprekarIterator(int startingNumber){
        int[] convertIntToList = new int[4];
        int[] reversedNum = new int[4];
        for(int character =3; character >= 0;character--){
            convertIntToList[3-character] = (int )(Math.floorMod(startingNumber,(int) Math.pow(10,character+1))/Math.pow(10,character));
        }
        Arrays.sort(convertIntToList);
        for(int index = 3;index >= 0;index--){
            reversedNum[3-index] = convertIntToList[index];
        }

        int convertListToInt=0;
        int convertListToIntReversed=0;
        for(int i = 0; i <= 3;i++){
            convertListToInt+= (int)(Math.pow(10,i)*convertIntToList[i]);
        }

        for(int i = 0; i <= 3;i++){
            convertListToIntReversed+= (int)(Math.pow(10,i)*reversedNum[i]);
        }
        System.out.print("S"+convertListToInt+"-->");
        int nextIteration = Math.abs(convertListToIntReversed-convertListToInt);
        return nextIteration;
    }
    public static int askNum(){
        Scanner question = new Scanner(System.in);
        int num = question.nextInt();
        return num;
    }


    public static void main(String[] args) {
        int num = 6714;

        for(int i = 0; i < 100; i++) {
            num = kaprekarIterator((int) (Math.random() * 9000 + 1000));
            //num = askNum();
            System.out.print(num+"-->");
            while (num != 6174) {
                num = kaprekarIterator(num);
                System.out.print("u"+num+ "-->");
        }
            System.out.println("next iter");
        }
   /*     int num2;
        for(int i = 0; i < 100; i++) {
            num2 = kaprekarIterator((int) (Math.random() * 9000 + 1000));
            System.out.println(num2);
            while (num2 != 909) {
                num2 = kaprekarNew(num2);
                System.out.println(num2);
            }
            System.out.println("next iterNew");
        }

    */
    }
}
