#include<iostream>
using namespace std;
int main()
{
  int a,i=0,next,b;
    std::cin>>a;
  b=a;
  int t1=0,t2=1;
  while(i<=(a-3))
  {
    next=t1+t2;
  t1=t2;
  t2=next;
    i++;
  }
  std::cout<<"The term "<<b<<" in the fibonacci series is "<<next;
}