public class T4Q3 {
    public static long concatenateUsingString(int count) {
        long startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < count; i++) {
            str += "text";
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long concatenateUsingStringBuilder(int count) {
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append("text");
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long concatenateUsingStringBuffer(int count) {
        long startTime = System.nanoTime();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < count; i++) {
            sb.append("text");
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static String reverseUsingStringBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverseUsingStringBuffer(String str) {
        return new StringBuffer(str).reverse().toString();
    }

    public static long replaceUsingString(String str, String oldSub, String newSub) {
        long startTime = System.nanoTime();
        str = str.replace(oldSub, newSub);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long replaceUsingStringBuilder(String str, String oldSub, String newSub) {
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder(str);
        int index;
        while ((index = sb.indexOf(oldSub)) != -1) {
            sb.replace(index, index + oldSub.length(), newSub);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long replaceUsingStringBuffer(String str, String oldSub, String newSub) {
        long startTime = System.nanoTime();
        StringBuffer sb = new StringBuffer(str);
        int index;
        while ((index = sb.indexOf(oldSub)) != -1) {
            sb.replace(index, index + oldSub.length(), newSub);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    public static void main(String[] args) {
        int count = 10000;
        String testString = "This is a sample text for testing.";
        String toReplace = "text";
        String replaceWith = "string";
        System.out.println("String concatenation time: " + concatenateUsingString(count) + " ns");
        System.out.println("StringBuilder concatenation time: " + concatenateUsingStringBuilder(count) + " ns");
        System.out.println("StringBuffer concatenation time: " + concatenateUsingStringBuffer(count) + " ns");
        System.out.println("\nOriginal String: " + testString);
        System.out.println("Reversed using StringBuilder: " + reverseUsingStringBuilder(testString));
        System.out.println("Reversed using StringBuffer: " + reverseUsingStringBuffer(testString));
        System.out.println("\nString replacement time: " + replaceUsingString(testString, toReplace, replaceWith) + " ns");
        System.out.println("StringBuilder replacement time: " + replaceUsingStringBuilder(testString, toReplace, replaceWith) + " ns");
        System.out.println("StringBuffer replacement time: " + replaceUsingStringBuffer(testString, toReplace, replaceWith) + " ns");
    }
}
