package utils;

public class Constants {
    private static final int INT_VALID_EMAIL = 1;
    public static final String BLANK_EMAIL = "";
    public static final String VALID_EMAIL = Utils.getSaltString(INT_VALID_EMAIL)+"@gmail.com";
    public static final String EXISTING_EMAIL = "onchari101@gmail.com";
    public static final String IN_VALID_EMAIL = "ff.gonchari564@";

    public static final String IN_VALID_EMAIL_TEXT  = "Invalid email address." ;
    public static final String BLANK_FIELD_TEXT  = "" ;
    public static final int WAIT_INTERVAL = 30;
    public static final String EXISTING_EMAIL_TEXT = "An account using this email address has already been registered. Please enter a valid password or request a new one.";
}
