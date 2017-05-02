package test;

public class NWcorner2 {
    public static void main(String[] args)
    {
        int[] s = {1, 1,1};   // Supply
        int[] d = {1,1,1,1,1};   // Demand
        int[][] c = { {1, 1, 1,1,1},  // Cost per item from source (row) to 
                      {2,2,2,2,2},  //     destination (column)
                      {3,3,3,3,3}};
        NorthWest(s,d,c);            // Calculate Shipping using NW Corner
        MinCost(s,d,c);              // Calculate Shipping using min cost method
        //percentSaved(NorthWest(s,d,c),MinCost(s,d,c));
    }
    
    public static int NorthWest(int[] s, int[] d, int[][] c){
    int[][] table = new int[s.length][d.length];
    int[]supply = s.clone();        // copy supply and demand array so original
    int[]demand = d.clone();        // arrays remain unchanged
    int totalCost = 0;
    
        for(int i=0; i < supply.length; i++)
        {
            for(int j=0; j < demand.length; j++)
            {
                // If Supply >= Demand, demand is filled completely, demand = 0
                if(supply[i] >= demand[j])        
                {
                    table[i][j] = demand[j];
                    supply[i] = supply[i] - demand[j];
                    demand[j] = 0;
                }
                // If Supply < Demand, demand = demand - supply, supply = 0
                else
                {
                    table[i][j] = supply[i];
                    demand[j]= demand[j] - supply[i];
                    supply[i] = 0;
                }
                System.out.print(table[i][j] + "\t");   // Print as calculated
            }
            System.out.println();                       // New line
        }
        // Calculate Shipping cost using NW Corner method
        for(int i=0; i<=2; i++)
        {
            for(int j=0; j<=2;j++)
            {
                totalCost = totalCost + c[i][j]*table[i][j];
            }
        }
        System.out.println("Total Cost = $" + totalCost);
        return(totalCost);
    }
    
    
    
    public static int MinCost(int[] s, int[] d, int[][] c){
        int[][] table = new int[s.length][d.length];
        int[]supply = s.clone();        // copy supply and demand and cost array 
        int[]demand = d.clone();        // so original arrays remain unchanged
        int[][]cost = c.clone();
        int totalCost = 0;
        int smallest = c[0][0];
        int ii=0, jj=0;
        boolean rowSatisfied = false;
        boolean colSatisfied = false;
    
        // find smallest cost of shipment from supplier
        for(int i=0; i < supply.length; i++)
        {
          for(int j=0; j < demand.length; j++)
          {
                if(smallest > cost[i][j])
                {
                  smallest = cost[i][j];
                  ii=i;
                    jj=j;
                }
          }
        }
        int last = smallest;
    
        while(colSatisfied != true)
        {
            // If Supply >= Demand, demand is filled completely, demand = 0
            if(supply[ii] >= demand[jj])
            {
                table[ii][jj] = demand[jj];
                supply[ii] = supply[ii] - demand[jj];
                demand[jj] = 0;
            }
            // If Supply < Demand, demand = demand - supply, supply = 0
            else{
                table[ii][jj] = supply[ii];
                demand[jj]= demand[jj] - supply[ii];
                supply[ii] = 0;
            }
            System.out.println("table " + table[ii][jj]);
            System.out.println(ii + "  " + jj);
        
            System.out.println("supply " + supply[ii]);
            System.out.println("demand " + demand[jj]);
            System.out.println("smallest " + smallest + " last " + last);
            int temp = 0;
            // Find next smallest cost of shipping
            for(int i=0;i<s.length;i++)
            {
                if(cost[i][jj] > last)
                {
                    temp = cost[i][jj];
                    System.out.println(temp);
                    if(temp <= cost[i][jj])
                    {
                        smallest = cost[i][jj];
                        ii=i;
                        System.out.println(i +" "+ temp);
                    }
                }System.out.println(i + " " + ii + "  " + jj + " " + smallest);
            } System.out.println("smallest " + smallest + " last " + last);
            System.out.println(ii + "  " + jj);
            if(demand[jj] == 0)
                colSatisfied = true;
        }
         
     // Calculate Shipping cost using Minimum Cost Method
     for(int i=0; i<=2; i++){
        for(int j=0; j<=2;j++){
            totalCost = totalCost + c[i][j]*table[i][j]; 
        }
     }
     System.out.println("Total Cost = $" + totalCost);
     return(totalCost);
    }
    // Calculate percentage saved using minPrice method over NWcorner method
    public static void percentSaved(int NWprice, int minPrice){
        System.out.println("Percentage "
                + "saved: "+ (100-(minPrice/NWprice)*100) + "%");
        
    }
}