package PROGRAMERS.코딩테스트;

import java.util.*;

public class 신고결과받기 {

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, List<String>> map = new HashMap<>();
        Map<String, Integer> cnt = new HashMap<>();
        Set<Object> set = new HashSet<>(List.of(report));
        StringTokenizer st;
        for (String user : id_list) {
            // 신고받은 유저 0으로 초기화
            cnt.put(user, 0);

            ArrayList li = new ArrayList();

            for (Object obj : set) {
                st = new StringTokenizer((String)obj);
                String key = st.nextToken();
                String singo = st.nextToken();
                String[] item = obj.toString().split(" ");
                // 사용자 신고
                if(user.equals(item[0])){
                    li.add((item[1]));
                    map.put(user, li);
                }
                // 신고받은 유저 카운트
                if (user.equals(item[1])) {
                    cnt.put(user, cnt.get(user) + 1);
                }
            }
        }

        int i=0;
        for(String user : id_list){
            int c = 0;
            if (map.get(user) != null) {
                for(String name : map.get(user)){
                    if (cnt.get(name) >= k) {
                        c++;
                    }
                }
            }
            answer[i] = c;
            i++;
        }
        System.out.println(map);
        System.out.println(cnt);
        return answer;
    }


    public static void main(String[] args) {
//        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
//        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
//        int k = 2;
        String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;

        for (int i : solution(id_list, report, k)) {
            System.out.print(i +" ");
        }
    }
}
