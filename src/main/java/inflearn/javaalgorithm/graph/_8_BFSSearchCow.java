/**
 * 
 */
package inflearn.javaalgorithm.graph;

import java.util.*;

import inflearn.javaalgorithm.array.*;

/**
 * @author njh
 *
 */
public class _8_BFSSearchCow {

	int answer=0;
	int[] dis= {-1,1,5};
	int[] ch;
	Queue<Integer> Q = new LinkedList<Integer>();
	
	public int BFS(int s, int e) {
		ch=new int[10001]; //모든값을 0으로 초기화(방문안했을때는 0)
		ch[s]=1; //시작지점값은 1로 체크(방문했을때는 1)
		Q.offer(s);
		int L=0;
		while(!Q.isEmpty()){
			int len=Q.size();
			for(int i=0; i<len; i++) {
				int x=Q.poll(); //큐에 있는 초기값을 받음(
				//if(x==e) return L; //결과값 리턴
				for(int j=0; j<3; j++) {
					int nx=x+dis[j]; //nx ==> next x(초기값은 s를 큐에 넣은것을 받아 왔으니 s=5 초기값이면 최초는 5)
					if(nx==e) return L+1; //여기서 왜 L+1 을 해야함: 부모노드 레벨에서 자식을 찾았을때므로 자식의 레벨은 L+1 임
					if(nx>=1 && nx<=10000 && ch[nx]==0) { //ch[nx]==0 이란건 아직 방문안했다는 뜻: 초기화가 0
						ch[nx]=1; //방문했을때는 check에 1을 세팅
						Q.offer(nx); //next x를 Q에 넣는다 
					}
				}
			}
			L++; // for문에서 다 탐색해서 각노드에 값까지 넣고나면 레벨 증가
		}
		return -1; //정답이 없을때 -1 리턴 
	}
	
	
	
	public static void main(String[] args) {
		_8_BFSSearchCow T = new _8_BFSSearchCow();
		Scanner kb = new Scanner(System.in);
		int s=kb.nextInt();//출발점(Start)
		int e=kb.nextInt();//목표점(End)
		System.out.println(T.BFS(s,e));
	}

}
