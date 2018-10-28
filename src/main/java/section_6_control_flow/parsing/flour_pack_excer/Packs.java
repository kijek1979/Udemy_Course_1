package section_6_control_flow.parsing.flour_pack_excer;

import static section_6_control_flow.parsing.flour_pack_excer.Counts.BIGCOUNT;
import static section_6_control_flow.parsing.flour_pack_excer.Counts.SMALLCOUNT;

public class Packs {

    private Counts counts;


    public boolean canPack(Counts counts, int bigCount, int smallCount) throws SumIsGreaterThanGoalException {


        if (counts.getGoal() > ((bigCount * BIGCOUNT) + (smallCount * SMALLCOUNT))) {

            if ((counts.getGoal() >= 0) && (bigCount >= 0) && (smallCount >= 0)){
                int restFromBigCount = counts.getGoal() % (bigCount*BIGCOUNT);
                if (restFromBigCount != 0) {
                    if (restFromBigCount % (smallCount * SMALLCOUNT) == 0)
                        return true;


                }else if(restFromBigCount == 0){
                    return true;
                }else {
                    return false;
                }

            }else {
                return false;
            }
        }
       throw new SumIsGreaterThanGoalException("Sum of kilos is bigger than goal");

    }
}

