package Lisa;

public class Task1 {
    public static void main(String[] args) {
        String str1 = "(]";
        String str = "({}){{[{}]}}[][]";
        System.out.println(task1(str));
    }
    public static boolean task1(String str){
        for (int i = 0; i <str.length()+1; i++) {//I don't know why length must be +1,but it works
            // this way
            str = str.replaceAll("\\[\\]","");
            str = str.replaceAll("\\(\\)","");
            str = str.replaceAll("\\{\\}","");
        }
        return str.isEmpty();
    }
}