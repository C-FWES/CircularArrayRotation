    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] values = new int[queries.length];
        int rotateCount = k % a.length;
        int[] lastRotationCount = new int[rotateCount];
        for (int i = 0; i < rotateCount; i++) {
            lastRotationCount[i] = a[a.length - rotateCount + i];
        }
        for (int j = a.length - 1; j >= rotateCount; j = j - rotateCount) {
            a[j] = a[j - rotateCount];
        }

        for (int i = 0; i < rotateCount; i++) {
            a[i] = lastRotationCount[i];
        }

        for (int i = 0; i < queries.length; i++) {
            values[i] = a[queries[i]];
        }
        return values;
    }
