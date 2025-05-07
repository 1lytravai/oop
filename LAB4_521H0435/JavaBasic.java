public class JavaBasic {
    public static int sumNegativeElements(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                sum += a[i];
            }
        }

        return sum;

    }

    public static int findMinNegativeElements(int[] a) {
        int min = -1;
        for(int i = 0; i < a.length; i++) {
            if(a[i] < min) {
                min = i;
            }
        }
        return min;
    }
    
        public static void main(String[] args) {
            String input = "nguyen tran anh oanh";
            System.out.println(uppercaseFirstVowels(input));
        }
    
        public static String uppercaseFirstVowels(String str) {
            String[] words = str.split("\\s+"); // Tách chuỗi thành các từ cách nhau bởi dấu khoảng trắng
    
            StringBuilder result = new StringBuilder();
    
            for (String word : words) {
                if (isVowel(word.charAt(0))) {
                    result.append(Character.toUpperCase(word.charAt(0))); // Chuyển ký tự đầu tiên thành chữ hoa
                } else {
                    result.append(word.charAt(0)); // Giữ nguyên ký tự đầu tiên nếu không phải nguyên âm
                }
                result.append(word.substring(1)); // Gắn thêm các ký tự còn lại của từ
                result.append(" "); // Thêm dấu cách để cách các từ nhau
            }
    
            return result.toString().trim(); // Loại bỏ dấu cách thừa ở cuối chuỗi và trả về
        }
    
        public static boolean isVowel(char c) {
            return "AEIOUaeiou".indexOf(c) != -1; // Kiểm tra xem ký tự có phải là nguyên âm hay không
        }
    }
    
