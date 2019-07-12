public_static void main(String args[]) throws Exception{
    Random rn = new_Random();
    Scanner input = new_Scanner(System.in);

    //random number 1-6
    int answer = rn.nextInt(6) + 1;
    System.out.println("Your random  number between 1-6 is: "+answer);
}