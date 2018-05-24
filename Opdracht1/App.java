public class App {

    public static void main(String[] args){
        //Studenten aanmaken
        Student Janice = new Student(01, "Janice", 25, "v");
        Student Kermit = new Student(02, "Kermit", 18, "m");
        Student Gonzo = new Student(03, "Gonzo", 8, "m");
        Student Swedish_Chef = new Student(04, "Swedish_Chef", 35, "m");
        Student Miss_Piggy = new Student(05, "Miss_Piggy", 28, "v");


        Stack stack = new Stack();      //Stack aanmaken
        stack.pop();                    //Pop uitvoeren
        stack.printStack();             //Stack printen
        stack.printWomen();             //Vrouwen printen

        //push studenten
        stack.push(Janice);
        stack.push(Kermit);
        stack.push(Gonzo);
        stack.push(Swedish_Chef);
        stack.push(Miss_Piggy);

        stack.printMen();               //Mannen printen
        stack.printWomen();             //Vrouwen printen
        stack.push(Kermit);             //Kermit nogmaals pushen
        stack.printStack();             //Stack printen
    }
}

