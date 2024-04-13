import java.util.Scanner;
class Report {
public static void main(String[] args)
{
int EC=75;
int LAAC=80;
int ENG=98;
int totalmarks1=EC+LAAC+ENG;
double year1_percentage=totalmarks1*100/300f;
int EDC=70;
int PPS=80;
int UHV=97;
int totalmarks2=EDC+PPS+UHV;
double year2_percentage=totalmarks2*100/300f;
int NA=75;
int ADC=71;
int COA=91;
int totalmarks3=NA+ADC+COA;
double year3_percentage=totalmarks3*100/300f;
int DCNS=80;
int DSP=78;
int VLSI=70;
int totalmarks4=DCNS+DSP+VLSI;
double year4_percentage=totalmarks4*100/300f;
Scanner s=new Scanner(System.in);
System.out.println("enter the year=");
int i=s.nextInt();
switch(i)
{
case 1:
System.out.println(" First year marks:");
int A=s.nextInt();
if(A==1)
{
System.out.println("EC:"+EC);
System.out.println("LAAC:"+LAAC);
System.out.println("ENG:"+ENG);
System.out.println("YEAR1_percentage:"+year1_percentage);
}
break;
case 2:
System.out.println(" Second year marks:");
int B=s.nextInt();
if(B==1)
{
System.out.println("EDC:"+EDC);
System.out.println("PPS:"+PPS);
System.out.println("UHV:"+UHV);
System.out.println("YEAR2_percentage:"+year2_percentage);
}
break;
case 3:
System.out.println(" Third year marks:");
int C=s.nextInt();
if(C==1)
{
System.out.println("NA:"+NA);
System.out.println("ADC:"+ADC);
System.out.println("COA:"+COA);
System.out.println("YEAR3_percentage:"+year3_percentage);
}
break;
case 4:
System.out.println("Fourth year marks:");
int D=s.nextInt();
if(D==1)
{
System.out.println("DCNS:"+DCNS);
System.out.println("DSP:"+DSP);
System.out.println("VLSI:"+VLSI);
System.out.println("YEAR4_percentage:"+year4_percentage);
}
break;
case 5:
System.out.println("overall_percentage");
int E=s.nextInt();
if(E==1) 
{
double
overall_percentage=(year1_percentage+year2_percentage+year3_percentage+year4_percentage)/4;
System.out.println("OVERALL_PERCENTAGE:"+overall_percentage);
}
break;
default:
System.out.println("Details not found");
}
s.close();
}
}
				


 