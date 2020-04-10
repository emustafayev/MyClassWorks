package lesson20;

public class MergeSortDetailed {
    public static void main(String[] args) {
        int[] data = Utils.create_random_data(10);
        sort(data, 0, data.length-1);
    }
    static void sort(int[] data,int left, int right){
        if(left<right){
            System.out.printf("SORT: within indexes: %d..%d, sub-array:%s\n", left, right,
                    Utils.arrToString(data, left, right));
            int mid = (left+right)/2;
            sort(data,left,mid);
            sort(data,mid+1,right);
            merge(data,left,mid,right);
        }
    }

    private static void merge(int[] part, int indx_L, int mid, int indx_R) {
         int size_L = mid-indx_L;
         int size_R = indx_R-mid+1;

         int[] left = new int[size_L];
         int[] right = new int[size_R];

         System.arraycopy(part, indx_L, left, 0, left.length);
        for (int i = 0; i < right.length; i++) {
            right[i] = part[mid+1+i];
        }
        int l=0;
        int r=0;
        int k=indx_L;
        while (l<left.length && r<right.length){
            part[k++] = left[l]<right[r]?left[l++]:right[r++];
        }
        while (l<left.length){
            part[k++] = left[l++];
        }
        while (r<right.length){
            part[k++]=right[r++];
        }
        System.out.printf("Merged into %s",Utils.arrToString(part,indx_L, indx_R));

    }
}
