package problem14503;

import java.io.*;
import java.util.*;

// 3 3
// 1 1 0
// 1 1 1
// 1 0 1
// 1 1 1
public class Main {

  static int n, m;
  static int map[][];
  static int count;
  static int dx[] = { -1, 0, 1, 0 };
  static int dy[] = { 0, 1, 0, -1 };

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

    n = Integer.parseInt(stk.nextToken());
    m = Integer.parseInt(stk.nextToken());

    stk = new StringTokenizer(br.readLine(), " ");
    int r, c, dir;
    r = Integer.parseInt(stk.nextToken());
    c = Integer.parseInt(stk.nextToken());
    dir = Integer.parseInt(stk.nextToken());
    count = 1;

    for (int i = 0; i < n; i++) {
      stk = new StringTokenizer(br.readLine(), " ");
      for (int j = 0; j < m; j++) {
        map[i][j] = Integer.parseInt(stk.nextToken());
      }
    }

  }
}

// 현재 위치를 청소한다.
// 현재 위치에서 현재 방향을 기준으로 왼쪽방향부터 차례대로 탐색을 진행한다.
// 왼쪽 방향에 아직 청소하지 않은 공간이 존재한다면, 그 방향으로 회전한 다음 한 칸을 전진하고 1번부터 진행한다.
// 왼쪽 방향에 청소할 공간이 없다면, 그 방향으로 회전하고 2번으로 돌아간다.
// 네 방향 모두 청소가 이미 되어있거나 벽인 경우에는, 바라보는 방향을 유지한 채로 한 칸 후진을 하고 2번으로 돌아간다.
// 네 방향 모두 청소가 이미 되어있거나 벽이면서, 뒤쪽 방향이 벽이라 후진도 할 수 없는 경우에는 작동을 멈춘다.
