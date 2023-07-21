class Solution {
   public int[][] kClosest(int[][] points, int k) {
		PriorityQueue<int[]> maxHeap = new PriorityQueue<>(k, (o1, o2) -> sum(o2) - sum(o1));
		for (int i = 0; i < k; i++) {
			maxHeap.add(points[i]);
		}
       
        for(int i=k;i<points.length;i++) {
            if(sum(points[i])<sum(maxHeap.peek())) {
                maxHeap.poll();
                maxHeap.add(points[i]);
            }
        }
       
		int[][] op = new int[k][2];
		for (int i = 0; i < k; i++) {
			op[i] = maxHeap.poll();
		}
		return op;
	}
	private int sum(int[] points1) {
		return points1[0] * points1[0] + points1[1] * points1[1];
	}
}
