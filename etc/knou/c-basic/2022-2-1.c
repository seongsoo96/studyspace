#include <stdio.h>
#pragma warning(disable:4996)
void main() {
  char ch;
  int Nchar = 0, Nnum = 0, Nblank = 0;
  printf("문자열을 입력하시오 : ");
  while((ch = getchar()) != '\n') {
    if(ch >= '0' && ch <= '9')
      ++Nnum;
    else if(ch == ' ' || ch =='\t')
      ++Nblank;
    else
      ++Nchar;
  }
  printf("\n ***** 결과 ***** \n");
  printf("숫자 = %d \n", Nnum);
  printf("공백 = %d \n", Nblank);
  printf("문자 = %d \n", Nchar);
}