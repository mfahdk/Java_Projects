import java.util.Scanner;                                                               

public class Athlete {

    static final double weightFactor = 0.45;                                            //Constant for weight factor
    static final double heightFactor = 0.025;                                           //Constant for height factor

    private String name;                                                                //Private attributes; name, weight, height
    private double weight;
    private double height;

    public Athlete(){                                                                   //Default contructor
        this.name = "Unknown";
        this.height = 0;
        this.weight = 0;
    }
    
    public Athlete(String Name, double Height, double Weight){                          //Parameterized constructor
        this.name = Name;
        this.height = Height;
        this.weight = Weight;
    }

    public String getName() {                                                           //Name Accesor
        return name;
    }

    public void setName(String name) {                                                  //Name Mutator
        this.name = name;
    }

    public double getWeight() {                                                         //Weight Accesor
        return weight;
    }

    public void setWeight(double weight) {                                              //Weight Mutator
        this.weight = weight;
    }

    public double getHeight() {                                                         //Height Accesor
        return height;
    }

    public void setHeight(double height) {                                              //Height Mutatator
        this.height = height;
    }
    public double setBMI(double height,double weight){                                  //Method to set BMI
        if (height <= 0.0001){                                                          //If height is less than 0 to accuracy of 0.0001, BMI is -999
            return -999.0;
        }
        else{
            double BMI = (weight*weightFactor)/Math.pow((height*heightFactor),2);    //Caluculates BMI using formula and returns it
            return BMI;
        }
    }
}

class TestAthlete{
    public static void main(String[] args){
        Athlete Athlete1 = new Athlete();
        System.out.printf("Name: "+Athlete1.getName()+" Height: %.1f"+ " Weight: %.1f",Athlete1.getHeight(),Athlete1.getWeight());
        System.out.printf("\nAthlete's BMI: %.2f \n\n",Athlete1.setBMI(0, 0));
        Athlete1.setName("George Brown");                                                                                          //Sets athelte name, height and weight
        Athlete1.setHeight(71.0);
        Athlete1.setWeight(175.0);
        System.out.printf("Name: "+Athlete1.getName()+" Height: %.1f"+ " Weight: %.1f",Athlete1.getHeight(),Athlete1.getWeight());
        System.out.printf("\nAthlete's BMI: %.2f \n\n",Athlete1.setBMI(71.0, 175.0));
        Scanner scan = new Scanner(System.in);                                                                                          //Scanner class used to take user input
        System.out.println("Enter name: ");
        String athleteName = scan.nextLine();                                                                                           //Name input
        System.out.println("Enter Height: ");
        double athleteHeight = scan.nextDouble();                                                                                       //Height input
        System.out.println("Enter weight: ");
        double athleteWeight = scan.nextDouble();                                                                                       //Weight input
        Athlete Athlete2 = new Athlete(athleteName,athleteHeight,athleteWeight);
        System.out.printf("Name: "+Athlete2.getName()+" Height: %.1f"+ " Weight: %.1f",Athlete2.getHeight(),Athlete2.getWeight());
        System.out.printf("\nAthlete's BMI: %.2f \n\n",Athlete2.setBMI(athleteHeight,athleteWeight));
        scan.close();                                                                                                                   //Close scanner
    }
}
