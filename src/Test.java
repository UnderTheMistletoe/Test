import java.util.LinkedList;

public class Test {

    private LinkedList<Integer> numStack = new LinkedList<>();
    private LinkedList<Character> opStack = new LinkedList<>();

    public void splitFormula(String formula){
        String tempRes = formula.trim();
        for (Character ch: tempRes.toCharArray()
             ) {
            if (Character.isDigit(ch)){
                numStack.push(Character.getNumericValue(ch));
            }else{
                opStack.push(ch);
            }
        }
        System.out.println(numStack);
        System.out.println(opStack);
    }



    public static void main(String[] args) {
//        System.out.println(Character.isDigit('2'));
        Test test = new Test();
        test.splitFormula("ass");
    }
}
