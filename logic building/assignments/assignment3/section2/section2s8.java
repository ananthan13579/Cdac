/*
section 2 snippet8
output is -4
i++=1,++i=2
0(pre increment)-2=-2
i=3
i++=4,++i=5;
3-5=-2
count=-4
*/

public class LoopIncrement {
 public static void main(String[] args) {
 int count = 0;
 for (int i = 0; i < 4; i++) {
 count += i++ - ++i;
 }
 System.out.println(count);
 }
}