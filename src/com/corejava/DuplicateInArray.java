import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DuplicateInArray {
    public static void main(String[] args) {

        int arr[] = { 13, 93, 20, 17, 70, 17, 20, 93, 5, 17, 16, 17 };
        int temp[] = new int[arr.length];
        int m = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    for (int k = 0; k < temp.length; k++) {
                        if (temp[k] == arr[i]) {
                            m = k;
                        }
                    }
                    temp[m] = arr[i];
                    m++;
                }
            }

        }

        for (int i = 0; i < m; i++) {
            // System.out.print(temp[i] + " ");
        }

        HashSet<Integer> dup = new HashSet<>();
        HashSet<Integer> distinctVal = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!distinctVal.contains(arr[i])) {
                distinctVal.add(arr[i]);
            } else {
                dup.add(arr[i]);
            }
        }
        // System.out.println(dup);

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                // System.out.println(entry.getKey());
            }
        }

        map.entrySet().forEach(el -> {
            if (el.getValue() > 1) {
                // System.out.println(el.getKey());
            }
        });

        map.entrySet().stream().filter(el -> el.getValue() > 1).forEach(ell -> System.out.println(ell.getKey()));

    }
}
