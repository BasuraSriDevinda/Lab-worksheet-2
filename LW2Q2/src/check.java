public class check {
    static int number;
    private String inValidIteme="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM,.,<.>?/':;+=_-)*";
    static boolean now;
    public check(int numb ) {
        if (numb>0){
            this.number = numb;
        }else {
            this.number=0;
        }

    }

    public    check(String numberString ){
        for (int i=0;i<numberString.length();i++){
            for (int J=0;J<inValidIteme.length();J++){
                if (numberString.charAt(i)==inValidIteme.charAt(J)){
                    now= false;
                }


            }

        }
        now=  true;

    }
}
