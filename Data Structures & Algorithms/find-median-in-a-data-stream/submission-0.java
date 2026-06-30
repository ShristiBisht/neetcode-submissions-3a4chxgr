class MedianFinder {
    private Queue<Integer> smallHeap; // maxHeap
        private Queue<Integer> largeHeap; //minHeap
    public MedianFinder() {
        smallHeap = new PriorityQueue<>((a, b) -> b - a);
        largeHeap = new PriorityQueue<>((a, b) -> a - b);
    }
    
    public void addNum(int num) {
        smallHeap.offer(num);
        largeHeap.offer(smallHeap.poll());

        if(largeHeap.size()>smallHeap.size()){
            smallHeap.offer(largeHeap.poll());
        }
    }
    
    public double findMedian() {
        if(smallHeap.size() > largeHeap.size()){
            return smallHeap.peek();
        }
        return (smallHeap.peek()+largeHeap.peek())/2.0;
    }
}
