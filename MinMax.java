class MinMax{
public static void main (String args[ ]) {
int nums [ ] = new int [10];
nums[0] = 99 ;
nums[1] = -10 ;
nums[2] = 100123 ;
nums[3] = 18 ;
nums[4] = -978 ;
nums[5] = 5623 ;
nums[6] = 463 ;
nums[7] = -9;
nums[8] = 287 ;
nums[9] = 49;
int  i , min , max;
min  =  max  =  nums[0];
for (i=0; i<10; i++) {
if (nums [i]  <  min)  min = nums[i] ;
if (nums [i]  >  max) max= nums[i] ;
}
System.out.println("min and max: "  + min +  "   "  + max );
}
}