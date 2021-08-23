package cisco.java.programs;
public class SalaryException {
static void SalaryCheck(int sal) throws EffortException {
if(sal<2000){
throw new EffortException("need to Work hard");
}
else if(2100<sal && sal<5000){
throw new EffortException("Salary somehow good");
}
else if(5100<sal && sal<9000){
//System.out.println("Welcome to vote");
throw new EffortException("salary very nice");
}
}
public static void main(String[] args) {
// TODO Auto-generated  stub
try {
SalaryCheck(1900);
} catch(Exception m){
System.out.println("Exception occured: "+m.getMessage());
}
System.out.println("rest of the code");
}
}
class EffortException extends Exception {
EffortException(String s){
super(s);
}
}