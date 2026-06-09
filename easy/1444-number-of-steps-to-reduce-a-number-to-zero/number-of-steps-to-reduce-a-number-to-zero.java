class Solution {
    public int numberOfSteps(int num) {
        
        int steps = 0;

        int a = num;

        while( a != 0 ){

            if(a % 2 == 0){
                a /= 2;
                steps++;
            }
            else{
                a -= 1;
                steps++;
            }
        }

        return steps;
    }
}