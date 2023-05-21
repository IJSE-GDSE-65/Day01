public class Boy {
    public void chatWithGirl(){
        Agreement agreement=new Girl();
        while (true){
            agreement.chat();
        }
    }

    public static void main(String[] args) {
        Boy boy=new Boy();
        boy.chatWithGirl();
    }
}
