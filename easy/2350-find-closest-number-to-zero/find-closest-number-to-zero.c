int absval(int x){
    if(x < 0)
        return x * -1;
    return x;
}

int findClosestNumber(int* nums, int numsSize) {
    int flag = 0;
    for(int i=1; i<numsSize; i++){
        if(absval(nums[flag]) > absval(nums[i])){
            flag = i;
        }
        else if(absval(nums[flag]) == absval(nums[i])){
            if(nums[flag] < nums[i]){
                flag = i;
            } 
        }
    }
    return nums[flag];

}