package problem2178;

import java.util.*;

class Node {
  private int x;
  private int y;

  public Node(int x, int y) {
    this.x = x;
    this.y = y;

  }

  public int getX() {
    return this.x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return this.y;
  }

  public void setY(int y) {
    this.y = y;
  }

}

public class Main {

  public static int[][] graph = {
      { 1, 0, 1, 1, 1, 1 },
      { 1, 0, 1, 0, 1, 0 },
      { 1, 0, 1, 0, 1, 1 },
      { 1, 1, 1, 0, 1, 1 }
  };

  public static int n, m;
  // int[][] graph = new int[200][200];

  // 상하좌우
  public static int[] dx = { -1, 1, 0, 0 };
  public static int[] dy = { 0, 0, -1, 1 };

  public static int bfs(int x, int y) {

    Queue<Node> que = new LinkedList<>();
    que.add(new Node(x, y));
    while (!que.isEmpty()) {
      Node node = que.remove();
      x = node.getX();
      y = node.getY();
    }

    return 0;
  }

  public static void main(String[] args) {

  }
}
