public class GetShortestWord
{
    //code the method getShortestWord that accepts two words and returns the shortest one
    /* Code a method that returns the shortest word of the two inputs*/
public static String getShortestWord(String a,String b){
    if(a.length()>b.length()){
        return b;
    }
    else{
        return a;
    }
}
}