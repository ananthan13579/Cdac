 class Assignment1 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
int a=9;
int b=-9;
int c=8;
int d=11;
if(a>0)  System.out.println("a whose value is "+a+" is positive");
if(b<0)  System.out.println("b whose value is "+b+" is negative");
if(c%2==0)  System.out.println("c whose value is "+c+" is even");
if(d%2!=0)  System.out.println("d whose value is "+d+" is off"); 
int side=4;
int length = 6;
int breadth = 11;
//representing time with int value. so time=5 means 5am and time=15 means 3pm
int time=8;
if(5<time&&time<12) System.out.println("good morning");
System.out.println("area of square of side 4 is "+ (side*side));
System.out.println("area of rectangle of length 6 n breadth 11 is "+ (length*breadth));

int x=1;int y=2;int z=3;
if(x>y){
        if(x>z){
            System.out.println("x whose value is "+x+" is largest");
        }
        else{
            System.out.println("z whose value is "+z+" is largest");
        }
    }
    else{
        if(y>z){
            System.out.println("y whose value is "+y+" is largest");

        }
        else{System.out.println("z whose value is "+z+" is largest");}
    } 
}
}
