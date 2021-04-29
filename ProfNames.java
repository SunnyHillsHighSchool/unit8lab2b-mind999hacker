public class ProfNames
{
  public int countNames(String[][]nameArray, String lastName)
  {
    int count = 0;
for(int row = 0;row<nameArray.length;row++)
{
for(int col = 0;col<nameArray[0].length;col++)
{
String[] name = nameArray[row][col].split(",");
if(name[0].equals(lastName))
{
count++;
}
}
}
return count;

  }
}