package onboarding;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;
        return answer;
    }
    private static int count369(int num){
        int cnt=0;
        for(int i=1;i<=num;i++){
            int temp=i;
            while(temp>0){
                if(temp%10==3||temp%10==6||temp%10==9){
                    cnt++;
                }
                temp/=10;
            }
        }
        return cnt;
    }
}
