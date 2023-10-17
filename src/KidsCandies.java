import java.util.ArrayList;
import java.util.List;

public class KidsCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        ArrayList<Boolean> boolList = new ArrayList<>();
        int largestNum = 0;

        //Get the largest integer.
        for(int i : candies){
            if(i > largestNum){
                largestNum = i;
            }
        }

        //Iterate through candies and add extraCandies to each element. If
        //the element is >= our largestNum set boolArr element true, otherwise false.
        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= largestNum){
                boolList.add(true);
            }
            else{
                boolList.add(false);
            }
        }

        return boolList;
    }
}
