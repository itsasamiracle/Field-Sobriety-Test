import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Test");
        char[][] test1 = {{'-','X','-','-'},
                          {'-','-','X','-'},
                          {'-','-','-','X'}
                        
                        };
         char[][] test2 = {{'-','X','-','-'},
                          {'-','-','X','-'},
                          {'-','-','X','-'}
                        
                        };
        char[][] test3 = {{'X','X','X','X'},
                          {'-','-','-','-'},
                          {'-','-','-','-'}
                        
                        };
        char[][] test4 = {{'X','-','-','-','-','-','-','-'},
                          {'-','-','X','-','-','-','-','-'},
                          {'-','-','-','-','X','-','-','-'},
                          {'-','-','-','-','-','-','X','-'},
                          {'-','-','-','-','-','-','-','-'},
                          {'-','-','-','-','-','-','-','-'}};



                        System.out.println("test1 " + StraightLineTest(test1));
                        System.out.println("test2 " + StraightLineTest(test2));
                        System.out.println("test3 " + StraightLineTest(test3));
                        System.out.println("test4 " + StraightLineTest(test4));
                        for (char[] c : test3)
                        {
                            for (char x : c)
                            {
                                System.out.print(x);
                            }
                            System.out.println();
                        }
    
    
    
                    }       

    public static boolean StraightLineTest(char[][] arr)
    {
        ArrayList<Position> path = new ArrayList<Position>();
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if (arr[i][j] == 'X')
                {
                    path.add(new Position(i, j));
                }

            }
         }
         // check if slope is 0 (registered as infinite)
         int initialRow = path.get(0).getRow();
         boolean repeat = true;
         for (Position x : path)
         {
            if (initialRow != x.getRow())
            repeat = false;

         }
         if (repeat)
         {
            return true;
         }
        double slopeInitial = (path.get(1).getCol()-path.get(0).getCol())/(path.get(1).getRow()-path.get(0).getRow());
         for (int i = 0; i < path.size() - 1; i ++)
         {
            
            double slope = (path.get(i+1).getCol()-path.get(i).getCol())/(path.get(i+1).getRow()-path.get(i).getRow());

            if (slope != slopeInitial)
            {
                return false;
            }

         }



        return true;



    }






}
