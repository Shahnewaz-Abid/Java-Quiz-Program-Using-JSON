// Add 10 general knowledge question in a json file(you can add or remove data from the file).
// Generate 5 random questions from the saved question. Now input the correct answer. If ans is correct, count point 1 for each corrected ans.
// For each wrong ans, point is 0. After ending the quiz, show total point out of 5 questions.

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Quiz_Program {
    public static void main(String[] args) throws IOException, ParseException {
        String fileName="./src/main/resources/Questions.json";
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileName));
        JSONArray jsonArray = (JSONArray) obj;

        JSONObject jsonObj1 = (JSONObject) jsonArray.get(0);
        JSONObject jsonObj2 = (JSONObject) jsonArray.get(1);
        JSONObject jsonObj3 = (JSONObject) jsonArray.get(2);
        JSONObject jsonObj4 = (JSONObject) jsonArray.get(3);
        JSONObject jsonObj5 = (JSONObject) jsonArray.get(4);
        JSONObject jsonObj6 = (JSONObject) jsonArray.get(5);
        JSONObject jsonObj7 = (JSONObject) jsonArray.get(6);
        JSONObject jsonObj8 = (JSONObject) jsonArray.get(7);
        JSONObject jsonObj9 = (JSONObject) jsonArray.get(8);
        JSONObject jsonObj10 = (JSONObject) jsonArray.get(9);

        String one1 = (String) jsonObj1.get("1");
        String que1 = (String) jsonObj1.get("Que1");
        String oneA = (String) jsonObj1.get("A");
        String oneB = (String) jsonObj1.get("B");
        String oneC = (String) jsonObj1.get("C");
        String oneD = (String) jsonObj1.get("D");

        String two2 = (String) jsonObj2.get("2");
        String que2 = (String) jsonObj2.get("Que2");
        String twoA = (String) jsonObj2.get("A");
        String twoB = (String) jsonObj2.get("B");
        String twoC = (String) jsonObj2.get("C");
        String twoD = (String) jsonObj2.get("D");

        String three3 = (String) jsonObj3.get("3");
        String que3 = (String) jsonObj3.get("Que3");
        String threeA = (String) jsonObj3.get("A");
        String threeB = (String) jsonObj3.get("B");
        String threeC = (String) jsonObj3.get("C");
        String threeD = (String) jsonObj3.get("D");

        String four4 = (String) jsonObj4.get("4");
        String que4 = (String) jsonObj4.get("Que4");
        String fourA = (String) jsonObj4.get("A");
        String fourB = (String) jsonObj4.get("B");
        String fourC = (String) jsonObj4.get("C");
        String fourD = (String) jsonObj4.get("D");

        String five5 = (String) jsonObj5.get("5");
        String que5 = (String) jsonObj5.get("Que5");
        String fiveA = (String) jsonObj5.get("A");
        String fiveB = (String) jsonObj5.get("B");
        String fiveC = (String) jsonObj5.get("C");
        String fiveD = (String) jsonObj5.get("D");

        String six6 = (String) jsonObj6.get("6");
        String que6 = (String) jsonObj6.get("Que6");
        String sixA = (String) jsonObj6.get("A");
        String sixB = (String) jsonObj6.get("B");
        String sixC = (String) jsonObj6.get("C");
        String sixD = (String) jsonObj6.get("D");

        String seven7 = (String) jsonObj7.get("7");
        String que7 = (String) jsonObj7.get("Que7");
        String sevenA = (String) jsonObj7.get("A");
        String sevenB = (String) jsonObj7.get("B");
        String sevenC = (String) jsonObj7.get("C");
        String sevenD = (String) jsonObj7.get("D");

        String eight8 = (String) jsonObj8.get("8");
        String que8 = (String) jsonObj8.get("Que8");
        String eightA = (String) jsonObj8.get("A");
        String eightB = (String) jsonObj8.get("B");
        String eightC = (String) jsonObj8.get("C");
        String eightD = (String) jsonObj8.get("D");

        String nine9 = (String) jsonObj9.get("9");
        String que9 = (String) jsonObj9.get("Que9");
        String nineA = (String) jsonObj9.get("A");
        String nineB = (String) jsonObj9.get("B");
        String nineC = (String) jsonObj9.get("C");
        String nineD = (String) jsonObj9.get("D");

        String ten10 = (String) jsonObj10.get("10");
        String que10 = (String) jsonObj10.get("Que10");
        String tenA = (String) jsonObj10.get("A");
        String tenB = (String) jsonObj10.get("B");
        String tenC = (String) jsonObj10.get("C");
        String tenD = (String) jsonObj10.get("D");

        Scanner sc = new Scanner(System.in);
        int count = 0;
        for(int i = 1; i<=5; i++) {
            double rand = Math.ceil(Math.random()*10);
            int random = (int) rand;
            if(random == Integer.parseInt(one1)) {
                System.out.println(que1);
                System.out.println(oneA);
                System.out.println(oneB);
                System.out.println(oneC);
                System.out.println(oneD);
                System.out.println("Give the correct answer exactly as the following option: ");
                String input = sc.nextLine();
                if(input.equals(oneB)) {
                    count++;
                    System.out.println("Answer is correct!");
                }
                else {
                    System.out.println("Wrong Answer");
                }
            }
            if(random == Integer.parseInt(two2)) {
                System.out.println(que2);
                System.out.println(twoA);
                System.out.println(twoB);
                System.out.println(twoC);
                System.out.println(twoD);
                System.out.println("Give the correct answer exactly as the following option: ");
                String input = sc.nextLine();
                if(input.equals(twoB)) {
                    count++;
                    System.out.println("Answer is correct!");
                }
                else {
                    System.out.println("Wrong Answer");
                }
            }
            if(random == Integer.parseInt(three3)) {
                System.out.println(que3);
                System.out.println(threeA);
                System.out.println(threeB);
                System.out.println(threeC);
                System.out.println(threeD);
                System.out.println("Give the correct answer exactly as the following option: ");
                String input = sc.nextLine();
                if(input.equals(threeB)) {
                    count++;
                    System.out.println("Answer is correct!");
                }
                else {
                    System.out.println("Wrong Answer");
                }
            }
            if(random == Integer.parseInt(four4)) {
                System.out.println(que4);
                System.out.println(fourA);
                System.out.println(fourB);
                System.out.println(fourC);
                System.out.println(fourD);
                System.out.println("Give the correct answer exactly as the following option: ");
                String input = sc.nextLine();
                if(input.equals(fourA)) {
                    count++;
                    System.out.println("Answer is correct!");
                }
                else {
                    System.out.println("Wrong Answer");
                }
            }
            if(random == Integer.parseInt(five5)) {
                System.out.println(que5);
                System.out.println(fiveA);
                System.out.println(fiveB);
                System.out.println(fiveC);
                System.out.println(fiveD);
                System.out.println("Give the correct answer exactly as the following option: ");
                String input = sc.nextLine();
                if(input.equals(fiveA)) {
                    count++;
                    System.out.println("Answer is correct!");
                }
                else {
                    System.out.println("Wrong Answer");
                }
            }
            if(random == Integer.parseInt(six6)) {
                System.out.println(que6);
                System.out.println(sixA);
                System.out.println(sixB);
                System.out.println(sixC);
                System.out.println(sixD);
                System.out.println("Give the correct answer exactly as the following option: ");
                String input = sc.nextLine();
                if(input.equals(sixD)) {
                    count++;
                    System.out.println("Answer is correct!");
                }
                else {
                    System.out.println("Wrong Answer");
                }
            }
            if(random == Integer.parseInt(seven7)) {
                System.out.println(que7);
                System.out.println(sevenA);
                System.out.println(sevenB);
                System.out.println(sevenC);
                System.out.println(sevenD);
                System.out.println("Give the correct answer exactly as the following option: ");
                String input = sc.nextLine();
                if(input.equals(sevenA)) {
                    count++;
                    System.out.println("Answer is correct!");
                }
                else {
                    System.out.println("Wrong Answer");
                }
            }
            if(random == Integer.parseInt(eight8)) {
                System.out.println(que8);
                System.out.println(eightA);
                System.out.println(eightB);
                System.out.println(eightC);
                System.out.println(eightD);
                System.out.println("Give the correct answer exactly as the following option: ");
                String input = sc.nextLine();
                if(input.equals(eightA)) {
                    count++;
                    System.out.println("Answer is correct!");
                }
                else {
                    System.out.println("Wrong Answer");
                }
            }
            if(random == Integer.parseInt(nine9)) {
                System.out.println(que9);
                System.out.println(nineA);
                System.out.println(nineB);
                System.out.println(nineC);
                System.out.println(nineD);
                System.out.println("Give the correct answer exactly as the following option: ");
                String input = sc.nextLine();
                if(input.equals(nineB)) {
                    count++;
                    System.out.println("Answer is correct!");
                }
                else {
                    System.out.println("Wrong Answer");
                }
            }if(random == Integer.parseInt(ten10)) {
                System.out.println(que10);
                System.out.println(tenA);
                System.out.println(tenB);
                System.out.println(tenC);
                System.out.println(tenD);
                System.out.println("Give the correct answer exactly as the following option: ");
                String input = sc.nextLine();
                if(input.equals(tenC)) {
                    count++;
                    System.out.println("Answer is correct!");
                }
                else {
                    System.out.println("Wrong Answer");
                }
            }
        }

        System.out.println("Your total point: "+ count);
    }
}
