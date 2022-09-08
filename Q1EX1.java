public class Mu06_Cristobal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var studentOne = "Brent";
        var studentTwo = "JD";
        var studentThr = "Ivan";
        
        double gradeOne = 2.00;
        double gradeTwo = 1.25;
        double gradeThr = 1.50;
        
        var laneOne = "Solo";
        var laneTwo = "Jungle";
        var laneThr = "Duo";
        
        int hoursPlayedOne = 5;
        int hoursPlayedTwo = 1;
        int hoursPlayedThr = 3;
        
        System.out.println("Student 1");
        System.out.println("Name: " + studentOne);
        System.out.println("Wild Rift Lane: " + laneOne);
        System.out.println("Average Hours Played a Day: " + hoursPlayedOne);
        System.out.println("GWA: " + gradeOne);
        System.out.println("");
        
        System.out.println("Student 2");
        System.out.println("Name: " + studentTwo);
        System.out.println("Wild Rift Lane: " + laneTwo);
        System.out.println("Average Hours Played a Day: " + hoursPlayedTwo);
        System.out.println("GWA: " + gradeTwo);
        System.out.println("");
        
        System.out.println("Student 3");
        System.out.println("Name: " + studentThr);
        System.out.println("Wild Rift Lane: " + laneThr);
        System.out.println("Average Hours Played a Day: " + hoursPlayedThr);
        System.out.println("GWA: " + gradeThr);
        System.out.println("");
        
        double averageGrade = (gradeOne + gradeTwo + gradeThr)/3;
        System.out.println("Their average grade is " + averageGrade);
        
        var laneCheck = "";
        
        if ((laneOne != laneThr) && (laneThr != laneTwo) && (laneTwo != laneOne)){
            laneCheck = "No";
        }
        
        else{
            laneCheck = "Yes"; 
        }
        
        System.out.println("Are there any repeated lanes: " + laneCheck);
        
        int hoursPlayedTotal = hoursPlayedOne + hoursPlayedTwo + hoursPlayedThr;
        System.out.println("They play a total of " + hoursPlayedTotal + " hours everyday." );
        }
    }
    

