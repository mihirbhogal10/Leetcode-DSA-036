class Solution {
    public int[] sortedSquares(int[] nums) {

        List<Integer> neg_nums = new ArrayList<Integer>();
        List<Integer> pos_nums = new ArrayList<Integer>();

        for(int num:nums){
            if(num < 0){
                neg_nums.add(num);
            }
            else{
                pos_nums.add(num);
            }
        }

        //If no negative number is present in the given array
        if(neg_nums.size() == 0){

            for (int i = 0; i < pos_nums.size(); i++){
                pos_nums.set(i, pos_nums.get(i)*pos_nums.get(i));
            }

            int[] arr = new int[pos_nums.size()];
            for (int i = 0; i < pos_nums.size(); i++) {
                arr[i] = pos_nums.get(i);
            }

            return arr;
        }
        
        //If there is no positive number present in the given array
        if(pos_nums.size() == 0){

            for (int i = 0; i < neg_nums.size(); i++){
                neg_nums.set(i, neg_nums.get(i)*neg_nums.get(i));
            }

            Collections.reverse(neg_nums);

            int[] arr = new int[neg_nums.size()];
            for (int i = 0; i < neg_nums.size(); i++) {
                arr[i] = neg_nums.get(i);
            }

            return arr;
        }

        for (int i = 0; i < pos_nums.size(); i++){
            pos_nums.set(i, pos_nums.get(i)*pos_nums.get(i));
        }

        for (int i = 0; i < neg_nums.size(); i++){
            neg_nums.set(i, neg_nums.get(i)*neg_nums.get(i));
        }
        Collections.reverse(neg_nums);

        int i = 0, j = 0, index = 0;
        int [] arr = new int [neg_nums.size() + pos_nums.size()];

        //Merging both the ArrayList and sorting simultaneously 
        while(i < neg_nums.size() && j < pos_nums.size()){

            if(neg_nums.get(i) <= pos_nums.get(j)){
                arr[index] = neg_nums.get(i);
                index++;
                i++;
            }
            else{
                arr[index] = pos_nums.get(j);
                index++;
                j++;
            }

        }

        while(i != neg_nums.size()){
            arr[index] = neg_nums.get(i);
            index++;
            i++;
        }

        while(j != pos_nums.size()){
            arr[index] = pos_nums.get(j);
            index++;
            j++;
        }

        return arr;

    }
}