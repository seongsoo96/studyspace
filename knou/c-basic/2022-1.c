#include <stdio.h>

int main() {
  while(1) {
    int Lee_Seongsoo;
    printf("1000~9000 사이의정수를 입력하시오: ");
    scanf("%d", &Lee_Seongsoo);
    if(Lee_Seongsoo == 0) {
      printf("\n");
      printf("프로그램을 종료합니다. 학번:202234-153629");
      printf("\n");
      break;
    } else if(Lee_Seongsoo < 1000 || Lee_Seongsoo > 9000) {
      printf("1000이상 9000이하의 숫자를 입력해 주세요.");
      printf("\n");
    } else {
      printf("%d", Lee_Seongsoo);
      if(Lee_Seongsoo%2 == 0) {
        printf(", 짝수");
        printf("\n");
      } else {
        printf(", 홀수");
        printf("\n");
      }
    }
  }
  return 0;
}