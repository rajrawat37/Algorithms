 public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              String s=sc.next();
              solve("",s,1,0);
       }
       static void solve(String str,String s, int skip,int i) {
              if (i == s.length()) {
                     System.out.println(str);
                     return;
              }
              char ch = s.charAt(i);
              solve(str + ch, s, skip, i + 1); //add a character
              
              // add the skip to string if last character is number
              if (str.length() > 0 && Character.isDigit(str.charAt(str.length() - 1))) {
                     int prev = str.charAt(str.length() - 1) - '0';
                     str = s.substring(0,str.length()-1)+skip;
                     solve(str, s, skip + 1, i + 1);
              } else
                     solve(str + skip, s, skip + 1, i + 1);
       }

//My version
//basically a variation of subset problem
//pick and notpick
//just increment the skip when you are not picking the character
