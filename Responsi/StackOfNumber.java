package Responsi;

class StackOfNumber extends Stack<Integer> {
    public int sum() {
        int sum = 0;
        for (Integer num : elements) {
            sum += num;
        }
        return sum;
    }
}