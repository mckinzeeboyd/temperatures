import static java.lang.System.out;
import java.util.Scanner;

public class temperatures
{

    public static void main(String[] args)
    {

        int [] [] temp = new int [4] [7];
        temp [0][0] = 68;
        temp [0][1]= 70;
        temp [0][2] = 76;
        temp [0][3] = 70;
        temp [0][4] = 68;
        temp [0][5] = 71;
        temp [0][6] = 75;
        temp [1][0] =76 ;
        temp [1][1]= 76;
        temp [1][2] = 87;
        temp [1][3] = 84;
        temp [1][4] = 82;
        temp [1][5] = 75;
        temp [1][6] = 83;
        temp [2][0] = 73;
        temp [2][1]= 72;
        temp [2][2] = 81;
        temp [2][3] = 78;
        temp [2][4] = 76;
        temp [2][5] = 73;
        temp [2][6] = 77;
        temp [3][0] = 64;
        temp [3][1]= 65;
        temp [3][2] = 69;
        temp [3][3] = 68;
        temp [3][4] = 70;
        temp [3][5] = 74;
        temp [3][6] = 72;

        out.println("The data provided are: ");

        //7AM
        out.print("7 AM: ");
        for (int row =0; row < 1; row++)
        {
            for (int column =0; column < 7; column ++)
            {
                int sevenA = temp[row][column];
                if (column <6)
                {
                    out.printf( "%3d", sevenA);
                    out.print(",");
                } else 
                {
                    out.printf("%3d", sevenA);
                }
            }
        }

        out.println("");

        //3PM
        out.print("3 PM: ");
        for (int row =1; row < 2; row++)
        {
            for (int column =0; column < 7; column ++)
            {
                int threeP=temp[row][column];
                if (column <6)
                {
                    out.printf("%3d", threeP); 
                    out.print(",");
                } else 
                {
                    out.printf("%3d", threeP);
                }
            }
        }

        out.println("");

        //7PM
        out.print("7 PM: ");
        for (int row =2; row < 3; row++)
        {
            for (int column =0; column < 7; column ++)
            {
                int sevenP=temp[row][column];
                if (column <6)
                {
                    out.printf("%3d", sevenP); 
                    out.print(",");
                } else 
                {
                    out.printf("%3d", sevenP);
                }
            }
        }

        out.println("");

        //3AM
        out.print("3 AM: ");
        for (int row =3; row < 4; row++)
        {
            for (int column =0; column < 7; column ++)
            {
                int threeA=temp[row][column];
                if (column <6)
                {
                    out.printf("%3d", threeA);
                    out.print(",");
                } else 
                {
                    out.printf("%3d", threeA);
                }
            }
        }

        out.println("");
        out.println("");
        out.println("Based on that data, the following are the average temperatures for the week.");
        out.println("");
        out.println("");

        //SUNDAY COLUMN 0
        int sumSunday=0;
        int averageSunday=0;
        for (int row=0; row < 4; row++)
        {
            for (int column=0; column < 1; column ++)
            {
                sumSunday=sumSunday + temp[row][column];

                
            }

        }
        averageSunday= sumSunday/4;
        out.print("Sun: ");
        out.printf("%3d", averageSunday);
        out.println("");

        //MONDAY COLUMN 1
        int sumMonday=0;
        int averageMonday=0;

        for (int row=0; row < 4; row++)
        {
            for (int column=1; column == 1; column ++)
            {
                sumMonday=sumMonday + temp[row][column];

                
            }

        }

        averageMonday=sumMonday/4;
        out.print("Mon: ");
        out.printf("%3d", averageMonday);
        out.println("");

        //TUESDAY COLUMN 2 ~ 78
        int sumTuesday=0;
        int averageTuesday=0;

        for (int row=0; row < 4; row++)
        {
            for (int column=2; column == 2; column ++)
            {
                sumTuesday=sumTuesday + temp[row][column];

                
            }

        }

        averageTuesday=sumTuesday/4;
        out.print("Tue: ");
        out.printf("%3d", averageTuesday);
        out.println("");

        
        //WEDNESDAY COLUMN 3 ~ 75

        int sumWednesday=0;
        int averageWednesday=0;

        for (int row=0; row < 4; row++)
        {
            for (int column=3; column == 3; column ++)
            {
                sumWednesday=sumWednesday + temp[row][column];

                
            }

        }

        averageWednesday=sumWednesday/4;
        out.print("Wed: ");
        out.printf("%3d", averageWednesday);
        out.println("");

        //THURSDAY COLUMN 4 ~ 74

        int sumThursday=0;
        int averageThursday=0;

        for (int row=0; row < 4; row++)
        {
            for (int column=4; column == 4; column ++)
            {
                sumThursday=sumThursday + temp[row][column];

                
            }

        }

        averageThursday=sumThursday/4;
        out.print("Thu: ");
        out.printf("%3d", averageThursday);
        out.println("");

        //FRIDAY COLUMN 5 ~ 73

        int sumFriday=0;
        int averageFriday=0;

        for (int row=0; row < 4; row++)
        {
            for (int column=5; column == 5; column ++)
            {
                sumFriday=sumFriday + temp[row][column];

                
            }

        }

        averageFriday=sumFriday/4;
        out.print("Fri: ");
        out.printf("%3d", averageFriday);
        out.println("");

        //SATURDAY COLUMN 6 ~ 76

        int sumSaturday=0;
        int averageSaturday=0;

        for (int row=0; row < 4; row++)
        {
            for (int column=6; column == 6; column ++)
            {
                sumSaturday=sumSaturday + temp[row][column];

                
            }

        }

        averageSaturday=sumSaturday/4;
        out.print("Sat: ");
        out.printf("%3d", averageSaturday);
        out.println("");
        out.println("");
    
    
        //7 AM ~ 71
        int sum7A=0;
        int average7A=0;

        for (int row=0; row ==0; row++)
        {
            for (int column=0; column < 7; column ++)
            {
                sum7A=sum7A + temp[row][column];

                
            }

        }

        average7A=sum7A/7;
        out.print("7 AM : ");
        out.printf("%3d", average7A);
        out.println("");

    
        //3 PM ~ 80
        int sum3P=0;
        int average3P=0;

        for (int row=1; row ==1; row++)
        {
            for (int column=0; column < 7; column ++)
            {
                sum3P=sum3P + temp[row][column];

                
            }

        }

        average3P=sum3P/7;
        out.print("3 PM : ");
        out.printf("%3d", average3P);
        out.println("");
        
        
        
        
        
    
        //7 PM ~ 75
        int sum7P=0;
        int average7P=0;

        for (int row=2; row ==2; row++)
        {
            for (int column=0; column < 7; column ++)
            {
                sum7P=sum7P + temp[row][column];

                
            }

        }

        average7P=sum7P/7;
        out.print("7 PM : ");
        out.printf("%3d", average7P);
        out.println("");
        
        
        
        
        
    
    
        //3 AM ~ 68
    
        int sum3A=0;
        int average3A=0;

        for (int row=3; row ==3; row++)
        {
            for (int column=0; column < 7; column ++)
            {
                sum3A=sum3A + temp[row][column];

                
            }

        }

        average3A=sum3A/7;
        out.print("3 AM : ");
        out.printf("%3d", average3A);
        out.println("");
        out.println("");
        
        
        //final average
        
        int sumFinal=0;
        int averageFinal=0;
        
        for (int row=0; row < 4; row++)
        {
            for (int column =0; column < 7; column ++)
            {
                sumFinal=sumFinal + temp[row][column];
            }
        }
        
        averageFinal=sumFinal/28;
        
        
        out.println("The final average temperature for the week was: ");
        out.println("");
        out.print("Overall: ");
        out.printf( "%4d" , averageFinal);
    
    
    
    
    }
}