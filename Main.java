public class Main {
    public static void main(String[] args) {

        double random = Math.random();

        Student p1= new Student("Jade",19,"Sophomore", 'B');
        Student p2= new Student("Roxanne", 19,"Sophomore", 'F');

        System.out.println("Random value: "+random + "\n");

        if (random < .5) {
            System.out.println("It is "+ p1.name+"'s birthday!");
            p1.age++;
            System.out.println("They turn "+ p1.age+"'s today!");
        }
        else {
            System.out.println("It is "+ p2.name+"'s birthday!");
            p2.age++;
            System.out.println("They turn "+ p2.age+"'s today!");
        }
        //It is Jade's birthday!//
        //They turn 20's today!//
        //It is Roxanne's birthday!//
        //They turn 20's today!//
    }
}
