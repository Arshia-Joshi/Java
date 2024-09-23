//Total number of characters in a string
public class Assignment1 {
   public static void main(String[] args) {
        String s="My name is Arshia";
        int length=s.length();
        int a=0;
        for(int i=0;i<length;i++){
            if(s.charAt(i)!=' '){
                a++;
            }
        }
        System.out.println("the total of character in string id:"+a);
    }
}
