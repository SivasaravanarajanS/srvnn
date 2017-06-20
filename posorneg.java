
public static void main(String[] args) 
    {
Scanner s=new Scanner(System.in);
System.out.println("ENTER THE VALUE");
        int number=s.nextInt();
        if(number>0)
            System.out.println("ENTERED VALUE IS POSITIVE");
        else if(number<0)
           System.out.println("ENTERED VALUE IS NEGATIVE");
        else
            System.out.println("ENTERED VALUE IS ZERO");
}
