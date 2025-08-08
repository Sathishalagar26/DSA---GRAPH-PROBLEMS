//BFS-BREATH FIRST SEARCH
import java.util.*;
class BFS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Character, List<Character>> map = new HashMap<>();
        int l = scan.nextInt();
        for (int i = 0; i < l; i++) {
            char a = scan.next().charAt(0);
            map.put(a, new ArrayList<>());
        }
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            char a = scan.next().charAt(0);
            char b = scan.next().charAt(0);
            map.get(a).add(b);
            map.get(b).add(a);
        }
        char st=scan.next().charAt(0);
        bfs(map, l, st);
    }
    static void bfs(Map<Character, List<Character>> map, int l, char st) {
        boolean visit[] = new boolean[26];
        Queue<Character> q=new LinkedList<>();
        q.add(st);
        while(!q.isEmpty()){
            char a=q.poll();
            if(!visit[a-65]){
                visit[a-65]=true;
                System.out.print(a+" ");
                for(char b : map.get(a)){
                    q.add(b);
                }
            }
        }
    }
}