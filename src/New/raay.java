package New;
public class raay {
public static void main(String[]args) {
int a[][] = new int[2] [2];
a[0][0]=10;
a[0][1]=20;
a[1][0]=30;
a[1][1]=40;

System.out.println(a[1][1]);
for (int i = 0; i < a.length; i++) {
for (int j = 0; j < a.length; j++) {
System.out.println(a[i][j])	;
}	
}
System.out.println("****************");
for (int[] is : a) {
for (int i : is) {
System.out.println(i);
System.out.println("passi");
}
}	
}
}
