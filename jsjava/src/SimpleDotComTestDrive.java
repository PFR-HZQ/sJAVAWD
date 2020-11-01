class SimpleDotCom{
    int [] locationCells;
    int numofHits=0;
    public void setLocationCells(int [] locs ){
        locationCells=locs;
    }
    public String checkYourself(String stringguess){
        int guess =Integer.parseInt( stringguess );
        String result = "miss";
        for (int cell: locationCells) {
            if(guess== cell){
                result="hit";
                numofHits++;
                break;
            }
        }
        if(numofHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result );
        return  result;

    }

}
public class SimpleDotComTestDrive {
    public static void main( String[] args ) {
      SimpleDotCom dot = new SimpleDotCom();
      int []locations ={2,3,4};
      dot.setLocationCells(locations);
      String userGuess = "2";
      String result = dot.checkYourself( userGuess);
      String testResult = "failed";
      if(result.equals( "hit" )){
          testResult = "passed";
      }
        System.out.println(testResult );
    }
}
