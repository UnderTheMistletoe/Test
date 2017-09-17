import java.util.LinkedList;


public class Test {

    private LinkedList<Integer> numStack = new LinkedList<>();
    private LinkedList<String> opStack = new LinkedList<>();

    private void splitFormula(String formula) throws Exception {
        String tempRes = formula.trim();
        String tempOp;
        for (char ch : tempRes.toCharArray()
                ) {
            if (Character.isDigit(ch)) {
                numStack.push(Character.getNumericValue(ch));
            } else {
                tempOp = String.valueOf(ch);
                if (opStack.isEmpty() ||
                        PriorityCheck.check(tempOp) > PriorityCheck.check(opStack.getFirst())) {
                    opStack.push(tempOp);
                } else {
                    //To do

                }
            }
        }
        System.out.println(numStack);
        System.out.println(opStack);
    }


    private int calcWithOp(String Op, int pre, int post) {

        switch (Op) {
            case "+":
                return pre + post;
            case "-":
                return pre - post;
            case "*":
                return pre * post;
            case "/":
                return pre / post;
            default:
                throw new RuntimeException("Op error");
        }
    }


    public static void main(String[] args) {
//        System.out.println(Character.isDigit('2'));
        Test test = new Test();
        try {
            test.splitFormula(args[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
