
class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);

        int left = 0;
        int right = sb.length() - 1;

        while (left < right) {

            while (left < right &&
                   "aeiouAEIOU".indexOf(sb.charAt(left)) == -1) {
                left++;
            }

            while (left < right &&
                   "aeiouAEIOU".indexOf(sb.charAt(right)) == -1) {
                right--;
            }

            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);

            left++;
            right--;
        }

        return sb.toString();
    }
}
