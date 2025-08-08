//PRIMS ALGORITHM
import java.util.*;
class Prims{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        char arr[]=str.toCharArray();
        int n=scan.nextInt();

        List<List<Edge>> list=new ArrayList<>(arr.length);
        for(int i=0;i<arr.length;i++)list.add(new ArrayList<>());

        for(int i=0;i<n;i++){
            char a=scan.next().charAt(0);
            char b=scan.next().charAt(0);
            int c=scan.nextInt();
            list.get(a-'A').add(new Edge(a,b,c));
        }
        prims(list,arr.length);
    }
    static void prims(List<List<Edge>> list,int l){
        boolean visit[]=new boolean[l];
        PriorityQueue<Edge> pq=new PriorityQueue<>(Comparator.comparing(a->a.w));
        pq.offer(new Edge('-','A',0));
        int sum=0;

        while(!pq.isEmpty()){
            Edge current=pq.poll();
            if(!visit[current.d-65]){
                visit[current.d-65]=true;
                sum+= current.w;
                for(Edge e : list.get(current.d-65)){
                    pq.add(e);
                }
            }
        }
        System.out.print(sum);
    }
}
class Edge{
    char s,d;
    int w;
    Edge(char s,char d,int w) {
        this.s = s;
        this.d = d;
        this.w = w;
    }
}
