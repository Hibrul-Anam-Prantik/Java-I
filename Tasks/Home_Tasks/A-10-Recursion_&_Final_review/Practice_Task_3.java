public class Practice_Task_3 {
    public static void main(String[] args) {
        // String[] email_list = { "cse110@gmail.com", "government@cv.",
        // "eee@bracu.ac.bd" };
        String[] email_list = { "abc@gmail.com", "!@cv.bd", "123cse@bracu.ac.bd" };
        int count = 0;
        for (int i = 0; i < email_list.length; i++) {
            String email = email_list[i];
            boolean at = false;
            boolean fullstop = false;
            boolean first_letter = false;
            if (email.charAt(0) >= 'a' && email.charAt(0) <= 'z') {
                first_letter = true;
            }
            for (int j = 0; j < email.length(); j++) {
                char c = email.charAt(j);
                if (c == '@') {
                    if ((j > 0 && j < email.length() - 1)
                            && ((email.charAt(j - 1) >= 'a' && email.charAt(j - 1) <= 'z')
                                    || (email.charAt(j - 1) >= '0' && email.charAt(j - 1) <= '9'))
                            && (email.charAt(j + 1) >= 'a' && email.charAt(j + 1) <= 'z')) {
                        at = true;
                    }
                    int k = j + 2; // +2 => to identify "." after at least one letter after the "@"
                    while (k < email.length()) {
                        char ch = email.charAt(k);
                        if (ch == '.' && (k > j + 1 && k < email.length() - 1)
                                && ((email.charAt(k + 1) >= 'a' && email.charAt(k + 1) <= 'z'))) {
                            fullstop = true;
                            break;
                        }
                        k++;
                    }
                }
            }
            if (at && fullstop && first_letter) {
                count++;
            }
        }
        System.out.println(count);
    }
}
