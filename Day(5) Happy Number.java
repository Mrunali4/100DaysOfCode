class Solution {
    public int getNext(int n){
        int totalSum=0;
        while(n>0){
           int d =n%10;
            n=n/10;
            totalSum += d*d;
        }
       return totalSum;
         
    }
    public boolean isHappy(int n) {
        int hare = getNext(n);
        int turtle = n;
        while(hare != 1 && turtle!=hare){
            turtle = getNext(turtle);
            hare = getNext(getNext(hare));
        }
        return hare == 1;
    }
}
