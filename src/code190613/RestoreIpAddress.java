package code190613;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个只包含数字的字符串，复原它并返回所有可能的 IP 地址格式。
 *
 * 示例:
 *
 * 输入: "25525511135"
 * 输出: ["255.255.11.135", "255.255.111.35"]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/restore-ip-addresses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RestoreIpAddress {
    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        doRestore(result, "", s, 0);
        return result;
    }

    public static void doRestore(List<String> result, String path, String s, int k) {
        if (s.isEmpty() || k == 4){
            if (s.isEmpty() && k == 4) {
                result.add(path.substring(1));
            }
            return;
        }
        for (int i = 1; i <= (s.charAt(0) == '0' ? 1 : 3) && i <= s.length(); i++) {
            String part = s.substring(0, i);
            if (Integer.parseInt(part) <= 255) {
                doRestore(result, path + "." + part, s.substring(i), k + 1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(restoreIpAddresses("25525511135"));
    }
}
