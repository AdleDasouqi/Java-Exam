package com.xcode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();
        System.out.print("Enter your ID: ");
        int yourId = input.nextInt();
        
        System.out.println("Welcome " + fullName + "\n\"The exam consists of one part and ten questions\".");

        String questionOne = "Question 1: Java is short for \"JavaScript?\n" +
                "(a.) Ture\n(b.) False";

        String questionTwo = "Question 2: Which data type is used to create a variable that should store text?\n" +
                "(a.) string\n(b.) nextString\n(c.) String\n(d.) myString";

        String questionThree = "Question 3: Which method can be used to find the length of a string?\n" +
                "(a.) getLength()\n(b.) getSize\n(c.) length()\n(d.) len";

        String questionFour = "Question 4: The value of a string variable can be surrounded by single quotes?\n" +
                "(a.) True\n(b.) False";

        String questionFive = "Question 5: Which operator can be used to compare two values?\n" +
                "(a.) ==\n(b.) =\n(c.) >=\n(d.) <=";

        String questionSix = "Question 6: To declare an array in Java, define the variable type with?\n" +
                "(a.) ()\n(b.) {}\n(c.) []\n(d.) All of the above are correct";

        String questionSeven = "Question 7: Array indexes start with?\n" +
                "(a.) -1\n(b.) 1\n(c.) 0\n(d.) 2";

        String questionEight = "Question 8: How do you call a method in Java?\n" +
                "(a.) methodName{}\n(b.) methodName[]\n(c.) methodName()\n(d.) methodName";

        String questionNine = "Question 9: What is the correct way to create an object called myObj of myClass?\n" +
                "(a.) new myObj = myClass();\n(b.) myClass myObj = new myClass();\n(c.) class myClass = new myObj();\n(d.) All of the above are incorrect";

        String questionTen = "Question 10: In Java, it is possible to inherit attributes and methods from one class to another?\n" +
                "(a.) True\n(b.) False";

        Question[] question = { 
            new Question(questionOne, "b"),
            new Question(questionTwo, "d"),
            new Question(questionThree, "c"),
            new Question(questionFour, "a"),
            new Question(questionFive, "a"),
            new Question(questionSix, "c"),
            new Question(questionSeven, "c"),
            new Question(questionEight, "c"),
            new Question(questionNine, "b"),
            new Question(questionTen, "a")
        };
        testExam(question);

    }
    public static void testExam(Question[] questions) {
        int marks = 0;
        Scanner inputAnswer = new Scanner(System.in);
        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].questionExam);
            String answer = inputAnswer.nextLine();
            if(answer.equals(questions[i].answerExam)) {
                marks++;
            }
        }
        inputAnswer.close();
        System.out.println("You got " + marks + "/" + questions.length);
    }
}
