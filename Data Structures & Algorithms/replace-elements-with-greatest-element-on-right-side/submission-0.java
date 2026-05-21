class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];

        int rMax = -1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = rMax;
            if (arr[i] > res[i]) {
                rMax = arr[i];
            }
        }

        return res;
    }
}