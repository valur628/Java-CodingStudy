//https://www.acmicpc.net/problem/5397

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
  public static void main(String args[]) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    String pwd;

    for (int i = 0; i < N; i++) {
      pwd = br.readLine();
      String password = gettingPwd(pwd);
      System.out.println(password);
    }
  }

  public static String gettingPwd(String pwd) {
    StringBuilder st = new StringBuilder();
    Stack<Character> front = new Stack<>();
    Stack<Character> back = new Stack<>();

    for (int i = 0; i < pwd.length(); i++) {
      switch (pwd.charAt(i)) {
        case '<':
          if (!front.isEmpty())
            back.push(front.pop());
          break;
        case '>':
          if (!back.isEmpty())
            front.push(back.pop());
          break;
        case '-':
          if (!front.isEmpty())
            front.pop();
          break;
        default:
          front.push(pwd.charAt(i));
          break;
      }
    }
    while (!back.isEmpty()) {
      front.push(back.pop());
    }
    for (int i = 0; i < front.size(); i++) {
      st.append(front.elementAt(i));
    }
    return st.toString();
  }
}
