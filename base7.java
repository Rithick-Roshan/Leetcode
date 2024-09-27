class Solution {
    public String convertToBase7(int num) {
        if (num==0) return "0";
        boolean isneg=num<0;
        num=Math.abs(num);
        StringBuffer sum = new StringBuffer();
        
        while(num!=0){
            int temp=num%7;
            sum.append(temp);
            num/=7;
        }
        if(isneg){
            sum.append("-");
        }
        return sum.reverse().toString();
    }
}
