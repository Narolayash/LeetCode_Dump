public class SearchInString {
    public static void main(String[] args) {
        String name = "yashNarola";
        char ch = 'n';
        char ch2 = 'N';
        System.out.println(search(name, ch));
        System.out.println(search(name, ch2));
        System.out.println(search2(name, ch));
        System.out.println(search2(name, ch2));
    }

    static boolean search(String str, char target) {
        for (int i=0; i< str.length(); i++) {
            if (str.charAt(i) == target) return true;
        }

        return false;
    }

    static boolean search2(String str, char target) {
        for (char tr : str.toCharArray()) {
            if (tr == target) return true;
        }

        return false;
    }
}
