public class Boy {
    Agreement agreement;
    //constructor injection
    public Boy(Agreement a) {
        this.agreement = a;
    }
    public Boy() {
    }
    public void chatWithGirl(){
        //Agreement agreement=new Girl();
        while (true){
            agreement.chat();
        }
    }

    public static void main(String[] args) {
        Boy boy=new Boy(new Girl());
        boy.chatWithGirl();
    }
}
