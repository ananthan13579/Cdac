import java.util.*;
public class hw1{
static ArrayList<?> checkDuplicates(int a[]){
int n=a.length;
ArrayList<Integer> res=new ArrayList<>();
Map<Integer,Integer> m=new HashMap<>();
for(int i=0;i<n;i++){
if(m.containsKey(a[i])) m.put(a[i],m.get(a[i])+1);
else m.put(a[i],1);
	}
for(Map.Entry<Integer,Integer> me:m.entrySet()){
if(me.getValue()>1) res.add(me.getKey());	
	}
return res;
} 
static String removePunctuation(String s){
String res=s.replaceAll("\\p{Punct}","");
return res;	
}
static String returnInitials(String s){
StringBuilder initials = new StringBuilder(); 
String[] words = s.split("\\s+");
for(String word:words) {
if(!word.isEmpty()){
initials.append(word.charAt(0));
        }
    }
return initials.toString();	
}
public static void main(String[] args){
int ip[]={1,2,1,3,4,5,4,4,5,5,3,3,6,7,8,9,10};
System.out.println(checkDuplicates(ip));
String s1="hello, welcome@!!! to cdac# mumbai%";
System.out.println(removePunctuation(s1));
Scanner sc=new Scanner(System.in);
System.out.print("Enter a string: ");
String s2=sc.nextLine();
System.out.print(returnInitials(s2));
	}
}