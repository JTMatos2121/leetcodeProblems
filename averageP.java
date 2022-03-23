public class averageP {
    
    public static void main(String[] args){
        int salary[] = {4000,3000,1000,2000};
        int maxValue = 0;
        double answer = 0;
        int minValue= salary[0];
        //for loop gets max value of array 
        for (int i=0;i <salary.length;i++)
        {
            if(maxValue <salary[i])
            {
                maxValue = salary[i];
            }
        }
        
        //for loop gets min value of array
        for (int i=1;i <salary.length;i++)
        {
            if(salary[i]< minValue)
            {
                minValue = salary[i];
            }
        }


        double sum =0;
        double sub =0;

        //for loop adds all elements of the array
        for(int i=0;i <salary.length;i++)
        {
            sum=sum+salary[i];
        }
        sub = maxValue + minValue;
        sum = (sum - sub);
        int newLengh=salary.length -2;
        answer = sum/newLengh;


        //output to check for results
        System.out.print(maxValue);
        System.out.print("\n");
        System.out.print(minValue);
        System.out.print("\n");
        System.out.print(sub);
        System.out.print("\n");
        System.out.print(answer);

    }
}
