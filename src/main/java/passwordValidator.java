public class passwordValidator {

    public static void main(String[] args) {

        String password = "dfkz";
        //passwordLength(password);


        System.out.println(passwordLength(password));

    }
        public static boolean passwordLength(String password){

            boolean longEnough;

            if (password.length() >= 8) {
                longEnough = true;
                //System.out.println(longEnough);
            } else {
                longEnough = false;
                //System.out.println(longEnough);
            }
            return longEnough;
        }
        //Alternative:
        // longEnough = password.length() >= 8;
        // return longEnough;
}
