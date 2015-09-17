package my_ps2;

public class MyInteger {

public void setValue(int num){

this.value=num;

}




public MyInteger(){

}

public MyInteger(int val) {

this.value = val;

}




public int getValue(){

return this.value;

}










public static boolean isEven(int num){

if (num%2 == 0){

return true;

}

return false;

}




public static boolean isOdd(int num){

if (num%2 == 1){

return true;

}

return false;

}







public boolean isOdd(){

if (value%2==1){

return true;

}

return false;

}




public boolean isEven(){

if (value%2==0){

return true;

}

return false;

}







public boolean isPrime(){

for (int i=2; i<=value/2; i++){

if(value % i == 0){

return false;

}

}

return true;

}

public static int parseInt(char[] arr){

String fjt = java.lang.String.copyValueOf(arr);

return parseInt(fjt);

}

public static boolean isPrime(MyInteger num){

for (int i=2; i<=num.getValue()/2; i++){

if(num.getValue()% i == 0){

return false;

}

}

return true;

}

public static boolean isOdd(MyInteger num){

if (num.getValue()%2==1){

return true;

}

return false;

}




public static boolean isEven(MyInteger num){

if (num.getValue()%2==0){

return true;

}

return false;

}






private int value;




public boolean equals(int num){

if (value == num){

return true;

}

return false;

}




public static boolean isPrime(int num){

for (int i=2; i<=(num)/2; i++){

if(num % i == 0){

return false;

}

}

return true;

}







public boolean equals(MyInteger vals){

if (vals.getValue()==value){

return true;

}

return false;

}
















public static int parseInt(String a){

return java.lang.Integer.parseInt(a);

}

}