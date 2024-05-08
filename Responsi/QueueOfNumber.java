package Responsi;

class QueueOfNumber extends Queue<Integer> {
    // Additional methods or overrides specific to QueueOfNumber can be added here
    public int sum() {
        int sum = 0;
        for (Integer num : elements) {
            sum += num;
        }
        return sum;
    }
}