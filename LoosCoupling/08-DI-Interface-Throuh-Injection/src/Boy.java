public class Boy implements DI {
    Agreement agreement;
    public void chatWithGirl(){
        //Agreement agreement=new Girl();
        while (true){
            agreement.chat();
        }
    }
    public static void main(String[] args) {
        Boy boy=new Boy();
        boy.inject(new Girl());
        boy.chatWithGirl();
    }
    @Override
    public void inject(Agreement a) {
         agreement=a;
    }
}
