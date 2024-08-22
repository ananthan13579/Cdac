/*
section 2 snippet 6
x=5
++x=6,x=6
++x-x=0, x=5
--x=4
--x+x++=4+4=8
output is 8

*/
public class section2s6{
 public static void main(String[] args) {
 int x = 5;
 int y = ++x - x-- + --x + x++;
 System.out.println(y);
 }
}