import java.util.*;
import java.lang.*;
public class A2{
static void q1bool(){
//q1 part a is explored
//part b boolean to string
boolean status=true;
String s= Boolean.toString(status);
System.out.println(status);

//part c string to boolean
String strStatus="false";
Boolean c=Boolean.parseBoolean(strStatus);
System.out.println(c);

//part d
String strStatus1="0";
Boolean d=Boolean.parseBoolean(strStatus1);
System.out.println(d);
//parseBoolean will not return an error but for both string values 1 and 0 the value of bool is false. to get
//accurate output always use true or false 

//part e
Boolean statusE=false;
Boolean e =Boolean.valueOf(statusE);
System.out.println(e);
//part f
String strStatusF="true";
Boolean f=Boolean.valueOf(strStatusF);
System.out.println(f);

//part g
/*int intStatusG=1;
float floatStatusG=0.44;
double doubleStatusG=0.5;
String stringStatusG="true";
Boolean booleanStatusG=true;*/
//Boolean g1 = (Boolean)intStatusG;
//Boolean g2 = (Boolean)floatStatusG;
//Boolean g3 = (Boolean)doubleStatusG;
//Boolean g4=(Boolean)stringStatusG;
//int intG=(int)booleanStatusG;
//System.out.print(intG);
//every operation here results in incompatible types error, boolean cant be converted to or from 
//other primitive types
}
static void q2byte(){
//part a read abt modifiers
//part b
byte bytesize=Byte.BYTES;
System.out.println(bytesize);
 
//part c
byte byteminC=Byte.MIN_VALUE;
byte bytemaxC=Byte.MAX_VALUE;
System.out.println(byteminC+" "+bytemaxC);

//part d
byte numberD=111;
String d=Byte.toString(numberD);
System.out.println(d);

//part e
String strNumberE="123";
byte e=Byte.parseByte(strNumberE);
System.out.println(e);

//part f
String strNumberF="Ab12Cd3";
//Byte f=Byte.parseByte(strNumberF);
//System.out.println(f);
//Exception in thread "main" java.lang.NumberFormatException: For input string: "Ab12Cd3"

//part g
byte numberG=102;
Byte g=Byte.valueOf(numberG);
System.out.println(g);

//part h
String strNumberH="44";
byte h=Byte.valueOf(strNumberH);
System.out.println(h);

//part i
int intI=3;
float floatI=3.3f;
double doubleI=3.3342d;
byte i1=(byte)floatI;
byte i2=(byte)floatI;
byte i3=(byte)doubleI;
//byte datatype can be typecasted to other types but there is loss of decimal from float to byte.
System.out.print(i1+ " "+ i2+" "+i3);
}
static void q3short(){
//part a reading task to explore java api
//part b
short b=Short.BYTES;//returns 2 as short is 2 bytes
System.out.println(b);

//part c
short shortmaxC=Short.MAX_VALUE;
short shortminC=Short.MIN_VALUE;
System.out.println(shortmaxC+" "+shortminC);

//partd
short d=32116;
String strD=Short.toString(d);
System.out.println(strD);

//part e
String strNumberE="28182";
short e=Short.parseShort(strNumberE);
System.out.println(e);

//part f
//Exception in thread "main" java.lang.NumberFormatException: For input string: "Ab12Cd3"
/*String strNumberF="Ab12Cd3";
short f=Short.parseShort(strNumberF);
System.out.println(f);*/

//part g
short numberG=-15921;
Short g=Short.valueOf(numberG);
System.out.println(g);

//part h
String strNumberH="15921";
Short h=Short.valueOf(strNumberH);
System.out.println(h);

//part i
int intI= 18;
float floatI=49.15f;
double doubleI=66.13d;
char charI='5';
short i1=(short)intI;
short i2=(short)floatI;
short i3=(short)doubleI;
short i4=(short)charI;
System.out.println(i1+" "+i2+" "+i3+" "+i4+" ");//from float,double to short decimal points will be removed
short I1=45;
short I2=17;
short I3=7;
short I4=2;
int i=(int)I1;
float f=(float)I2;
double di=(double)I3;
char c=(char)I4;
System.out.println(i+" "+f+" "+c+" "+di+" ");//decimal pt added to float n double, char is a special character
}
static void q4int(){
//part a java documentation
//part b
int b=Integer.BYTES;
System.out.println(b);//4 bytes

//part c
int cmin=Integer.MIN_VALUE;
int cmax=Integer.MAX_VALUE;
System.out.println(cmin+" "+cmax);

//part d
int numberD=787887;
String d=Integer.toString(numberD);
System.out.println(d);

//part e
String strNumberE="990887";
int e=Integer.parseInt(strNumberE);
System.out.println(e);

//part f
//String strNumberF="Ab12Cd3";
//int f=Integer.parseInt(strNumberF);
//System.out.println(f);//Exception in thread "main" java.lang.NumberFormatException: For input string: "Ab12Cd3"

//part g
int numberG=88973;
Integer g=Integer.valueOf(numberG);
System.out.println(g);

// part h
String strNumberH="883";
Integer h=Integer.valueOf(strNumberH);
System.out.println(h);

//part i
boolean bi= true;//boolean cant be converted to int and vice versa
short si=32131;
long li=90022L;
float fi=33.45f;
double di=5.6d;//decimal point is removed in double,float
System.out.println((int)si+" "+(int)li+" "+(int)fi+" "+(int)di+" ");
int i1=5;int i2=3;int i3=1;int i4=10;int i5=18;
System.out.println((double)i1+" "+(long)i2+" "+(float)i4+" "+(double)i5);

//part j
int j1=12;
int j2=15;
System.out.println(Integer.min(j1,j2)+" "+Integer.max(j1,j2));

//part k
int k=7;
System.out.println(Integer.toBinaryString(k)+" "+ Integer.toOctalString(k) +" " + Integer.toHexString(k));
}
static void q5long(){
//part a java documentation
// part b
long b=Long.BYTES;
System.out.println(b);

//part c 
System.out.println(Long.MIN_VALUE+" "+Long.MAX_VALUE);

//part d
long numberD=998238488;
String d=Long.toString(numberD);
System.out.println(d);

//part e
String strNumberE="1243455";
long e=Long.parseLong(strNumberE);
System.out.println(e);

//part f
//String strNumberF="Ab12Cd3";
//long f=Long.parseLong(strNumberF);
//System.out.println(f);//Exception in thread "main" java.lang.NumberFormatException: For input string: "Ab12Cd3"

//part g
long numberG=88973;
Long g=Long.valueOf(numberG);
System.out.println(g);

//part h
String strNumberH="88873";
Long h=Long.valueOf(strNumberH);
System.out.println(h);

//part i
long li1=3454;long li2=7687;
System.out.println(Long.sum(li1,li2));

//part j
long lj1=1123;long lj2=3070;
System.out.println(Long.min(lj1,lj2)+" "+Long.max(lj1,lj2));

//part k
long k=7;
System.out.println(Long.toBinaryString(k)+" "+Long.toHexString(k)+" "+Long.toOctalString(k));
}
static void q6float(){
//part a java documentation
//part b
float b=Float.BYTES;
System.out.println(b);

//part c
System.out.println(Float.MAX_VALUE+" "+Float.MIN_VALUE);

//part d
float numberD=78787;
String d=Float.toString(numberD);
System.out.println(d);

//part e
String strNumberE="2938.944";
float e=Float.parseFloat(strNumberE);
System.out.println(e);

//part f
//String strNumberF="Ab12Cd3";
//float f=Float.parseFloat(strNumberF);
//System.out.println(f);//Exception in thread "main" java.lang.NumberFormatException: For input string: "Ab12Cd3"

//part g
float numberG=88973.554f;
Float g=Float.valueOf(numberG);
System.out.println(g);

//part h
String strNumberH="888.73";
Float h=Float.valueOf(strNumberH);
System.out.println(h);

//part i
float fi1=118.954f;float fi2=329.372f;
System.out.println(Float.sum(fi1,fi2));

//part j
float fj1=218.22f;float fj2=329.7f;
System.out.println(Float.min(fj1,fj2)+" "+Float.max(fj2,fj1));

//part k
float k=-25.0f;
System.out.println(Math.sqrt(k));// output is NaN

//part l
float fl1=0.0f;float fl2=0.0f;
System.out.println(fl1/fl2);//output is NaN

//part m
int im=4;byte bm=2;double dm=5.585898d;short sm=455;long lm=390244738;
System.out.println((float)im+" "+(float)bm+" "+(float)dm+" "+(float)sm+" "+(float)lm+" ");
//float fm1=2.0f;float fm2=281.33f;float fm3=83.98;float fm4=332.16;float fm5=90.5f;
//System.out.println((byte)fm1+" "+(int)fm2+" "+(double)fm3+" "+(short)fm4+" "+(long)fm5);
//there is lossy conversion from float to other datatypes, so it will require boxing/unboxing
}
static void q7double(){
//part a java documentation
//part b
double b=Double.BYTES;
System.out.println(b);

//part c
System.out.println(Double.MAX_VALUE+" "+Double.MIN_VALUE);

//part d
Double numberD=78787d;
String d=Double.toString(numberD);
System.out.println(d);

//part e
String strNumberE="2938.944";
double e=Double.parseDouble(strNumberE);
System.out.println(e);

//part f
//String strNumberF="Ab12Cd3";
//double f=Double.parseDouble(strNumberF);
//System.out.println(f);//Exception in thread "main" java.lang.NumberFormatException: For input string: "Ab12Cd3"

//part g
Double numberG=88973.554;
Double g=Double.valueOf(numberG);
System.out.println(g);

//part h
String strNumberH="888.73";
double h=Double.valueOf(strNumberH);
System.out.println(h);

//part i
double di1=118.954;double di2=329.372;
System.out.println(Double.sum(di1,di2));

//part j
double dj1=218.22;double dj2=329.7;
System.out.println(Double.min(dj1,dj2)+" "+Double.max(dj2,dj1));

//part k
double k=-25.0f;
System.out.println(Math.sqrt(k));// output is NaN

//part l
double dl1=0.0d;double dl2=0.0d;
System.out.println(dl1/dl2);

//part m
int im=4;byte bm=2;short sm=455;long lm=390244738;
//float fl=5.585898f;
System.out.println((double)im+" "+(double)bm+" "+" "+(double)sm+" "+(double)lm+" ");
//double dm1=2.0d;double dm2=281.33d;double dm3=83.98d;double dm4=332.16d;double dm5=90.5d;
//System.out.println((byte)dm1+" "+(int)dm2+" "+(float)dm3+" "+(short)dm4+" "+(long)dm5);
//there is lossy conversion from double to other datatypes, so it will require boxing/unboxing
}
static void q8(){
Boolean b=false;char c='a';byte by=1; int i=10;short s=292; long l=15883; float f=55.4f; double d=59.44d;
System.out.print(Boolean.toString(b)+" ");
System.out.print(Byte.toString(by)+" ");
System.out.print(Character.toString(c)+" ");
System.out.print(Integer.toString(i)+" ");
System.out.print(Short.toString(s)+" ");
System.out.print(Long.toString(l)+" ");
System.out.print(Float.toString(f)+" ");
System.out.print(Double.toString(d)+" ");
System.out.println();
String s1=String.valueOf(b);
String s3=String.valueOf(by);
String s4=String.valueOf(i);
String s5=String.valueOf(s);
String s6=String.valueOf(l);
String s7=String.valueOf(f);
String s8=String.valueOf(d);
String s2=String.valueOf(c);
System.out.print(s1+" ");
System.out.print(s2+" ");
System.out.print(s3+" ");
System.out.print(s4+" ");
System.out.print(s5+" ");
System.out.print(s6+" ");
System.out.print(s7+" ");
System.out.print(s8+" ");
}
//q9 declaring datatypes without initializing
static int i;
static Boolean b;
static byte by;
static char c;
static String s;
static short srt;
static long l;
static float f;
static double d;

static void q10operations(int a,int b,String sign){
switch(sign){
case "+":{
int res=a+b;
System.out.println("result of operation "+sign+" is= "+res);
break;
}
case "-":{
int res=a-b;
System.out.println("result of operation "+sign+" is= "+res);
break;
}
case "*":{
int res=a*b;
System.out.println("result of operation "+sign+" is= "+res);
break;
}
case "/":{
int res=a/b;
if(b!=0)
System.out.println("result of operation "+sign+" is= "+res);
else{
    System.out.print("b cant be 0 if / is the operation");
}
break;
        }
    }
}

public static void main(String[] args){
//q1bool();q2byte();
//for q10 code
/*if(args.length!=3){
System.out.print("please enter the valid operations");
return;
}
int n1=Integer.parseInt(args[0]);
int n2=Integer.parseInt(args[1]);
//String s="asdfghjkl";
String op=args[2];
q10operations(n1,n2,op);*/
//q3short();q4int();q5long();
//q6float();q7double();q8();
System.out.println(i+" "+b+" "+c+" "+d+" "+f+" "+l+" "+by+" "+srt+" ");
}
}
