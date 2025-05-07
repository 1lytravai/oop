public class exercise7 {
    public boolean isAlphanumeric(char ch) {
        return ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'));
    }

    public static void main(String[] args) {        exercise7 checker = new exercise7();
        char character = '7';
        System.out.println("Character " + character + " is alphanumeric: " + checker.isAlphanumeric(character));
    }
}
