import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        char[][] test1 = {{'-','X','-','-'},
                          {'-','-','X','-'},
                          {'-','-','-','X'}
                        
                        };

                        System.out.println(StraightLineTest(test1));
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
