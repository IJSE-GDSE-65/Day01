public class Boy {
    Agreement agreement;
    //setter method through injection
    public void setInjection(Agreement a){
        this.agreement=a;
    }
    public Boy() {}
    public void chatWithGirl(){
        //Agreement agreement=new Girl();
        while (true){
            agreement.chat();
        }
    }

    public static void main(String[] args) {
        Boy boy=new Boy();
        boy.setInjection(new Girl());
        boy.chatWithGirl();
    }
}
